package vx9;

import efm.d0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f292870a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f292871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f292872c;

    public /* synthetic */ j(List list, g gVar) {
        this.f292871b = list;
        this.f292872c = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f292870a) {
            case 0:
                Boolean isEnabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(isEnabled, "isEnabled");
                if (isEnabled.booleanValue()) {
                    g gVar = this.f292872c;
                }
                break;
            default:
                List cryptoAddresses = (List) obj2;
                Intrinsics.checkNotNullParameter(cryptoAddresses, "cryptoAddresses");
                List list = this.f292871b;
                if (!list.isEmpty() && !cryptoAddresses.isEmpty()) {
                    List list2 = list;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : list2) {
                        if (obj3 instanceof ux9.h) {
                            arrayList.add(obj3);
                        }
                    }
                    ufm.c cVar = new ufm.c(new a80.b(arrayList, cryptoAddresses, new vw4.j(11), new vw4.j(10), 10), 2);
                    Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj4 : list2) {
                        if (obj4 instanceof ux9.i) {
                            arrayList2.add(obj4);
                        }
                    }
                    ufm.c cVar2 = new ufm.c(new a80.b(arrayList2, cryptoAddresses, new vw4.j(9), new vw4.j(8), 10), 2);
                    Intrinsics.checkNotNullExpressionValue(cVar2, "fromCallable(...)");
                    pfm.a aVar = new pfm.a(d0.D(cVar, cVar2, new vx5.m(new vv7.l(9), 15)), new vx5.m(new b(this.f292872c, 3), 16), 4);
                    Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                }
                break;
        }
        return pfm.m.f235744a;
    }

    public /* synthetic */ j(g gVar, List list) {
        this.f292872c = gVar;
        this.f292871b = list;
    }
}
