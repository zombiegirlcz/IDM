package czh;

import g1i.d0;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110236a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wd6.h f110237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f110238c;
    public final /* synthetic */ xi0.b d;

    public /* synthetic */ c(d0 d0Var, wd6.h hVar, boolean z, xi0.b bVar) {
        this.f110237b = hVar;
        this.f110238c = z;
        this.d = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f110236a) {
            case 0:
                List pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : pockets) {
                    io3.d dVar = (io3.d) obj3;
                    xi0.a aVar = xi0.b.Companion;
                    String str = dVar.f163147c;
                    aVar.getClass();
                    xi0.b bVarA = xi0.a.a(str);
                    wd6.h hVar = wd6.h.MARKET;
                    wd6.h hVar2 = this.f110237b;
                    boolean z = false;
                    if ((((hVar2 == hVar && this.f110238c) || hVar2 == wd6.h.RECURRING) ? cp5.d.A(bVarA) : !bVarA.equals(this.d) && (cp5.d.A(bVarA) || cp5.d.z(bVarA))) && dVar.e == io3.l.CURRENT && dVar.f == io3.k.ACTIVE && dVar.i > 0) {
                        z = true;
                    }
                    if (z) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            default:
                Set currencies = (Set) obj2;
                Intrinsics.checkNotNullParameter(currencies, "currencies");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : currencies) {
                    xi0.b bVar = (xi0.b) obj4;
                    wd6.h hVar3 = wd6.h.MARKET;
                    wd6.h hVar4 = this.f110237b;
                    if (((hVar4 == hVar3 && this.f110238c) || hVar4 == wd6.h.RECURRING) ? cp5.d.A(bVar) : !Intrinsics.f(bVar, this.d) && (cp5.d.A(bVar) || cp5.d.z(bVar))) {
                        arrayList2.add(obj4);
                    }
                }
                return arrayList2;
        }
    }

    public /* synthetic */ c(wd6.h hVar, boolean z, xi0.b bVar) {
        this.f110237b = hVar;
        this.f110238c = z;
        this.d = bVar;
    }
}
