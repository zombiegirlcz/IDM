package com.revolut.feature.retail.legacy.login.impl.signsms;

import a0.d;
import android.content.Context;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import aw0.o9;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LabelButtonView;
import com.revolut.core.ui_kit.views.code.CodeEditor;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.retail.legacy.login.impl.R$id;
import com.revolut.feature.retail.legacy.login.impl.R$layout;
import com.revolut.feature.retail.legacy.login.impl.R$string;
import com.revolut.retail.core.navigation.FragmentDestination;
import com.revolut.retail.legacy_ui.fragment.BaseFragment;
import efm.r;
import j90.c;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import kotlin.text.d0;
import le.u1;
import ofm.h;
import org.jetbrains.annotations.NotNull;
import pfm.m;
import pfm.n;
import sab.b;
import t70.g;
import te0.w;
import twl.o;
import ujg.a;
import yq0.e;
import z63.j;
import zab.a0;
import zab.c0;
import zab.f;
import zab.i;
import zab.v;
import zab.y;
import zab.z;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003:\u0001\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/feature/retail/legacy/login/impl/signsms/SignSmsStepFragment;", "Lcom/revolut/retail/legacy_ui/fragment/BaseFragment;", "Lzab/f;", "Lzab/i;", "<init>", "()V", "Companion", "a", "feature_retail_legacy_login_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SignSmsStepFragment extends BaseFragment<f, i> implements i {
    public static final /* synthetic */ KProperty[] A0;
    public static final FragmentDestination B0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public CountDownTimer f82708d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public Boolean f82709e0;
    public SignSmsScreenContract$SignSmsConfiguration f0;
    public a i0;
    public g j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public c70.a f82711k0;
    public tl0.a l0;
    public b c0 = b.NONE;
    public final Handler g0 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final ihm.f f82710h0 = v0.a.d("create(...)");
    public final c m0 = u1.x(this, R$id.debug_sms_code);

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final c f82712n0 = u1.x(this, R$id.deeplink_animation_view);

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final c f82713o0 = u1.x(this, R$id.deeplink_button);
    public final c p0 = u1.x(this, R$id.deeplink_note);
    public final c q0 = u1.x(this, R$id.deeplink_subtitle);

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final c f82714r0 = u1.x(this, R$id.deeplink_title);

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final c f82715s0 = u1.x(this, R$id.deeplink_wrapper);

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final c f82716t0 = u1.x(this, R$id.digits_wrapper);
    public final c u0 = u1.x(this, R$id.main_hint_text);

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final c f82717v0 = u1.x(this, R$id.resend_button);

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final c f82718w0 = u1.x(this, com.revolut.retail.common.ui.R$id.toolbar);

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final c f82719x0 = u1.x(this, R$id.codeInput);
    public final RowDelegate y0 = new RowDelegate(null, null, 7);
    public final Object z0 = w.y0(new e(this, 23));

    /* JADX INFO: renamed from: com.revolut.feature.retail.legacy.login.impl.signsms.SignSmsStepFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    static {
        h0 h0Var = new h0(SignSmsStepFragment.class, "debugSmsCode", "getDebugSmsCode()Landroid/widget/TextView;", 0);
        p0 p0Var = o0.f186429a;
        A0 = new KProperty[]{p0Var.j(h0Var), p.a.y(SignSmsStepFragment.class, "deeplinkAnimation", "getDeeplinkAnimation()Landroid/widget/ImageView;", 0, p0Var), p.a.y(SignSmsStepFragment.class, "deeplinkButton", "getDeeplinkButton()Landroid/widget/TextView;", 0, p0Var), p.a.y(SignSmsStepFragment.class, "deeplinkNote", "getDeeplinkNote()Landroid/widget/TextView;", 0, p0Var), p.a.y(SignSmsStepFragment.class, "deeplinkSubtitle", "getDeeplinkSubtitle()Landroid/widget/TextView;", 0, p0Var), p.a.y(SignSmsStepFragment.class, "deeplinkTitle", "getDeeplinkTitle()Landroid/widget/TextView;", 0, p0Var), p.a.y(SignSmsStepFragment.class, "deeplinkWrapper", "getDeeplinkWrapper()Landroid/widget/RelativeLayout;", 0, p0Var), p.a.y(SignSmsStepFragment.class, "digitsWrapper", "getDigitsWrapper()Landroid/view/View;", 0, p0Var), p.a.y(SignSmsStepFragment.class, "hintText", "getHintText()Landroid/widget/TextView;", 0, p0Var), p.a.y(SignSmsStepFragment.class, "resendButton", "getResendButton()Lcom/revolut/core/ui_kit/views/LabelButtonView;", 0, p0Var), p.a.y(SignSmsStepFragment.class, "toolbar", "getToolbar()Lcom/revolut/core/ui_kit/views/navbar/NavBarWithToolbar;", 0, p0Var), p.a.y(SignSmsStepFragment.class, "codeInput", "getCodeInput()Lcom/revolut/core/ui_kit/views/code/CodeEditor;", 0, p0Var)};
        INSTANCE = new Companion();
        B0 = new FragmentDestination(SignSmsStepFragment.class);
    }

    public static String N(long j2) {
        int i = (int) (j2 / 60000.0f);
        long j3 = (j2 - (((long) i) * 60000)) / 1000;
        return d.i(i, j3 >= 10 ? ":" : ":0", (int) j3);
    }

    public final CodeEditor E() {
        return (CodeEditor) this.f82719x0.getValue(this, A0[11]);
    }

    public final TextView F() {
        return (TextView) this.m0.getValue(this, A0[0]);
    }

    public final TextView G() {
        return (TextView) this.f82713o0.getValue(this, A0[2]);
    }

    public final TextView H() {
        return (TextView) this.p0.getValue(this, A0[3]);
    }

    public final View I() {
        return (View) this.f82716t0.getValue(this, A0[7]);
    }

    public final TextView J() {
        return (TextView) this.u0.getValue(this, A0[8]);
    }

    public final String K() {
        SignSmsScreenContract$SignSmsConfiguration signSmsScreenContract$SignSmsConfiguration = this.f0;
        String e = signSmsScreenContract$SignSmsConfiguration != null ? signSmsScreenContract$SignSmsConfiguration.getE() : null;
        if (!a0m.a.a(e)) {
            return e;
        }
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        phm.a aVar = (phm.a) ue0.e.j(fragmentActivityRequireActivity).a().get(xmg.a.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 != null) {
            return ((xmg.a) aVar2.b()).a().a();
        }
        throw new IllegalStateException(d.q("Api ", xmg.a.class, " is not found"));
    }

    public final LabelButtonView L() {
        return (LabelButtonView) this.f82717v0.getValue(this, A0[9]);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final abb.g M() {
        return (abb.g) this.z0.getValue();
    }

    public final NavBarWithToolbar O() {
        return (NavBarWithToolbar) this.f82718w0.getValue(this, A0[10]);
    }

    public final efm.b Q(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        if (z.f320645a[this.c0.ordinal()] == 1) {
            n nVar = new n(new wf6.w(this, code, 7), 1);
            Intrinsics.checkNotNullExpressionValue(nVar, "fromCallable(...)");
            return nVar;
        }
        m mVar = m.f235744a;
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }

    public final void V() {
        CountDownTimer countDownTimer = this.f82708d0;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f82709e0 = Boolean.FALSE;
        this.f82708d0 = new c0(this).start();
        if (I().getVisibility() == 0) {
            J().setVisibility(0);
            L().setVisibility(8);
        }
    }

    public final void W(CharSequence string) {
        Intrinsics.checkNotNullParameter(string, "string");
        O().setSecondDescriptionVisible(!d0.W(string));
        O().setSecondDescriptionText(new TextClause(string.toString(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
    }

    public final void X(String str, String str2, String str3) {
        KProperty[] kPropertyArr = A0;
        ((TextView) this.f82714r0.getValue(this, kPropertyArr[5])).setText(str);
        ((TextView) this.q0.getValue(this, kPropertyArr[4])).setText(str2);
        if (str3.length() == 0) {
            G().setVisibility(8);
        } else {
            G().setText(str3);
            G().setVisibility(0);
        }
        G().setOnClickListener(new v(this, 2));
        H().setOnClickListener(new v(this, 3));
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        yy0.f.e(jh.d.f(fragmentActivityRequireActivity).Q(), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D001", null, null, null, 30), (ImageView) this.f82712n0.getValue(this, kPropertyArr[1]), null, null, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Y() {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.retail.legacy.login.impl.signsms.SignSmsStepFragment.Y():void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        this.j0 = M().E();
        this.i0 = M().e();
        this.f82711k0 = M().getClipboard();
        this.l0 = M().y();
    }

    @Override // com.revolut.retail.legacy_ui.fragment.BaseFragment
    public final boolean onBackPressed() {
        D().setResult(0);
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onContextItemSelected(MenuItem item) throws IOException {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() != E().getId()) {
            return super.onContextItemSelected(item);
        }
        c70.a aVar = this.f82711k0;
        if (aVar == null) {
            Intrinsics.r("clipboard");
            throw null;
        }
        String strE = aVar.e();
        if (strE == null) {
            return false;
        }
        E().setCode(strE);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    @Override // androidx.fragment.app.Fragment, android.view.View.OnCreateContextMenuListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreateContextMenu(android.view.ContextMenu r4, android.view.View r5, android.view.ContextMenu.ContextMenuInfo r6) throws java.io.IOException {
        /*
            r3 = this;
            java.lang.String r0 = "menu"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "v"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            super.onCreateContextMenu(r4, r5, r6)
            int r6 = r5.getId()
            com.revolut.core.ui_kit.views.code.CodeEditor r0 = r3.E()
            int r0 = r0.getId()
            if (r6 != r0) goto L5b
            c70.a r6 = r3.f82711k0
            r0 = 0
            if (r6 == 0) goto L55
            java.lang.String r1 = "text/plain"
            boolean r1 = r6.f(r1)
            r2 = 0
            if (r1 == 0) goto L3a
            java.lang.String r6 = r6.e()
            if (r6 == 0) goto L34
            int r6 = r6.length()
            goto L35
        L34:
            r6 = r2
        L35:
            r1 = 6
            if (r6 < r1) goto L3a
            r6 = 1
            goto L3b
        L3a:
            r6 = r2
        L3b:
            if (r6 == 0) goto L5b
            int r5 = r5.getId()
            t70.g r6 = r3.j0
            if (r6 == 0) goto L4f
            int r0 = com.revolut.feature.retail.legacy.login.impl.R$string.common_action_paste
            java.lang.String r6 = r6.getString(r0)
            r4.add(r2, r5, r2, r6)
            return
        L4f:
            java.lang.String r4 = "localization"
            kotlin.jvm.internal.Intrinsics.r(r4)
            throw r0
        L55:
            java.lang.String r4 = "clipboard"
            kotlin.jvm.internal.Intrinsics.r(r4)
            throw r0
        L5b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.retail.legacy.login.impl.signsms.SignSmsStepFragment.onCreateContextMenu(android.view.ContextMenu, android.view.View, android.view.ContextMenu$ContextMenuInfo):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        b f82722c;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        if (requireActivity().getIntent() != null && (requireActivity().getIntent().getParcelableExtra("CONFIGURATION_ARG") instanceof SignSmsScreenContract$SignSmsConfiguration)) {
            this.f0 = (SignSmsScreenContract$SignSmsConfiguration) requireActivity().getIntent().getParcelableExtra("CONFIGURATION_ARG");
        } else if (B() != null && (B() instanceof SignSmsScreenContract$SignSmsConfiguration)) {
            this.f0 = (SignSmsScreenContract$SignSmsConfiguration) A();
        }
        SignSmsScreenContract$SignSmsConfiguration signSmsScreenContract$SignSmsConfiguration = this.f0;
        if (signSmsScreenContract$SignSmsConfiguration == null || (f82722c = signSmsScreenContract$SignSmsConfiguration.getF82722c()) == null) {
            f82722c = b.values()[D().getIntent().getIntExtra("argSignMode", b.NONE.ordinal())];
        }
        this.c0 = f82722c;
        View viewInflate = inflater.inflate(R$layout.fragment_sign_sms, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.g0.removeCallbacksAndMessages(null);
        CountDownTimer countDownTimer = this.f82708d0;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        super.onDestroyView();
    }

    @Override // com.revolut.retail.legacy_ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (I().getVisibility() == 0) {
            this.g0.postDelayed(new x.b(this, 15), 100L);
        }
    }

    @Override // com.revolut.retail.core.mvp.BaseMvpFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        Companion companion = INSTANCE;
        CodeEditor codeEditorE = E();
        FragmentActivity activity = getActivity();
        companion.getClass();
        Intrinsics.checkNotNullParameter(codeEditorE, "<this>");
        Intrinsics.checkNotNullParameter(this, "view");
        r rVarDebounce = codeEditorE.f59037g.debounce(500L, TimeUnit.MILLISECONDS);
        efm.c0 c0Var = hfm.c.f152030a;
        m70.a.p(c0Var);
        r rVarDoOnNext = rVarDebounce.observeOn(c0Var).doOnNext(new zab.b(16, new btb.m(activity, 1)));
        int i = 17;
        h disposable = rVarDoOnNext.flatMapCompletable(new zab.b(i, new zab.w(this, 4))).h(y.f320644a).w(new zab.b(15, new z8h.b(i)), new bji.a(10));
        Intrinsics.checkNotNullExpressionValue(disposable, "subscribe(...)");
        Intrinsics.checkNotNullParameter(disposable, "disposable");
        this.f104326b0.a(disposable);
    }

    @Override // com.revolut.retail.legacy_ui.fragment.BaseFragment, com.revolut.retail.core.mvp.BaseMvpFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        opi.d.c(M().c());
        super.onStop();
    }

    @Override // com.revolut.retail.core.mvp.BaseMvpFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        registerForContextMenu(E());
        Y();
        CountDownTimer countDownTimer = this.f82708d0;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f82709e0 = Boolean.FALSE;
        this.f82708d0 = new c0(this).start();
        M().c().Y("SIGN_SMS_RESEND_DIALOG_DELEGATES_KEY", u.c(this.y0));
        NavBarWithToolbar navBarWithToolbarO = O();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        navBarWithToolbarO.setBackgroundColor(kli.a.s(R$attr.uikit_windowBackground, contextRequireContext));
        O().setAlwaysExpanded(false);
        O().setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back));
        ihm.f fVar = O().f59410q;
        zab.w wVar = new zab.w(this, 3);
        r rVarOnErrorResumeNext = fVar.onErrorResumeNext(new nii.o0(27, new j(new BreadcrumbException(), 17)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new o(12, wVar), new o(12, a0.f320593a));
        Intrinsics.checkNotNullExpressionValue(cVarSubscribe, "subscribe(...)");
        w.j0(this.f104326b0, cVarSubscribe);
        if (b.SIGN_2FA == this.c0) {
            O().setTitle(new TextLocalisedClause(R$string.otp_input_sms_title, null, null, 14), null);
        } else {
            O().setTitle(new TextLocalisedClause(R$string.signup_registration_sms_code_title, null, null, 14), null);
        }
        TextView textViewJ = J();
        g gVar = this.j0;
        if (gVar == null) {
            Intrinsics.r("localization");
            throw null;
        }
        textViewJ.setText(gVar.getString(R$string.signup_registration_sms_code_hint_should_arrive));
        L().setText(new TextLocalisedClause(R$string.otp_input_sms_resend, null, null, 14));
        L().setOnClickListener(new v(this, 1));
    }

    @Override // com.revolut.retail.core.mvp.BaseMvpFragment
    public final pri.e z() {
        zab.g gVar = (zab.g) getActivity();
        if (gVar != null) {
            return gVar.B0();
        }
        return null;
    }
}
