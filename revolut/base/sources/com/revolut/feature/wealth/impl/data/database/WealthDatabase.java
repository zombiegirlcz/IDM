package com.revolut.feature.wealth.impl.data.database;

import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import h7h.a;
import h7h.b;
import h7h.c;
import h7h.d;
import h7h.e;
import h7h.f;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/wealth/impl/data/database/WealthDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "Companion", "a", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class WealthDatabase extends RoomDatabase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(0);
    public static final Migration[] f = {a.f149879c, b.f149880c, c.f149881c, d.f149882c, e.f149883c, f.f149884c};

    /* JADX INFO: renamed from: com.revolut.feature.wealth.impl.data.database.WealthDatabase$a, reason: from kotlin metadata */
    public static final class Companion extends ce0.c {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
            super("wealth_database", WealthDatabase.class);
        }
    }

    public abstract f7h.f g();

    public abstract i7h.a h();
}
