package com.revolut.retail.feature.impl;

import androidx.room.RoomDatabase;
import ce0.c;
import kotlin.Metadata;
import lqj.a;
import org.jetbrains.annotations.NotNull;
import psj.b;
import wsj.e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/impl/AnalyticsDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "Companion", "a", "feature_analytics_cycle_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AnalyticsDatabase extends RoomDatabase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(0);

    /* JADX INFO: renamed from: com.revolut.retail.feature.impl.AnalyticsDatabase$a, reason: from kotlin metadata */
    public static final class Companion extends c {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
            super("analytics_db", AnalyticsDatabase.class);
        }
    }

    public abstract a g();

    public abstract psj.a h();

    public abstract b i();

    public abstract wsj.a j();

    public abstract e k();

    public abstract qvj.a l();
}
