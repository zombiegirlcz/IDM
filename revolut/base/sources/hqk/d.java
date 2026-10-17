package hqk;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.t;
import hcj.o;
import iqk.f;
import iqk.j;
import iqk.k;
import j49.i;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import nii.n1;
import rd0.e;
import vkm.q;
import wsg.n;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements qsi.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qsi.b f154737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final iqk.c f154738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final iqk.d f154739c;
    public final n d;

    public d(qsi.b contentProvider, iqk.c outboundConfirmationRequiredDelegate, iqk.d suspiciousTransactionDelegate, n walletInteractor) {
        Intrinsics.checkNotNullParameter(contentProvider, "contentProvider");
        Intrinsics.checkNotNullParameter(outboundConfirmationRequiredDelegate, "outboundConfirmationRequiredDelegate");
        Intrinsics.checkNotNullParameter(suspiciousTransactionDelegate, "suspiciousTransactionDelegate");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f154737a = contentProvider;
        this.f154738b = outboundConfirmationRequiredDelegate;
        this.f154739c = suspiciousTransactionDelegate;
        this.d = walletInteractor;
    }

    @Override // i49.c
    public final boolean a(t data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.f54722b.f51596l instanceof iqk.b) {
            return true;
        }
        ((k) this.f154739c).getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        return data.f54722b.f51596l instanceof j;
    }

    @Override // i49.c
    public final Object c(n1 n1Var) {
        this.f154739c.getClass();
        return j49.c.f171322a;
    }

    @Override // i49.c
    public final Object e(Object obj2, j60.a aVar, Continuation continuation) {
        this.f154739c.getClass();
        return j49.c.f171322a;
    }

    @Override // i49.c
    public final Flow f(i params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return e.e(q.Q(e.b(m70.a.g(nim.a.w(this.d.R(), new a(0)), null, null, 3)), new o((Continuation) null, this, 10)), h0.f322473a, new b(3, null));
    }

    @Override // i49.c
    public final Object g(t data, Continuation continuation) {
        Intrinsics.checkNotNullParameter(data, "data");
        ActionWidgetDelegate.Model model = data.f54722b;
        if (model.f51596l instanceof iqk.b) {
            Intrinsics.checkNotNullParameter(data, "data");
            Object obj2 = model.f51596l;
            Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.retail.feature.retail_accounts.impl.ui.delegate.internal.OutboundConfirmationRequiredDelegate.SuspiciousTransferPayload");
            return new j49.b(f.a(((iqk.b) obj2).f167885a));
        }
        k kVar = (k) this.f154739c;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        if (!(data.f54722b.f51596l instanceof j)) {
            return j49.c.f171322a;
        }
        f fVar = kVar.f167892b;
        Object obj3 = model.f51596l;
        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.retail.feature.retail_accounts.impl.ui.delegate.internal.SuspiciousTransactionReviewDelegate.SuspiciousTransactionPayload");
        return new j49.b(f.a(((j) obj3).f167890a));
    }
}
