package com.revolut.shared.feature.wealth.domain.impl.data.database;

import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import dcl.a0;
import dcl.d0;
import dcl.i0;
import dcl.k0;
import dcl.n0;
import dcl.o0;
import dcl.p0;
import dcl.r0;
import dcl.u0;
import dcl.w0;
import dcl.y;
import gcl.a;
import gcl.b;
import gcl.c;
import gcl.d;
import gcl.e;
import gcl.f;
import gcl.g;
import gcl.h;
import gcl.i;
import gcl.j;
import gcl.k;
import gcl.l;
import gcl.m;
import gcl.n;
import gcl.o;
import gcl.p;
import gcl.q;
import gcl.r;
import gcl.s;
import gcl.t;
import gcl.u;
import gcl.v;
import gcl.w;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/revolut/shared/feature/wealth/domain/impl/data/database/WealthDomainDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "Companion", "a", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class WealthDomainDatabase extends RoomDatabase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(0);
    public static final Migration[] f = {k.f142539c, p.f142544c, q.f142545c, r.f142546c, s.f142547c, t.f142548c, u.f142549c, v.f142550c, w.f142551c, a.f142529c, b.f142530c, c.f142531c, d.f142532c, e.f142533c, f.f142534c, g.f142535c, h.f142536c, i.f142537c, j.f142538c, l.f142540c, m.f142541c, n.f142542c, o.f142543c};

    /* JADX INFO: renamed from: com.revolut.shared.feature.wealth.domain.impl.data.database.WealthDomainDatabase$a, reason: from kotlin metadata */
    public static final class Companion extends ce0.c {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
            super("shared_wealth_domain_database", WealthDomainDatabase.class);
        }
    }

    public abstract r0 A();

    public abstract u0 B();

    public abstract w0 C();

    public abstract ecl.b D();

    public abstract ecl.d E();

    public abstract dcl.a g();

    public abstract dcl.c h();

    public abstract dcl.o i();

    public abstract dcl.e j();

    public abstract dcl.g k();

    public abstract dcl.i l();

    public abstract dcl.k m();

    public abstract dcl.m n();

    public abstract i0 o();

    public abstract dcl.q p();

    public abstract dcl.r q();

    public abstract dcl.t r();

    public abstract dcl.w s();

    public abstract y t();

    public abstract a0 u();

    public abstract d0 v();

    public abstract k0 w();

    public abstract n0 x();

    public abstract o0 y();

    public abstract p0 z();
}
