package com.revolut.shared.feature.wealth_discovery.domain.impl.data.database;

import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import bhl.d;
import ce0.c;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/revolut/shared/feature/wealth_discovery/domain/impl/data/database/WealthDiscoveryDomainDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "Companion", "a", "feature_shared_wealth_discovery_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class WealthDiscoveryDomainDatabase extends RoomDatabase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(0);
    public static final Migration[] f = new Migration[0];

    /* JADX INFO: renamed from: com.revolut.shared.feature.wealth_discovery.domain.impl.data.database.WealthDiscoveryDomainDatabase$a, reason: from kotlin metadata */
    public static final class Companion extends c {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
            super("shared_wealth_discovery_domain_database", WealthDiscoveryDomainDatabase.class);
        }
    }

    public abstract d g();
}
