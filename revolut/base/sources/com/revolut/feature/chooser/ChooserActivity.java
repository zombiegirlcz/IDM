package com.revolut.feature.chooser;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.feature.chooser.ChooserActivity;
import com.revolut.feature.chooser.ChooserConfiguration;
import com.revolut.feature.chooser.ChooserScreenContract$Configuration;
import com.revolut.retail.common.ui.R$style;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import fsi.h;
import grl.k9;
import hqi.i;
import hqi.k;
import ihm.f;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import le.u1;
import org.jetbrains.annotations.NotNull;
import qi3.s;
import te0.r;
import te0.w;
import yhm.j;
import yp0.y;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001\nB\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/revolut/feature/chooser/ChooserActivity;", "Lcom/revolut/retail/core/ui/activity/BaseDelegatesActivity;", "Lqi3/q;", "Lqi3/s;", "Ldri/a;", "Lfsi/h;", "Lin0/g;", "<init>", "()V", "Companion", "a", "feature_chooser_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChooserActivity extends BaseDelegatesActivity implements s, dri.a, h {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final /* synthetic */ KProperty[] E0;
    public final Lazy D0;
    public final Object u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final Lazy f65887v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public d f65888w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public opi.b f65889x0;
    public ui3.b y0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final j90.a f65884r0 = u1.w(this, R$id.recyclerView);

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final j90.a f65885s0 = u1.w(this, R$id.empty);

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final f f65886t0 = v0.a.d("create(...)");
    public final Object z0 = w.y0(new qh0.d(14));
    public final Object A0 = w.y0(new qh0.d(15));
    public final Object B0 = w.y0(new qh0.d(16));
    public final Object C0 = w.y0(new qh0.d(17));

    /* JADX INFO: renamed from: com.revolut.feature.chooser.ChooserActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    static {
        h0 h0Var = new h0(ChooserActivity.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0);
        p0 p0Var = o0.f186429a;
        E0 = new KProperty[]{p0Var.j(h0Var), p.a.y(ChooserActivity.class, "empty", "getEmpty()Lcom/revolut/core_ui_custom_font/TypefaceTextView;", 0, p0Var)};
        INSTANCE = new Companion();
    }

    public ChooserActivity() {
        final int i = 0;
        this.u0 = w.y0(new Function0(this) { // from class: qi3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChooserActivity f246629b;

            {
                this.f246629b = this;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AnalyticsProduct analyticsProduct;
                String str;
                int i2 = i;
                ChooserActivity chooserActivity = this.f246629b;
                switch (i2) {
                    case 0:
                        ChooserActivity.Companion companion = ChooserActivity.INSTANCE;
                        ChooserScreenContract$Configuration chooserScreenContract$Configuration = (ChooserScreenContract$Configuration) chooserActivity.I0();
                        if (chooserScreenContract$Configuration != null && (analyticsProduct = ((ChooserConfiguration) chooserScreenContract$Configuration).f65897m) != null) {
                            return analyticsProduct;
                        }
                        AnalyticsProduct.Companion companion2 = AnalyticsProduct.INSTANCE;
                        k9 k9Var = frl.a.o;
                        return com.google.android.gms.internal.mlkit_vision_face.a.g(companion2, k9Var, k9Var);
                    case 1:
                        ChooserActivity.Companion companion3 = ChooserActivity.INSTANCE;
                        ChooserScreenContract$Configuration chooserScreenContract$Configuration2 = (ChooserScreenContract$Configuration) chooserActivity.I0();
                        return (chooserScreenContract$Configuration2 == null || (str = ((ChooserConfiguration) chooserScreenContract$Configuration2).f65892c) == null) ? "LEGACY_CHOOSER_FLOW" : str;
                    default:
                        ChooserActivity.Companion companion4 = ChooserActivity.INSTANCE;
                        return new z4l.j(4, v.k(new ListSubheaderDelegate(), (RowDelegate) chooserActivity.z0.getValue(), (AccountCellItemDelegate) chooserActivity.A0.getValue(), new TextDelegate()), false);
                }
            }
        });
        final int i2 = 1;
        this.f65887v0 = j.b(new Function0(this) { // from class: qi3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChooserActivity f246629b;

            {
                this.f246629b = this;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AnalyticsProduct analyticsProduct;
                String str;
                int i22 = i2;
                ChooserActivity chooserActivity = this.f246629b;
                switch (i22) {
                    case 0:
                        ChooserActivity.Companion companion = ChooserActivity.INSTANCE;
                        ChooserScreenContract$Configuration chooserScreenContract$Configuration = (ChooserScreenContract$Configuration) chooserActivity.I0();
                        if (chooserScreenContract$Configuration != null && (analyticsProduct = ((ChooserConfiguration) chooserScreenContract$Configuration).f65897m) != null) {
                            return analyticsProduct;
                        }
                        AnalyticsProduct.Companion companion2 = AnalyticsProduct.INSTANCE;
                        k9 k9Var = frl.a.o;
                        return com.google.android.gms.internal.mlkit_vision_face.a.g(companion2, k9Var, k9Var);
                    case 1:
                        ChooserActivity.Companion companion3 = ChooserActivity.INSTANCE;
                        ChooserScreenContract$Configuration chooserScreenContract$Configuration2 = (ChooserScreenContract$Configuration) chooserActivity.I0();
                        return (chooserScreenContract$Configuration2 == null || (str = ((ChooserConfiguration) chooserScreenContract$Configuration2).f65892c) == null) ? "LEGACY_CHOOSER_FLOW" : str;
                    default:
                        ChooserActivity.Companion companion4 = ChooserActivity.INSTANCE;
                        return new z4l.j(4, v.k(new ListSubheaderDelegate(), (RowDelegate) chooserActivity.z0.getValue(), (AccountCellItemDelegate) chooserActivity.A0.getValue(), new TextDelegate()), false);
                }
            }
        });
        final int i3 = 2;
        this.D0 = j.b(new Function0(this) { // from class: qi3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChooserActivity f246629b;

            {
                this.f246629b = this;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AnalyticsProduct analyticsProduct;
                String str;
                int i22 = i3;
                ChooserActivity chooserActivity = this.f246629b;
                switch (i22) {
                    case 0:
                        ChooserActivity.Companion companion = ChooserActivity.INSTANCE;
                        ChooserScreenContract$Configuration chooserScreenContract$Configuration = (ChooserScreenContract$Configuration) chooserActivity.I0();
                        if (chooserScreenContract$Configuration != null && (analyticsProduct = ((ChooserConfiguration) chooserScreenContract$Configuration).f65897m) != null) {
                            return analyticsProduct;
                        }
                        AnalyticsProduct.Companion companion2 = AnalyticsProduct.INSTANCE;
                        k9 k9Var = frl.a.o;
                        return com.google.android.gms.internal.mlkit_vision_face.a.g(companion2, k9Var, k9Var);
                    case 1:
                        ChooserActivity.Companion companion3 = ChooserActivity.INSTANCE;
                        ChooserScreenContract$Configuration chooserScreenContract$Configuration2 = (ChooserScreenContract$Configuration) chooserActivity.I0();
                        return (chooserScreenContract$Configuration2 == null || (str = ((ChooserConfiguration) chooserScreenContract$Configuration2).f65892c) == null) ? "LEGACY_CHOOSER_FLOW" : str;
                    default:
                        ChooserActivity.Companion companion4 = ChooserActivity.INSTANCE;
                        return new z4l.j(4, v.k(new ListSubheaderDelegate(), (RowDelegate) chooserActivity.z0.getValue(), (AccountCellItemDelegate) chooserActivity.A0.getValue(), new TextDelegate()), false);
                }
            }
        });
    }

    @Override // dri.a
    public final boolean D0() {
        return ((ChooserConfiguration) ((ChooserScreenContract$Configuration) G0())).d;
    }

    @Override // nri.b
    public final pri.e F0() {
        ui3.b bVar = this.y0;
        if (bVar != null) {
            return bVar.b();
        }
        Intrinsics.r("component");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0 */
    public final String getF71630s0() {
        return (String) this.f65887v0.getValue();
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        ui3.b bVar = this.y0;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.r("component");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // nri.b, no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getQ() {
        return (AnalyticsProduct) this.u0.getValue();
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, androidx.view.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        this.f65886t0.onNext(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ChooserScreenContract$Configuration chooserScreenContract$Configuration = (ChooserScreenContract$Configuration) G0();
        b05.a aVar = (b05.a) ((ui3.a) com.bumptech.glide.c.l(this).b(null, getF71630s0())).G().h(rd0.e.g(this, bundle, null));
        ypi.h.Companion.getClass();
        ChooserConfiguration chooserConfiguration = (ChooserConfiguration) chooserScreenContract$Configuration;
        b05.a aVar2 = (b05.a) ((b05.a) aVar.b(ypi.h.d)).g(new i(Integer.valueOf(com.revolut.retail.common.ui.R$id.toolbar), new k.b(chooserConfiguration.i)));
        switch (aVar2.f11553a) {
            case 0:
                aVar2.e = chooserScreenContract$Configuration;
                break;
            case 1:
                aVar2.e = chooserScreenContract$Configuration;
                break;
            case 2:
                aVar2.e = chooserScreenContract$Configuration;
                break;
            case 3:
                aVar2.e = chooserScreenContract$Configuration;
                break;
            case 4:
                aVar2.e = chooserScreenContract$Configuration;
                break;
            case 5:
                aVar2.e = chooserScreenContract$Configuration;
                break;
            case 6:
                aVar2.e = chooserScreenContract$Configuration;
                break;
            case 7:
                aVar2.e = chooserScreenContract$Configuration;
                break;
            case 8:
                aVar2.e = chooserScreenContract$Configuration;
                break;
            case 9:
                aVar2.e = chooserScreenContract$Configuration;
                break;
            case 10:
                aVar2.e = chooserScreenContract$Configuration;
                break;
            case 11:
                aVar2.e = chooserScreenContract$Configuration;
                break;
            default:
                aVar2.e = chooserScreenContract$Configuration;
                break;
        }
        ui3.b bVar = (ui3.b) aVar2.build();
        this.y0 = bVar;
        if (bVar == null) {
            Intrinsics.r("component");
            throw null;
        }
        bVar.H(this);
        d dVar = this.f65888w0;
        if (dVar == null) {
            Intrinsics.r("state");
            throw null;
        }
        dVar.f0().set(chooserConfiguration.f65891b);
        d dVar2 = this.f65888w0;
        if (dVar2 == null) {
            Intrinsics.r("state");
            throw null;
        }
        dVar2.a0().set(chooserConfiguration.f65890a);
        d dVar3 = this.f65888w0;
        if (dVar3 == null) {
            Intrinsics.r("state");
            throw null;
        }
        ((r) dVar3.j()).set("");
        if (chooserConfiguration.k) {
            setTheme(R$style.AppTheme_Grey);
        }
        super.onCreate(bundle);
        setContentView(R$layout.activity_chooser);
        RecyclerView recyclerView = (RecyclerView) this.f65884r0.getValue(this, E0[0]);
        y.h(recyclerView, (z4l.j) this.D0.getValue(), new LinearLayoutManager(recyclerView.getContext()));
        opi.b bVar2 = this.f65889x0;
        if (bVar2 != null) {
            bVar2.Y("bottom_dialog_delegates_key", v.k((TwinHorizontalButtonDelegate) this.C0.getValue(), (LargeActionButtonDelegate) this.B0.getValue()));
        } else {
            Intrinsics.r("expandableDialogActivityDelegate");
            throw null;
        }
    }

    @Override // nri.b, in0.g
    public final boolean p0() {
        return ((ChooserConfiguration) ((ChooserScreenContract$Configuration) G0())).f65898n;
    }
}
