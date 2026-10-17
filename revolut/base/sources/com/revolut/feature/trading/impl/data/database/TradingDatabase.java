package com.revolut.feature.trading.impl.data.database;

import androidx.room.RoomDatabase;
import ce0.c;
import j3f.a;
import j3f.f;
import j3f.i;
import k3f.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/trading/impl/data/database/TradingDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "Companion", "a", "feature_trading_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TradingDatabase extends RoomDatabase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(0);

    /* JADX INFO: renamed from: com.revolut.feature.trading.impl.data.database.TradingDatabase$a, reason: from kotlin metadata */
    public static final class Companion extends c {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
            super("trading_database", TradingDatabase.class);
        }
    }

    public abstract a g();

    public abstract j3f.c h();

    public abstract k3f.a i();

    public abstract f j();

    public abstract i k();

    public abstract b l();
}
