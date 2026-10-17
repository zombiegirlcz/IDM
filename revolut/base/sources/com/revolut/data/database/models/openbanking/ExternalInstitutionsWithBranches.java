package com.revolut.data.database.models.openbanking;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/revolut/data/database/models/openbanking/ExternalInstitutionsWithBranches;", "", "institution", "Lcom/revolut/data/database/models/openbanking/ExternalInstitutionEntity;", "branches", "", "Lcom/revolut/data/database/models/openbanking/ExternalInstitutionBranchEntity;", "<init>", "(Lcom/revolut/data/database/models/openbanking/ExternalInstitutionEntity;Ljava/util/List;)V", "getInstitution", "()Lcom/revolut/data/database/models/openbanking/ExternalInstitutionEntity;", "getBranches", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExternalInstitutionsWithBranches {
    private final List<ExternalInstitutionBranchEntity> branches;

    @NotNull
    private final ExternalInstitutionEntity institution;

    public ExternalInstitutionsWithBranches(@NotNull ExternalInstitutionEntity institution, List<ExternalInstitutionBranchEntity> list) {
        Intrinsics.checkNotNullParameter(institution, "institution");
        this.institution = institution;
        this.branches = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExternalInstitutionsWithBranches copy$default(ExternalInstitutionsWithBranches externalInstitutionsWithBranches, ExternalInstitutionEntity externalInstitutionEntity, List list, int i, Object obj2) {
        if ((i & 1) != 0) {
            externalInstitutionEntity = externalInstitutionsWithBranches.institution;
        }
        if ((i & 2) != 0) {
            list = externalInstitutionsWithBranches.branches;
        }
        return externalInstitutionsWithBranches.copy(externalInstitutionEntity, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ExternalInstitutionEntity getInstitution() {
        return this.institution;
    }

    public final List<ExternalInstitutionBranchEntity> component2() {
        return this.branches;
    }

    @NotNull
    public final ExternalInstitutionsWithBranches copy(@NotNull ExternalInstitutionEntity institution, List<ExternalInstitutionBranchEntity> branches) {
        Intrinsics.checkNotNullParameter(institution, "institution");
        return new ExternalInstitutionsWithBranches(institution, branches);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExternalInstitutionsWithBranches)) {
            return false;
        }
        ExternalInstitutionsWithBranches externalInstitutionsWithBranches = (ExternalInstitutionsWithBranches) other;
        return Intrinsics.f(this.institution, externalInstitutionsWithBranches.institution) && Intrinsics.f(this.branches, externalInstitutionsWithBranches.branches);
    }

    public final List<ExternalInstitutionBranchEntity> getBranches() {
        return this.branches;
    }

    @NotNull
    public final ExternalInstitutionEntity getInstitution() {
        return this.institution;
    }

    public int hashCode() {
        int iHashCode = this.institution.hashCode() * 31;
        List<ExternalInstitutionBranchEntity> list = this.branches;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }
}
