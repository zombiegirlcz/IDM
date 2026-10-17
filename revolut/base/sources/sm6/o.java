package sm6;

import android.content.Context;
import android.content.pm.PackageManager;
import com.revolut.data.model.Data;
import com.revolut.feature.external_accounts.impl.domain.india.upi.model.IndiaUpiApplications;
import com.revolut.feature.external_accounts.impl.domain.india.upi.model.IndiaUpiProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f264377w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(p pVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f264377w = pVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                o oVar = new o(this.f264377w, continuation, 0);
                oVar.v = obj2;
                return oVar;
            default:
                o oVar2 = new o(this.f264377w, continuation, 1);
                oVar2.v = obj2;
                return oVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((o) create((IndiaUpiApplications) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((o) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        boolean z;
        int i = this.u;
        p pVar = this.f264377w;
        switch (i) {
            case 0:
                IndiaUpiApplications apps = (IndiaUpiApplications) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Context context = ((b) pVar.f264379q.f248595b).f264363a;
                Intrinsics.checkNotNullParameter(apps, "apps");
                List list = apps.f72372a;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                Iterator it8 = list.iterator();
                while (true) {
                    boolean z3 = true;
                    if (!it8.hasNext()) {
                        List popular = d0.P0(arrayList, new c());
                        List<IndiaUpiProvider> list2 = apps.f72373b;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        for (IndiaUpiProvider indiaUpiProvider : list2) {
                            String packageName = indiaUpiProvider.d;
                            Intrinsics.checkNotNullParameter(packageName, "packageName");
                            try {
                                context.getPackageManager().getPackageInfo(packageName, 0);
                                z = true;
                            } catch (PackageManager.NameNotFoundException unused) {
                                z = false;
                            }
                            arrayList2.add(IndiaUpiProvider.a(indiaUpiProvider, z));
                        }
                        List others = d0.P0(arrayList2, new d());
                        Intrinsics.checkNotNullParameter(popular, "popular");
                        Intrinsics.checkNotNullParameter(others, "others");
                        return new IndiaUpiApplications(popular, others);
                    }
                    IndiaUpiProvider indiaUpiProvider2 = (IndiaUpiProvider) it8.next();
                    String packageName2 = indiaUpiProvider2.d;
                    Intrinsics.checkNotNullParameter(packageName2, "packageName");
                    try {
                        context.getPackageManager().getPackageInfo(packageName2, 0);
                    } catch (PackageManager.NameNotFoundException unused2) {
                        z3 = false;
                    }
                    arrayList.add(IndiaUpiProvider.a(indiaUpiProvider2, z3));
                }
                break;
            default:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                pVar.H2(pVar.f264380r, new s86.k(data, 11));
                return Unit.f186387a;
        }
    }
}
