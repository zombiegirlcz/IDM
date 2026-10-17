package vga;

import com.revolut.data.model.Data;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import do3.n;
import do3.s;
import ffk.j;
import ffk.t;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m8b.o;
import org.joda.time.DateTime;
import w4l.h;
import yhm.r;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f288805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f288806b;

    public /* synthetic */ a(o oVar, int i) {
        this.f288805a = i;
        this.f288806b = oVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f288805a) {
            case 0:
                n user = (n) obj2;
                Intrinsics.checkNotNullParameter(user, "user");
                if (user.f116415m != s.ACTIVE) {
                    return new go.g(new Data(null, null, false, 7, null), 2);
                }
                o oVar = this.f288806b;
                if (oVar.b(user)) {
                    return new go.g(new Data(null, null, false, 7, null), 2);
                }
                t tVar = (t) oVar.f203466b;
                h hVar = h.f294642c;
                return nim.a.v(u0.i(rd0.e.b(tVar.v(hVar)), rd0.e.b(tVar.o()), rd0.e.b(((j) oVar.f203465a).b(hVar))), new a(oVar, 1));
            default:
                r rVar = (r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                PricingPlanSubscription pricingPlanSubscription = (PricingPlanSubscription) rVar.f314201a;
                List list = (List) rVar.f314202b;
                List list2 = (List) rVar.f314203c;
                DateTime dateTime = pricingPlanSubscription.e;
                o oVar2 = this.f288806b;
                if (i2b.a.i((l80.e) oVar2.f203467c, dateTime)) {
                    return null;
                }
                return oVar2.a(pricingPlanSubscription, list, list2);
        }
    }
}
