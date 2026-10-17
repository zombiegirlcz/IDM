package com.revolut.feature.shared.autoinvest.impl.database;

import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import y5d.a;
import y5d.b;
import y5d.c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/shared/autoinvest/impl/database/AutoInvestDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "Companion", "a", "feature_shared_autoinvest_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AutoInvestDatabase extends RoomDatabase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(0);
    public static final Migration[] f = {a.f311073c, b.f311074c, c.f311075c};

    /* JADX INFO: renamed from: com.revolut.feature.shared.autoinvest.impl.database.AutoInvestDatabase$a, reason: from kotlin metadata */
    public static final class Companion extends ce0.c {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
            super("autoinvest_db", AutoInvestDatabase.class);
        }
    }

    public abstract v5d.a g();
}
