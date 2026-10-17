package com.revolut.data.database.models.transactioncategory;

import efm.d0;
import efm.r;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import t11.b2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b!\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b0\u00072\u0006\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0005H'¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\u0005H'¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0002H'¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0018\u001a\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\bH'¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\u0005H'¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/revolut/data/database/models/transactioncategory/TransactionCustomCategoryDao;", "Lt11/b2;", "Lcom/revolut/data/database/models/transactioncategory/TransactionCustomCategoryEntity;", "<init>", "()V", "", "walletId", "Lefm/r;", "", "observeAll", "(Ljava/lang/String;)Lefm/r;", "getAll", "(Ljava/lang/String;)Ljava/util/List;", "id", "Lefm/d0;", "getById", "(Ljava/lang/String;)Lefm/d0;", "getIfExistById", "(Ljava/lang/String;)Lcom/revolut/data/database/models/transactioncategory/TransactionCustomCategoryEntity;", "entity", "", "insert", "(Lcom/revolut/data/database/models/transactioncategory/TransactionCustomCategoryEntity;)V", "entities", "insertAll", "(Ljava/util/List;)V", "", "delete", "(Ljava/lang/String;)I", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TransactionCustomCategoryDao extends b2 {
    public abstract int delete(@NotNull String id10);

    @NotNull
    public abstract List<TransactionCustomCategoryEntity> getAll(@NotNull String walletId);

    @NotNull
    public abstract d0<TransactionCustomCategoryEntity> getById(@NotNull String id10);

    public abstract TransactionCustomCategoryEntity getIfExistById(@NotNull String id10);

    public abstract void insert(@NotNull TransactionCustomCategoryEntity entity);

    public abstract void insertAll(@NotNull List<TransactionCustomCategoryEntity> entities);

    @NotNull
    public abstract r<List<TransactionCustomCategoryEntity>> observeAll(@NotNull String walletId);
}
