package nhm;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public final class h extends i implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f215592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f215593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f215594c;
    public final int d;
    public final i e;

    public h(int i, Object obj2, Object obj3, i iVar) {
        this.f215592a = i;
        this.f215593b = obj2;
        this.f215594c = obj3;
        this.d = iVar.size() + 1;
        this.e = iVar;
    }

    @Override // nhm.b
    public final ohm.c b(int i, int i2, Object obj2) {
        int i3 = this.f215592a;
        ohm.c bVar = ohm.a.f225407a;
        if (i3 != i2) {
            return bVar;
        }
        g gVar = new g(this);
        while (true) {
            if (!gVar.hasNext()) {
                break;
            }
            Object next = gVar.next();
            if (Objects.equals(((i) next).f(), obj2)) {
                bVar = new ohm.b(next);
                break;
            }
        }
        return bVar.map(new com.google.android.material.color.utilities.f(8));
    }

    @Override // nhm.b
    public final b c(int i, int i2, Object obj2, Object obj3, c cVar) {
        h hVar;
        int i3 = this.f215592a;
        if (i2 != i3) {
            return cVar == c.REMOVE ? this : i.h(i, this, new k(i2, obj2, obj3));
        }
        Object obj4 = this.f215593b;
        boolean zEquals = Objects.equals(obj2, obj4);
        i iVar = this.e;
        if (!zEquals) {
            i kVar = new k(i3, obj4, this.f215594c);
            boolean z = false;
            while (!z && iVar != null) {
                if (Objects.equals(obj2, iVar.f())) {
                    z = true;
                } else {
                    kVar = new h(iVar.e(), iVar.f(), iVar.i(), kVar);
                }
                iVar = iVar instanceof h ? ((h) iVar).e : null;
            }
            if (iVar == null) {
                iVar = kVar;
            } else {
                if (kVar instanceof k) {
                    k kVar2 = (k) kVar;
                    hVar = new h(kVar2.f215598a, kVar2.f215599b, kVar2.f215600c, iVar);
                } else if (iVar instanceof k) {
                    hVar = new h(iVar.e(), iVar.f(), iVar.i(), kVar);
                } else {
                    while (iVar instanceof h) {
                        h hVar2 = (h) iVar;
                        h hVar3 = new h(hVar2.f215592a, hVar2.f215593b, hVar2.f215594c, kVar);
                        iVar = hVar2.e;
                        kVar = hVar3;
                    }
                    hVar = new h(iVar.e(), iVar.f(), iVar.i(), kVar);
                }
                iVar = hVar;
            }
        }
        return cVar == c.REMOVE ? iVar : new h(i3, obj2, obj3, iVar);
    }

    @Override // nhm.b
    public final p d() {
        return new g(this);
    }

    @Override // nhm.i
    public final int e() {
        return this.f215592a;
    }

    @Override // nhm.i
    public final Object f() {
        return this.f215593b;
    }

    @Override // nhm.i
    public final Object i() {
        return this.f215594c;
    }

    @Override // nhm.b
    public final int size() {
        return this.d;
    }
}
