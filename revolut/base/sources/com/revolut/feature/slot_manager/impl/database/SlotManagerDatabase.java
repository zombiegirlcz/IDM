package com.revolut.feature.slot_manager.impl.database;

import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import pkd.b;
import pkd.c;
import pkd.d;
import pkd.e;
import pkd.f;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/slot_manager/impl/database/SlotManagerDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "Companion", "a", "feature_slot_manager_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SlotManagerDatabase extends RoomDatabase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(0);
    public static final Migration[] f = {b.f237001c, c.f237002c, d.f237003c, e.f237004c, f.f237005c};

    /* JADX INFO: renamed from: com.revolut.feature.slot_manager.impl.database.SlotManagerDatabase$a, reason: from kotlin metadata */
    public static final class Companion extends ce0.c {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
            super("slot_manager_db", SlotManagerDatabase.class);
        }
    }

    public abstract okd.b g();
}
