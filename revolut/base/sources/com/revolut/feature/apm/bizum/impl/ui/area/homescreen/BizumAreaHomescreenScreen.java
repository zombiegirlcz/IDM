package com.revolut.feature.apm.bizum.impl.ui.area.homescreen;

import aii.q;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlaceholderRowDelegate;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerBoxDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ContactsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.bizum.api.R$string;
import com.revolut.feature.apm.bizum.impl.R$id;
import com.revolut.feature.apm.bizum.impl.R$layout;
import com.revolut.feature.apm.bizum.impl.ui.area.homescreen.BizumAreaHomescreenScreen;
import com.revolut.feature.apm.core.api.product.ApmBizum;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ms1.k;
import rd0.e;
import sji.b;
import te0.w;
import tk5.c;
import tl7.a;
import tpi.g;
import ts1.d;
import ts1.f;
import ts1.i;
import ts1.j;
import ts1.l;
import ts1.m;
import ts1.n;
import ts1.o;
import ts1.p;
import tw0.t0;
import tx0.j0;
import vc.s;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bizum/impl/ui/area/homescreen/BizumAreaHomescreenScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lts1/f;", "Lcom/revolut/feature/apm/bizum/impl/ui/area/homescreen/BizumAreaHomescreenContract$InputData;", "Laii/q;", "feature_apm_bizum_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BizumAreaHomescreenScreen extends BaseRecyclerViewScreen<f, BizumAreaHomescreenContract$InputData, q> {
    public static final /* synthetic */ KProperty[] m0 = {o0.f186429a.j(new h0(BizumAreaHomescreenScreen.class, "binding", "getBinding()Lcom/revolut/feature/apm/bizum/impl/databinding/ScreenBizumAreaBinding;", 0))};
    public final int U;
    public final int V;
    public final boolean W;
    public final h X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f61574a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f61575b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f61576d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f61577e0;
    public final Object f0;
    public final Object g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Object f61578h0;
    public final Object i0;
    public final Object j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final Object f61579k0;
    public final Object l0;

    /* JADX WARN: Illegal instructions before constructor call */
    public BizumAreaHomescreenScreen() {
        BizumAreaHomescreenContract$InputData inputData = BizumAreaHomescreenContract$InputData.f61573a;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        super(inputData);
        this.U = R$layout.screen_bizum_area;
        this.V = R$id.bizumArea_recyclerView;
        this.W = true;
        this.X = s.t(this, i.f);
        final int i = 1;
        this.Y = w.y0(new Function0(this) { // from class: ts1.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BizumAreaHomescreenScreen f273928b;

            {
                this.f273928b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BizumAreaHomescreenScreen bizumAreaHomescreenScreen = this.f273928b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BizumAreaHomescreenScreen.m0;
                        return new ScrollerBoxDelegate(zhm.u.c((ReferralContactDelegate) bizumAreaHomescreenScreen.f0.getValue()));
                    case 1:
                        KProperty[] kPropertyArr2 = BizumAreaHomescreenScreen.m0;
                        phm.a aVar = (phm.a) ue0.e.j(bizumAreaHomescreenScreen.m2()).a().get(ms1.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new ms1.k(((ms1.j) aVar2.b()).B);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", ms1.j.class, " is not found"));
                    case 2:
                        KProperty[] kPropertyArr3 = BizumAreaHomescreenScreen.m0;
                        return new SwipeToActionDelegate((RowDelegate) bizumAreaHomescreenScreen.f61578h0.getValue(), false);
                    case 3:
                        KProperty[] kPropertyArr4 = BizumAreaHomescreenScreen.m0;
                        return zhm.v.k((FullScreenStateDelegate) bizumAreaHomescreenScreen.f61574a0.getValue(), (ActionsDelegate) bizumAreaHomescreenScreen.f61575b0.getValue(), (ActionWidgetDelegate) bizumAreaHomescreenScreen.c0.getValue(), (ContactsWidgetDelegate) bizumAreaHomescreenScreen.f61576d0.getValue(), (RowsWidgetDelegate) bizumAreaHomescreenScreen.f61577e0.getValue(), (ScrollerBoxDelegate) bizumAreaHomescreenScreen.g0.getValue(), (RowDelegate) bizumAreaHomescreenScreen.f61578h0.getValue(), (SwipeToActionDelegate) bizumAreaHomescreenScreen.i0.getValue(), (LargeActionButtonDelegate) bizumAreaHomescreenScreen.f61579k0.getValue(), (ListSubheaderDelegate) bizumAreaHomescreenScreen.j0.getValue(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), new PlaceholderRowDelegate());
                    default:
                        KProperty[] kPropertyArr5 = BizumAreaHomescreenScreen.m0;
                        return (d) ((ms1.k) bizumAreaHomescreenScreen.Y.getValue()).e.get();
                }
            }
        });
        final int i2 = 4;
        this.Z = w.y0(new Function0(this) { // from class: ts1.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BizumAreaHomescreenScreen f273928b;

            {
                this.f273928b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BizumAreaHomescreenScreen bizumAreaHomescreenScreen = this.f273928b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BizumAreaHomescreenScreen.m0;
                        return new ScrollerBoxDelegate(zhm.u.c((ReferralContactDelegate) bizumAreaHomescreenScreen.f0.getValue()));
                    case 1:
                        KProperty[] kPropertyArr2 = BizumAreaHomescreenScreen.m0;
                        phm.a aVar = (phm.a) ue0.e.j(bizumAreaHomescreenScreen.m2()).a().get(ms1.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new ms1.k(((ms1.j) aVar2.b()).B);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", ms1.j.class, " is not found"));
                    case 2:
                        KProperty[] kPropertyArr3 = BizumAreaHomescreenScreen.m0;
                        return new SwipeToActionDelegate((RowDelegate) bizumAreaHomescreenScreen.f61578h0.getValue(), false);
                    case 3:
                        KProperty[] kPropertyArr4 = BizumAreaHomescreenScreen.m0;
                        return zhm.v.k((FullScreenStateDelegate) bizumAreaHomescreenScreen.f61574a0.getValue(), (ActionsDelegate) bizumAreaHomescreenScreen.f61575b0.getValue(), (ActionWidgetDelegate) bizumAreaHomescreenScreen.c0.getValue(), (ContactsWidgetDelegate) bizumAreaHomescreenScreen.f61576d0.getValue(), (RowsWidgetDelegate) bizumAreaHomescreenScreen.f61577e0.getValue(), (ScrollerBoxDelegate) bizumAreaHomescreenScreen.g0.getValue(), (RowDelegate) bizumAreaHomescreenScreen.f61578h0.getValue(), (SwipeToActionDelegate) bizumAreaHomescreenScreen.i0.getValue(), (LargeActionButtonDelegate) bizumAreaHomescreenScreen.f61579k0.getValue(), (ListSubheaderDelegate) bizumAreaHomescreenScreen.j0.getValue(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), new PlaceholderRowDelegate());
                    default:
                        KProperty[] kPropertyArr5 = BizumAreaHomescreenScreen.m0;
                        return (d) ((ms1.k) bizumAreaHomescreenScreen.Y.getValue()).e.get();
                }
            }
        });
        this.f61574a0 = w.y0(new ts1.h(1));
        this.f61575b0 = w.y0(new a(23));
        this.c0 = w.y0(new a(24));
        this.f61576d0 = w.y0(new a(25));
        this.f61577e0 = w.y0(new a(26));
        this.f0 = w.y0(new a(27));
        final int i3 = 0;
        this.g0 = w.y0(new Function0(this) { // from class: ts1.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BizumAreaHomescreenScreen f273928b;

            {
                this.f273928b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BizumAreaHomescreenScreen bizumAreaHomescreenScreen = this.f273928b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BizumAreaHomescreenScreen.m0;
                        return new ScrollerBoxDelegate(zhm.u.c((ReferralContactDelegate) bizumAreaHomescreenScreen.f0.getValue()));
                    case 1:
                        KProperty[] kPropertyArr2 = BizumAreaHomescreenScreen.m0;
                        phm.a aVar = (phm.a) ue0.e.j(bizumAreaHomescreenScreen.m2()).a().get(ms1.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new ms1.k(((ms1.j) aVar2.b()).B);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", ms1.j.class, " is not found"));
                    case 2:
                        KProperty[] kPropertyArr3 = BizumAreaHomescreenScreen.m0;
                        return new SwipeToActionDelegate((RowDelegate) bizumAreaHomescreenScreen.f61578h0.getValue(), false);
                    case 3:
                        KProperty[] kPropertyArr4 = BizumAreaHomescreenScreen.m0;
                        return zhm.v.k((FullScreenStateDelegate) bizumAreaHomescreenScreen.f61574a0.getValue(), (ActionsDelegate) bizumAreaHomescreenScreen.f61575b0.getValue(), (ActionWidgetDelegate) bizumAreaHomescreenScreen.c0.getValue(), (ContactsWidgetDelegate) bizumAreaHomescreenScreen.f61576d0.getValue(), (RowsWidgetDelegate) bizumAreaHomescreenScreen.f61577e0.getValue(), (ScrollerBoxDelegate) bizumAreaHomescreenScreen.g0.getValue(), (RowDelegate) bizumAreaHomescreenScreen.f61578h0.getValue(), (SwipeToActionDelegate) bizumAreaHomescreenScreen.i0.getValue(), (LargeActionButtonDelegate) bizumAreaHomescreenScreen.f61579k0.getValue(), (ListSubheaderDelegate) bizumAreaHomescreenScreen.j0.getValue(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), new PlaceholderRowDelegate());
                    default:
                        KProperty[] kPropertyArr5 = BizumAreaHomescreenScreen.m0;
                        return (d) ((ms1.k) bizumAreaHomescreenScreen.Y.getValue()).e.get();
                }
            }
        });
        this.f61578h0 = w.y0(new a(28));
        final int i5 = 2;
        this.i0 = w.y0(new Function0(this) { // from class: ts1.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BizumAreaHomescreenScreen f273928b;

            {
                this.f273928b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                BizumAreaHomescreenScreen bizumAreaHomescreenScreen = this.f273928b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BizumAreaHomescreenScreen.m0;
                        return new ScrollerBoxDelegate(zhm.u.c((ReferralContactDelegate) bizumAreaHomescreenScreen.f0.getValue()));
                    case 1:
                        KProperty[] kPropertyArr2 = BizumAreaHomescreenScreen.m0;
                        phm.a aVar = (phm.a) ue0.e.j(bizumAreaHomescreenScreen.m2()).a().get(ms1.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new ms1.k(((ms1.j) aVar2.b()).B);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", ms1.j.class, " is not found"));
                    case 2:
                        KProperty[] kPropertyArr3 = BizumAreaHomescreenScreen.m0;
                        return new SwipeToActionDelegate((RowDelegate) bizumAreaHomescreenScreen.f61578h0.getValue(), false);
                    case 3:
                        KProperty[] kPropertyArr4 = BizumAreaHomescreenScreen.m0;
                        return zhm.v.k((FullScreenStateDelegate) bizumAreaHomescreenScreen.f61574a0.getValue(), (ActionsDelegate) bizumAreaHomescreenScreen.f61575b0.getValue(), (ActionWidgetDelegate) bizumAreaHomescreenScreen.c0.getValue(), (ContactsWidgetDelegate) bizumAreaHomescreenScreen.f61576d0.getValue(), (RowsWidgetDelegate) bizumAreaHomescreenScreen.f61577e0.getValue(), (ScrollerBoxDelegate) bizumAreaHomescreenScreen.g0.getValue(), (RowDelegate) bizumAreaHomescreenScreen.f61578h0.getValue(), (SwipeToActionDelegate) bizumAreaHomescreenScreen.i0.getValue(), (LargeActionButtonDelegate) bizumAreaHomescreenScreen.f61579k0.getValue(), (ListSubheaderDelegate) bizumAreaHomescreenScreen.j0.getValue(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), new PlaceholderRowDelegate());
                    default:
                        KProperty[] kPropertyArr5 = BizumAreaHomescreenScreen.m0;
                        return (d) ((ms1.k) bizumAreaHomescreenScreen.Y.getValue()).e.get();
                }
            }
        });
        this.j0 = w.y0(new a(29));
        this.f61579k0 = w.y0(new ts1.h(0));
        final int i6 = 3;
        this.l0 = w.y0(new Function0(this) { // from class: ts1.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BizumAreaHomescreenScreen f273928b;

            {
                this.f273928b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                BizumAreaHomescreenScreen bizumAreaHomescreenScreen = this.f273928b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BizumAreaHomescreenScreen.m0;
                        return new ScrollerBoxDelegate(zhm.u.c((ReferralContactDelegate) bizumAreaHomescreenScreen.f0.getValue()));
                    case 1:
                        KProperty[] kPropertyArr2 = BizumAreaHomescreenScreen.m0;
                        phm.a aVar = (phm.a) ue0.e.j(bizumAreaHomescreenScreen.m2()).a().get(ms1.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new ms1.k(((ms1.j) aVar2.b()).B);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", ms1.j.class, " is not found"));
                    case 2:
                        KProperty[] kPropertyArr3 = BizumAreaHomescreenScreen.m0;
                        return new SwipeToActionDelegate((RowDelegate) bizumAreaHomescreenScreen.f61578h0.getValue(), false);
                    case 3:
                        KProperty[] kPropertyArr4 = BizumAreaHomescreenScreen.m0;
                        return zhm.v.k((FullScreenStateDelegate) bizumAreaHomescreenScreen.f61574a0.getValue(), (ActionsDelegate) bizumAreaHomescreenScreen.f61575b0.getValue(), (ActionWidgetDelegate) bizumAreaHomescreenScreen.c0.getValue(), (ContactsWidgetDelegate) bizumAreaHomescreenScreen.f61576d0.getValue(), (RowsWidgetDelegate) bizumAreaHomescreenScreen.f61577e0.getValue(), (ScrollerBoxDelegate) bizumAreaHomescreenScreen.g0.getValue(), (RowDelegate) bizumAreaHomescreenScreen.f61578h0.getValue(), (SwipeToActionDelegate) bizumAreaHomescreenScreen.i0.getValue(), (LargeActionButtonDelegate) bizumAreaHomescreenScreen.f61579k0.getValue(), (ListSubheaderDelegate) bizumAreaHomescreenScreen.j0.getValue(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), new PlaceholderRowDelegate());
                    default:
                        KProperty[] kPropertyArr5 = BizumAreaHomescreenScreen.m0;
                        return (d) ((ms1.k) bizumAreaHomescreenScreen.Y.getValue()).e.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (k) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v29, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v34, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v40, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v45, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v50, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(g3().f189087b.f59410q), null, new c(this, continuation, 11), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((FullScreenStateDelegate) this.f61574a0.getValue()).f52371h.f121375b), null, new n(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(w.a0(((ActionsDelegate) this.f61575b0.getValue()).f51611c.f121375b, new g(13))), null, new j(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((ActionWidgetDelegate) this.c0.getValue()).f51589c.f121375b), null, new j(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((ContactsWidgetDelegate) this.f61576d0.getValue()).f), null, new o(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((RowsWidgetDelegate) this.f61577e0.getValue()).f), null, new p(this, null), 3);
        ?? r62 = this.f0;
        com.revolut.kompot.navigable.a.g2(this, e.b(w.a0(((ReferralContactDelegate) r62.getValue()).q(), new g(14))), null, new j(this, continuation, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(w.a0(((ReferralContactDelegate) r62.getValue()).q(), new g(15))), null, new j(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((ListSubheaderDelegate) this.j0.getValue()).f52707c), null, new ts1.k(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((RowDelegate) this.f61578h0.getValue()).f53218h), null, new l(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((LargeActionButtonDelegate) this.f61579k0.getValue()).d.f121375b), null, new m(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ScreenContentRecyclerView screenContentRecyclerView = g3().f189088c;
        RecyclerView.Adapter adapter = screenContentRecyclerView.getAdapter();
        Intrinsics.i(adapter, "null cannot be cast to non-null type com.revolut.recyclerkit.delegates.DiffAdapter");
        screenContentRecyclerView.addItemDecoration(new t0((koi.h) adapter, false));
        NavBarWithToolbar navBarWithToolbar = g3().f189087b;
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, new TextLocalisedClause(R$string.bizum_back, null, null, 14), 126));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setEndIconImage(ApmBizum.f61808c.F());
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.bizum_area_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.bizum_area_title, null, null, 14), null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF90107b0() {
        return (List) this.l0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.V;
    }

    public final ks1.a g3() {
        ViewBinding value = this.X.getValue(this, m0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ks1.a) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: h3, reason: merged with bridge method [inline-methods] */
    public final d T2() {
        return (d) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.W);
    }
}
