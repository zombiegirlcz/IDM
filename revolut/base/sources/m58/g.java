package m58;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.joint.impl.ui.withdraw.AmountData;
import com.revolut.feature.joint.impl.ui.withdraw.JointWithdrawScreen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements zp0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CenteredAmountDelegate.Model f202857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JointWithdrawScreen f202858b;

    public g(CenteredAmountDelegate.Model model, JointWithdrawScreen jointWithdrawScreen) {
        this.f202857a = model;
        this.f202858b = jointWithdrawScreen;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zp0.c
    public final void k(String extractedValue, String formattedValue, boolean z) {
        xi0.b bVar;
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        Object obj2 = this.f202857a.f51981p;
        d dVar = obj2 instanceof d ? (d) obj2 : null;
        if (dVar == null || (bVar = dVar.f202854a) == null) {
            return;
        }
        b bVar2 = (b) this.f202858b.R.getValue();
        nqi.a inputCurrency = new nqi.a(formattedValue, z, bVar);
        com.revolut.feature.joint.impl.ui.withdraw.b bVar3 = (com.revolut.feature.joint.impl.ui.withdraw.b) bVar2;
        bVar3.getClass();
        Intrinsics.checkNotNullParameter(inputCurrency, "inputCurrency");
        bVar3.f76614x.k(new Data(new AmountData(new dj0.d(bVar3.f76608p.b(formattedValue, bVar.f306286a), bVar), formattedValue, z), null, false, 6, null));
    }
}
