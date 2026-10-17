package com.revolut.feature.global_markets.impl.data.database;

import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import ce0.c;
import kotlin.Metadata;
import n77.d;
import n77.i;
import o77.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/global_markets/impl/data/database/GlobalMarketsDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "Companion", "a", "feature_global_markets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class GlobalMarketsDatabase extends RoomDatabase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(0);
    public static final Migration[] f = {new a()};

    /* JADX INFO: renamed from: com.revolut.feature.global_markets.impl.data.database.GlobalMarketsDatabase$a, reason: from kotlin metadata */
    public static final class Companion extends c {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
            super("global_markets_db", GlobalMarketsDatabase.class);
        }
    }

    public abstract d g();

    public abstract i h();
}
