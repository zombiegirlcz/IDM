package com.revolut.feature.profile.impl.ui.details.email.confirm;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.m;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.profile.impl.R$id;
import com.revolut.feature.profile.impl.R$layout;
import com.revolut.feature.profile.impl.ui.details.email.confirm.EmailConfirmationScreen;
import com.revolut.feature.profile.impl.ui.details.email.confirm.EmailConfirmationScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import dli.a;
import fma.i;
import jh.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import wma.b;
import wma.c;
import wma.f;
import xki.e;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/profile/impl/ui/details/email/confirm/EmailConfirmationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lwma/c;", "Ldli/a;", "Lcli/m;", "retail_feature_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EmailConfirmationScreen extends ViewController<c> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(EmailConfirmationScreen.class, "binding", "getBinding()Lcom/revolut/feature/profile/impl/databinding/ScreenConfirmationLoadingBinding;", 0))};
    public final EmailConfirmationScreenContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final h P;

    public EmailConfirmationScreen(EmailConfirmationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_confirmation_loading;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: wma.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EmailConfirmationScreen f298625b;

            {
                this.f298625b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EmailConfirmationScreen emailConfirmationScreen = this.f298625b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EmailConfirmationScreen.Q;
                        qji.b bVarU2 = emailConfirmationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.profile.impl.ui.details.email.confirm.di.EmailConfirmationScreenInjector");
                        i iVar = (i) bVarU2;
                        fma.h hVar = iVar.f136161b;
                        i iVar2 = iVar.f136162c;
                        EmailConfirmationScreenContract$InputData emailConfirmationScreenContract$InputData = emailConfirmationScreen.K;
                        emailConfirmationScreenContract$InputData.getClass();
                        return new fma.e(hVar, iVar2, emailConfirmationScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = EmailConfirmationScreen.Q;
                        return (f) ((fma.e) emailConfirmationScreen.M.getValue()).f136090b.get();
                    default:
                        KProperty[] kPropertyArr3 = EmailConfirmationScreen.Q;
                        EmailConfirmationScreen emailConfirmationScreen2 = this.f298625b;
                        return dli.f.a(emailConfirmationScreen2, (f) emailConfirmationScreen2.N.getValue(), f0.f322471a, R$id.loadingConfirmation_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: wma.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EmailConfirmationScreen f298625b;

            {
                this.f298625b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EmailConfirmationScreen emailConfirmationScreen = this.f298625b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EmailConfirmationScreen.Q;
                        qji.b bVarU2 = emailConfirmationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.profile.impl.ui.details.email.confirm.di.EmailConfirmationScreenInjector");
                        i iVar = (i) bVarU2;
                        fma.h hVar = iVar.f136161b;
                        i iVar2 = iVar.f136162c;
                        EmailConfirmationScreenContract$InputData emailConfirmationScreenContract$InputData = emailConfirmationScreen.K;
                        emailConfirmationScreenContract$InputData.getClass();
                        return new fma.e(hVar, iVar2, emailConfirmationScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = EmailConfirmationScreen.Q;
                        return (f) ((fma.e) emailConfirmationScreen.M.getValue()).f136090b.get();
                    default:
                        KProperty[] kPropertyArr3 = EmailConfirmationScreen.Q;
                        EmailConfirmationScreen emailConfirmationScreen2 = this.f298625b;
                        return dli.f.a(emailConfirmationScreen2, (f) emailConfirmationScreen2.N.getValue(), f0.f322471a, R$id.loadingConfirmation_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: wma.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EmailConfirmationScreen f298625b;

            {
                this.f298625b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EmailConfirmationScreen emailConfirmationScreen = this.f298625b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EmailConfirmationScreen.Q;
                        qji.b bVarU2 = emailConfirmationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.profile.impl.ui.details.email.confirm.di.EmailConfirmationScreenInjector");
                        i iVar = (i) bVarU2;
                        fma.h hVar = iVar.f136161b;
                        i iVar2 = iVar.f136162c;
                        EmailConfirmationScreenContract$InputData emailConfirmationScreenContract$InputData = emailConfirmationScreen.K;
                        emailConfirmationScreenContract$InputData.getClass();
                        return new fma.e(hVar, iVar2, emailConfirmationScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = EmailConfirmationScreen.Q;
                        return (f) ((fma.e) emailConfirmationScreen.M.getValue()).f136090b.get();
                    default:
                        KProperty[] kPropertyArr3 = EmailConfirmationScreen.Q;
                        EmailConfirmationScreen emailConfirmationScreen2 = this.f298625b;
                        return dli.f.a(emailConfirmationScreen2, (f) emailConfirmationScreen2.N.getValue(), f0.f322471a, R$id.loadingConfirmation_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = s.t(this, b.f);
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((m) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (fma.e) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (f) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.P.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ema.a aVar = (ema.a) value;
        AppCompatTextView loadingConfirmationTitleView = aVar.f127638c;
        Intrinsics.checkNotNullExpressionValue(loadingConfirmationTitleView, "loadingConfirmationTitleView");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R.string.email_verification_status_verifying_title, null, null, 14);
        Context context = loadingConfirmationTitleView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ty0.c.b(d.f(context).b0(), textLocalisedClause, loadingConfirmationTitleView, null, null, 12);
        AppCompatTextView loadingConfirmationSubtitleView = aVar.f127637b;
        Intrinsics.checkNotNullExpressionValue(loadingConfirmationSubtitleView, "loadingConfirmationSubtitleView");
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R.string.email_verification_status_verifying_subtitle, null, null, 14);
        Context context2 = loadingConfirmationSubtitleView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        ty0.c.b(d.f(context2).b0(), textLocalisedClause2, loadingConfirmationSubtitleView, null, null, 12);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
