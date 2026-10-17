package com.revolut.feature.account_switching.impl.data.storage;

import androidx.room.RoomDatabase;
import ce0.c;
import kotlin.Metadata;
import m91.a;
import m91.d;
import m91.f;
import m91.i;
import m91.k;
import m91.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/account_switching/impl/data/storage/AccountSwitchingDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "Companion", "a", "retail_feature_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AccountSwitchingDatabase extends RoomDatabase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(0);

    /* JADX INFO: renamed from: com.revolut.feature.account_switching.impl.data.storage.AccountSwitchingDatabase$a, reason: from kotlin metadata */
    public static final class Companion extends c {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
            super("retail_pae_account_switching_db", AccountSwitchingDatabase.class);
        }
    }

    public abstract a g();

    public abstract d h();

    public abstract f i();

    public abstract i j();

    public abstract k k();

    public abstract m l();
}
