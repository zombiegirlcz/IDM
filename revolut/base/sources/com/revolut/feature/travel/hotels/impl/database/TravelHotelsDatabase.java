package com.revolut.feature.travel.hotels.impl.database;

import androidx.room.RoomDatabase;
import ce0.c;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import z8g.b;
import z8g.d;
import z8g.f;
import z8g.g;
import z8g.j;
import z8g.l;
import z8g.n;
import z8g.p;
import z8g.r;
import z8g.s;
import z8g.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/database/TravelHotelsDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "Companion", "a", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TravelHotelsDatabase extends RoomDatabase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(0);

    /* JADX INFO: renamed from: com.revolut.feature.travel.hotels.impl.database.TravelHotelsDatabase$a, reason: from kotlin metadata */
    public static final class Companion extends c {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
            super("travel_hotels_db", TravelHotelsDatabase.class);
        }
    }

    public abstract b g();

    public abstract d h();

    public abstract f i();

    public abstract g j();

    public abstract j k();

    public abstract l l();

    public abstract n m();

    public abstract p n();

    public abstract r o();

    public abstract s p();

    public abstract u q();
}
