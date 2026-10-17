package vri;

import bq.i;
import fsi.g;
import gsi.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import py0.e;
import ty0.c;
import vc.s;
import xoi.d;
import yy0.f;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f291608a;

    public b(d dVar) {
        this.f291608a = dVar;
    }

    @Override // gsi.a
    public final f Q() {
        return i.j(this.f291608a);
    }

    @Override // gsi.a
    public final mz0.a V() {
        return i.p(this.f291608a);
    }

    @Override // gsi.a
    public final c01.d W() {
        return gmf.b.e(this.f291608a);
    }

    @Override // gsi.a
    public final e X() {
        return gmf.b.g(this.f291608a);
    }

    @Override // gsi.a
    public final xy0.a Y() {
        return gmf.b.b(this.f291608a);
    }

    @Override // gsi.a
    public final h01.b Z() {
        return i.n(this.f291608a);
    }

    @Override // gsi.h
    public final g a() {
        return this.f291608a;
    }

    @Override // gsi.a
    public final jz0.d a0() {
        return gmf.b.d(this.f291608a);
    }

    @Override // gsi.a
    public final c b0() {
        return i.g(this.f291608a);
    }

    @Override // gsi.a
    public final lz0.g c0() {
        return gmf.b.f(this.f291608a);
    }

    @Override // gsi.a
    public final i01.b d0() {
        return gsi.d.p(this.f291608a);
    }

    @Override // gsi.a
    public final d01.g e0() {
        return gmf.b.c(this.f291608a);
    }

    @Override // gsi.a
    public final Set l0() {
        ArrayList arrayList = new ArrayList(1);
        Set setK = i.k(this.f291608a);
        Iterator it8 = setK.iterator();
        while (it8.hasNext()) {
            s.i(it8.next(), "Set contributions cannot be null");
        }
        arrayList.addAll(setK);
        return arrayList.isEmpty() ? Collections.EMPTY_SET : arrayList.size() == 1 ? Collections.singleton(arrayList.get(0)) : j6.a.A(arrayList);
    }

    @Override // gsi.a
    public final py0.f m0() {
        return gmf.b.i(this.f291608a);
    }
}
