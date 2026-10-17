package yua;

import a31.x;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qua.u;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f316939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f316940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f316941c;

    public /* synthetic */ f(q qVar, boolean z) {
        this.f316939a = 2;
        this.f316941c = qVar;
        this.f316940b = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Set set;
        switch (this.f316939a) {
            case 0:
                s71.a aVar = this.f316941c.f316963a;
                hbd.a params = (hbd.a) obj2;
                Intrinsics.checkNotNullParameter(params, "it");
                if (this.f316940b) {
                    Intrinsics.checkNotNullParameter(params, "params");
                    return nim.a.w(((x) aVar).i.f(params, false), new a09.a(24));
                }
                Intrinsics.checkNotNullParameter(params, "params");
                return nim.a.w(((x) aVar).i.f(params, true), new a09.a(24));
            case 1:
                List recurringPayments = (List) obj2;
                Intrinsics.checkNotNullParameter(recurringPayments, "recurringPayments");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : recurringPayments) {
                    qua.p pVar = (qua.p) obj3;
                    if (!this.f316940b || u.h(pVar, ((l80.f) this.f316941c.f316968j).k())) {
                        if (u.G(pVar) && (set = pVar.G) != null && (!set.isEmpty())) {
                            arrayList.add(obj3);
                        }
                    }
                }
                return arrayList;
            default:
                hbd.a params2 = (hbd.a) obj2;
                Intrinsics.checkNotNullParameter(params2, "params");
                x xVar = (x) this.f316941c.f316963a;
                Intrinsics.checkNotNullParameter(params2, "params");
                return xVar.i.g(params2, this.f316940b);
        }
    }

    public /* synthetic */ f(boolean z, q qVar, int i) {
        this.f316939a = i;
        this.f316940b = z;
        this.f316941c = qVar;
    }
}
