package ch.qos.logback.core.pattern.parser;

import ch.qos.logback.core.pattern.util.IEscapeUtil;
import ch.qos.logback.core.pattern.util.RegularEscapeUtil;
import ch.qos.logback.core.pattern.util.RestrictedEscapeUtil;
import ch.qos.logback.core.spi.ScanException;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class TokenStream {
    final IEscapeUtil escapeUtil;
    final IEscapeUtil optionEscapeUtil;
    final String pattern;
    final int patternLength;
    int pointer;
    TokenizerState state;

    /* JADX INFO: renamed from: ch.qos.logback.core.pattern.parser.TokenStream$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$ch$qos$logback$core$pattern$parser$TokenStream$TokenizerState;

        static {
            int[] iArr = new int[TokenizerState.values().length];
            $SwitchMap$ch$qos$logback$core$pattern$parser$TokenStream$TokenizerState = iArr;
            try {
                iArr[TokenizerState.LITERAL_STATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$pattern$parser$TokenStream$TokenizerState[TokenizerState.FORMAT_MODIFIER_STATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$pattern$parser$TokenStream$TokenizerState[TokenizerState.OPTION_STATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$pattern$parser$TokenStream$TokenizerState[TokenizerState.KEYWORD_STATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$pattern$parser$TokenStream$TokenizerState[TokenizerState.RIGHT_PARENTHESIS_STATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum TokenizerState {
        LITERAL_STATE,
        FORMAT_MODIFIER_STATE,
        KEYWORD_STATE,
        OPTION_STATE,
        RIGHT_PARENTHESIS_STATE
    }

    public TokenStream(String str) {
        this(str, new RegularEscapeUtil());
    }

    private void addValuedToken(int i, StringBuffer stringBuffer, List<Token> list) {
        if (stringBuffer.length() > 0) {
            list.add(new Token(i, stringBuffer.toString()));
            stringBuffer.setLength(0);
        }
    }

    private void handleFormatModifierState(char c2, List<Token> list, StringBuffer stringBuffer) {
        if (c2 == '(') {
            addValuedToken(1002, stringBuffer, list);
            list.add(Token.BARE_COMPOSITE_KEYWORD_TOKEN);
            this.state = TokenizerState.LITERAL_STATE;
        } else {
            if (!Character.isJavaIdentifierStart(c2)) {
                stringBuffer.append(c2);
                return;
            }
            addValuedToken(1002, stringBuffer, list);
            this.state = TokenizerState.KEYWORD_STATE;
            stringBuffer.append(c2);
        }
    }

    private void handleKeywordState(char c2, List<Token> list, StringBuffer stringBuffer) {
        TokenizerState tokenizerState;
        if (Character.isJavaIdentifierPart(c2)) {
            stringBuffer.append(c2);
            return;
        }
        if (c2 == '{') {
            addValuedToken(GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION, stringBuffer, list);
            tokenizerState = TokenizerState.OPTION_STATE;
        } else {
            if (c2 == '(') {
                addValuedToken(GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT, stringBuffer, list);
            } else if (c2 == '%') {
                addValuedToken(GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION, stringBuffer, list);
                list.add(Token.PERCENT_TOKEN);
                tokenizerState = TokenizerState.FORMAT_MODIFIER_STATE;
            } else {
                addValuedToken(GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION, stringBuffer, list);
                if (c2 == ')') {
                    tokenizerState = TokenizerState.RIGHT_PARENTHESIS_STATE;
                } else if (c2 == '\\') {
                    int i = this.pointer;
                    if (i < this.patternLength) {
                        String str = this.pattern;
                        this.pointer = i + 1;
                        this.escapeUtil.escape("%()", stringBuffer, str.charAt(i), this.pointer);
                    }
                } else {
                    stringBuffer.append(c2);
                }
            }
            tokenizerState = TokenizerState.LITERAL_STATE;
        }
        this.state = tokenizerState;
    }

    private void handleLiteralState(char c2, List<Token> list, StringBuffer stringBuffer) {
        if (c2 == '%') {
            addValuedToken(1000, stringBuffer, list);
            list.add(Token.PERCENT_TOKEN);
            this.state = TokenizerState.FORMAT_MODIFIER_STATE;
        } else if (c2 == ')') {
            addValuedToken(1000, stringBuffer, list);
            this.state = TokenizerState.RIGHT_PARENTHESIS_STATE;
        } else if (c2 != '\\') {
            stringBuffer.append(c2);
        } else {
            escape("%()", stringBuffer);
        }
    }

    private void handleRightParenthesisState(char c2, List<Token> list, StringBuffer stringBuffer) {
        TokenizerState tokenizerState;
        list.add(Token.RIGHT_PARENTHESIS_TOKEN);
        if (c2 != ')') {
            if (c2 == '\\') {
                escape("%{}", stringBuffer);
            } else {
                if (c2 == '{') {
                    tokenizerState = TokenizerState.OPTION_STATE;
                    this.state = tokenizerState;
                }
                stringBuffer.append(c2);
            }
            tokenizerState = TokenizerState.LITERAL_STATE;
            this.state = tokenizerState;
        }
    }

    private void processOption(char c2, List<Token> list, StringBuffer stringBuffer) throws ScanException {
        new OptionTokenizer(this).tokenize(c2, list);
    }

    public void escape(String str, StringBuffer stringBuffer) {
        int i = this.pointer;
        if (i < this.patternLength) {
            String str2 = this.pattern;
            this.pointer = i + 1;
            this.escapeUtil.escape(str, stringBuffer, str2.charAt(i), this.pointer);
        }
    }

    public void optionEscape(String str, StringBuffer stringBuffer) {
        int i = this.pointer;
        if (i < this.patternLength) {
            String str2 = this.pattern;
            this.pointer = i + 1;
            this.optionEscapeUtil.escape(str, stringBuffer, str2.charAt(i), this.pointer);
        }
    }

    public List<Token> tokenize() throws ScanException {
        ArrayList arrayList = new ArrayList();
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            int i = this.pointer;
            if (i >= this.patternLength) {
                break;
            }
            char cCharAt = this.pattern.charAt(i);
            this.pointer++;
            int i2 = AnonymousClass1.$SwitchMap$ch$qos$logback$core$pattern$parser$TokenStream$TokenizerState[this.state.ordinal()];
            if (i2 == 1) {
                handleLiteralState(cCharAt, arrayList, stringBuffer);
            } else if (i2 == 2) {
                handleFormatModifierState(cCharAt, arrayList, stringBuffer);
            } else if (i2 == 3) {
                processOption(cCharAt, arrayList, stringBuffer);
            } else if (i2 == 4) {
                handleKeywordState(cCharAt, arrayList, stringBuffer);
            } else if (i2 == 5) {
                handleRightParenthesisState(cCharAt, arrayList, stringBuffer);
            }
        }
        int i3 = AnonymousClass1.$SwitchMap$ch$qos$logback$core$pattern$parser$TokenStream$TokenizerState[this.state.ordinal()];
        if (i3 == 1) {
            addValuedToken(1000, stringBuffer, arrayList);
            return arrayList;
        }
        if (i3 == 2 || i3 == 3) {
            throw new ScanException("Unexpected end of pattern string");
        }
        if (i3 == 4) {
            arrayList.add(new Token(GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION, stringBuffer.toString()));
            return arrayList;
        }
        if (i3 != 5) {
            return arrayList;
        }
        arrayList.add(Token.RIGHT_PARENTHESIS_TOKEN);
        return arrayList;
    }

    public TokenStream(String str, IEscapeUtil iEscapeUtil) {
        this.optionEscapeUtil = new RestrictedEscapeUtil();
        this.state = TokenizerState.LITERAL_STATE;
        this.pointer = 0;
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("null or empty pattern string not allowed");
        }
        this.pattern = str;
        this.patternLength = str.length();
        this.escapeUtil = iEscapeUtil;
    }
}
