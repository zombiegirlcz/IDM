package com.revolut.feature.defi.rates.impl.data;

import androidx.room.RoomDatabase;
import ce0.c;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v46.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/defi/rates/impl/data/DeFiRatesDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "Companion", "a", "feature_defi_rates_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class DeFiRatesDatabase extends RoomDatabase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(0);

    /* JADX INFO: renamed from: com.revolut.feature.defi.rates.impl.data.DeFiRatesDatabase$a, reason: from kotlin metadata */
    public static final class Companion extends c {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
            super("defi_rates_db", DeFiRatesDatabase.class);
        }
    }

    public abstract a g();
}
