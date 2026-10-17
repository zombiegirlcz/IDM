package com.revolut.data.database.models.splitbill;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b!\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H'J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH'J\u0016\u0010\n\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H'J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0006H'J\u0016\u0010\u000e\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0005H'J\u0016\u0010\u0010\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0017¨\u0006\u0011"}, d2 = {"Lcom/revolut/data/database/models/splitbill/SplitBillDao;", "", "<init>", "()V", "splitBills", "", "Lcom/revolut/data/database/models/splitbill/SplitBillEntity;", "getById", "id", "", "createOrUpdateSplitBills", "", "createOrUpdate", "splitBill", "deleteAllById", "ids", "replaceAll", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SplitBillDao {
    public abstract void createOrUpdate(@NotNull SplitBillEntity splitBill);

    public abstract void createOrUpdateSplitBills(@NotNull List<SplitBillEntity> splitBills);

    public abstract void deleteAllById(@NotNull List<String> ids);

    public abstract SplitBillEntity getById(@NotNull String id10);

    public void replaceAll(@NotNull List<SplitBillEntity> splitBills) {
        Intrinsics.checkNotNullParameter(splitBills, "splitBills");
        Set setQ0 = d0.Q0(splitBills(), splitBills);
        ArrayList arrayList = new ArrayList(w.t(setQ0, 10));
        Iterator it8 = setQ0.iterator();
        while (it8.hasNext()) {
            arrayList.add(((SplitBillEntity) it8.next()).getId());
        }
        if (!arrayList.isEmpty()) {
            deleteAllById(arrayList);
        }
        if (splitBills.isEmpty()) {
            return;
        }
        createOrUpdateSplitBills(splitBills);
    }

    @NotNull
    public abstract List<SplitBillEntity> splitBills();
}
