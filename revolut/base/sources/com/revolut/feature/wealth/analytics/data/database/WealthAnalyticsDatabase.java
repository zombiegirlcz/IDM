package com.revolut.feature.wealth.analytics.data.database;

import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import kotlin.Metadata;
import nvg.t0;
import org.jetbrains.annotations.NotNull;
import ovg.a;
import ovg.a0;
import ovg.b;
import ovg.b0;
import ovg.c;
import ovg.c0;
import ovg.d;
import ovg.d0;
import ovg.e;
import ovg.e0;
import ovg.f;
import ovg.f0;
import ovg.g;
import ovg.g0;
import ovg.h;
import ovg.h0;
import ovg.i;
import ovg.i0;
import ovg.j;
import ovg.j0;
import ovg.k;
import ovg.k0;
import ovg.l;
import ovg.l0;
import ovg.m;
import ovg.m0;
import ovg.n;
import ovg.n0;
import ovg.o;
import ovg.o0;
import ovg.p;
import ovg.p0;
import ovg.q;
import ovg.q0;
import ovg.r;
import ovg.s;
import ovg.t;
import ovg.u;
import ovg.v;
import ovg.w;
import ovg.x;
import ovg.y;
import ovg.z;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/wealth/analytics/data/database/WealthAnalyticsDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "Companion", "a", "feature_wealth_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class WealthAnalyticsDatabase extends RoomDatabase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(0);
    public static final Migration[] f = {k.f230202c, v.f230220c, g0.f230195c, l0.f230205c, m0.f230207c, n0.f230209c, o0.f230211c, p0.f230213c, q0.f230215c, a.f230182c, b.f230184c, c.f230186c, d.f230188c, e.f230190c, f.f230192c, g.f230194c, h.f230196c, i.f230198c, j.f230200c, l.f230204c, m.f230206c, n.f230208c, o.f230210c, p.f230212c, q.f230214c, r.f230216c, s.f230217c, t.f230218c, u.f230219c, w.f230221c, x.f230222c, y.f230223c, z.f230224c, a0.f230183c, b0.f230185c, c0.f230187c, d0.f230189c, e0.f230191c, f0.f230193c, h0.f230197c, i0.f230199c, j0.f230201c, k0.f230203c};

    /* JADX INFO: renamed from: com.revolut.feature.wealth.analytics.data.database.WealthAnalyticsDatabase$a, reason: from kotlin metadata */
    public static final class Companion extends ce0.c {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
            super("wealth_analytics_db", WealthAnalyticsDatabase.class);
        }
    }

    public abstract nvg.a g();

    public abstract nvg.e h();

    public abstract nvg.i i();

    public abstract nvg.n j();

    public abstract nvg.q k();

    public abstract nvg.s l();

    public abstract nvg.u m();

    public abstract nvg.x n();

    public abstract nvg.a0 o();

    public abstract nvg.e0 p();

    public abstract nvg.h0 q();

    public abstract nvg.k0 r();

    public abstract nvg.n0 s();

    public abstract nvg.q0 t();

    public abstract t0 u();
}
