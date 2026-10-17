package com.revolut.data.database.models.recurringpayments;

import efm.d0;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b!\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H'¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\n2\u0006\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H'¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\bH'¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentDao;", "", "<init>", "()V", "", "Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentEntity;", "getAllSync", "()Ljava/util/List;", "", "receiver", "Lefm/d0;", "getByReceiver", "(Ljava/lang/String;)Lefm/d0;", "recurringPayments", "", "insertOrUpdateAll", "(Ljava/util/List;)V", "id", "", "deleteById", "(Ljava/lang/String;)I", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RecurringPaymentDao {
    public abstract int deleteById(@NotNull String id10);

    @NotNull
    public abstract List<RecurringPaymentEntity> getAllSync();

    @NotNull
    public abstract d0<List<RecurringPaymentEntity>> getByReceiver(@NotNull String receiver);

    public abstract void insertOrUpdateAll(@NotNull List<RecurringPaymentEntity> recurringPayments);
}
