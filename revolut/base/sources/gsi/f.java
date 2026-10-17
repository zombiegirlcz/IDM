package gsi;

import android.app.Activity;
import android.content.Context;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import fw2.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import sri.m;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public final class f implements fsi.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BaseDelegatesActivity f146537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f146538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f146539c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f146540g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f146541h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f146542j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f146543l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f146544m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f146545n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f146546p;

    public f(i iVar, BaseDelegatesActivity baseDelegatesActivity, Integer num) {
        this.f146537a = baseDelegatesActivity;
        this.f146538b = num;
        this.f146539c = iVar;
        int i = 9;
        this.d = e4m.b.b(new l(this, 0, i));
        this.e = e4m.b.b(new l(this, 1, i));
        this.f = e4m.b.b(new l(this, 2, i));
        this.f146540g = e4m.b.b(new l(this, 3, i));
        this.f146541h = e4m.b.b(new l(this, 4, i));
        this.i = e4m.b.b(new l(this, 5, i));
        this.f146542j = e4m.b.b(new l(this, 6, i));
        this.k = e4m.b.b(new l(this, 7, i));
        this.f146543l = e4m.b.b(new l(this, 8, i));
        e4m.b.b(new l(this, 9, i));
        this.f146544m = e4m.b.b(new l(this, 10, i));
        this.f146545n = e4m.b.b(new l(this, 11, i));
        this.o = e4m.b.b(new l(this, 12, i));
        this.f146546p = e4m.b.b(new l(this, 13, i));
    }

    @Override // fsi.g
    public final yy0.f Q() {
        return (yy0.f) this.e.get();
    }

    @Override // fsi.g
    public final mz0.a V() {
        return (mz0.a) this.f.get();
    }

    @Override // fsi.g
    public final c01.d W() {
        return (c01.d) this.o.get();
    }

    @Override // fsi.g
    public final py0.e X() {
        return (py0.e) this.i.get();
    }

    @Override // fsi.g
    public final xy0.a Y() {
        return (xy0.a) this.k.get();
    }

    @Override // fsi.g
    public final h01.b Z() {
        return (h01.b) this.f146544m.get();
    }

    @Override // fsi.g
    public final jz0.d a0() {
        return (jz0.d) this.f146543l.get();
    }

    @Override // fsi.g
    public final ty0.c b0() {
        return (ty0.c) this.f146540g.get();
    }

    @Override // fsi.g
    public final lz0.g c0() {
        return (lz0.g) this.f146542j.get();
    }

    @Override // fsi.g
    public final i01.b d0() {
        return (i01.b) this.f146546p.get();
    }

    @Override // fsi.g
    public final Activity getActivity() {
        BaseDelegatesActivity baseDelegatesActivity = this.f146537a;
        bq.i.a(baseDelegatesActivity);
        return baseDelegatesActivity;
    }

    @Override // fsi.g
    public final Integer getContainerId() {
        return this.f146538b;
    }

    @Override // fsi.g
    public final Context getContext() {
        BaseDelegatesActivity baseDelegatesActivity = this.f146537a;
        bq.i.h(baseDelegatesActivity);
        return baseDelegatesActivity;
    }

    @Override // fsi.g
    public final py0.f n0() {
        return (py0.f) this.f146541h.get();
    }

    @Override // fsi.g
    public final kz0.b o0() {
        BaseDelegatesActivity baseDelegatesActivity = this.f146537a;
        bq.i.a(baseDelegatesActivity);
        return bq.i.m(baseDelegatesActivity);
    }

    @Override // fsi.g
    public final m p0() {
        return (m) this.d.get();
    }

    @Override // fsi.g
    public final Set q0() {
        ArrayList arrayList = new ArrayList(1);
        Set setV = bq.i.v(Collections.EMPTY_SET);
        Iterator it8 = setV.iterator();
        while (it8.hasNext()) {
            s.i(it8.next(), "Set contributions cannot be null");
        }
        arrayList.addAll(setV);
        return arrayList.isEmpty() ? Collections.EMPTY_SET : arrayList.size() == 1 ? Collections.singleton(arrayList.get(0)) : j6.a.A(arrayList);
    }

    @Override // fsi.g
    public final f9b.f r0() {
        d.q(this.f146539c);
        throw null;
    }

    @Override // fsi.g
    public final msb.a s0() {
        d.z(this.f146539c);
        throw null;
    }

    @Override // fsi.g
    public final d01.g t0() {
        return (d01.g) this.f146545n.get();
    }

    @Override // fsi.g
    public final tri.c u0() {
        hsi.a.Companion.getClass();
        BaseDelegatesActivity baseDelegatesActivity = this.f146537a;
        Intrinsics.checkNotNullParameter(baseDelegatesActivity, "baseDelegatesActivity");
        tri.c cVar = baseDelegatesActivity.f98687h0;
        s.k(cVar);
        return cVar;
    }

    @Override // fsi.g
    public final BaseDelegatesActivity v0() {
        return this.f146537a;
    }

    @Override // fsi.g
    public final pri.f w0() {
        d.f(this.f146539c);
        throw null;
    }
}
