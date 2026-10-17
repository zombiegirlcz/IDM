package ch.qos.logback.core.subst;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.spi.ScanException;
import ch.qos.logback.core.subst.Token;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Tokenizer {
    final String pattern;
    final int patternLength;
    TokenizerState state = TokenizerState.LITERAL_STATE;
    int pointer = 0;

    /* JADX INFO: renamed from: ch.qos.logback.core.subst.Tokenizer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$ch$qos$logback$core$subst$Tokenizer$TokenizerState;

        static {
            int[] iArr = new int[TokenizerState.values().length];
            $SwitchMap$ch$qos$logback$core$subst$Tokenizer$TokenizerState = iArr;
            try {
                iArr[TokenizerState.LITERAL_STATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$subst$Tokenizer$TokenizerState[TokenizerState.START_STATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$subst$Tokenizer$TokenizerState[TokenizerState.DEFAULT_VAL_STATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum TokenizerState {
        LITERAL_STATE,
        START_STATE,
        DEFAULT_VAL_STATE
    }

    public Tokenizer(String str) {
        this.pattern = str;
        this.patternLength = str.length();
    }

    private void addLiteralToken(List<Token> list, StringBuilder sb6) {
        if (sb6.length() == 0) {
            return;
        }
        list.add(new Token(Token.Type.LITERAL, sb6.toString()));
    }

    private void handleDefaultValueState(char c2, List<Token> list, StringBuilder sb6) {
        TokenizerState tokenizerState;
        Token token;
        if (c2 != '$') {
            if (c2 != '-') {
                sb6.append(CoreConstants.COLON_CHAR);
                if (c2 != '{') {
                    sb6.append(c2);
                    tokenizerState = TokenizerState.LITERAL_STATE;
                } else {
                    addLiteralToken(list, sb6);
                    sb6.setLength(0);
                    token = Token.CURLY_LEFT_TOKEN;
                }
            } else {
                token = Token.DEFAULT_SEP_TOKEN;
            }
            list.add(token);
            tokenizerState = TokenizerState.LITERAL_STATE;
        } else {
            sb6.append(CoreConstants.COLON_CHAR);
            addLiteralToken(list, sb6);
            sb6.setLength(0);
            tokenizerState = TokenizerState.START_STATE;
        }
        this.state = tokenizerState;
    }

    private void handleLiteralState(char c2, List<Token> list, StringBuilder sb6) {
        if (c2 == '$') {
            addLiteralToken(list, sb6);
            sb6.setLength(0);
            this.state = TokenizerState.START_STATE;
            return;
        }
        if (c2 == ':') {
            addLiteralToken(list, sb6);
            sb6.setLength(0);
            this.state = TokenizerState.DEFAULT_VAL_STATE;
        } else if (c2 == '{') {
            addLiteralToken(list, sb6);
            list.add(Token.CURLY_LEFT_TOKEN);
            sb6.setLength(0);
        } else {
            if (c2 != '}') {
                sb6.append(c2);
                return;
            }
            addLiteralToken(list, sb6);
            list.add(Token.CURLY_RIGHT_TOKEN);
            sb6.setLength(0);
        }
    }

    private void handleStartState(char c2, List<Token> list, StringBuilder sb6) {
        if (c2 == '{') {
            list.add(Token.START_TOKEN);
        } else {
            sb6.append(CoreConstants.DOLLAR);
            sb6.append(c2);
        }
        this.state = TokenizerState.LITERAL_STATE;
    }

    public List<Token> tokenize() throws ScanException {
        char c2;
        ArrayList arrayList = new ArrayList();
        StringBuilder sb6 = new StringBuilder();
        while (true) {
            int i = this.pointer;
            if (i >= this.patternLength) {
                break;
            }
            char cCharAt = this.pattern.charAt(i);
            this.pointer++;
            int i2 = AnonymousClass1.$SwitchMap$ch$qos$logback$core$subst$Tokenizer$TokenizerState[this.state.ordinal()];
            if (i2 == 1) {
                handleLiteralState(cCharAt, arrayList, sb6);
            } else if (i2 == 2) {
                handleStartState(cCharAt, arrayList, sb6);
            } else if (i2 == 3) {
                handleDefaultValueState(cCharAt, arrayList, sb6);
            }
        }
        int i3 = AnonymousClass1.$SwitchMap$ch$qos$logback$core$subst$Tokenizer$TokenizerState[this.state.ordinal()];
        if (i3 == 1) {
            addLiteralToken(arrayList, sb6);
            return arrayList;
        }
        if (i3 == 2) {
            c2 = CoreConstants.DOLLAR;
        } else {
            if (i3 != 3) {
                return arrayList;
            }
            c2 = CoreConstants.COLON_CHAR;
        }
        sb6.append(c2);
        addLiteralToken(arrayList, sb6);
        return arrayList;
    }
}
