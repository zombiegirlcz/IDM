package com.revolut.data.database.models.beneficiary;

import efm.r;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import t11.b2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b!\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H'¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H'¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0002H'¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u0016H'¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00162\u0006\u0010\u0019\u001a\u00020\fH'¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/revolut/data/database/models/beneficiary/BeneficiaryDao;", "Lt11/b2;", "Lcom/revolut/data/database/models/beneficiary/BeneficiaryEntity;", "<init>", "()V", "", "getAllSync", "()Ljava/util/List;", "", "id", "getByIdSync", "(Ljava/lang/String;)Lcom/revolut/data/database/models/beneficiary/BeneficiaryEntity;", "", "deleteAll", "()I", "entityList", "", "insertAll", "(Ljava/util/List;)V", "entity", "insert", "(Lcom/revolut/data/database/models/beneficiary/BeneficiaryEntity;)V", "Lefm/r;", "observeRecent", "()Lefm/r;", "limit", "observeFrequent", "(I)Lefm/r;", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BeneficiaryDao extends b2 {
    public abstract int deleteAll();

    @NotNull
    public abstract List<BeneficiaryEntity> getAllSync();

    public abstract BeneficiaryEntity getByIdSync(@NotNull String id10);

    public abstract void insert(@NotNull BeneficiaryEntity entity);

    public abstract void insertAll(@NotNull List<BeneficiaryEntity> entityList);

    @NotNull
    public abstract r<List<BeneficiaryEntity>> observeFrequent(int limit);

    @NotNull
    public abstract r<List<BeneficiaryEntity>> observeRecent();
}
