package lwl;

import android.content.Intent;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.ui.login.pin.LoginActivity;
import efm.d0;
import ie.b0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pfm.z;
import rfm.t;
import te0.w;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class g implements od0.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f200492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LoginActivity f200493b;

    public /* synthetic */ g(LoginActivity loginActivity, int i) {
        this.f200492a = i;
        this.f200493b = loginActivity;
    }

    @Override // od0.f
    public final void accept(Object obj2) {
        Object objF;
        int i = this.f200492a;
        LoginActivity context = this.f200493b;
        switch (i) {
            case 0:
                nwl.l lVar = (nwl.l) obj2;
                int i2 = LoginActivity.f107072x0;
                Intent intent = context.getIntent();
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(intent, "intent");
                boolean zF = Intrinsics.f(context.getString(R.string.mime_type_send), intent.getType());
                boolean zF2 = Intrinsics.f(context.getString(R.string.mime_type_request), intent.getType());
                int i3 = 28;
                int i5 = 1;
                int i6 = 0;
                int i21 = 24;
                int i22 = 7;
                int i32 = 2;
                if ((zF || zF2) && intent.getData() != null) {
                    fl3.a aVar = (fl3.a) lVar.o.get();
                    String uri2 = String.valueOf(intent.getData());
                    sl3.k kVar = (sl3.k) aVar;
                    kVar.getClass();
                    Intrinsics.checkNotNullParameter(uri2, "uri");
                    ufm.c cVar = new ufm.c(new sl3.d(kVar, uri2, i32), 2);
                    Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
                    int i33 = 27;
                    efm.k kVarFirstElement = new sfm.b(w.i0(cVar), new sk2.g(i21, new sl3.c(kVar, i22)), i32).map(new sk2.g(25, new sk2.f(i33))).firstElement();
                    sk2.g gVar = new sk2.g(i33, new sk2.f(kVar, i3));
                    kVarFirstElement.getClass();
                    rfm.m mVar = new rfm.m(kVarFirstElement, gVar, 0);
                    Intrinsics.checkNotNullExpressionValue(mVar, "flatMap(...)");
                    ufm.i iVar = new ufm.i(new t(new rfm.m(o70.a.h(mVar), new b0(new nwl.f(lVar, zF), 24), 0)), new b0(new jli.f(23), 25), 1);
                    Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                    objF = ue0.e.F(iVar, Boolean.FALSE);
                } else {
                    objF = d0.m(Boolean.FALSE);
                    Intrinsics.checkNotNullExpressionValue(objF, "just(...)");
                }
                rfm.j jVar = new rfm.j(new z(objF, i5, new a5.a(28), null), new b0(new nwl.c(lVar, intent, i5), 23), i32);
                Intrinsics.checkNotNullExpressionValue(jVar, "flatMapMaybe(...)");
                efm.k kVarW = lVar.Q().w();
                Intrinsics.checkNotNullExpressionValue(kVarW, "toMaybe(...)");
                rfm.w wVarH = o70.a.h(w.D0(jVar, kVarW));
                nwl.c cVar2 = new nwl.c(lVar, intent, i6);
                Function1 function1K = lVar.K();
                Function0 function0J = lVar.J();
                rfm.m mVar2 = new rfm.m(wVarH, new gn.b(6, new bo.c(new BreadcrumbException(), i21)), 2);
                Intrinsics.checkNotNullExpressionValue(mVar2, "onErrorResumeNext(...)");
                rfm.b bVar = new rfm.b(new bo.e(7, cVar2), new bo.e(7, function1K), new c86.f(8, function0J));
                mVar2.i(bVar);
                Intrinsics.checkNotNullExpressionValue(bVar, "subscribe(...)");
                w.j0(lVar.f239031a, bVar);
                break;
            default:
                int i43 = LoginActivity.f107072x0;
                ((nwl.l) obj2).h(context);
                break;
        }
    }
}
