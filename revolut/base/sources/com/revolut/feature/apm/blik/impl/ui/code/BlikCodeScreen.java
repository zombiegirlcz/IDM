package com.revolut.feature.apm.blik.impl.ui.code;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlaceholderRowDelegate;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerBoxDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ContactsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.blik.api.R$string;
import com.revolut.feature.apm.blik.impl.R$id;
import com.revolut.feature.apm.blik.impl.R$layout;
import com.revolut.feature.apm.blik.impl.ui.code.BlikCodeScreen;
import com.revolut.feature.apm.core.api.product.ApmBlik;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import cu1.l;
import frl.a;
import grl.k9;
import hl6.b;
import ht1.e;
import hu1.c;
import hu1.d;
import hu1.f;
import hu1.g;
import hu1.i;
import hu1.j;
import hu1.k;
import hu1.p;
import hu1.q;
import hu1.r;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mx0.a7;
import mx0.bc;
import no.m;
import te0.w;
import tw0.t0;
import vc.s;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/apm/blik/impl/ui/code/BlikCodeScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lhu1/r;", "Lcom/revolut/feature/apm/blik/impl/ui/code/BlikCodeScreenContract$InputData;", "Lhu1/p;", "Lno/m;", "feature_apm_blik_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BlikCodeScreen extends BaseRecyclerViewScreen<r, BlikCodeScreenContract$InputData, p> implements m {

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f61658n0 = {o0.f186429a.j(new h0(BlikCodeScreen.class, "binding", "getBinding()Lcom/revolut/feature/apm/blik/impl/databinding/ScreenBlikCodeBinding;", 0))};
    public final AnalyticsProduct.Retail U;
    public final int V;
    public final int W;
    public final boolean X;
    public final h Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f61659a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f61660b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f61661d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f61662e0;
    public final Object f0;
    public final Object g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Object f61663h0;
    public final Object i0;
    public final Object j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final Object f61664k0;
    public final Object l0;
    public final Object m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlikCodeScreen(BlikCodeScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = a.i;
        this.U = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        this.V = R$layout.screen_blik_code;
        this.W = R$id.blikCode_recyclerView;
        this.X = true;
        this.Y = s.t(this, c.f);
        final int i = 2;
        this.Z = w.y0(new Function0(this) { // from class: hu1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BlikCodeScreen f155508b;

            {
                this.f155508b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v30, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BlikCodeScreen blikCodeScreen = this.f155508b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BlikCodeScreen.f61658n0;
                        return (q) ((cu1.l) blikCodeScreen.f61659a0.getValue()).i.get();
                    case 1:
                        KProperty[] kPropertyArr2 = BlikCodeScreen.f61658n0;
                        return new SwipeToActionDelegate((RowDelegate) blikCodeScreen.g0.getValue(), false);
                    case 2:
                        KProperty[] kPropertyArr3 = BlikCodeScreen.f61658n0;
                        return (my0.e) ((cu1.l) blikCodeScreen.f61659a0.getValue()).f108762h.get();
                    case 3:
                        KProperty[] kPropertyArr4 = BlikCodeScreen.f61658n0;
                        return new ScrollerBoxDelegate(zhm.u.c((ReferralContactDelegate) blikCodeScreen.j0.getValue()));
                    default:
                        KProperty[] kPropertyArr5 = BlikCodeScreen.f61658n0;
                        aim.e eVarB = zhm.u.b();
                        eVarB.addAll((List) ((my0.e) blikCodeScreen.Z.getValue()).f210285a.e.getValue());
                        eVarB.add((FullScreenStateDelegate) blikCodeScreen.c0.getValue());
                        eVarB.add((ActionWidgetDelegate) blikCodeScreen.f61661d0.getValue());
                        eVarB.add((ContactsWidgetDelegate) blikCodeScreen.f61662e0.getValue());
                        eVarB.add((RowsWidgetDelegate) blikCodeScreen.f0.getValue());
                        eVarB.add((ScrollerBoxDelegate) blikCodeScreen.f61664k0.getValue());
                        eVarB.add((RowDelegate) blikCodeScreen.g0.getValue());
                        eVarB.add((SwipeToActionDelegate) blikCodeScreen.f61663h0.getValue());
                        eVarB.add((LargeActionButtonDelegate) blikCodeScreen.i0.getValue());
                        eVarB.add((ListSubheaderDelegate) blikCodeScreen.l0.getValue());
                        eVarB.add(new PlaceholderRowDelegate());
                        return zhm.u.a(eVarB);
                }
            }
        });
        this.f61659a0 = w.y0(new b(this, inputData, 17));
        final int i2 = 0;
        this.f61660b0 = w.y0(new Function0(this) { // from class: hu1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BlikCodeScreen f155508b;

            {
                this.f155508b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v30, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BlikCodeScreen blikCodeScreen = this.f155508b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BlikCodeScreen.f61658n0;
                        return (q) ((cu1.l) blikCodeScreen.f61659a0.getValue()).i.get();
                    case 1:
                        KProperty[] kPropertyArr2 = BlikCodeScreen.f61658n0;
                        return new SwipeToActionDelegate((RowDelegate) blikCodeScreen.g0.getValue(), false);
                    case 2:
                        KProperty[] kPropertyArr3 = BlikCodeScreen.f61658n0;
                        return (my0.e) ((cu1.l) blikCodeScreen.f61659a0.getValue()).f108762h.get();
                    case 3:
                        KProperty[] kPropertyArr4 = BlikCodeScreen.f61658n0;
                        return new ScrollerBoxDelegate(zhm.u.c((ReferralContactDelegate) blikCodeScreen.j0.getValue()));
                    default:
                        KProperty[] kPropertyArr5 = BlikCodeScreen.f61658n0;
                        aim.e eVarB = zhm.u.b();
                        eVarB.addAll((List) ((my0.e) blikCodeScreen.Z.getValue()).f210285a.e.getValue());
                        eVarB.add((FullScreenStateDelegate) blikCodeScreen.c0.getValue());
                        eVarB.add((ActionWidgetDelegate) blikCodeScreen.f61661d0.getValue());
                        eVarB.add((ContactsWidgetDelegate) blikCodeScreen.f61662e0.getValue());
                        eVarB.add((RowsWidgetDelegate) blikCodeScreen.f0.getValue());
                        eVarB.add((ScrollerBoxDelegate) blikCodeScreen.f61664k0.getValue());
                        eVarB.add((RowDelegate) blikCodeScreen.g0.getValue());
                        eVarB.add((SwipeToActionDelegate) blikCodeScreen.f61663h0.getValue());
                        eVarB.add((LargeActionButtonDelegate) blikCodeScreen.i0.getValue());
                        eVarB.add((ListSubheaderDelegate) blikCodeScreen.l0.getValue());
                        eVarB.add(new PlaceholderRowDelegate());
                        return zhm.u.a(eVarB);
                }
            }
        });
        this.c0 = w.y0(new e(10));
        this.f61661d0 = w.y0(new e(11));
        this.f61662e0 = w.y0(new e(12));
        this.f0 = w.y0(new e(13));
        this.g0 = w.y0(new e(14));
        final int i3 = 1;
        this.f61663h0 = w.y0(new Function0(this) { // from class: hu1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BlikCodeScreen f155508b;

            {
                this.f155508b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v30, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BlikCodeScreen blikCodeScreen = this.f155508b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BlikCodeScreen.f61658n0;
                        return (q) ((cu1.l) blikCodeScreen.f61659a0.getValue()).i.get();
                    case 1:
                        KProperty[] kPropertyArr2 = BlikCodeScreen.f61658n0;
                        return new SwipeToActionDelegate((RowDelegate) blikCodeScreen.g0.getValue(), false);
                    case 2:
                        KProperty[] kPropertyArr3 = BlikCodeScreen.f61658n0;
                        return (my0.e) ((cu1.l) blikCodeScreen.f61659a0.getValue()).f108762h.get();
                    case 3:
                        KProperty[] kPropertyArr4 = BlikCodeScreen.f61658n0;
                        return new ScrollerBoxDelegate(zhm.u.c((ReferralContactDelegate) blikCodeScreen.j0.getValue()));
                    default:
                        KProperty[] kPropertyArr5 = BlikCodeScreen.f61658n0;
                        aim.e eVarB = zhm.u.b();
                        eVarB.addAll((List) ((my0.e) blikCodeScreen.Z.getValue()).f210285a.e.getValue());
                        eVarB.add((FullScreenStateDelegate) blikCodeScreen.c0.getValue());
                        eVarB.add((ActionWidgetDelegate) blikCodeScreen.f61661d0.getValue());
                        eVarB.add((ContactsWidgetDelegate) blikCodeScreen.f61662e0.getValue());
                        eVarB.add((RowsWidgetDelegate) blikCodeScreen.f0.getValue());
                        eVarB.add((ScrollerBoxDelegate) blikCodeScreen.f61664k0.getValue());
                        eVarB.add((RowDelegate) blikCodeScreen.g0.getValue());
                        eVarB.add((SwipeToActionDelegate) blikCodeScreen.f61663h0.getValue());
                        eVarB.add((LargeActionButtonDelegate) blikCodeScreen.i0.getValue());
                        eVarB.add((ListSubheaderDelegate) blikCodeScreen.l0.getValue());
                        eVarB.add(new PlaceholderRowDelegate());
                        return zhm.u.a(eVarB);
                }
            }
        });
        this.i0 = w.y0(new e(15));
        this.j0 = w.y0(new e(16));
        final int i5 = 3;
        this.f61664k0 = w.y0(new Function0(this) { // from class: hu1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BlikCodeScreen f155508b;

            {
                this.f155508b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v30, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                BlikCodeScreen blikCodeScreen = this.f155508b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BlikCodeScreen.f61658n0;
                        return (q) ((cu1.l) blikCodeScreen.f61659a0.getValue()).i.get();
                    case 1:
                        KProperty[] kPropertyArr2 = BlikCodeScreen.f61658n0;
                        return new SwipeToActionDelegate((RowDelegate) blikCodeScreen.g0.getValue(), false);
                    case 2:
                        KProperty[] kPropertyArr3 = BlikCodeScreen.f61658n0;
                        return (my0.e) ((cu1.l) blikCodeScreen.f61659a0.getValue()).f108762h.get();
                    case 3:
                        KProperty[] kPropertyArr4 = BlikCodeScreen.f61658n0;
                        return new ScrollerBoxDelegate(zhm.u.c((ReferralContactDelegate) blikCodeScreen.j0.getValue()));
                    default:
                        KProperty[] kPropertyArr5 = BlikCodeScreen.f61658n0;
                        aim.e eVarB = zhm.u.b();
                        eVarB.addAll((List) ((my0.e) blikCodeScreen.Z.getValue()).f210285a.e.getValue());
                        eVarB.add((FullScreenStateDelegate) blikCodeScreen.c0.getValue());
                        eVarB.add((ActionWidgetDelegate) blikCodeScreen.f61661d0.getValue());
                        eVarB.add((ContactsWidgetDelegate) blikCodeScreen.f61662e0.getValue());
                        eVarB.add((RowsWidgetDelegate) blikCodeScreen.f0.getValue());
                        eVarB.add((ScrollerBoxDelegate) blikCodeScreen.f61664k0.getValue());
                        eVarB.add((RowDelegate) blikCodeScreen.g0.getValue());
                        eVarB.add((SwipeToActionDelegate) blikCodeScreen.f61663h0.getValue());
                        eVarB.add((LargeActionButtonDelegate) blikCodeScreen.i0.getValue());
                        eVarB.add((ListSubheaderDelegate) blikCodeScreen.l0.getValue());
                        eVarB.add(new PlaceholderRowDelegate());
                        return zhm.u.a(eVarB);
                }
            }
        });
        this.l0 = w.y0(new e(17));
        final int i6 = 4;
        this.m0 = w.y0(new Function0(this) { // from class: hu1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BlikCodeScreen f155508b;

            {
                this.f155508b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v30, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                BlikCodeScreen blikCodeScreen = this.f155508b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BlikCodeScreen.f61658n0;
                        return (q) ((cu1.l) blikCodeScreen.f61659a0.getValue()).i.get();
                    case 1:
                        KProperty[] kPropertyArr2 = BlikCodeScreen.f61658n0;
                        return new SwipeToActionDelegate((RowDelegate) blikCodeScreen.g0.getValue(), false);
                    case 2:
                        KProperty[] kPropertyArr3 = BlikCodeScreen.f61658n0;
                        return (my0.e) ((cu1.l) blikCodeScreen.f61659a0.getValue()).f108762h.get();
                    case 3:
                        KProperty[] kPropertyArr4 = BlikCodeScreen.f61658n0;
                        return new ScrollerBoxDelegate(zhm.u.c((ReferralContactDelegate) blikCodeScreen.j0.getValue()));
                    default:
                        KProperty[] kPropertyArr5 = BlikCodeScreen.f61658n0;
                        aim.e eVarB = zhm.u.b();
                        eVarB.addAll((List) ((my0.e) blikCodeScreen.Z.getValue()).f210285a.e.getValue());
                        eVarB.add((FullScreenStateDelegate) blikCodeScreen.c0.getValue());
                        eVarB.add((ActionWidgetDelegate) blikCodeScreen.f61661d0.getValue());
                        eVarB.add((ContactsWidgetDelegate) blikCodeScreen.f61662e0.getValue());
                        eVarB.add((RowsWidgetDelegate) blikCodeScreen.f0.getValue());
                        eVarB.add((ScrollerBoxDelegate) blikCodeScreen.f61664k0.getValue());
                        eVarB.add((RowDelegate) blikCodeScreen.g0.getValue());
                        eVarB.add((SwipeToActionDelegate) blikCodeScreen.f61663h0.getValue());
                        eVarB.add((LargeActionButtonDelegate) blikCodeScreen.i0.getValue());
                        eVarB.add((ListSubheaderDelegate) blikCodeScreen.l0.getValue());
                        eVarB.add(new PlaceholderRowDelegate());
                        return zhm.u.a(eVarB);
                }
            }
        });
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getK() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (l) this.f61659a0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v21, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v28, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v33, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v38, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v43, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v49, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v54, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(g3().f9461b.f59410q), null, new hu1.h(this, continuation, 0), 3);
        ?? r72 = this.Z;
        my0.b bVar = ((my0.e) r72.getValue()).f210285a;
        efm.r map = ((ActionsDelegate) bVar.f210279b.getValue()).f51611c.f121375b.map(new bc(new a7(bVar, 11), 14));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(map), null, new g(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((HeaderDelegate) ((my0.e) r72.getValue()).f210285a.f210278a.getValue()).f52393g.f121375b), null, new i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((HeaderDelegate) ((my0.e) r72.getValue()).f210285a.f210278a.getValue()).f52394h.f121375b), null, new j(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.c0.getValue()).f52371h.f121375b), null, new k(this, null), 3);
        efm.r rVarFilter = ((ActionWidgetDelegate) this.f61661d0.getValue()).f51589c.f121375b.filter(new hp5.b(new hqk.a(20), 25));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarFilter), null, new hu1.h(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((ContactsWidgetDelegate) this.f61662e0.getValue()).f), null, new hu1.l(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowsWidgetDelegate) this.f0.getValue()).f), null, new hu1.m(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.g0.getValue()).f53218h), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((LargeActionButtonDelegate) this.i0.getValue()).d.f121375b), null, new hu1.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((ListSubheaderDelegate) this.l0.getValue()).f52707c), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(((ReferralContactDelegate) this.j0.getValue()).q(), new hqk.a(21))), null, new g(this, continuation, 0), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ScreenContentRecyclerView screenContentRecyclerView = g3().f9462c;
        RecyclerView.Adapter adapter = screenContentRecyclerView.getAdapter();
        Intrinsics.i(adapter, "null cannot be cast to non-null type com.revolut.recyclerkit.delegates.DiffAdapter");
        screenContentRecyclerView.addItemDecoration(new t0((koi.h) adapter, false));
        NavBarWithToolbar navBarWithToolbar = g3().f9461b;
        navBarWithToolbar.setAlwaysExpanded(true);
        navBarWithToolbar.setEndIconImage(ApmBlik.f61809c.j());
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.blik_home_section_code_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.blik_home_section_code_title, null, null, 14), null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF94258b0() {
        return (List) this.m0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getX() {
        return this.W;
    }

    public final au1.a g3() {
        ViewBinding value = this.Y.getValue(this, f61658n0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (au1.a) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.V;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: h3, reason: merged with bridge method [inline-methods] */
    public final q T2() {
        return (q) this.f61660b0.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.X);
    }
}
