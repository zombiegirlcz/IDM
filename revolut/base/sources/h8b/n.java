package h8b;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import qv0.p;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f149984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f149985b;

    public /* synthetic */ n(o oVar, int i) {
        this.f149984a = i;
        this.f149985b = oVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object it8) {
        switch (this.f149984a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                h hVar = this.f149985b.f149988c;
                Object u = ((p) it8).getU();
                Intrinsics.i(u, "null cannot be cast to non-null type com.revolut.feature.corporate_events.models.CorporateEvent");
                return hVar.b3((kp3.b) u, a0.H(((koi.j) it8).getF51752a(), "CORPORATE_EVENTS_EVENT_ID_", false));
            default:
                Pair it9 = (Pair) it8;
                Intrinsics.checkNotNullParameter(it9, "it");
                Object obj2 = it9.f186386b;
                return this.f149985b.f149987b.Y(obj2 instanceof String ? (String) obj2 : null);
        }
    }
}
