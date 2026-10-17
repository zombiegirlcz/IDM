package com.revolut.data.database;

import androidx.room.RoomDatabase;
import com.revolut.data.database.models.beneficiary.BeneficiaryDao;
import com.revolut.data.database.models.openbanking.ConsentsDao;
import com.revolut.data.database.models.openbanking.ExternalInstitutionsDao;
import com.revolut.data.database.models.recurringpayments.RecurringPaymentDao;
import com.revolut.data.database.models.splitbill.SplitBillDao;
import com.revolut.data.database.models.statement.StatementTemplatesInfoDao;
import com.revolut.data.database.models.transactioncategory.TransactionCustomCategoryDao;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/revolut/data/database/AppRoomDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "Companion", "a", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AppRoomDatabase extends RoomDatabase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.data.database.AppRoomDatabase$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public abstract BeneficiaryDao g();

    public abstract ConsentsDao h();

    public abstract ExternalInstitutionsDao i();

    public abstract RecurringPaymentDao j();

    public abstract SplitBillDao k();

    public abstract StatementTemplatesInfoDao l();

    public abstract TransactionCustomCategoryDao m();
}
