package com.revolut.feature.contacts.impl.data.database;

import androidx.room.RoomDatabase;
import ce0.c;
import kotlin.Metadata;
import ml3.a;
import ml3.q;
import ml3.s;
import ml3.x;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/contacts/impl/data/database/ContactsDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "Companion", "a", "retail_feature_contacts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ContactsDatabase extends RoomDatabase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(0);

    /* JADX INFO: renamed from: com.revolut.feature.contacts.impl.data.database.ContactsDatabase$a, reason: from kotlin metadata */
    public static final class Companion extends c {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
            super("contacts_db", ContactsDatabase.class);
        }
    }

    public abstract a g();

    public abstract q h();

    public abstract s i();

    public abstract x j();
}
