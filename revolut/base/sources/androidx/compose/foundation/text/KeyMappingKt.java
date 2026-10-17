package androidx.compose.foundation.text;

import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.h0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u001c\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0000\"\u0014\u0010\u0006\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"commonKeyMapping", "Landroidx/compose/foundation/text/KeyMapping;", "shortcutModifier", "Lkotlin/Function1;", "Landroidx/compose/ui/input/key/KeyEvent;", "", "defaultKeyMapping", "getDefaultKeyMapping", "()Landroidx/compose/foundation/text/KeyMapping;", "foundation"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class KeyMappingKt {

    @NotNull
    private static final KeyMapping defaultKeyMapping;

    static {
        final KeyMapping keyMappingCommonKeyMapping = commonKeyMapping(new h0() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$1
            @Override // kotlin.jvm.internal.h0, wim.p
            public Object get(Object obj2) {
                return Boolean.valueOf(KeyEvent_androidKt.m2399isCtrlPressedZmokQxo(((KeyEvent) obj2).getNativeKeyEvent()));
            }
        });
        defaultKeyMapping = new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$2$1
            @Override // androidx.compose.foundation.text.KeyMapping
            /* JADX INFO: renamed from: map-ZmokQxo */
            public KeyCommand mo998mapZmokQxo(android.view.KeyEvent event) {
                KeyCommand keyCommand = null;
                if (KeyEvent_androidKt.m2400isShiftPressedZmokQxo(event) && KeyEvent_androidKt.m2399isCtrlPressedZmokQxo(event)) {
                    long jM2395getKeyZmokQxo = KeyEvent_androidKt.m2395getKeyZmokQxo(event);
                    Key.Companion companion = Key.INSTANCE;
                    if (Key.m2352equalsimpl0(jM2395getKeyZmokQxo, companion.m2363getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LEFT_WORD;
                    } else if (Key.m2352equalsimpl0(jM2395getKeyZmokQxo, companion.m2364getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_RIGHT_WORD;
                    } else if (Key.m2352equalsimpl0(jM2395getKeyZmokQxo, companion.m2365getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_PREV_PARAGRAPH;
                    } else if (Key.m2352equalsimpl0(jM2395getKeyZmokQxo, companion.m2362getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_NEXT_PARAGRAPH;
                    }
                } else if (KeyEvent_androidKt.m2399isCtrlPressedZmokQxo(event)) {
                    long jM2395getKeyZmokQxo2 = KeyEvent_androidKt.m2395getKeyZmokQxo(event);
                    Key.Companion companion2 = Key.INSTANCE;
                    if (Key.m2352equalsimpl0(jM2395getKeyZmokQxo2, companion2.m2363getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.LEFT_WORD;
                    } else if (Key.m2352equalsimpl0(jM2395getKeyZmokQxo2, companion2.m2364getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.RIGHT_WORD;
                    } else if (Key.m2352equalsimpl0(jM2395getKeyZmokQxo2, companion2.m2365getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.PREV_PARAGRAPH;
                    } else if (Key.m2352equalsimpl0(jM2395getKeyZmokQxo2, companion2.m2362getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.NEXT_PARAGRAPH;
                    } else if (Key.m2352equalsimpl0(jM2395getKeyZmokQxo2, companion2.m2368getHEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_CHAR;
                    } else if (Key.m2352equalsimpl0(jM2395getKeyZmokQxo2, companion2.m2360getDeleteEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_NEXT_WORD;
                    } else if (Key.m2352equalsimpl0(jM2395getKeyZmokQxo2, companion2.m2356getBackspaceEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_WORD;
                    } else if (Key.m2352equalsimpl0(jM2395getKeyZmokQxo2, companion2.m2355getBackslashEK5gGoQ())) {
                        keyCommand = KeyCommand.DESELECT;
                    }
                } else if (KeyEvent_androidKt.m2400isShiftPressedZmokQxo(event)) {
                    long jM2395getKeyZmokQxo3 = KeyEvent_androidKt.m2395getKeyZmokQxo(event);
                    Key.Companion companion3 = Key.INSTANCE;
                    if (Key.m2352equalsimpl0(jM2395getKeyZmokQxo3, companion3.m2371getMoveHomeEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LINE_START;
                    } else if (Key.m2352equalsimpl0(jM2395getKeyZmokQxo3, companion3.m2370getMoveEndEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LINE_END;
                    }
                } else if (KeyEvent_androidKt.m2398isAltPressedZmokQxo(event)) {
                    long jM2395getKeyZmokQxo4 = KeyEvent_androidKt.m2395getKeyZmokQxo(event);
                    Key.Companion companion4 = Key.INSTANCE;
                    if (Key.m2352equalsimpl0(jM2395getKeyZmokQxo4, companion4.m2356getBackspaceEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_FROM_LINE_START;
                    } else if (Key.m2352equalsimpl0(jM2395getKeyZmokQxo4, companion4.m2360getDeleteEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_TO_LINE_END;
                    }
                }
                return keyCommand == null ? keyMappingCommonKeyMapping.mo998mapZmokQxo(event) : keyCommand;
            }
        };
    }

    @NotNull
    public static final KeyMapping commonKeyMapping(@NotNull final Function1<? super KeyEvent, Boolean> function1) {
        return new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt.commonKeyMapping.1
            @Override // androidx.compose.foundation.text.KeyMapping
            /* JADX INFO: renamed from: map-ZmokQxo */
            public KeyCommand mo998mapZmokQxo(android.view.KeyEvent event) {
                if (((Boolean) function1.invoke(KeyEvent.m2384boximpl(event))).booleanValue() && KeyEvent_androidKt.m2400isShiftPressedZmokQxo(event)) {
                    if (Key.m2352equalsimpl0(KeyEvent_androidKt.m2395getKeyZmokQxo(event), Key.INSTANCE.m2383getZEK5gGoQ())) {
                        return KeyCommand.REDO;
                    }
                    return null;
                }
                if (((Boolean) function1.invoke(KeyEvent.m2384boximpl(event))).booleanValue()) {
                    long jM2395getKeyZmokQxo = KeyEvent_androidKt.m2395getKeyZmokQxo(event);
                    Key.Companion companion = Key.INSTANCE;
                    if (Key.m2352equalsimpl0(jM2395getKeyZmokQxo, companion.m2357getCEK5gGoQ()) || Key.m2352equalsimpl0(jM2395getKeyZmokQxo, companion.m2369getInsertEK5gGoQ())) {
                        return KeyCommand.COPY;
                    }
                    if (Key.m2352equalsimpl0(jM2395getKeyZmokQxo, companion.m2380getVEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    if (Key.m2352equalsimpl0(jM2395getKeyZmokQxo, companion.m2381getXEK5gGoQ())) {
                        return KeyCommand.CUT;
                    }
                    if (Key.m2352equalsimpl0(jM2395getKeyZmokQxo, companion.m2353getAEK5gGoQ())) {
                        return KeyCommand.SELECT_ALL;
                    }
                    if (Key.m2352equalsimpl0(jM2395getKeyZmokQxo, companion.m2382getYEK5gGoQ())) {
                        return KeyCommand.REDO;
                    }
                    if (Key.m2352equalsimpl0(jM2395getKeyZmokQxo, companion.m2383getZEK5gGoQ())) {
                        return KeyCommand.UNDO;
                    }
                    return null;
                }
                if (KeyEvent_androidKt.m2399isCtrlPressedZmokQxo(event)) {
                    return null;
                }
                if (KeyEvent_androidKt.m2400isShiftPressedZmokQxo(event)) {
                    long jM2395getKeyZmokQxo2 = KeyEvent_androidKt.m2395getKeyZmokQxo(event);
                    Key.Companion companion2 = Key.INSTANCE;
                    if (Key.m2352equalsimpl0(jM2395getKeyZmokQxo2, companion2.m2363getDirectionLeftEK5gGoQ())) {
                        return KeyCommand.SELECT_LEFT_CHAR;
                    }
                    if (Key.m2352equalsimpl0(jM2395getKeyZmokQxo2, companion2.m2364getDirectionRightEK5gGoQ())) {
                        return KeyCommand.SELECT_RIGHT_CHAR;
                    }
                    if (Key.m2352equalsimpl0(jM2395getKeyZmokQxo2, companion2.m2365getDirectionUpEK5gGoQ())) {
                        return KeyCommand.SELECT_UP;
                    }
                    if (Key.m2352equalsimpl0(jM2395getKeyZmokQxo2, companion2.m2362getDirectionDownEK5gGoQ())) {
                        return KeyCommand.SELECT_DOWN;
                    }
                    if (Key.m2352equalsimpl0(jM2395getKeyZmokQxo2, companion2.m2376getPageUpEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_UP;
                    }
                    if (Key.m2352equalsimpl0(jM2395getKeyZmokQxo2, companion2.m2375getPageDownEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_DOWN;
                    }
                    if (Key.m2352equalsimpl0(jM2395getKeyZmokQxo2, companion2.m2371getMoveHomeEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_START;
                    }
                    if (Key.m2352equalsimpl0(jM2395getKeyZmokQxo2, companion2.m2370getMoveEndEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_END;
                    }
                    if (Key.m2352equalsimpl0(jM2395getKeyZmokQxo2, companion2.m2369getInsertEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    return null;
                }
                long jM2395getKeyZmokQxo3 = KeyEvent_androidKt.m2395getKeyZmokQxo(event);
                Key.Companion companion3 = Key.INSTANCE;
                if (Key.m2352equalsimpl0(jM2395getKeyZmokQxo3, companion3.m2363getDirectionLeftEK5gGoQ())) {
                    return KeyCommand.LEFT_CHAR;
                }
                if (Key.m2352equalsimpl0(jM2395getKeyZmokQxo3, companion3.m2364getDirectionRightEK5gGoQ())) {
                    return KeyCommand.RIGHT_CHAR;
                }
                if (Key.m2352equalsimpl0(jM2395getKeyZmokQxo3, companion3.m2365getDirectionUpEK5gGoQ())) {
                    return KeyCommand.UP;
                }
                if (Key.m2352equalsimpl0(jM2395getKeyZmokQxo3, companion3.m2362getDirectionDownEK5gGoQ())) {
                    return KeyCommand.DOWN;
                }
                if (Key.m2352equalsimpl0(jM2395getKeyZmokQxo3, companion3.m2361getDirectionCenterEK5gGoQ())) {
                    return KeyCommand.CENTER;
                }
                if (Key.m2352equalsimpl0(jM2395getKeyZmokQxo3, companion3.m2376getPageUpEK5gGoQ())) {
                    return KeyCommand.PAGE_UP;
                }
                if (Key.m2352equalsimpl0(jM2395getKeyZmokQxo3, companion3.m2375getPageDownEK5gGoQ())) {
                    return KeyCommand.PAGE_DOWN;
                }
                if (Key.m2352equalsimpl0(jM2395getKeyZmokQxo3, companion3.m2371getMoveHomeEK5gGoQ())) {
                    return KeyCommand.LINE_START;
                }
                if (Key.m2352equalsimpl0(jM2395getKeyZmokQxo3, companion3.m2370getMoveEndEK5gGoQ())) {
                    return KeyCommand.LINE_END;
                }
                if (Key.m2352equalsimpl0(jM2395getKeyZmokQxo3, companion3.m2366getEnterEK5gGoQ()) || Key.m2352equalsimpl0(jM2395getKeyZmokQxo3, companion3.m2374getNumPadEnterEK5gGoQ())) {
                    return KeyCommand.NEW_LINE;
                }
                if (Key.m2352equalsimpl0(jM2395getKeyZmokQxo3, companion3.m2356getBackspaceEK5gGoQ())) {
                    return KeyCommand.DELETE_PREV_CHAR;
                }
                if (Key.m2352equalsimpl0(jM2395getKeyZmokQxo3, companion3.m2360getDeleteEK5gGoQ())) {
                    return KeyCommand.DELETE_NEXT_CHAR;
                }
                if (Key.m2352equalsimpl0(jM2395getKeyZmokQxo3, companion3.m2377getPasteEK5gGoQ())) {
                    return KeyCommand.PASTE;
                }
                if (Key.m2352equalsimpl0(jM2395getKeyZmokQxo3, companion3.m2359getCutEK5gGoQ())) {
                    return KeyCommand.CUT;
                }
                if (Key.m2352equalsimpl0(jM2395getKeyZmokQxo3, companion3.m2358getCopyEK5gGoQ())) {
                    return KeyCommand.COPY;
                }
                if (Key.m2352equalsimpl0(jM2395getKeyZmokQxo3, companion3.m2379getTabEK5gGoQ())) {
                    return KeyCommand.TAB;
                }
                return null;
            }
        };
    }

    @NotNull
    public static final KeyMapping getDefaultKeyMapping() {
        return defaultKeyMapping;
    }
}
