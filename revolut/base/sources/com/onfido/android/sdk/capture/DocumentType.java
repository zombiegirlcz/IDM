package com.onfido.android.sdk.capture;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/onfido/android/sdk/capture/DocumentType;", "", "id", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "PASSPORT", "DRIVING_LICENCE", "NATIONAL_IDENTITY_CARD", "RESIDENCE_PERMIT", "VISA", "WORK_PERMIT", "PASSPORT_CARD", "GENERIC", "UNKNOWN", "onfido-public-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DocumentType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DocumentType[] $VALUES;

    @NotNull
    private final String id;
    public static final DocumentType PASSPORT = new DocumentType("PASSPORT", 0, "passport");
    public static final DocumentType DRIVING_LICENCE = new DocumentType("DRIVING_LICENCE", 1, "driving_licence");
    public static final DocumentType NATIONAL_IDENTITY_CARD = new DocumentType("NATIONAL_IDENTITY_CARD", 2, "national_id");
    public static final DocumentType RESIDENCE_PERMIT = new DocumentType("RESIDENCE_PERMIT", 3, "residence_permit");
    public static final DocumentType VISA = new DocumentType("VISA", 4, "visa");
    public static final DocumentType WORK_PERMIT = new DocumentType("WORK_PERMIT", 5, "work_permit");
    public static final DocumentType PASSPORT_CARD = new DocumentType("PASSPORT_CARD", 6, "passport_card");
    public static final DocumentType GENERIC = new DocumentType("GENERIC", 7, "generic");
    public static final DocumentType UNKNOWN = new DocumentType("UNKNOWN", 8, "unknown");

    private static final /* synthetic */ DocumentType[] $values() {
        return new DocumentType[]{PASSPORT, DRIVING_LICENCE, NATIONAL_IDENTITY_CARD, RESIDENCE_PERMIT, VISA, WORK_PERMIT, PASSPORT_CARD, GENERIC, UNKNOWN};
    }

    static {
        DocumentType[] documentTypeArr$values = $values();
        $VALUES = documentTypeArr$values;
        $ENTRIES = s.n(documentTypeArr$values);
    }

    private DocumentType(String str, int i, String str2) {
        this.id = str2;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static DocumentType valueOf(String str) {
        return (DocumentType) Enum.valueOf(DocumentType.class, str);
    }

    public static DocumentType[] values() {
        return (DocumentType[]) $VALUES.clone();
    }

    @NotNull
    public final String getId() {
        return this.id;
    }
}
