package com.revolut.data.database.models.recurringpayments;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/revolut/data/database/models/recurringpayments/TransferReferencesEmbeddedEntity;", "", "references", "", "Lcom/revolut/data/database/models/recurringpayments/TransferReferencesEmbeddedEntity$TransferReferenceEntity;", "<init>", "(Ljava/util/List;)V", "getReferences", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "TransferReferenceEntity", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransferReferencesEmbeddedEntity {

    @b("references")
    @NotNull
    private final List<TransferReferenceEntity> references;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/revolut/data/database/models/recurringpayments/TransferReferencesEmbeddedEntity$TransferReferenceEntity;", "", "label", "", "value", "optionType", "fieldType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "getValue", "getOptionType", "getFieldType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransferReferenceEntity {

        @b("fieldType")
        @NotNull
        private final String fieldType;

        @b("label")
        @NotNull
        private final String label;

        @b("optionType")
        @NotNull
        private final String optionType;

        @b("value")
        @NotNull
        private final String value;

        public TransferReferenceEntity(@NotNull String label, @NotNull String value, @NotNull String optionType, @NotNull String fieldType) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(optionType, "optionType");
            Intrinsics.checkNotNullParameter(fieldType, "fieldType");
            this.label = label;
            this.value = value;
            this.optionType = optionType;
            this.fieldType = fieldType;
        }

        public static /* synthetic */ TransferReferenceEntity copy$default(TransferReferenceEntity transferReferenceEntity, String str, String str2, String str3, String str4, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = transferReferenceEntity.label;
            }
            if ((i & 2) != 0) {
                str2 = transferReferenceEntity.value;
            }
            if ((i & 4) != 0) {
                str3 = transferReferenceEntity.optionType;
            }
            if ((i & 8) != 0) {
                str4 = transferReferenceEntity.fieldType;
            }
            return transferReferenceEntity.copy(str, str2, str3, str4);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getOptionType() {
            return this.optionType;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getFieldType() {
            return this.fieldType;
        }

        @NotNull
        public final TransferReferenceEntity copy(@NotNull String label, @NotNull String value, @NotNull String optionType, @NotNull String fieldType) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(optionType, "optionType");
            Intrinsics.checkNotNullParameter(fieldType, "fieldType");
            return new TransferReferenceEntity(label, value, optionType, fieldType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TransferReferenceEntity)) {
                return false;
            }
            TransferReferenceEntity transferReferenceEntity = (TransferReferenceEntity) other;
            return Intrinsics.f(this.label, transferReferenceEntity.label) && Intrinsics.f(this.value, transferReferenceEntity.value) && Intrinsics.f(this.optionType, transferReferenceEntity.optionType) && Intrinsics.f(this.fieldType, transferReferenceEntity.fieldType);
        }

        @NotNull
        public final String getFieldType() {
            return this.fieldType;
        }

        @NotNull
        public final String getLabel() {
            return this.label;
        }

        @NotNull
        public final String getOptionType() {
            return this.optionType;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.fieldType.hashCode() + a.c(a.c(this.label.hashCode() * 31, 31, this.value), 31, this.optionType);
        }
    }

    public TransferReferencesEmbeddedEntity(@NotNull List<TransferReferenceEntity> references) {
        Intrinsics.checkNotNullParameter(references, "references");
        this.references = references;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TransferReferencesEmbeddedEntity copy$default(TransferReferencesEmbeddedEntity transferReferencesEmbeddedEntity, List list, int i, Object obj2) {
        if ((i & 1) != 0) {
            list = transferReferencesEmbeddedEntity.references;
        }
        return transferReferencesEmbeddedEntity.copy(list);
    }

    @NotNull
    public final List<TransferReferenceEntity> component1() {
        return this.references;
    }

    @NotNull
    public final TransferReferencesEmbeddedEntity copy(@NotNull List<TransferReferenceEntity> references) {
        Intrinsics.checkNotNullParameter(references, "references");
        return new TransferReferencesEmbeddedEntity(references);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TransferReferencesEmbeddedEntity) && Intrinsics.f(this.references, ((TransferReferencesEmbeddedEntity) other).references);
    }

    @NotNull
    public final List<TransferReferenceEntity> getReferences() {
        return this.references;
    }

    public int hashCode() {
        return this.references.hashCode();
    }
}
