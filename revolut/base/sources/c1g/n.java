package c1g;

import com.revolut.data.model.Data;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f20501b;

    public /* synthetic */ n(u uVar, int i) {
        this.f20500a = i;
        this.f20501b = uVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f20500a) {
            case 0:
                Boolean experiencesEnabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(experiencesEnabled, "experiencesEnabled");
                return experiencesEnabled.booleanValue() ? nim.a.w(osg.b.d(this.f20501b.f20510b), new c09.a(7)) : zi0.c.j(p.f20505a);
            default:
                r result = (r) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof p) {
                    return new go.g(new Data(new x3g.i(null, zhm.f0.f322471a), null, false, 6, null), 2);
                }
                if (!(result instanceof q)) {
                    throw new NoWhenBranchMatchedException();
                }
                m0g.a aVar = this.f20501b.f20509a;
                xi0.b currency = ((q) result).f20506a;
                m0g.g gVar = (m0g.g) aVar;
                gVar.getClass();
                Intrinsics.checkNotNullParameter(currency, "currency");
                return rd0.e.b(gVar.f201151h.f(new m0g.f(currency), false));
        }
    }
}
