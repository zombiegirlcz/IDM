package zab;

import android.view.View;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.feature.retail.legacy.login.impl.signsms.SignSmsScreenContract$SignSmsConfiguration;
import com.revolut.feature.retail.legacy.login.impl.signsms.SignSmsStepFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class v implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f320637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SignSmsStepFragment f320638b;

    public /* synthetic */ v(SignSmsStepFragment signSmsStepFragment, int i) {
        this.f320637a = i;
        this.f320638b = signSmsStepFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SignSmsScreenContract$SignSmsConfiguration config;
        f fVar;
        efm.d0<yab.a> d0VarRequestSMSWithAuth;
        int i = this.f320637a;
        SignSmsStepFragment signSmsStepFragment = this.f320638b;
        switch (i) {
            case 0:
                SignSmsStepFragment.Companion aVar = SignSmsStepFragment.INSTANCE;
                String phone = signSmsStepFragment.K();
                if (phone != null && (config = signSmsStepFragment.f0) != null && (fVar = (f) signSmsStepFragment.C()) != null) {
                    t tVar = (t) fVar;
                    Intrinsics.checkNotNullParameter(phone, "phone");
                    Intrinsics.checkNotNullParameter(config, "config");
                    p61.b f = config.getF();
                    if (f == null) {
                        rfm.m mVar = new rfm.m(tVar.o.a(phone), new b(8, new z8h.b(12)), 1);
                        m70.a.c(t0.f186434a);
                        d0VarRequestSMSWithAuth = mVar.p(new yab.a(""));
                        Intrinsics.checkNotNullExpressionValue(d0VarRequestSMSWithAuth, "toSingle(...)");
                    } else {
                        d0VarRequestSMSWithAuth = tVar.f320626n.requestSMSWithAuth(phone, yh5.b.S(f, tVar.f320628q));
                    }
                    ufm.n nVarI = o70.a.i(te0.w.i0(d0VarRequestSMSWithAuth));
                    j jVar = new j(tVar, 4);
                    Function1 function1K = tVar.K();
                    ufm.i iVar = new ufm.i(nVarI, new xz7.f(4, new z63.j(new BreadcrumbException(), 13)), 2);
                    Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
                    ofm.i iVar2 = new ofm.i(new nw8.d(29, jVar), new nw8.d(29, function1K), 0);
                    iVar.q(iVar2);
                    Intrinsics.checkNotNullExpressionValue(iVar2, "subscribe(...)");
                    te0.w.j0(tVar.f239031a, iVar2);
                    break;
                }
                break;
            case 1:
                signSmsStepFragment.f82710h0.onNext(Unit.f186387a);
                break;
            case 2:
                SignSmsStepFragment.Companion aVar2 = SignSmsStepFragment.INSTANCE;
                f fVar2 = (f) signSmsStepFragment.C();
                if (fVar2 != null) {
                    t tVar2 = (t) fVar2;
                    tVar2.f320624l.c(tVar2.v);
                }
                break;
            default:
                if (Intrinsics.f(signSmsStepFragment.f82709e0, Boolean.TRUE)) {
                    signSmsStepFragment.f82710h0.onNext(Unit.f186387a);
                }
                break;
        }
    }
}
