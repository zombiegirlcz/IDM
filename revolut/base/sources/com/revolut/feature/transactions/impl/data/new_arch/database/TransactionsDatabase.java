package com.revolut.feature.transactions.impl.data.new_arch.database;

import androidx.room.RoomDatabase;
import kotlin.Metadata;
import mif.b;
import mif.f;
import mif.h;
import mif.j;
import mif.o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/transactions/impl/data/new_arch/database/TransactionsDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "Companion", "a", "retail_feature_transactions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TransactionsDatabase extends RoomDatabase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.transactions.impl.data.new_arch.database.TransactionsDatabase$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public abstract b g();

    public abstract f h();

    public abstract h i();

    public abstract j j();

    public abstract o k();
}
