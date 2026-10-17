package com.revolut.feature.blue_prompt.fullscreen;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.c;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.core.ui_kit.delegates.ad;
import com.revolut.core.ui_kit.delegates.bd;
import com.revolut.core.ui_kit.delegates.xc;
import com.revolut.core.ui_kit.internal.views.ProgressAnimation;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.blue_prompt.BluePromptContent;
import com.revolut.feature.blue_prompt.BluePromptProgressAnimation;
import com.revolut.feature.blue_prompt.R$id;
import com.revolut.feature.blue_prompt.R$layout;
import com.revolut.feature.blue_prompt.fullscreen.BluePromptContract$Configuration;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import le.u1;
import mic.a0;
import mk5.s;
import mm7.h;
import ms0.j0;
import ms2.d;
import ms2.f;
import opi.b;
import org.jetbrains.annotations.NotNull;
import pri.e;
import te0.n;
import te0.w;
import yhm.j;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001\nB\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/revolut/feature/blue_prompt/fullscreen/BluePromptActivity;", "Lcom/revolut/retail/core/ui/activity/BaseDelegatesActivity;", "Lms2/c;", "Lms2/f;", "Ldri/a;", "Lin0/g;", "Lno/m;", "<init>", "()V", "Companion", "a", "feature_blue_prompt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class BluePromptActivity extends BaseDelegatesActivity implements f, dri.a {
    public b B0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ns2.a f64288r0;
    public static final /* synthetic */ KProperty[] D0 = {o0.f186429a.j(new h0(BluePromptActivity.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final int E0 = R$attr.uikit_colorGroupedBackground;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final j90.a f64289s0 = u1.w(this, R$id.recyclerView);

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Lazy f64290t0 = j.b(new mq4.b(11));
    public final FullScreenStateDelegate u0 = new FullScreenStateDelegate();

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final Lazy f64291v0 = j.b(new ms2.a(this, 2));

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final Object f64292w0 = w.y0(new mq4.b(12));

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final Object f64293x0 = w.y0(new mq4.b(13));
    public final Object y0 = w.y0(new mq4.b(14));
    public final Object z0 = w.y0(new mq4.b(10));
    public final Lazy A0 = j.b(new ms2.a(this, 0));
    public final ifm.b C0 = new ifm.b();

    /* JADX INFO: renamed from: com.revolut.feature.blue_prompt.fullscreen.BluePromptActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    @Override // dri.a
    public final boolean D0() {
        return ((BluePromptContract$Configuration) G0()).getF64312c();
    }

    @Override // nri.b
    public final e F0() {
        ns2.a aVar = this.f64288r0;
        if (aVar != null) {
            return aVar.b();
        }
        Intrinsics.r("component");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0 */
    public final String getF85901s0() {
        return (String) this.A0.getValue();
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        ns2.a aVar = this.f64288r0;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("component");
        throw null;
    }

    @Override // nri.b, no.m
    /* JADX INFO: renamed from: P */
    public AnalyticsProduct getN() {
        return ((BluePromptContract$Configuration) G0()).getE();
    }

    public ns2.a Z0(Bundle bundle, BluePromptContract$Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new ls2.a(((ls2.b) c.l(this).b(null, getF85901s0())).f199601a, rd0.e.g(this, bundle, null));
    }

    public final PromptContentDelegate b1() {
        return (PromptContentDelegate) this.f64290t0.getValue();
    }

    public final RecyclerView c1() {
        return (RecyclerView) this.f64289s0.getValue(this, D0[0]);
    }

    public final void d1(ks2.c model) {
        PromptContentDelegate.Model.b bdVar;
        ProgressAnimation progressAnimation;
        PromptContentDelegate.Model.b bVar;
        xc xcVar;
        Intrinsics.checkNotNullParameter(model, "model");
        d state = new d(model);
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(model, "<this>");
        Clause clause = model.f189097b;
        Clause clause2 = model.f189098c;
        Clause clause3 = model.d;
        BluePromptContent bluePromptContent = model.e;
        Intrinsics.checkNotNullParameter(bluePromptContent, "<this>");
        if (Intrinsics.f(bluePromptContent, BluePromptContent.NoContent.f64283a)) {
            bVar = PromptContentDelegate.Model.b.a.f53077a;
        } else {
            if (bluePromptContent instanceof BluePromptContent.MediaContent) {
                bdVar = new ad(((BluePromptContent.MediaContent) bluePromptContent).f64282a, false);
            } else {
                if (!(bluePromptContent instanceof BluePromptContent.ProgressContent)) {
                    throw new NoWhenBranchMatchedException();
                }
                BluePromptContent.ProgressContent progressContent = (BluePromptContent.ProgressContent) bluePromptContent;
                int i = progressContent.f64284a;
                int i2 = R$attr.uikit_colorActionPhotoHeaderText;
                int i3 = R$attr.uikit_colorGreyTone50_20;
                BluePromptProgressAnimation bluePromptProgressAnimation = progressContent.d;
                if (bluePromptProgressAnimation != null) {
                    Intrinsics.checkNotNullParameter(bluePromptProgressAnimation, "<this>");
                    progressAnimation = new ProgressAnimation(bluePromptProgressAnimation.f64287a, true);
                } else {
                    progressAnimation = null;
                }
                bdVar = new bd(new ProgressStyle(i, 100, i2, i2, i3, 8.0f, 8.0f, progressAnimation, 512), progressContent.f64285b, progressContent.f64286c);
            }
            bVar = bdVar;
        }
        ResourceImage resourceImage = model.f;
        ks2.e eVar = model.f189099g;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        int i5 = ks2.b.f189095a[eVar.ordinal()];
        if (i5 == 1) {
            xcVar = xc.VERTICAL;
        } else {
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            xcVar = xc.HORIZONTAL;
        }
        ((z4l.j) this.f64291v0.getValue()).c(u.c(new PromptContentDelegate.Model("PromptDelegateId", clause, clause2, clause3, bVar, resourceImage, null, xcVar, false, model.f189100h, model.i, model.f189101j, model.k, model.f189102l, model.f189103m, null, model.f189104n, null, model.o, null, model.f189105p, model.f189106q, com.revolut.feature.blue_prompt.a.a(model.f189107r), model, null, null, null, null, 520781824)));
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        BluePromptActivity bluePromptActivity;
        BluePromptContract$Configuration bluePromptContract$Configuration = (BluePromptContract$Configuration) G0();
        ns2.a aVarZ0 = Z0(bundle, bluePromptContract$Configuration);
        this.f64288r0 = aVarZ0;
        aVarZ0.n(this);
        ns2.a aVar = this.f64288r0;
        if (aVar == null) {
            Intrinsics.r("component");
            throw null;
        }
        ks2.a state = aVar.getState();
        if (bluePromptContract$Configuration instanceof BluePromptContract$Configuration.Basic) {
            BluePromptContract$Configuration.Basic basic = (BluePromptContract$Configuration.Basic) bluePromptContract$Configuration;
            ks2.d dVar = (ks2.d) state;
            dVar.N0().set(basic.f64295b);
            dVar.B0().set(basic.f64296c);
            dVar.A0().set(basic.d);
            w.s0(dVar.z0(), basic.e);
            w.s0(dVar.y0(), basic.f);
            w.s0(dVar.C0(), basic.f64297g);
            n nVar = dVar.f189112h;
            KProperty[] kPropertyArr = ks2.d.f189108y;
            w.s0(nVar.getValue(dVar, kPropertyArr[6]), basic.f64298h);
            w.s0(dVar.H0(), basic.f64300l);
            w.s0(dVar.L0(), basic.f64301m);
            w.s0(dVar.E0(), basic.o);
            w.s0(dVar.I0(), basic.f64303p);
            w.s0(dVar.D0(), basic.f64304q);
            w.s0(dVar.f189120s.getValue(dVar, kPropertyArr[17]), basic.f64305r);
            dVar.x0().set(basic.i);
            w.s0(dVar.G0(), basic.f64299j);
            w.s0(dVar.K0(), basic.k);
            dVar.M0().set(basic.f64302n);
            w.s0(dVar.u.getValue(dVar, kPropertyArr[19]), basic.f64306s);
            w.s0(dVar.F0(), basic.v);
            w.s0(dVar.J0(), basic.f64308w);
        } else {
            if (!(bluePromptContract$Configuration instanceof BluePromptContract$Configuration.Custom)) {
                throw new NoWhenBranchMatchedException();
            }
            ks2.d dVar2 = (ks2.d) state;
            w.s0(dVar2.u.getValue(dVar2, ks2.d.f189108y[19]), ((BluePromptContract$Configuration.Custom) bluePromptContract$Configuration).f64311b);
        }
        super.onCreate(bundle);
        setContentView(R$layout.activity_blue_prompt);
        c1().setLayoutManager(new LinearLayoutManager(this));
        c1().setAdapter((z4l.j) this.f64291v0.getValue());
        c1().setOverScrollMode(2);
        Integer numA = bluePromptContract$Configuration.getD();
        int iS = kli.a.s(numA != null ? numA.intValue() : E0, this);
        getWindow().setStatusBarColor(iS);
        getWindow().setNavigationBarColor(iS);
        getWindow().setNavigationBarDividerColor(iS);
        c1().setBackgroundColor(iS);
        Integer numA2 = bluePromptContract$Configuration.getD();
        if (numA2 != null) {
            b bVar = this.B0;
            if (bVar == null) {
                Intrinsics.r("bottomDialogDelegate");
                throw null;
            }
            bluePromptActivity = this;
            w.j0(bluePromptActivity.C0, bVar.V().map(new j0(new s(numA2, this, 26), 18)).subscribe(new j0(new h(1, bluePromptActivity, BluePromptActivity.class, "setupNavigationBarColor", "setupNavigationBarColor(I)V", 0, 16), 19), new a0(1, ms2.b.f208622a)));
        } else {
            bluePromptActivity = this;
        }
        b bVar2 = bluePromptActivity.B0;
        if (bVar2 != null) {
            bVar2.W(new ms2.a(this, 1));
        } else {
            Intrinsics.r("bottomDialogDelegate");
            throw null;
        }
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        this.C0.d();
        super.onDestroy();
    }

    @Override // nri.b, in0.g
    public final boolean p0() {
        return ((BluePromptContract$Configuration) G0()).getF();
    }
}
