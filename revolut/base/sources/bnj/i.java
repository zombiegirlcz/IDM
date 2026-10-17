package bnj;

import dej.d2;
import dej.t1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t1 f17231b;

    public /* synthetic */ i(l lVar, t1 t1Var) {
        this.f17230a = 0;
        this.f17231b = t1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        a aVar;
        switch (this.f17230a) {
            case 0:
                d2 action = (d2) obj2;
                Intrinsics.checkNotNullParameter(action, "action");
                int i = k.f17232a[action.ordinal()];
                t1 t1Var = this.f17231b;
                if (i == 1) {
                    aVar = new a("ID_SUBSCRIPTION_DETAILS_ESIM_INSTALL", t1Var.e);
                } else if (i == 2) {
                    aVar = new a("ID_ESIM_SHARE", t1Var.e);
                } else if (i == 3) {
                    aVar = new a("ID_SUBSCRIPTION_DETAILS_ACTIVATE_ESIM", null);
                } else {
                    if (i != 4) {
                        return null;
                    }
                    aVar = new a("ID_SUBSCRIPTION_DETAILS_INSTALLATION_TROUBLESHOOTER", null);
                }
                return aVar;
            case 1:
                lnj.f update = (lnj.f) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return lnj.f.a(update, null, this.f17231b.f113650a, false, 5);
            default:
                t1 otherSubscription = (t1) obj2;
                Intrinsics.checkNotNullParameter(otherSubscription, "otherSubscription");
                return Boolean.valueOf(!Intrinsics.f(otherSubscription.f113650a, this.f17231b.f113650a) && gj7.b.u(otherSubscription));
        }
    }

    public /* synthetic */ i(t1 t1Var, int i) {
        this.f17230a = i;
        this.f17231b = t1Var;
    }
}
