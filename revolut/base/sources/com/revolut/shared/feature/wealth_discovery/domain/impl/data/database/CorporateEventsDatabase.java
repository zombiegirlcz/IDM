package com.revolut.shared.feature.wealth_discovery.domain.impl.data.database;

import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import dhl.b;
import dhl.c;
import dhl.d;
import dhl.e;
import dhl.f;
import dhl.g;
import dhl.h;
import dhl.i;
import dhl.j;
import dhl.k;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import yo3.a;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/revolut/shared/feature/wealth_discovery/domain/impl/data/database/CorporateEventsDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "Companion", "a", "feature_shared_wealth_discovery_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CorporateEventsDatabase extends RoomDatabase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(0);
    public static final Migration[] f = {d.f114843c, e.f114844c, f.f114845c, g.f114846c, h.f114847c, i.f114848c, j.f114849c, k.f114850c, a.f315551c, dhl.a.f114840c, b.f114841c, c.f114842c};

    /* JADX INFO: renamed from: com.revolut.shared.feature.wealth_discovery.domain.impl.data.database.CorporateEventsDatabase$a, reason: from kotlin metadata */
    public static final class Companion extends ce0.c {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
            super("corporate_events_db", CorporateEventsDatabase.class);
        }
    }

    public abstract bhl.a g();

    public abstract bhl.f h();
}
