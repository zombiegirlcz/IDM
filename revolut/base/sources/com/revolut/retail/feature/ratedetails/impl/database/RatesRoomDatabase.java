package com.revolut.retail.feature.ratedetails.impl.database;

import androidx.room.RoomDatabase;
import ce0.c;
import fpk.e;
import ipk.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/ratedetails/impl/database/RatesRoomDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "Companion", "a", "feature_rate_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RatesRoomDatabase extends RoomDatabase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(0);

    /* JADX INFO: renamed from: com.revolut.retail.feature.ratedetails.impl.database.RatesRoomDatabase$a, reason: from kotlin metadata */
    public static final class Companion extends c {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
            super("rates_database", RatesRoomDatabase.class);
        }
    }

    public abstract fpk.c g();

    public abstract jpk.c h();

    public abstract e i();

    public abstract b j();

    public abstract gpk.c k();
}
