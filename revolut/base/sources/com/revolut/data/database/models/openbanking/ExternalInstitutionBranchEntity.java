package com.revolut.data.database.models.openbanking;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/revolut/data/database/models/openbanking/ExternalInstitutionBranchEntity;", "", "id", "", "name", "institutionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "getInstitutionId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExternalInstitutionBranchEntity {

    @NotNull
    private final String id;

    @NotNull
    private final String institutionId;

    @NotNull
    private final String name;

    public ExternalInstitutionBranchEntity(@NotNull String id10, @NotNull String name, @NotNull String institutionId) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        this.id = id10;
        this.name = name;
        this.institutionId = institutionId;
    }

    public static /* synthetic */ ExternalInstitutionBranchEntity copy$default(ExternalInstitutionBranchEntity externalInstitutionBranchEntity, String str, String str2, String str3, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = externalInstitutionBranchEntity.id;
        }
        if ((i & 2) != 0) {
            str2 = externalInstitutionBranchEntity.name;
        }
        if ((i & 4) != 0) {
            str3 = externalInstitutionBranchEntity.institutionId;
        }
        return externalInstitutionBranchEntity.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getInstitutionId() {
        return this.institutionId;
    }

    @NotNull
    public final ExternalInstitutionBranchEntity copy(@NotNull String id10, @NotNull String name, @NotNull String institutionId) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        return new ExternalInstitutionBranchEntity(id10, name, institutionId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExternalInstitutionBranchEntity)) {
            return false;
        }
        ExternalInstitutionBranchEntity externalInstitutionBranchEntity = (ExternalInstitutionBranchEntity) other;
        return Intrinsics.f(this.id, externalInstitutionBranchEntity.id) && Intrinsics.f(this.name, externalInstitutionBranchEntity.name) && Intrinsics.f(this.institutionId, externalInstitutionBranchEntity.institutionId);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getInstitutionId() {
        return this.institutionId;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.institutionId.hashCode() + p.a.c(this.id.hashCode() * 31, 31, this.name);
    }
}
