package com.onfido.android.sdk.capture.document;

import com.onfido.android.sdk.capture.utils.CountryCode;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J3\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/onfido/android/sdk/capture/document/GenericDocument;", "Ljava/io/Serializable;", "countryCode", "Lcom/onfido/android/sdk/capture/utils/CountryCode;", "documentTitle", "", "documentSubtitle", "documentPages", "Lcom/onfido/android/sdk/capture/document/DocumentPages;", "(Lcom/onfido/android/sdk/capture/utils/CountryCode;Ljava/lang/String;Ljava/lang/String;Lcom/onfido/android/sdk/capture/document/DocumentPages;)V", "getCountryCode", "()Lcom/onfido/android/sdk/capture/utils/CountryCode;", "getDocumentPages", "()Lcom/onfido/android/sdk/capture/document/DocumentPages;", "getDocumentSubtitle", "()Ljava/lang/String;", "getDocumentTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "onfido-public-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class GenericDocument implements Serializable {
    private static final long serialVersionUID = 1;

    @NotNull
    private final CountryCode countryCode;

    @NotNull
    private final DocumentPages documentPages;
    private final String documentSubtitle;

    @NotNull
    private final String documentTitle;

    public GenericDocument(@NotNull CountryCode countryCode, @NotNull String documentTitle, String str, @NotNull DocumentPages documentPages) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(documentTitle, "documentTitle");
        Intrinsics.checkNotNullParameter(documentPages, "documentPages");
        this.countryCode = countryCode;
        this.documentTitle = documentTitle;
        this.documentSubtitle = str;
        this.documentPages = documentPages;
    }

    public static /* synthetic */ GenericDocument copy$default(GenericDocument genericDocument, CountryCode countryCode, String str, String str2, DocumentPages documentPages, int i, Object obj2) {
        if ((i & 1) != 0) {
            countryCode = genericDocument.countryCode;
        }
        if ((i & 2) != 0) {
            str = genericDocument.documentTitle;
        }
        if ((i & 4) != 0) {
            str2 = genericDocument.documentSubtitle;
        }
        if ((i & 8) != 0) {
            documentPages = genericDocument.documentPages;
        }
        return genericDocument.copy(countryCode, str, str2, documentPages);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CountryCode getCountryCode() {
        return this.countryCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDocumentTitle() {
        return this.documentTitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDocumentSubtitle() {
        return this.documentSubtitle;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final DocumentPages getDocumentPages() {
        return this.documentPages;
    }

    @NotNull
    public final GenericDocument copy(@NotNull CountryCode countryCode, @NotNull String documentTitle, String documentSubtitle, @NotNull DocumentPages documentPages) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(documentTitle, "documentTitle");
        Intrinsics.checkNotNullParameter(documentPages, "documentPages");
        return new GenericDocument(countryCode, documentTitle, documentSubtitle, documentPages);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GenericDocument)) {
            return false;
        }
        GenericDocument genericDocument = (GenericDocument) other;
        return this.countryCode == genericDocument.countryCode && Intrinsics.f(this.documentTitle, genericDocument.documentTitle) && Intrinsics.f(this.documentSubtitle, genericDocument.documentSubtitle) && this.documentPages == genericDocument.documentPages;
    }

    @NotNull
    public final CountryCode getCountryCode() {
        return this.countryCode;
    }

    @NotNull
    public final DocumentPages getDocumentPages() {
        return this.documentPages;
    }

    public final String getDocumentSubtitle() {
        return this.documentSubtitle;
    }

    @NotNull
    public final String getDocumentTitle() {
        return this.documentTitle;
    }

    public int hashCode() {
        int iC = a.c(this.countryCode.hashCode() * 31, 31, this.documentTitle);
        String str = this.documentSubtitle;
        return this.documentPages.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        return "GenericDocument(countryCode=" + this.countryCode + ", documentTitle=" + this.documentTitle + ", documentSubtitle=" + this.documentSubtitle + ", documentPages=" + this.documentPages + ")";
    }

    public /* synthetic */ GenericDocument(CountryCode countryCode, String str, String str2, DocumentPages documentPages, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(countryCode, str, (i & 4) != 0 ? null : str2, documentPages);
    }
}
