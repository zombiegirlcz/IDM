package com.revolut.feature.card_add_to_googlepay.impl;

import aii.q;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.card_add_to_googlepay.impl.AddToGooglePayViewController;
import com.revolut.feature.card_add_to_googlepay.impl.AddToGooglePayViewControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import ew2.b0;
import ew2.d0;
import ew2.e0;
import in0.g;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import pki.b;
import rd0.d;
import te0.w;
import tki.c;
import xki.e;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/card_add_to_googlepay/impl/AddToGooglePayViewController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Lew2/d0;", "Lin0/g;", "Lno/m;", "feature_card_add_to_googlepay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AddToGooglePayViewController extends ViewController<q> implements c, g, m {
    public final AddToGooglePayViewControllerContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;

    public AddToGooglePayViewController(AddToGooglePayViewControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = com.revolut.kompot.R$layout.screen_recycler_view;
        this.M = w.y0(new euf.a(9));
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: ew2.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddToGooglePayViewController f130064b;

            {
                this.f130064b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        AddToGooglePayViewController addToGooglePayViewController = this.f130064b;
                        phm.a aVar = (phm.a) ue0.e.j(addToGooglePayViewController.m2()).a().get(fw2.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", fw2.d.class, " is not found"));
                        }
                        fw2.d dVar = ((fw2.d) aVar2.b()).f138530n;
                        AddToGooglePayViewControllerContract$InputData addToGooglePayViewControllerContract$InputData = addToGooglePayViewController.K;
                        addToGooglePayViewControllerContract$InputData.getClass();
                        Activity activityM2 = addToGooglePayViewController.m2();
                        activityM2.getClass();
                        return new fw2.e(dVar, addToGooglePayViewController, addToGooglePayViewControllerContract$InputData, activityM2);
                    case 1:
                        return (b0) ((fw2.e) this.f130064b.N.getValue()).e.get();
                    default:
                        AddToGooglePayViewController addToGooglePayViewController2 = this.f130064b;
                        return tki.g.a(addToGooglePayViewController2, (b0) addToGooglePayViewController2.O.getValue(), zhm.u.c((PromptMarketingContentDelegate) addToGooglePayViewController2.M.getValue()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: ew2.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddToGooglePayViewController f130064b;

            {
                this.f130064b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        AddToGooglePayViewController addToGooglePayViewController = this.f130064b;
                        phm.a aVar = (phm.a) ue0.e.j(addToGooglePayViewController.m2()).a().get(fw2.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", fw2.d.class, " is not found"));
                        }
                        fw2.d dVar = ((fw2.d) aVar2.b()).f138530n;
                        AddToGooglePayViewControllerContract$InputData addToGooglePayViewControllerContract$InputData = addToGooglePayViewController.K;
                        addToGooglePayViewControllerContract$InputData.getClass();
                        Activity activityM2 = addToGooglePayViewController.m2();
                        activityM2.getClass();
                        return new fw2.e(dVar, addToGooglePayViewController, addToGooglePayViewControllerContract$InputData, activityM2);
                    case 1:
                        return (b0) ((fw2.e) this.f130064b.N.getValue()).e.get();
                    default:
                        AddToGooglePayViewController addToGooglePayViewController2 = this.f130064b;
                        return tki.g.a(addToGooglePayViewController2, (b0) addToGooglePayViewController2.O.getValue(), zhm.u.c((PromptMarketingContentDelegate) addToGooglePayViewController2.M.getValue()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: ew2.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddToGooglePayViewController f130064b;

            {
                this.f130064b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        AddToGooglePayViewController addToGooglePayViewController = this.f130064b;
                        phm.a aVar = (phm.a) ue0.e.j(addToGooglePayViewController.m2()).a().get(fw2.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", fw2.d.class, " is not found"));
                        }
                        fw2.d dVar = ((fw2.d) aVar2.b()).f138530n;
                        AddToGooglePayViewControllerContract$InputData addToGooglePayViewControllerContract$InputData = addToGooglePayViewController.K;
                        addToGooglePayViewControllerContract$InputData.getClass();
                        Activity activityM2 = addToGooglePayViewController.m2();
                        activityM2.getClass();
                        return new fw2.e(dVar, addToGooglePayViewController, addToGooglePayViewControllerContract$InputData, activityM2);
                    case 1:
                        return (b0) ((fw2.e) this.f130064b.N.getValue()).e.get();
                    default:
                        AddToGooglePayViewController addToGooglePayViewController2 = this.f130064b;
                        return tki.g.a(addToGooglePayViewController2, (b0) addToGooglePayViewController2.O.getValue(), zhm.u.c((PromptMarketingContentDelegate) addToGooglePayViewController2.M.getValue()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((d0) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((a) ((b0) this.O.getValue())).L2(e0.f130014a);
        return true;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getM() {
        return this.K.f;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (fw2.e) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (b0) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void W2(int i, int i2, Intent intent) {
        a aVar = (a) ((b0) this.O.getValue());
        aVar.getClass();
        if (i != 1000) {
            if (i != 1001) {
                return;
            }
            aVar.F.U(Boolean.valueOf(i2 == -1));
        } else {
            if (i2 != -1 || aVar.G.k(Unit.f186387a)) {
                return;
            }
            IllegalStateException illegalStateException = new IllegalStateException("tokenizeResultFlow buffer overflow — duplicate PUSH_TOKENIZE result");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTag(com.revolut.core.ui_kit.R$id.internal_content_description_clause, new TextLocalisedClause("add.card.to.google.pay", (List) null, (Clause) null, false, 30));
        RecyclerView recyclerViewH = ((tki.b) ((tki.a) this.P.getValue())).f271959b.h();
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerViewH.setPaddingRelative(recyclerViewH.getPaddingStart(), kli.a.w(R$attr.uikit_dp8, context), recyclerViewH.getPaddingEnd(), recyclerViewH.getPaddingBottom());
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r62 = this.M;
        ViewController.P2(this, vkm.q.J(new eq8.g(rd0.e.b(((PromptMarketingContentDelegate) r62.getValue()).f.f121375b), 12), new eq8.g(rd0.e.b(((PromptMarketingContentDelegate) r62.getValue()).f53080g.f121375b), 13), new eq8.g(rd0.e.b(((PromptMarketingContentDelegate) r62.getValue()).f53079c), 14)), new ew1.d(this, null, 1), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.P.getValue();
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }
}
