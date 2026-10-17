package com.revolut.data.database.models.openbanking;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H'J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H'J\b\u0010\b\u001a\u00020\tH'J\b\u0010\n\u001a\u00020\tH'J\u0016\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H'J\u0016\u0010\u000e\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0017J\u0016\u0010\u000f\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0017¨\u0006\u0010"}, d2 = {"Lcom/revolut/data/database/models/openbanking/ConsentsDao;", "", "<init>", "()V", "getAllActive", "", "Lcom/revolut/data/database/models/openbanking/ConsentEntity;", "getAllInactive", "deleteAllActive", "", "deleteAllInactive", "saveAll", "", "consents", "updateAll", "updateAllInactive", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ConsentsDao {
    public abstract int deleteAllActive();

    public abstract int deleteAllInactive();

    @NotNull
    public abstract List<ConsentEntity> getAllActive();

    @NotNull
    public abstract List<ConsentEntity> getAllInactive();

    public abstract void saveAll(@NotNull List<ConsentEntity> consents);

    public void updateAll(@NotNull List<ConsentEntity> consents) {
        Intrinsics.checkNotNullParameter(consents, "consents");
        deleteAllActive();
        saveAll(consents);
    }

    public void updateAllInactive(@NotNull List<ConsentEntity> consents) {
        Intrinsics.checkNotNullParameter(consents, "consents");
        deleteAllInactive();
        saveAll(consents);
    }
}
