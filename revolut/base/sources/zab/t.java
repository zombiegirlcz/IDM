package zab;

import android.widget.RelativeLayout;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.domain.models.login.ChannelType;
import com.revolut.feature.retail.legacy.login.impl.R$string;
import com.revolut.feature.retail.legacy.login.impl.network.AuthService;
import com.revolut.feature.retail.legacy.login.impl.signsms.SignSmsStepFragment;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.ImplicitActivityDestination;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;

/* JADX INFO: loaded from: classes6.dex */
public final class t extends pri.b implements f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f9b.f f320622h;
    public final f01.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d f320623j;
    public final h k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final sri.m f320624l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final tpi.j f320625m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AuthService f320626n;
    public final k21.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z80.b f320627p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final tl0.a f320628q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final zm0.c f320629r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final gu2.b f320630s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e f320631t;
    public final opi.d u;
    public final ActivityNavigateCommand v;

    public t(f9b.f errorView, f01.c uiKitResources, d presentationModel, h state, sri.m navigator, tpi.j progressView, AuthService authService, k21.c otpRepository, z80.b phoneToolsProvider, tl0.a base64Wrapper, zm0.c sessionProvider, gu2.b captchaView, e signSmsScreenMapper, opi.d expandableDialogView) {
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        Intrinsics.checkNotNullParameter(authService, "authService");
        Intrinsics.checkNotNullParameter(otpRepository, "otpRepository");
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
        Intrinsics.checkNotNullParameter(sessionProvider, "sessionProvider");
        Intrinsics.checkNotNullParameter(captchaView, "captchaView");
        Intrinsics.checkNotNullParameter(signSmsScreenMapper, "signSmsScreenMapper");
        Intrinsics.checkNotNullParameter(expandableDialogView, "expandableDialogView");
        this.f320622h = errorView;
        this.i = uiKitResources;
        this.f320623j = presentationModel;
        this.k = state;
        this.f320624l = navigator;
        this.f320625m = progressView;
        this.f320626n = authService;
        this.o = otpRepository;
        this.f320627p = phoneToolsProvider;
        this.f320628q = base64Wrapper;
        this.f320629r = sessionProvider;
        this.f320630s = captchaView;
        this.f320631t = signSmsScreenMapper;
        this.u = expandableDialogView;
        this.v = new ActivityNavigateCommand(new ImplicitActivityDestination("android.intent.action.MAIN", zhm.u.c("android.intent.category.APP_EMAIL"), null, null, null, 28), null, null, null, 268435456, null, null, null, null, false, 1006);
    }

    public static String N(String str) {
        if (str == null || str.length() == 0) {
            String strE = o0.f186429a.b(t.class).e();
            Intrinsics.h(strE);
            Exception exc2 = new Exception("phone is empty");
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, strE, null, exc2, h0Var);
        }
        return str == null ? "" : str;
    }

    public final void O(Function1 function1) {
        efm.d0 d0VarM;
        if (((cn0.g) this.f320629r).d() instanceof mm0.n) {
            od0.i.Companion.getClass();
            d0VarM = efm.d0.m(od0.i.f224256b);
        } else {
            gu2.b bVar = this.f320630s;
            bVar.getClass();
            ufm.i iVar = new ufm.i(te0.w.o0(kotlin.coroutines.g.f186406a, new gu2.a(bVar, null, 1)), new b(9, new s(1, od0.i.Companion, od0.h.class, "of", "of(Ljava/lang/Object;)Lcom/revolut/core/common/Optional;", 0, 3)), 1);
            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
            d0VarM = ue0.e.D(iVar, new z8h.b(14));
        }
        efm.d0 d0VarW = mo3.a.w(o70.a.i(d0VarM), this.f320625m);
        z8g.q qVar = new z8g.q(function1, this);
        Function1 function1K = K();
        ufm.i iVar2 = new ufm.i(d0VarW, new xz7.f(4, new z63.j(new BreadcrumbException(), 14)), 2);
        Intrinsics.checkNotNullExpressionValue(iVar2, "onErrorResumeNext(...)");
        ofm.i iVar3 = new ofm.i(new nw8.d(29, qVar), new nw8.d(29, function1K), 0);
        iVar2.q(iVar3);
        Intrinsics.checkNotNullExpressionValue(iVar3, "subscribe(...)");
        te0.w.j0(this.f239031a, iVar3);
    }

    public final void P(ChannelType channelType) {
        efm.d0 fVar;
        int i = n.f320617a[channelType.ordinal()];
        f01.c cVar = this.i;
        z80.b bVar = this.f320627p;
        int i2 = 0;
        d dVar = this.f320623j;
        if (i == 1) {
            i iVar = (i) L();
            if (iVar != null) {
                SignSmsStepFragment signSmsStepFragment = (SignSmsStepFragment) iVar;
                if (signSmsStepFragment.I().getVisibility() == 0) {
                    kli.c.d(signSmsStepFragment.L(), 500L);
                }
                signSmsStepFragment.I().setVisibility(0);
                ((RelativeLayout) signSmsStepFragment.f82715s0.getValue(signSmsStepFragment, SignSmsStepFragment.A0[6])).setVisibility(8);
            }
            i iVar2 = (i) L();
            if (iVar2 != null) {
                ((SignSmsStepFragment) iVar2).W(cVar.b(new TextLocalisedClause(R$string.sign_in_confirmation_code_sms_subtitle, zhm.u.c(N(z80.b.b(bVar, dVar.k3(), null, null, 6))), null, 12)).toString());
                return;
            }
            return;
        }
        int i3 = 3;
        if (i == 2) {
            String str = (String) ((te0.r) dVar.f320600b.getEmail()).get();
            int i5 = 29;
            if (kotlin.text.d0.W(str)) {
                ufm.i iVar3 = new ufm.i(dVar.j3(), new z3e.a(new z8h.b(11), i5), 1);
                Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                ufm.b bVarM = efm.d0.m("");
                Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                fVar = new ufm.f(ue0.e.C(iVar3, bVarM), new b(i2, new a(dVar, 0)), 0);
            } else {
                fVar = efm.d0.m(str);
            }
            ufm.n nVarI = o70.a.i(fVar);
            j jVar = new j(this, i3);
            Function1 function1K = K();
            ufm.i iVar4 = new ufm.i(nVarI, new xz7.f(4, new z63.j(new BreadcrumbException(), 15)), 2);
            Intrinsics.checkNotNullExpressionValue(iVar4, "onErrorResumeNext(...)");
            ofm.i iVar5 = new ofm.i(new nw8.d(29, jVar), new nw8.d(29, function1K), i2);
            iVar4.q(iVar5);
            Intrinsics.checkNotNullExpressionValue(iVar5, "subscribe(...)");
            te0.w.j0(this.f239031a, iVar5);
            return;
        }
        if (i != 3) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("No title for channel for the channel type " + channelType);
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.WARNING, null, null, illegalArgumentException, h0Var);
            return;
        }
        i iVar6 = (i) L();
        if (iVar6 != null) {
            SignSmsStepFragment signSmsStepFragment2 = (SignSmsStepFragment) iVar6;
            if (signSmsStepFragment2.I().getVisibility() == 0) {
                kli.c.d(signSmsStepFragment2.L(), 500L);
            }
            signSmsStepFragment2.I().setVisibility(0);
            ((RelativeLayout) signSmsStepFragment2.f82715s0.getValue(signSmsStepFragment2, SignSmsStepFragment.A0[6])).setVisibility(8);
        }
        i iVar7 = (i) L();
        if (iVar7 != null) {
            ((SignSmsStepFragment) iVar7).W(cVar.b(new TextLocalisedClause(R$string.signup_registration_call_code_subtitle, zhm.u.c(N(z80.b.b(bVar, dVar.k3(), null, null, 6))), null, 12)).toString());
        }
    }

    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        final i view = (i) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        d dVar = this.f320623j;
        dVar.init();
        h hVar = dVar.f320600b;
        if (!this.f320624l.b(this.v)) {
            ((SignSmsStepFragment) view).G().setVisibility(8);
        }
        ChannelType channelType = (ChannelType) te0.w.O(hVar.j0());
        if (channelType == null) {
            channelType = ChannelType.SMS;
        }
        P(channelType);
        efm.r rVarF = o70.a.f(dVar.f320602g);
        tpi.j jVar = this.f320625m;
        efm.r rVarS = mo3.a.s(rVarF, jVar);
        Intrinsics.checkNotNullExpressionValue(rVarS, "withDataProgress(...)");
        efm.r rVarK = hx7.a.K(rVarS, this.f320622h, true, false, null, 24);
        Function1 function1K = K();
        Function0 function0J = J();
        efm.r rVarOnErrorResumeNext = rVarK.onErrorResumeNext(new xz7.f(4, new z63.j(new BreadcrumbException(), 9)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new nw8.d(29, o.f320618a), new nw8.d(29, function1K), new yzc.p(5, function0J));
        ifm.b bVar = this.f239031a;
        te0.w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        efm.r rVarS2 = mo3.a.s(o70.a.f(dVar.f320603h), jVar);
        Intrinsics.checkNotNullExpressionValue(rVarS2, "withDataProgress(...)");
        efm.r rVarK2 = hx7.a.K(rVarS2, this.f320622h, true, false, null, 24);
        Function1 function1K2 = K();
        Function0 function0J2 = J();
        efm.r rVarOnErrorResumeNext2 = rVarK2.onErrorResumeNext(new xz7.f(4, new z63.j(new BreadcrumbException(), 10)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new nw8.d(29, p.f320619a), new nw8.d(29, function1K2), new yzc.p(5, function0J2));
        te0.w.j0(bVar, cVarSubscribe2);
        Intrinsics.h(cVarSubscribe2);
        efm.r rVarS3 = mo3.a.s(o70.a.f(dVar.f), jVar);
        Intrinsics.checkNotNullExpressionValue(rVarS3, "withDataProgress(...)");
        efm.r rVarK3 = hx7.a.K(rVarS3, this.f320622h, true, false, null, 24);
        Function1 function1K3 = K();
        Function0 function0J3 = J();
        efm.r rVarOnErrorResumeNext3 = rVarK3.onErrorResumeNext(new xz7.f(4, new z63.j(new BreadcrumbException(), 11)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext3, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe3 = rVarOnErrorResumeNext3.subscribe(new nw8.d(29, q.f320620a), new nw8.d(29, function1K3), new yzc.p(5, function0J3));
        te0.w.j0(bVar, cVarSubscribe3);
        Intrinsics.h(cVarSubscribe3);
        te0.e eVarJ0 = hVar.j0();
        te0.s sVar = te0.s.f270018a;
        efm.r rVarF2 = o70.a.f(eVarJ0.c(sVar));
        j jVar2 = new j(this, 0);
        Function1 function1K4 = K();
        Function0 function0J4 = J();
        efm.r rVarOnErrorResumeNext4 = rVarF2.onErrorResumeNext(new xz7.f(4, new z63.j(new BreadcrumbException(), 4)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext4, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe4 = rVarOnErrorResumeNext4.subscribe(new nw8.d(29, jVar2), new nw8.d(29, function1K4), new yzc.p(5, function0J4));
        te0.w.j0(bVar, cVarSubscribe4);
        Intrinsics.h(cVarSubscribe4);
        efm.r rVarDoAfterNext = hVar.v().c(sVar).filter(new b(3, new z8h.b(10))).doAfterNext(new b(4, new a(dVar, 3)));
        Intrinsics.checkNotNullExpressionValue(rVarDoAfterNext, "doAfterNext(...)");
        efm.r rVarF3 = o70.a.f(rVarDoAfterNext);
        final int i = 0;
        Function1 function1 = new Function1() { // from class: zab.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        String code = (String) obj2;
                        Intrinsics.checkNotNullParameter(code, "it");
                        SignSmsStepFragment signSmsStepFragment = (SignSmsStepFragment) view;
                        Intrinsics.checkNotNullParameter(code, "code");
                        e0m.e.b(signSmsStepFragment.getActivity(), true);
                        t70.g gVar = signSmsStepFragment.j0;
                        if (gVar == null) {
                            Intrinsics.r("localization");
                            throw null;
                        }
                        String string = gVar.getString(R$string.email_verification_status_verifying_title);
                        t70.g gVar2 = signSmsStepFragment.j0;
                        if (gVar2 == null) {
                            Intrinsics.r("localization");
                            throw null;
                        }
                        signSmsStepFragment.X(string, gVar2.getString(R$string.email_verification_status_verifying_subtitle), "");
                        signSmsStepFragment.H().setVisibility(8);
                        ((RelativeLayout) signSmsStepFragment.f82715s0.getValue(signSmsStepFragment, SignSmsStepFragment.A0[6])).setVisibility(0);
                        signSmsStepFragment.I().setVisibility(8);
                        efm.b bVarH = signSmsStepFragment.Q(code).h(d0.f320604a);
                        Intrinsics.checkNotNullExpressionValue(bVarH, "compose(...)");
                        pfm.a aVar2 = new pfm.a(bVarH, new nii.o0(27, new z63.j(new BreadcrumbException(), 20)), 2);
                        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
                        ofm.h disposable = aVar2.w(new twl.o(12, f0.f320606a), e0.f320605a);
                        Intrinsics.checkNotNullExpressionValue(disposable, "subscribe(...)");
                        Intrinsics.checkNotNullParameter(disposable, "disposable");
                        signSmsStepFragment.f104326b0.a(disposable);
                        return Unit.f186387a;
                    default:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ((SignSmsStepFragment) view).Y();
                        return Unit.f186387a;
                }
            }
        };
        Function1 function1K5 = K();
        Function0 function0J5 = J();
        efm.r rVarOnErrorResumeNext5 = rVarF3.onErrorResumeNext(new xz7.f(4, new z63.j(new BreadcrumbException(), 5)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext5, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe5 = rVarOnErrorResumeNext5.subscribe(new nw8.d(29, function1), new nw8.d(29, function1K5), new yzc.p(5, function0J5));
        te0.w.j0(bVar, cVarSubscribe5);
        Intrinsics.h(cVarSubscribe5);
        if (((Boolean) hVar.F().get()).booleanValue()) {
            O(new yea.l(1, this.f320623j, d.class, "onSmsVerificationResendPressed", "onSmsVerificationResendPressed(Ljava/lang/String;)V", 0, 29));
        }
        efm.r rVarF4 = o70.a.f(dVar.i);
        final int i2 = 1;
        Function1 function12 = new Function1() { // from class: zab.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        String code = (String) obj2;
                        Intrinsics.checkNotNullParameter(code, "it");
                        SignSmsStepFragment signSmsStepFragment = (SignSmsStepFragment) view;
                        Intrinsics.checkNotNullParameter(code, "code");
                        e0m.e.b(signSmsStepFragment.getActivity(), true);
                        t70.g gVar = signSmsStepFragment.j0;
                        if (gVar == null) {
                            Intrinsics.r("localization");
                            throw null;
                        }
                        String string = gVar.getString(R$string.email_verification_status_verifying_title);
                        t70.g gVar2 = signSmsStepFragment.j0;
                        if (gVar2 == null) {
                            Intrinsics.r("localization");
                            throw null;
                        }
                        signSmsStepFragment.X(string, gVar2.getString(R$string.email_verification_status_verifying_subtitle), "");
                        signSmsStepFragment.H().setVisibility(8);
                        ((RelativeLayout) signSmsStepFragment.f82715s0.getValue(signSmsStepFragment, SignSmsStepFragment.A0[6])).setVisibility(0);
                        signSmsStepFragment.I().setVisibility(8);
                        efm.b bVarH = signSmsStepFragment.Q(code).h(d0.f320604a);
                        Intrinsics.checkNotNullExpressionValue(bVarH, "compose(...)");
                        pfm.a aVar2 = new pfm.a(bVarH, new nii.o0(27, new z63.j(new BreadcrumbException(), 20)), 2);
                        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
                        ofm.h disposable = aVar2.w(new twl.o(12, f0.f320606a), e0.f320605a);
                        Intrinsics.checkNotNullExpressionValue(disposable, "subscribe(...)");
                        Intrinsics.checkNotNullParameter(disposable, "disposable");
                        signSmsStepFragment.f104326b0.a(disposable);
                        return Unit.f186387a;
                    default:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ((SignSmsStepFragment) view).Y();
                        return Unit.f186387a;
                }
            }
        };
        Function1 function1K6 = K();
        Function0 function0J6 = J();
        efm.r rVarOnErrorResumeNext6 = rVarF4.onErrorResumeNext(new xz7.f(4, new z63.j(new BreadcrumbException(), 6)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext6, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe6 = rVarOnErrorResumeNext6.subscribe(new nw8.d(29, function12), new nw8.d(29, function1K6), new yzc.p(5, function0J6));
        te0.w.j0(bVar, cVarSubscribe6);
        Intrinsics.h(cVarSubscribe6);
        SignSmsStepFragment signSmsStepFragment = (SignSmsStepFragment) view;
        rfm.o oVar = new rfm.o(new s2i.i(signSmsStepFragment, 25));
        Intrinsics.checkNotNullExpressionValue(oVar, "fromCallable(...)");
        pfm.a aVar2 = new pfm.a(new rfm.m(oVar, new b(5, new z8h.b(13)), 0), new b(6, new j(this, 2)), 3);
        Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
        Function1 function1K7 = K();
        pfm.a aVar3 = new pfm.a(aVar2, new xz7.f(4, new z63.j(new BreadcrumbException(), 12)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar3.w(new nw8.d(29, function1K7), new yzc.p(5, r.f320621a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        te0.w.j0(bVar, hVarW);
        efm.r rVarSwitchMapSingle = signSmsStepFragment.f82710h0.switchMapSingle(new b(7, new l(this, signSmsStepFragment)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMapSingle, "switchMapSingle(...)");
        efm.r rVarF5 = o70.a.f(rVarSwitchMapSingle);
        l lVar = new l(signSmsStepFragment, this);
        Function1 function1K8 = K();
        Function0 function0J7 = J();
        efm.r rVarOnErrorResumeNext7 = rVarF5.onErrorResumeNext(new xz7.f(4, new z63.j(new BreadcrumbException(), 7)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext7, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe7 = rVarOnErrorResumeNext7.subscribe(new nw8.d(29, lVar), new nw8.d(29, function1K8), new yzc.p(5, function0J7));
        te0.w.j0(bVar, cVarSubscribe7);
        Intrinsics.h(cVarSubscribe7);
        ihm.f fVar = signSmsStepFragment.y0.f53218h;
        j jVar3 = new j(this, 1);
        Function1 function1K9 = K();
        Function0 function0J8 = J();
        efm.r rVarOnErrorResumeNext8 = fVar.onErrorResumeNext(new xz7.f(4, new z63.j(new BreadcrumbException(), 8)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext8, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe8 = rVarOnErrorResumeNext8.subscribe(new nw8.d(29, jVar3), new nw8.d(29, function1K9), new yzc.p(5, function0J8));
        te0.w.j0(bVar, cVarSubscribe8);
        Intrinsics.h(cVarSubscribe8);
    }
}
