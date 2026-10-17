package com.revolut.feature.shared.airtip.impl.data.database;

import androidx.room.RoomDatabase;
import androidx.room.migration.AutoMigrationSpec;
import ce0.c;
import g5d.d;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b!\u0018\u0000 \u00042\u00020\u0001:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/shared/airtip/impl/data/database/AirTipDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "Companion", "b", "a", "feature_shared_airtip_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AirTipDatabase extends RoomDatabase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(0);

    /* JADX INFO: renamed from: com.revolut.feature.shared.airtip.impl.data.database.AirTipDatabase$a, reason: from kotlin metadata */
    public static final class Companion extends c {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
            super("shared_air_tip_db", AirTipDatabase.class);
        }
    }

    public static final class b implements AutoMigrationSpec {
    }

    public abstract d g();
}
