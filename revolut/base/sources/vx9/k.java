package vx9;

import efm.d0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f292873a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f292874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f292875c;

    public /* synthetic */ k(List list, c cVar) {
        this.f292874b = list;
        this.f292875c = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f292873a) {
            case 0:
                Boolean enabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(enabled, "enabled");
                if (!enabled.booleanValue()) {
                    return pfm.m.f235744a;
                }
                c cVar = this.f292875c;
                d0 d0VarFirstOrError = m70.a.g(((er9.x) ((mr9.a) ((mq9.f) cVar.f292858c)).f208082a).g(true), null, null, 3).firstOrError();
                Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                pfm.a aVar = new pfm.a(ue0.e.F(d0VarFirstOrError, f0.f322471a), new vx5.m(new k(this.f292874b, cVar), 18), 4);
                Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                return aVar;
            default:
                List groups = (List) obj2;
                Intrinsics.checkNotNullParameter(groups, "groups");
                List list = this.f292874b;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (obj3 instanceof ux9.n) {
                        arrayList.add(obj3);
                    }
                }
                if (arrayList.isEmpty() && groups.isEmpty()) {
                    return pfm.m.f235744a;
                }
                c cVar2 = this.f292875c;
                ufm.i iVar = new ufm.i(((ang.f) cVar2.e).f(false), new vx5.m(new uyh.w(groups, 28, arrayList, cVar2), 20), 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                pfm.a aVar2 = new pfm.a(iVar, new vx5.m(new b(cVar2, 4), 19), 4);
                Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
                return aVar2;
        }
    }

    public /* synthetic */ k(c cVar, List list) {
        this.f292875c = cVar;
        this.f292874b = list;
    }
}
