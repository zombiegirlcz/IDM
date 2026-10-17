package bbb;

import a08.p0;
import a08.q;
import android.app.Activity;
import android.os.Parcelable;
import android.view.View;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.views.code.CodeEditor;
import com.revolut.core.ui_kit.views.pin.PinCodeView;
import com.revolut.feature.retail.legacy.login.impl.R$id;
import com.revolut.feature.retail.legacy.login.impl.login.LoginFragment;
import com.revolut.feature.retail.legacy.login.impl.login.LoginFragmentContract$Configuration;
import com.revolut.feature.retail.legacy.login.impl.signsms.SignSmsStepFragment;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.FragmentDestination;
import com.revolut.retail.core.navigation.FragmentNavigateCommand;
import e0f.n;
import efm.r;
import eli.o;
import eli.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import te0.s;
import te0.w;
import tjg.c;

/* JADX INFO: loaded from: classes6.dex */
public class l extends pri.b implements c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final sri.m f14233h;
    public final h i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a61.a f14234j;
    public final f9b.f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ujg.a f14235l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p f14236m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final r f14237n;

    public l(sri.m navigator, h presentationModel, a61.a twoFaProgressView, f9b.f errorView, ujg.a twoFaRepository, p twoFaSmsRetriever) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(twoFaProgressView, "twoFaProgressView");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(twoFaRepository, "twoFaRepository");
        Intrinsics.checkNotNullParameter(twoFaSmsRetriever, "twoFaSmsRetriever");
        this.f14233h = navigator;
        this.i = presentationModel;
        this.f14234j = twoFaProgressView;
        this.k = errorView;
        this.f14235l = twoFaRepository;
        this.f14236m = twoFaSmsRetriever;
        m mVar = (m) presentationModel.f14228a;
        r map = mVar.e.getValue(mVar, m.f14238l[3]).c(s.f270018a).map(new b79.g(new b96.a(25), 22));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        r rVarMerge = r.merge(map, ((eli.l) twoFaRepository).f127487g);
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        this.f14237n = rVarMerge;
    }

    @Override // pri.b, pri.e
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public void h(e view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        r rVar = this.f14237n;
        r rVarDistinctUntilChanged = rVar.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        r rVarF = o70.a.f(rVarDistinctUntilChanged);
        final int i = 0;
        Function1 function1 = new Function1(this) { // from class: bbb.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f14230b;

            {
                this.f14230b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        tjg.e eVar = (tjg.e) obj2;
                        l lVar = this.f14230b;
                        a61.a aVar = lVar.f14234j;
                        sri.m mVar = lVar.f14233h;
                        aVar.J();
                        int i2 = eVar == null ? -1 : j.f14231a[eVar.ordinal()];
                        if (i2 == 1) {
                            LoginFragment.INSTANCE.getClass();
                            FragmentDestination fragmentDestination = new FragmentDestination(LoginFragment.class);
                            sab.b bVar = sab.b.SIGN_2FA;
                            m mVar2 = (m) lVar.i.f14228a;
                            mVar.c(new FragmentNavigateCommand(fragmentDestination, new LoginFragmentContract$Configuration(bVar, (String) null, false, (String) null, ((Boolean) mVar2.f14241g.getValue(mVar2, m.f14238l[5]).get()).booleanValue(), (String) null, (Integer) null, (Parcelable) null, 494), false, 2044));
                        } else if (i2 == 2) {
                            p pVar = lVar.f14236m;
                            lfm.c cVar = pVar.d;
                            pfm.a aVar2 = new pfm.a(pVar.f127492c.a(), new n(1, new e05.h(new BreadcrumbException(), 25)), 2);
                            Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
                            ofm.h hVarW = aVar2.w(new e0f.m(1, o.f127490a), eli.n.f127489a);
                            Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
                            w.j0(cVar, hVarW);
                            SignSmsStepFragment.INSTANCE.getClass();
                            mVar.c(new FragmentNavigateCommand(SignSmsStepFragment.B0, null, false, 2046));
                        } else if (i2 == 3 || i2 == 4) {
                            SignSmsStepFragment.INSTANCE.getClass();
                            mVar.c(new FragmentNavigateCommand(SignSmsStepFragment.B0, null, false, 2046));
                        } else {
                            com.google.android.gms.internal.mlkit_vision_face.a.C(null, null, null, 7, mVar);
                        }
                        return Unit.f186387a;
                    default:
                        l lVar2 = this.f14230b;
                        sri.m mVar3 = lVar2.f14233h;
                        a61.a aVar3 = lVar2.f14234j;
                        tjg.c cVar2 = (tjg.c) obj2;
                        boolean z = false;
                        if (Intrinsics.f(cVar2, c.C1515c.f271718a)) {
                            View viewFindViewById = ((Activity) aVar3.f1531b).findViewById(R$id.login_pin_code_view);
                            PinCodeView pinCodeView = viewFindViewById instanceof PinCodeView ? (PinCodeView) viewFindViewById : null;
                            if (pinCodeView != null) {
                                pinCodeView.G0("twoFaLoading");
                                z = true;
                            }
                            View viewFindViewById2 = ((Activity) aVar3.f1531b).findViewById(R$id.codeInput);
                            CodeEditor codeEditor = viewFindViewById2 instanceof CodeEditor ? (CodeEditor) viewFindViewById2 : null;
                            if (codeEditor != null) {
                                codeEditor.setLoadingState(true);
                                z = true;
                            }
                            if (!z) {
                                ((tpi.i) ((tpi.j) aVar3.f1532c)).W(true);
                            }
                        } else if (cVar2 instanceof tjg.a) {
                            aVar3.J();
                            mVar3.c(new FinishCommand(null, null, null, 7));
                        } else if (cVar2 instanceof tjg.b) {
                            aVar3.J();
                            pfm.n nVarN = efm.b.n(((tjg.b) cVar2).f271715a);
                            Intrinsics.checkNotNullExpressionValue(nVarN, "error(...)");
                            pfm.a aVar4 = new pfm.a(hx7.a.L(nVarN, lVar2.k, false, null, 24), mfm.f.f205044g, 1);
                            Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorComplete(...)");
                            Function1 function1K = lVar2.K();
                            pfm.a aVar5 = new pfm.a(aVar4, new a0d.g(4, new b9i.h(new BreadcrumbException(), 8)), 2);
                            Intrinsics.checkNotNullExpressionValue(aVar5, "onErrorResumeNext(...)");
                            ofm.h hVarW2 = aVar5.w(new p0(2, function1K), new q(10, k.f14232a));
                            Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
                            w.j0(lVar2.f239031a, hVarW2);
                        } else if (Intrinsics.f(cVar2, c.a.f271716a) || Intrinsics.f(cVar2, c.b.f271717a)) {
                            com.google.android.gms.internal.mlkit_vision_face.a.C(null, null, null, 7, mVar3);
                        } else if (!Intrinsics.f(cVar2, c.d.f271719a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return Unit.f186387a;
                }
            }
        };
        Function1 function1K = K();
        Function0 function0J = J();
        r rVarOnErrorResumeNext = rVarF.onErrorResumeNext(new a0d.g(4, new b9i.h(new BreadcrumbException(), 6)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new p0(2, function1), new p0(2, function1K), new q(10, function0J));
        ifm.b bVar = this.f239031a;
        w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        r map = w.l(((eli.l) this.f14235l).e, rVar).filter(new b79.g(new b96.a(26), 23)).map(new b79.g(new b96.a(27), 24));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        r rVarF2 = o70.a.f(map);
        final int i2 = 1;
        Function1 function12 = new Function1(this) { // from class: bbb.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f14230b;

            {
                this.f14230b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        tjg.e eVar = (tjg.e) obj2;
                        l lVar = this.f14230b;
                        a61.a aVar = lVar.f14234j;
                        sri.m mVar = lVar.f14233h;
                        aVar.J();
                        int i22 = eVar == null ? -1 : j.f14231a[eVar.ordinal()];
                        if (i22 == 1) {
                            LoginFragment.INSTANCE.getClass();
                            FragmentDestination fragmentDestination = new FragmentDestination(LoginFragment.class);
                            sab.b bVar2 = sab.b.SIGN_2FA;
                            m mVar2 = (m) lVar.i.f14228a;
                            mVar.c(new FragmentNavigateCommand(fragmentDestination, new LoginFragmentContract$Configuration(bVar2, (String) null, false, (String) null, ((Boolean) mVar2.f14241g.getValue(mVar2, m.f14238l[5]).get()).booleanValue(), (String) null, (Integer) null, (Parcelable) null, 494), false, 2044));
                        } else if (i22 == 2) {
                            p pVar = lVar.f14236m;
                            lfm.c cVar = pVar.d;
                            pfm.a aVar2 = new pfm.a(pVar.f127492c.a(), new n(1, new e05.h(new BreadcrumbException(), 25)), 2);
                            Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
                            ofm.h hVarW = aVar2.w(new e0f.m(1, o.f127490a), eli.n.f127489a);
                            Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
                            w.j0(cVar, hVarW);
                            SignSmsStepFragment.INSTANCE.getClass();
                            mVar.c(new FragmentNavigateCommand(SignSmsStepFragment.B0, null, false, 2046));
                        } else if (i22 == 3 || i22 == 4) {
                            SignSmsStepFragment.INSTANCE.getClass();
                            mVar.c(new FragmentNavigateCommand(SignSmsStepFragment.B0, null, false, 2046));
                        } else {
                            com.google.android.gms.internal.mlkit_vision_face.a.C(null, null, null, 7, mVar);
                        }
                        return Unit.f186387a;
                    default:
                        l lVar2 = this.f14230b;
                        sri.m mVar3 = lVar2.f14233h;
                        a61.a aVar3 = lVar2.f14234j;
                        tjg.c cVar2 = (tjg.c) obj2;
                        boolean z = false;
                        if (Intrinsics.f(cVar2, c.C1515c.f271718a)) {
                            View viewFindViewById = ((Activity) aVar3.f1531b).findViewById(R$id.login_pin_code_view);
                            PinCodeView pinCodeView = viewFindViewById instanceof PinCodeView ? (PinCodeView) viewFindViewById : null;
                            if (pinCodeView != null) {
                                pinCodeView.G0("twoFaLoading");
                                z = true;
                            }
                            View viewFindViewById2 = ((Activity) aVar3.f1531b).findViewById(R$id.codeInput);
                            CodeEditor codeEditor = viewFindViewById2 instanceof CodeEditor ? (CodeEditor) viewFindViewById2 : null;
                            if (codeEditor != null) {
                                codeEditor.setLoadingState(true);
                                z = true;
                            }
                            if (!z) {
                                ((tpi.i) ((tpi.j) aVar3.f1532c)).W(true);
                            }
                        } else if (cVar2 instanceof tjg.a) {
                            aVar3.J();
                            mVar3.c(new FinishCommand(null, null, null, 7));
                        } else if (cVar2 instanceof tjg.b) {
                            aVar3.J();
                            pfm.n nVarN = efm.b.n(((tjg.b) cVar2).f271715a);
                            Intrinsics.checkNotNullExpressionValue(nVarN, "error(...)");
                            pfm.a aVar4 = new pfm.a(hx7.a.L(nVarN, lVar2.k, false, null, 24), mfm.f.f205044g, 1);
                            Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorComplete(...)");
                            Function1 function1K2 = lVar2.K();
                            pfm.a aVar5 = new pfm.a(aVar4, new a0d.g(4, new b9i.h(new BreadcrumbException(), 8)), 2);
                            Intrinsics.checkNotNullExpressionValue(aVar5, "onErrorResumeNext(...)");
                            ofm.h hVarW2 = aVar5.w(new p0(2, function1K2), new q(10, k.f14232a));
                            Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
                            w.j0(lVar2.f239031a, hVarW2);
                        } else if (Intrinsics.f(cVar2, c.a.f271716a) || Intrinsics.f(cVar2, c.b.f271717a)) {
                            com.google.android.gms.internal.mlkit_vision_face.a.C(null, null, null, 7, mVar3);
                        } else if (!Intrinsics.f(cVar2, c.d.f271719a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return Unit.f186387a;
                }
            }
        };
        Function1 function1K2 = K();
        Function0 function0J2 = J();
        r rVarOnErrorResumeNext2 = rVarF2.onErrorResumeNext(new a0d.g(4, new b9i.h(new BreadcrumbException(), 7)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new p0(2, function12), new p0(2, function1K2), new q(10, function0J2));
        w.j0(bVar, cVarSubscribe2);
        Intrinsics.h(cVarSubscribe2);
    }
}
