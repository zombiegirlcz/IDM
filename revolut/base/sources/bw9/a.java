package bw9;

import cw9.d;
import jla.h;
import kotlin.jvm.internal.Intrinsics;
import vc.s;
import zjh.f;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ite.a f19261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ila.b f19262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q8b.a f19263c;

    public a(q8b.a aVar, ite.a aVar2, ila.b bVar) {
        this.f19261a = aVar2;
        this.f19262b = bVar;
        this.f19263c = aVar;
    }

    public final d a() {
        gte.a aVarB = this.f19261a.b();
        s.j(aVarB);
        ila.b bVar = this.f19262b;
        f fVar = new f(bVar.a());
        h productCatalogueInteractor = bVar.a();
        q8b.a aVar = this.f19263c;
        n8b.a countryInteractor = aVar.a();
        s.j(countryInteractor);
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        r10.a aVar2 = new r10.a();
        aVar2.f250811a = productCatalogueInteractor;
        aVar2.f250812b = countryInteractor;
        n8b.a aVarA = aVar.a();
        s.j(aVarA);
        return new d(aVarB, fVar, aVar2, aVarA);
    }
}
