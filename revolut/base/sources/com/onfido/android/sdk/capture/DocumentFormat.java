package com.onfido.android.sdk.capture;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/onfido/android/sdk/capture/DocumentFormat;", "", "(Ljava/lang/String;I)V", "CARD", "FOLDED", "onfido-public-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DocumentFormat {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DocumentFormat[] $VALUES;
    public static final DocumentFormat CARD = new DocumentFormat("CARD", 0);
    public static final DocumentFormat FOLDED = new DocumentFormat("FOLDED", 1);

    private static final /* synthetic */ DocumentFormat[] $values() {
        return new DocumentFormat[]{CARD, FOLDED};
    }

    static {
        DocumentFormat[] documentFormatArr$values = $values();
        $VALUES = documentFormatArr$values;
        $ENTRIES = s.n(documentFormatArr$values);
    }

    private DocumentFormat(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static DocumentFormat valueOf(String str) {
        return (DocumentFormat) Enum.valueOf(DocumentFormat.class, str);
    }

    public static DocumentFormat[] values() {
        return (DocumentFormat[]) $VALUES.clone();
    }
}
