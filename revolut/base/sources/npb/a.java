package npb;

import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import djb.k;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rnb.i;
import w4l.k;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f218178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f218179b;

    public /* synthetic */ a(e eVar, int i) {
        this.f218178a = i;
        this.f218179b = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        switch (this.f218178a) {
            case 0:
                k loadingStrategy = (k) obj2;
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                e eVar = this.f218179b;
                return nim.a.w(((i) eVar.f218182l).f(k.b.f115282a, loadingStrategy), new a(eVar, 1));
            default:
                ejb.b savingsInfo = (ejb.b) obj2;
                Intrinsics.checkNotNullParameter(savingsInfo, "savingsInfo");
                Iterator it8 = savingsInfo.f126837b.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (Intrinsics.f(((SavingsAccountDetails) next).f86460a.f234881a, this.f218179b.f218183m.f90576a)) {
                        }
                    } else {
                        next = null;
                    }
                }
                return (SavingsAccountDetails) next;
        }
    }
}
