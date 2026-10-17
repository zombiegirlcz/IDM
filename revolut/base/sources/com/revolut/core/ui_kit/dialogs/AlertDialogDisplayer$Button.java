package com.revolut.core.ui_kit.dialogs;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/revolut/core/ui_kit/dialogs/AlertDialogDisplayer$Button", "", "", "Lcom/revolut/core/ui_kit/dialogs/AlertDialogDisplayer$Button;", "POSITIVE", "NEGATIVE", "NEUTRAL", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AlertDialogDisplayer$Button {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AlertDialogDisplayer$Button[] $VALUES;
    public static final AlertDialogDisplayer$Button NEGATIVE;
    public static final AlertDialogDisplayer$Button NEUTRAL;
    public static final AlertDialogDisplayer$Button POSITIVE;

    static {
        AlertDialogDisplayer$Button alertDialogDisplayer$Button = new AlertDialogDisplayer$Button("POSITIVE", 0);
        POSITIVE = alertDialogDisplayer$Button;
        AlertDialogDisplayer$Button alertDialogDisplayer$Button2 = new AlertDialogDisplayer$Button("NEGATIVE", 1);
        NEGATIVE = alertDialogDisplayer$Button2;
        AlertDialogDisplayer$Button alertDialogDisplayer$Button3 = new AlertDialogDisplayer$Button("NEUTRAL", 2);
        NEUTRAL = alertDialogDisplayer$Button3;
        AlertDialogDisplayer$Button[] alertDialogDisplayer$ButtonArr = {alertDialogDisplayer$Button, alertDialogDisplayer$Button2, alertDialogDisplayer$Button3};
        $VALUES = alertDialogDisplayer$ButtonArr;
        $ENTRIES = s.n(alertDialogDisplayer$ButtonArr);
    }

    public static AlertDialogDisplayer$Button valueOf(String str) {
        return (AlertDialogDisplayer$Button) Enum.valueOf(AlertDialogDisplayer$Button.class, str);
    }

    public static AlertDialogDisplayer$Button[] values() {
        return (AlertDialogDisplayer$Button[]) $VALUES.clone();
    }
}
