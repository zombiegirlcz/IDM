package com.fourthline.orca.workflow;

import com.fourthline.core.DocumentType;
import com.fourthline.orca.core.ProductConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/fourthline/orca/workflow/DocumentComponentConfig;", "Lcom/fourthline/orca/core/ProductConfig;", "Lcom/fourthline/core/DocumentType;", "type", "", "issuingCountry", "<init>", "(Lcom/fourthline/core/DocumentType;Ljava/lang/String;)V", "component1", "()Lcom/fourthline/core/DocumentType;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/fourthline/core/DocumentType;Ljava/lang/String;)Lcom/fourthline/orca/workflow/DocumentComponentConfig;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/fourthline/core/DocumentType;", "getType", "b", "Ljava/lang/String;", "getIssuingCountry", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentComponentConfig implements ProductConfig {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final DocumentType type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String issuingCountry;

    public DocumentComponentConfig(@NotNull DocumentType type, @NotNull String issuingCountry) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(issuingCountry, "issuingCountry");
        this.type = type;
        this.issuingCountry = issuingCountry;
    }

    public static /* synthetic */ DocumentComponentConfig copy$default(DocumentComponentConfig documentComponentConfig, DocumentType documentType, String str, int i, Object obj2) {
        if ((i & 1) != 0) {
            documentType = documentComponentConfig.type;
        }
        if ((i & 2) != 0) {
            str = documentComponentConfig.issuingCountry;
        }
        return documentComponentConfig.copy(documentType, str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DocumentType getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIssuingCountry() {
        return this.issuingCountry;
    }

    @NotNull
    public final DocumentComponentConfig copy(@NotNull DocumentType type, @NotNull String issuingCountry) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(issuingCountry, "issuingCountry");
        return new DocumentComponentConfig(type, issuingCountry);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentComponentConfig)) {
            return false;
        }
        DocumentComponentConfig documentComponentConfig = (DocumentComponentConfig) other;
        return this.type == documentComponentConfig.type && Intrinsics.f(this.issuingCountry, documentComponentConfig.issuingCountry);
    }

    @NotNull
    public final String getIssuingCountry() {
        return this.issuingCountry;
    }

    @NotNull
    public final DocumentType getType() {
        return this.type;
    }

    public int hashCode() {
        return (this.type.hashCode() * 31) + this.issuingCountry.hashCode();
    }

    @NotNull
    public String toString() {
        return "DocumentComponentConfig(type=" + this.type + ", issuingCountry=" + this.issuingCountry + ")";
    }
}
