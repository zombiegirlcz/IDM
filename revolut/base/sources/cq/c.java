package cq;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import oc.k;
import zp.e;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f107975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f107976b;

    public /* synthetic */ c(g gVar, int i) {
        this.f107975a = i;
        this.f107976b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object dVar;
        switch (this.f107975a) {
            case 0:
                g gVar = this.f107976b;
                oc.b bVar = gVar.f107980b;
                oc.a aVar = (oc.a) obj2;
                if (aVar.f223996b == 3) {
                    if (aVar.e == zp.c.BLOCKER.ordinal()) {
                        ((oc.e) bVar).c(aVar, 1, gVar.f107979a);
                    } else {
                        ((oc.e) bVar).b(gVar.e);
                    }
                }
                if (aVar.f223997c == 11) {
                    gVar.d.onNext(e.b.f324092a);
                }
                break;
            default:
                oc.a aVar2 = (oc.a) obj2;
                int i = aVar2.f223996b;
                g gVar2 = this.f107976b;
                if (i == 0 || i == 1) {
                    dVar = e.c.f324093a;
                } else if (i != 2) {
                    dVar = null;
                } else {
                    zp.c cVar = zp.c.values()[aVar2.e];
                    int i2 = aVar2.f223995a;
                    long j2 = aVar2.f223998g;
                    boolean z = aVar2.a(k.a(1)) != null;
                    boolean z3 = aVar2.a(k.a(0)) != null;
                    Integer num = aVar2.d;
                    int iIntValue = num != null ? num.intValue() : 0;
                    Boolean bool = (Boolean) gVar2.f107981c.T2(String.valueOf(aVar2.f223995a), Boolean.TYPE);
                    dVar = new zp.d(cVar, i2, j2, iIntValue, z, z3, bool != null ? bool.booleanValue() : false);
                }
                if (dVar != null) {
                    gVar2.d.onNext(dVar);
                }
                break;
        }
        return Unit.f186387a;
    }
}
