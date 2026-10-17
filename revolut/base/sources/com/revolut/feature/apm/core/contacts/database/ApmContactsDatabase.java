package com.revolut.feature.apm.core.contacts.database;

import androidx.room.RoomDatabase;
import ce0.c;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sx1.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/apm/core/contacts/database/ApmContactsDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "Companion", "a", "feature_apm_core_contacts_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ApmContactsDatabase extends RoomDatabase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(0);

    /* JADX INFO: renamed from: com.revolut.feature.apm.core.contacts.database.ApmContactsDatabase$a, reason: from kotlin metadata */
    public static final class Companion extends c {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
            super("apm_contacts_db", ApmContactsDatabase.class);
        }
    }

    public abstract a g();

    public abstract tx1.a h();

    public abstract ux1.a i();

    public abstract vx1.a j();

    public abstract xx1.a k();

    public abstract zx1.a l();

    public abstract ay1.a m();

    public abstract by1.a n();

    public abstract cy1.a o();

    public abstract dy1.a p();
}
