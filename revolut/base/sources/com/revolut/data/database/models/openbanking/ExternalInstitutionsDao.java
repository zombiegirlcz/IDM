package com.revolut.data.database.models.openbanking;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H'J\b\u0010\u0007\u001a\u00020\bH'J\u0016\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005H'J\u0016\u0010\r\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0005H'J\u0016\u0010\u0010\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0017J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0006H\u0002¨\u0006\u0013"}, d2 = {"Lcom/revolut/data/database/models/openbanking/ExternalInstitutionsDao;", "", "<init>", "()V", "getAll", "", "Lcom/revolut/data/database/models/openbanking/ExternalInstitutionsWithBranches;", "deleteAll", "", "saveAllInstitutions", "", "institutions", "Lcom/revolut/data/database/models/openbanking/ExternalInstitutionEntity;", "saveInstitutionBranches", "branches", "Lcom/revolut/data/database/models/openbanking/ExternalInstitutionBranchEntity;", "updateAll", "institutionsWithBranches", "institutionWithBranches", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ExternalInstitutionsDao {
    private final void saveInstitutionBranches(ExternalInstitutionsWithBranches institutionWithBranches) {
        List<ExternalInstitutionBranchEntity> branches = institutionWithBranches.getBranches();
        if (branches != null) {
            saveInstitutionBranches(branches);
        }
    }

    public abstract int deleteAll();

    @NotNull
    public abstract List<ExternalInstitutionsWithBranches> getAll();

    public abstract void saveAllInstitutions(@NotNull List<ExternalInstitutionEntity> institutions);

    public abstract void saveInstitutionBranches(@NotNull List<ExternalInstitutionBranchEntity> branches);

    public void updateAll(@NotNull List<ExternalInstitutionsWithBranches> institutionsWithBranches) {
        Intrinsics.checkNotNullParameter(institutionsWithBranches, "institutionsWithBranches");
        deleteAll();
        List<ExternalInstitutionsWithBranches> list = institutionsWithBranches;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator<T> it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(((ExternalInstitutionsWithBranches) it8.next()).getInstitution());
        }
        saveAllInstitutions(arrayList);
        Iterator<T> it9 = list.iterator();
        while (it9.hasNext()) {
            saveInstitutionBranches((ExternalInstitutionsWithBranches) it9.next());
        }
    }
}
