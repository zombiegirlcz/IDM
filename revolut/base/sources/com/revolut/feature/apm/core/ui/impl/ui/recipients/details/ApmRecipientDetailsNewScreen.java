package com.revolut.feature.apm.core.ui.impl.ui.recipients.details;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import cli.o;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RectangularButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import com.revolut.core.ui_kit.views.navbar.l;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.apm.core.ui.impl.ui.recipients.details.ApmRecipientDetailsContract$InputData;
import com.revolut.feature.apm.core.ui.impl.ui.recipients.details.ApmRecipientDetailsNewScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import jii.y;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jmrtd.lds.LDSFile;
import p12.c0;
import te0.w;
import tx0.q1;
import vc.s;
import xki.e;
import yy6.f;
import z32.b;
import z32.c;
import z32.j;
import z32.k;
import z32.m;
import z32.n;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/ui/impl/ui/recipients/details/ApmRecipientDetailsNewScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lz32/b;", "feature_apm_core_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ApmRecipientDetailsNewScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(ApmRecipientDetailsNewScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarlargecentredBinding;", 0))};
    public final ApmRecipientDetailsContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;
    public final Object W;

    public ApmRecipientDetailsNewScreen(ApmRecipientDetailsContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbarlargecentred;
        this.M = s.t(this, j.f);
        this.N = w.y0(new z1i.a(3));
        final int i = 1;
        this.O = w.y0(new Function0(this) { // from class: z32.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ApmRecipientDetailsNewScreen f319135b;

            {
                this.f319135b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ApmRecipientDetailsNewScreen apmRecipientDetailsNewScreen = this.f319135b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ApmRecipientDetailsNewScreen.X;
                        phm.a aVar = (phm.a) ue0.e.j(apmRecipientDetailsNewScreen.m2()).a().get(p12.v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p12.v.class, " is not found"));
                        }
                        p12.v vVar = ((p12.v) aVar2.b()).K;
                        ApmRecipientDetailsContract$InputData apmRecipientDetailsContract$InputData = apmRecipientDetailsNewScreen.K;
                        apmRecipientDetailsContract$InputData.getClass();
                        return new c0(vVar, apmRecipientDetailsContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ApmRecipientDetailsNewScreen.X;
                        return new GridBoxDelegate(zhm.u.c((RectangularButtonDelegate) apmRecipientDetailsNewScreen.N.getValue()), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
                    case 2:
                        KProperty[] kPropertyArr3 = ApmRecipientDetailsNewScreen.X;
                        return new SwipeToActionDelegate((RowDelegate) apmRecipientDetailsNewScreen.P.getValue(), false);
                    case 3:
                        KProperty[] kPropertyArr4 = ApmRecipientDetailsNewScreen.X;
                        return (c) ((c0) apmRecipientDetailsNewScreen.W.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr5 = ApmRecipientDetailsNewScreen.X;
                        ApmRecipientDetailsNewScreen apmRecipientDetailsNewScreen2 = this.f319135b;
                        return dli.f.a(apmRecipientDetailsNewScreen2, apmRecipientDetailsNewScreen2.d(), zhm.v.k((GridBoxDelegate) apmRecipientDetailsNewScreen2.O.getValue(), (RowDelegate) apmRecipientDetailsNewScreen2.P.getValue(), (SwipeToActionDelegate) apmRecipientDetailsNewScreen2.Q.getValue(), (CellDetailsDelegate) apmRecipientDetailsNewScreen2.R.getValue(), (CellDetailsChevronDelegate) apmRecipientDetailsNewScreen2.S.getValue(), (LargeActionButtonDelegate) apmRecipientDetailsNewScreen2.T.getValue(), new TextDelegate(), new ListSubheaderDelegate(), new FullScreenStateDelegate(), new RowLoadingDelegate()), R$id.screenRecyclerNavBarLargeCentred_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = w.y0(new z1i.a(4));
        final int i2 = 2;
        this.Q = w.y0(new Function0(this) { // from class: z32.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ApmRecipientDetailsNewScreen f319135b;

            {
                this.f319135b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ApmRecipientDetailsNewScreen apmRecipientDetailsNewScreen = this.f319135b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ApmRecipientDetailsNewScreen.X;
                        phm.a aVar = (phm.a) ue0.e.j(apmRecipientDetailsNewScreen.m2()).a().get(p12.v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p12.v.class, " is not found"));
                        }
                        p12.v vVar = ((p12.v) aVar2.b()).K;
                        ApmRecipientDetailsContract$InputData apmRecipientDetailsContract$InputData = apmRecipientDetailsNewScreen.K;
                        apmRecipientDetailsContract$InputData.getClass();
                        return new c0(vVar, apmRecipientDetailsContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ApmRecipientDetailsNewScreen.X;
                        return new GridBoxDelegate(zhm.u.c((RectangularButtonDelegate) apmRecipientDetailsNewScreen.N.getValue()), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
                    case 2:
                        KProperty[] kPropertyArr3 = ApmRecipientDetailsNewScreen.X;
                        return new SwipeToActionDelegate((RowDelegate) apmRecipientDetailsNewScreen.P.getValue(), false);
                    case 3:
                        KProperty[] kPropertyArr4 = ApmRecipientDetailsNewScreen.X;
                        return (c) ((c0) apmRecipientDetailsNewScreen.W.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr5 = ApmRecipientDetailsNewScreen.X;
                        ApmRecipientDetailsNewScreen apmRecipientDetailsNewScreen2 = this.f319135b;
                        return dli.f.a(apmRecipientDetailsNewScreen2, apmRecipientDetailsNewScreen2.d(), zhm.v.k((GridBoxDelegate) apmRecipientDetailsNewScreen2.O.getValue(), (RowDelegate) apmRecipientDetailsNewScreen2.P.getValue(), (SwipeToActionDelegate) apmRecipientDetailsNewScreen2.Q.getValue(), (CellDetailsDelegate) apmRecipientDetailsNewScreen2.R.getValue(), (CellDetailsChevronDelegate) apmRecipientDetailsNewScreen2.S.getValue(), (LargeActionButtonDelegate) apmRecipientDetailsNewScreen2.T.getValue(), new TextDelegate(), new ListSubheaderDelegate(), new FullScreenStateDelegate(), new RowLoadingDelegate()), R$id.screenRecyclerNavBarLargeCentred_recyclerView, null, null, null, 56);
                }
            }
        });
        this.R = w.y0(new z1i.a(5));
        this.S = w.y0(new z1i.a(6));
        this.T = w.y0(new z1i.a(7));
        final int i3 = 3;
        this.U = w.y0(new Function0(this) { // from class: z32.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ApmRecipientDetailsNewScreen f319135b;

            {
                this.f319135b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ApmRecipientDetailsNewScreen apmRecipientDetailsNewScreen = this.f319135b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ApmRecipientDetailsNewScreen.X;
                        phm.a aVar = (phm.a) ue0.e.j(apmRecipientDetailsNewScreen.m2()).a().get(p12.v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p12.v.class, " is not found"));
                        }
                        p12.v vVar = ((p12.v) aVar2.b()).K;
                        ApmRecipientDetailsContract$InputData apmRecipientDetailsContract$InputData = apmRecipientDetailsNewScreen.K;
                        apmRecipientDetailsContract$InputData.getClass();
                        return new c0(vVar, apmRecipientDetailsContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ApmRecipientDetailsNewScreen.X;
                        return new GridBoxDelegate(zhm.u.c((RectangularButtonDelegate) apmRecipientDetailsNewScreen.N.getValue()), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
                    case 2:
                        KProperty[] kPropertyArr3 = ApmRecipientDetailsNewScreen.X;
                        return new SwipeToActionDelegate((RowDelegate) apmRecipientDetailsNewScreen.P.getValue(), false);
                    case 3:
                        KProperty[] kPropertyArr4 = ApmRecipientDetailsNewScreen.X;
                        return (c) ((c0) apmRecipientDetailsNewScreen.W.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr5 = ApmRecipientDetailsNewScreen.X;
                        ApmRecipientDetailsNewScreen apmRecipientDetailsNewScreen2 = this.f319135b;
                        return dli.f.a(apmRecipientDetailsNewScreen2, apmRecipientDetailsNewScreen2.d(), zhm.v.k((GridBoxDelegate) apmRecipientDetailsNewScreen2.O.getValue(), (RowDelegate) apmRecipientDetailsNewScreen2.P.getValue(), (SwipeToActionDelegate) apmRecipientDetailsNewScreen2.Q.getValue(), (CellDetailsDelegate) apmRecipientDetailsNewScreen2.R.getValue(), (CellDetailsChevronDelegate) apmRecipientDetailsNewScreen2.S.getValue(), (LargeActionButtonDelegate) apmRecipientDetailsNewScreen2.T.getValue(), new TextDelegate(), new ListSubheaderDelegate(), new FullScreenStateDelegate(), new RowLoadingDelegate()), R$id.screenRecyclerNavBarLargeCentred_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i5 = 4;
        this.V = w.y0(new Function0(this) { // from class: z32.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ApmRecipientDetailsNewScreen f319135b;

            {
                this.f319135b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                ApmRecipientDetailsNewScreen apmRecipientDetailsNewScreen = this.f319135b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ApmRecipientDetailsNewScreen.X;
                        phm.a aVar = (phm.a) ue0.e.j(apmRecipientDetailsNewScreen.m2()).a().get(p12.v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p12.v.class, " is not found"));
                        }
                        p12.v vVar = ((p12.v) aVar2.b()).K;
                        ApmRecipientDetailsContract$InputData apmRecipientDetailsContract$InputData = apmRecipientDetailsNewScreen.K;
                        apmRecipientDetailsContract$InputData.getClass();
                        return new c0(vVar, apmRecipientDetailsContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ApmRecipientDetailsNewScreen.X;
                        return new GridBoxDelegate(zhm.u.c((RectangularButtonDelegate) apmRecipientDetailsNewScreen.N.getValue()), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
                    case 2:
                        KProperty[] kPropertyArr3 = ApmRecipientDetailsNewScreen.X;
                        return new SwipeToActionDelegate((RowDelegate) apmRecipientDetailsNewScreen.P.getValue(), false);
                    case 3:
                        KProperty[] kPropertyArr4 = ApmRecipientDetailsNewScreen.X;
                        return (c) ((c0) apmRecipientDetailsNewScreen.W.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr5 = ApmRecipientDetailsNewScreen.X;
                        ApmRecipientDetailsNewScreen apmRecipientDetailsNewScreen2 = this.f319135b;
                        return dli.f.a(apmRecipientDetailsNewScreen2, apmRecipientDetailsNewScreen2.d(), zhm.v.k((GridBoxDelegate) apmRecipientDetailsNewScreen2.O.getValue(), (RowDelegate) apmRecipientDetailsNewScreen2.P.getValue(), (SwipeToActionDelegate) apmRecipientDetailsNewScreen2.Q.getValue(), (CellDetailsDelegate) apmRecipientDetailsNewScreen2.R.getValue(), (CellDetailsChevronDelegate) apmRecipientDetailsNewScreen2.S.getValue(), (LargeActionButtonDelegate) apmRecipientDetailsNewScreen2.T.getValue(), new TextDelegate(), new ListSubheaderDelegate(), new FullScreenStateDelegate(), new RowLoadingDelegate()), R$id.screenRecyclerNavBarLargeCentred_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i6 = 0;
        this.W = w.y0(new Function0(this) { // from class: z32.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ApmRecipientDetailsNewScreen f319135b;

            {
                this.f319135b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                ApmRecipientDetailsNewScreen apmRecipientDetailsNewScreen = this.f319135b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ApmRecipientDetailsNewScreen.X;
                        phm.a aVar = (phm.a) ue0.e.j(apmRecipientDetailsNewScreen.m2()).a().get(p12.v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p12.v.class, " is not found"));
                        }
                        p12.v vVar = ((p12.v) aVar2.b()).K;
                        ApmRecipientDetailsContract$InputData apmRecipientDetailsContract$InputData = apmRecipientDetailsNewScreen.K;
                        apmRecipientDetailsContract$InputData.getClass();
                        return new c0(vVar, apmRecipientDetailsContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ApmRecipientDetailsNewScreen.X;
                        return new GridBoxDelegate(zhm.u.c((RectangularButtonDelegate) apmRecipientDetailsNewScreen.N.getValue()), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
                    case 2:
                        KProperty[] kPropertyArr3 = ApmRecipientDetailsNewScreen.X;
                        return new SwipeToActionDelegate((RowDelegate) apmRecipientDetailsNewScreen.P.getValue(), false);
                    case 3:
                        KProperty[] kPropertyArr4 = ApmRecipientDetailsNewScreen.X;
                        return (c) ((c0) apmRecipientDetailsNewScreen.W.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr5 = ApmRecipientDetailsNewScreen.X;
                        ApmRecipientDetailsNewScreen apmRecipientDetailsNewScreen2 = this.f319135b;
                        return dli.f.a(apmRecipientDetailsNewScreen2, apmRecipientDetailsNewScreen2.d(), zhm.v.k((GridBoxDelegate) apmRecipientDetailsNewScreen2.O.getValue(), (RowDelegate) apmRecipientDetailsNewScreen2.P.getValue(), (SwipeToActionDelegate) apmRecipientDetailsNewScreen2.Q.getValue(), (CellDetailsDelegate) apmRecipientDetailsNewScreen2.R.getValue(), (CellDetailsChevronDelegate) apmRecipientDetailsNewScreen2.S.getValue(), (LargeActionButtonDelegate) apmRecipientDetailsNewScreen2.T.getValue(), new TextDelegate(), new ListSubheaderDelegate(), new FullScreenStateDelegate(), new RowLoadingDelegate()), R$id.screenRecyclerNavBarLargeCentred_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        b uiState = (b) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        ViewBinding value = this.M.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((y) value).f174576b.setModel(new NavBarLargeCentred.Model(new l(new TextClause(this.K.f62397a.getDisplayName(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, new TextClause(uiState.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, new com.revolut.core.ui_kit.views.navbar.j(new AvatarModel.Default(uiState.f319121b, null, null, null, new AvatarModel.BadgeModel(uiState.f319122c, com.revolut.core.ui_kit.models.avatar.b.BOTTOM), null, LDSFile.EF_DG14_TAG), (q1) null, 6), null, 858));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c0) this.W.getValue();
    }

    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((y) value).f174576b.f59292m), null, new yl6.b(this, continuation, 29), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RectangularButtonDelegate) this.N.getValue()).f53149c), null, new k(this, null), 3);
        ?? r62 = this.P;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(((RowDelegate) r62.getValue()).f53218h, new z1i.l(20))), null, new f(this, continuation, 8), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) r62.getValue()).f53225r), null, new z32.l(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsChevronDelegate) this.S.getValue()).f51821c), null, new m(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((LargeActionButtonDelegate) this.T.getValue()).d.f121375b), null, new n(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final c d() {
        return (c) this.U.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.V.getValue();
    }
}
