package com.revolut.feature.wealth.private_companies.impl.ui.private_company_details.screens.feed;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.feature.wealth.private_companies.impl.ui.private_company_details.screens.feed.PrivateCompanyDetailsFeedController;
import com.revolut.kompot.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.a;
import dli.c;
import gfh.b;
import gfh.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import te0.w;
import vc.s;
import xki.e;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/wealth/private_companies/impl/ui/private_company_details/screens/feed/PrivateCompanyDetailsFeedController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lgfh/d;", "Companion", "a", "feature_wealth_private_companies_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PrivateCompanyDetailsFeedController extends ViewController<q> implements a {
    public final PrivateCompanyDetailsFeedControllerContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(PrivateCompanyDetailsFeedController.class, "binding", "getBinding()Lcom/revolut/kompot/databinding/ScreenRecyclerViewBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.wealth.private_companies.impl.ui.private_company_details.screens.feed.PrivateCompanyDetailsFeedController$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public PrivateCompanyDetailsFeedController(PrivateCompanyDetailsFeedControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_view;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: gfh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PrivateCompanyDetailsFeedController f143408b;

            {
                this.f143408b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PrivateCompanyDetailsFeedController privateCompanyDetailsFeedController = this.f143408b;
                switch (i2) {
                    case 0:
                        PrivateCompanyDetailsFeedController.Companion companion = PrivateCompanyDetailsFeedController.INSTANCE;
                        qji.b bVarU2 = privateCompanyDetailsFeedController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth.private_companies.impl.ui.private_company_details.screens.feed.di.PrivateCompanyDetailsFeedControllerComponentInjector");
                        privateCompanyDetailsFeedController.K.getClass();
                        afh.a aVar = new afh.a();
                        aVar.f4066a = e4m.b.b(new a96.b(3));
                        return aVar;
                    case 1:
                        PrivateCompanyDetailsFeedController.Companion companion2 = PrivateCompanyDetailsFeedController.INSTANCE;
                        return (e) ((afh.a) privateCompanyDetailsFeedController.N.getValue()).f4066a.get();
                    default:
                        PrivateCompanyDetailsFeedController.Companion companion3 = PrivateCompanyDetailsFeedController.INSTANCE;
                        PrivateCompanyDetailsFeedController privateCompanyDetailsFeedController2 = this.f143408b;
                        return dli.f.a(privateCompanyDetailsFeedController2, (e) privateCompanyDetailsFeedController2.O.getValue(), f0.f322471a, 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: gfh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PrivateCompanyDetailsFeedController f143408b;

            {
                this.f143408b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PrivateCompanyDetailsFeedController privateCompanyDetailsFeedController = this.f143408b;
                switch (i22) {
                    case 0:
                        PrivateCompanyDetailsFeedController.Companion companion = PrivateCompanyDetailsFeedController.INSTANCE;
                        qji.b bVarU2 = privateCompanyDetailsFeedController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth.private_companies.impl.ui.private_company_details.screens.feed.di.PrivateCompanyDetailsFeedControllerComponentInjector");
                        privateCompanyDetailsFeedController.K.getClass();
                        afh.a aVar = new afh.a();
                        aVar.f4066a = e4m.b.b(new a96.b(3));
                        return aVar;
                    case 1:
                        PrivateCompanyDetailsFeedController.Companion companion2 = PrivateCompanyDetailsFeedController.INSTANCE;
                        return (e) ((afh.a) privateCompanyDetailsFeedController.N.getValue()).f4066a.get();
                    default:
                        PrivateCompanyDetailsFeedController.Companion companion3 = PrivateCompanyDetailsFeedController.INSTANCE;
                        PrivateCompanyDetailsFeedController privateCompanyDetailsFeedController2 = this.f143408b;
                        return dli.f.a(privateCompanyDetailsFeedController2, (e) privateCompanyDetailsFeedController2.O.getValue(), f0.f322471a, 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: gfh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PrivateCompanyDetailsFeedController f143408b;

            {
                this.f143408b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PrivateCompanyDetailsFeedController privateCompanyDetailsFeedController = this.f143408b;
                switch (i22) {
                    case 0:
                        PrivateCompanyDetailsFeedController.Companion companion = PrivateCompanyDetailsFeedController.INSTANCE;
                        qji.b bVarU2 = privateCompanyDetailsFeedController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth.private_companies.impl.ui.private_company_details.screens.feed.di.PrivateCompanyDetailsFeedControllerComponentInjector");
                        privateCompanyDetailsFeedController.K.getClass();
                        afh.a aVar = new afh.a();
                        aVar.f4066a = e4m.b.b(new a96.b(3));
                        return aVar;
                    case 1:
                        PrivateCompanyDetailsFeedController.Companion companion2 = PrivateCompanyDetailsFeedController.INSTANCE;
                        return (e) ((afh.a) privateCompanyDetailsFeedController.N.getValue()).f4066a.get();
                    default:
                        PrivateCompanyDetailsFeedController.Companion companion3 = PrivateCompanyDetailsFeedController.INSTANCE;
                        PrivateCompanyDetailsFeedController privateCompanyDetailsFeedController2 = this.f143408b;
                        return dli.f.a(privateCompanyDetailsFeedController2, (e) privateCompanyDetailsFeedController2.O.getValue(), f0.f322471a, 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((d) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (afh.a) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (gfh.e) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        KProperty[] kPropertyArr = Q;
        KProperty kProperty = kPropertyArr[0];
        h hVar = this.M;
        ViewBinding value = hVar.getValue(this, kProperty);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((pji.a) value).f236787b.setClipToPadding(false);
        ViewBinding value2 = hVar.getValue(this, kPropertyArr[0]);
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ScreenContentRecyclerView recyclerView = ((pji.a) value2).f236787b;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        knm.b.v(kli.a.k(m2(), 134.0f), recyclerView);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.P.getValue();
    }
}
