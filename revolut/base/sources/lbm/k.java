package lbm;

import java.util.Objects;
import java.util.function.Supplier;
import nhm.p;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class k implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f193729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f193730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jbm.h f193731c;
    public final /* synthetic */ nhm.l d;

    public /* synthetic */ k(l lVar, String str, jbm.h hVar, nhm.l lVar2) {
        this.f193729a = lVar;
        this.f193730b = str;
        this.f193731c = hVar;
        this.d = lVar2;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        jbm.h hVar = this.f193731c;
        Objects.requireNonNull(hVar, "Config must not be null");
        nhm.l lVar = this.f193729a.f193733b;
        Objects.requireNonNull(lVar, "that is null");
        nhm.l lVar2 = this.d;
        if (lVar2.f215602a.isEmpty()) {
            nhm.l lVar3 = nhm.l.f215601b;
        } else {
            if (!lVar.f215602a.isEmpty()) {
                p it8 = lVar.iterator();
                while (it8.hasNext()) {
                    mhm.d dVar = (mhm.d) it8.next();
                    Object obj2 = dVar.f205589a;
                    nhm.b bVar = lVar2.f215602a;
                    bVar.getClass();
                    if (bVar.b(0, Objects.hashCode(obj2), obj2).isEmpty()) {
                        Object obj3 = dVar.f205589a;
                        lVar2 = new nhm.l(bVar.c(0, Objects.hashCode(obj3), obj3, dVar.f205590b, nhm.c.PUT));
                    }
                }
            }
            lVar = lVar2;
        }
        return new j(this.f193730b, hVar, lVar);
    }
}
