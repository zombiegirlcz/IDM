package com.fourthline.core;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/fourthline/core/DocumentType;", "", "<init>", "(Ljava/lang/String;I)V", "PASSPORT", "ID_CARD", "DRIVERS_LICENSE", "RESIDENCE_PERMIT", "PAPER_ID", "FRENCH_ID_CARD", "DUTCH_DRIVERS_LICENSE", "PROOF_OF_ADDRESS", "TIN_REFERENCE_DOCUMENT", "fourthline-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DocumentType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ DocumentType[] f26251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f26252b;
    public static final DocumentType PASSPORT = new DocumentType("PASSPORT", 0);
    public static final DocumentType ID_CARD = new DocumentType("ID_CARD", 1);
    public static final DocumentType DRIVERS_LICENSE = new DocumentType("DRIVERS_LICENSE", 2);
    public static final DocumentType RESIDENCE_PERMIT = new DocumentType("RESIDENCE_PERMIT", 3);
    public static final DocumentType PAPER_ID = new DocumentType("PAPER_ID", 4);
    public static final DocumentType FRENCH_ID_CARD = new DocumentType("FRENCH_ID_CARD", 5);
    public static final DocumentType DUTCH_DRIVERS_LICENSE = new DocumentType("DUTCH_DRIVERS_LICENSE", 6);
    public static final DocumentType PROOF_OF_ADDRESS = new DocumentType("PROOF_OF_ADDRESS", 7);
    public static final DocumentType TIN_REFERENCE_DOCUMENT = new DocumentType("TIN_REFERENCE_DOCUMENT", 8);

    static {
        DocumentType[] documentTypeArrA = a();
        f26251a = documentTypeArrA;
        f26252b = s.n(documentTypeArrA);
    }

    private DocumentType(String str, int i) {
    }

    private static final /* synthetic */ DocumentType[] a() {
        return new DocumentType[]{PASSPORT, ID_CARD, DRIVERS_LICENSE, RESIDENCE_PERMIT, PAPER_ID, FRENCH_ID_CARD, DUTCH_DRIVERS_LICENSE, PROOF_OF_ADDRESS, TIN_REFERENCE_DOCUMENT};
    }

    @NotNull
    public static EnumEntries getEntries() {
        return f26252b;
    }

    public static DocumentType valueOf(String str) {
        return (DocumentType) Enum.valueOf(DocumentType.class, str);
    }

    public static DocumentType[] values() {
        return (DocumentType[]) f26251a.clone();
    }
}
