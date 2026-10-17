package sp5;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.feature.crypto.withdraw.impl.ui.withdrawtoaddress.confirmation.CryptoWithdrawToAddressConfirmationActivity;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qfm.r0;
import te0.w;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends pri.c implements qp5.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final up5.b f264887h;
    public final qp5.h i;

    public f(up5.b presentationModel, qp5.h router) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(router, "router");
        this.f264887h = presentationModel;
        this.i = router;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        qp5.i view = (qp5.i) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        r0 r0VarD = w.D(((CellDetailsActionDelegate) ((CryptoWithdrawToAddressConfirmationActivity) view).f71167w0.getValue()).d, new d(this, 1));
        Function1 function1K = K();
        pfm.a aVar2 = new pfm.a(r0VarD, new ogm.i(new ry7.j(new BreadcrumbException(), 16)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        e function = e.f264886a;
        Intrinsics.checkNotNullParameter(function, "function");
        ofm.h hVarW = aVar2.w(new ly7.g(16, function1K), new a1l.c(17));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(this.f239031a, hVarW);
    }
}
