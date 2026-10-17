package l5a;

import com.revolut.core.extensions.rx.BreadcrumbException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f192215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.e f192216b;

    public /* synthetic */ q(com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.e eVar, int i) {
        this.f192215a = i;
        this.f192216b = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f192215a) {
            case 0:
                l update = (l) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.e eVar = this.f192216b;
                return l.a(update, null, null, null, null, eVar.z.d(eVar.A.m2(), zhm.v.k("android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS")), false, null, null, false, null, 1007);
            default:
                if (((Boolean) obj2).booleanValue()) {
                    efm.b bVarIgnoreElements = ((sl3.k) ((wl3.h) this.f192216b.f80202y).f298380a).f264121n.ignoreElements();
                    Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
                    vfg.p pVar = new vfg.p(new vx5.r(new BreadcrumbException(), 22), (char) 0);
                    bVarIgnoreElements.getClass();
                    pfm.a aVar = new pfm.a(bVarIgnoreElements, pVar, 2);
                    Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
                    Intrinsics.checkNotNullExpressionValue(aVar.w(new wl3.e(0, wl3.g.f298379a), wl3.f.f298378a), "subscribe(...)");
                }
                return Unit.f186387a;
        }
    }
}
