package com.revolut.data.database.models.charity;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b!\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H'J\u0016\u0010\n\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H'J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u000eH'¨\u0006\u000f"}, d2 = {"Lcom/revolut/data/database/models/charity/CharityDao;", "", "<init>", "()V", "getAllCharities", "", "Lcom/revolut/data/database/models/charity/CharityEntity;", "createOrUpdate", "", "request", "createOrUpdateAll", "requests", "getById", "id", "", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CharityDao {
    public abstract void createOrUpdate(@NotNull CharityEntity request);

    public abstract void createOrUpdateAll(@NotNull List<CharityEntity> requests);

    @NotNull
    public abstract List<CharityEntity> getAllCharities();

    public abstract CharityEntity getById(@NotNull String id10);
}
