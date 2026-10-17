package com.revolut.carousel_with_sheet.shared.ui.screen;

import aii.r;
import android.os.Parcelable;
import android.view.View;
import cli.j;
import cli.w;
import com.revolut.carousel_with_sheet.shared.ui.R$dimen;
import com.revolut.carousel_with_sheet.shared.ui.screen.CarouselWithBottomSheetScreen;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.internal.dialogs.BottomExpandableDialogView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.DialogHeaderView;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.ui_kit.carousel_with_sheet.view.HorizontalScrollExpandableLayoutView;
import cr0.g;
import cr0.h;
import foh.i;
import java.util.List;
import kl.t1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kye.e;
import mx0.p5;
import nii.o0;
import ny7.t;
import o10.a;
import o10.b;
import o10.c;
import o10.f;
import rp0.s;
import rp0.u;
import rp0.v;
import rp0.x;
import rp0.y;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 \f*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u0003*\b\b\u0002\u0010\u0006*\u00020\u00052\b\u0012\u0004\u0012\u00028\u00020\u00072\b\u0012\u0004\u0012\u00028\u00010\b2\u00020\t:\u0001\rB\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/revolut/carousel_with_sheet/shared/ui/screen/CarouselWithBottomSheetScreen;", "Lcli/j;", "DOMAIN_STATE", "Lo10/b;", "UI_STATE", "Laii/r;", "OUTPUT_DATA", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcli/w;", "Lo10/a;", "<init>", "()V", "Companion", "a", "carousel_with_sheet_shared_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CarouselWithBottomSheetScreen<DOMAIN_STATE extends j, UI_STATE extends b, OUTPUT_DATA extends r> extends ViewController<OUTPUT_DATA> implements w, a {
    public long K;
    public int L;
    public int M;
    public boolean N;

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Z1().setOnHorizontalScrollCallback(new e(this, 23));
        HorizontalScrollExpandableLayoutView horizontalScrollExpandableLayoutViewZ1 = Z1();
        horizontalScrollExpandableLayoutViewZ1.setupAnchorParameters(new p5(R$dimen.carousel_expandable_layout_top_offset, R$dimen.carousel_expandable_layout_bottom_offset, Integer.valueOf(R$dimen.carousel_expandable_layout_mid_offset)));
        this.M = horizontalScrollExpandableLayoutViewZ1.getResources().getDimensionPixelSize(R$dimen.carousel_expandable_layout_top_offset);
        horizontalScrollExpandableLayoutViewZ1.setupRecyclerView(null, new c(this, 0));
        horizontalScrollExpandableLayoutViewZ1.setHasCollapsedState(true);
        horizontalScrollExpandableLayoutViewZ1.setDisableExpandingForShortContent(false);
        efm.r<h> stateChangeEvents = horizontalScrollExpandableLayoutViewZ1.f59131a.getStateChangeEvents();
        final int i = 0;
        Function1 function1 = new Function1(this) { // from class: o10.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CarouselWithBottomSheetScreen f221262b;

            {
                this.f221262b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        h it8 = (h) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        int i2 = e.f221263a[it8.ordinal()];
                        if (i2 == 1 || i2 == 2) {
                            CarouselWithBottomSheetScreen carouselWithBottomSheetScreen = this.f221262b;
                            if (!carouselWithBottomSheetScreen.n1()) {
                                carouselWithBottomSheetScreen.r1();
                            }
                        }
                        break;
                    default:
                        float fFloatValue = ((Float) obj2).floatValue();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        CarouselWithBottomSheetScreen carouselWithBottomSheetScreen2 = this.f221262b;
                        if (jCurrentTimeMillis - carouselWithBottomSheetScreen2.K >= 500) {
                            carouselWithBottomSheetScreen2.A1(((carouselWithBottomSheetScreen2.F0().getHeight() - carouselWithBottomSheetScreen2.M) * fFloatValue) / (carouselWithBottomSheetScreen2.F0().getHeight() - carouselWithBottomSheetScreen2.L));
                        }
                        break;
                }
                return Unit.f186387a;
            }
        };
        efm.r<h> rVarOnErrorResumeNext = stateChangeEvents.onErrorResumeNext(new t1(new t(new BreadcrumbException(), 23)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext.subscribe(new o0(3, function1), new o0(3, f.f221264a)), "subscribe(...)");
        int iV = V();
        horizontalScrollExpandableLayoutViewZ1.setAnchoredStateOffset(iV);
        this.L = iV;
        horizontalScrollExpandableLayoutViewZ1.setAnchoredState();
        final int i2 = 1;
        horizontalScrollExpandableLayoutViewZ1.setOnOffsetChangeListener(new Function1(this) { // from class: o10.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CarouselWithBottomSheetScreen f221262b;

            {
                this.f221262b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        h it8 = (h) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        int i22 = e.f221263a[it8.ordinal()];
                        if (i22 == 1 || i22 == 2) {
                            CarouselWithBottomSheetScreen carouselWithBottomSheetScreen = this.f221262b;
                            if (!carouselWithBottomSheetScreen.n1()) {
                                carouselWithBottomSheetScreen.r1();
                            }
                        }
                        break;
                    default:
                        float fFloatValue = ((Float) obj2).floatValue();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        CarouselWithBottomSheetScreen carouselWithBottomSheetScreen2 = this.f221262b;
                        if (jCurrentTimeMillis - carouselWithBottomSheetScreen2.K >= 500) {
                            carouselWithBottomSheetScreen2.A1(((carouselWithBottomSheetScreen2.F0().getHeight() - carouselWithBottomSheetScreen2.M) * fFloatValue) / (carouselWithBottomSheetScreen2.F0().getHeight() - carouselWithBottomSheetScreen2.L));
                        }
                        break;
                }
                return Unit.f186387a;
            }
        });
    }

    public int a0() {
        return V();
    }

    public final void d3(boolean z) {
        int iV = V();
        int iA0 = z ? a0() : iV;
        int iJ = i.j(64) + (iA0 - iV);
        this.K = System.currentTimeMillis();
        Z1().setExpandedStateOffset(iJ);
        this.M = iJ;
        Z1().setAnchoredStateOffset(iA0);
        this.L = iA0;
        Z1().setAnchoredState();
        g3();
    }

    public abstract void e3();

    public void f3(b uiState) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
    }

    public void g3() {
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // cli.w
    /* JADX INFO: renamed from: h3, reason: merged with bridge method [inline-methods] */
    public void B(b uiState, Object obj2) {
        x xVar;
        DialogHeaderView.a aVar;
        DialogHeaderView.b gVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        int iK = K();
        HorizontalScrollExpandableLayoutView horizontalScrollExpandableLayoutViewZ1 = Z1();
        List<? extends koi.j> listL = uiState.l();
        y model = new y(listL, null, null, null, null, null, 1022);
        horizontalScrollExpandableLayoutViewZ1.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        BottomExpandableDialogView bottomExpandableDialogView = horizontalScrollExpandableLayoutViewZ1.f59131a;
        g gVar2 = null;
        DialogHeaderView.b bVar = null;
        u uVar = model.f256218b;
        if (uVar != null) {
            boolean z = uVar instanceof s;
            if (z) {
                xVar = null;
            } else {
                if (!(uVar instanceof rp0.t)) {
                    throw new NoWhenBranchMatchedException();
                }
                xVar = ((rp0.t) uVar).f256176c;
            }
            if (z) {
                aVar = ((s) uVar).f256161a;
            } else {
                if (!(uVar instanceof rp0.t)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = null;
            }
            Clause title = uVar.getTitle();
            Clause description = uVar.getDescription();
            Parcelable analyticsContext = uVar.getAnalyticsContext();
            if (xVar != null) {
                if (xVar instanceof rp0.w) {
                    rp0.w wVar = (rp0.w) xVar;
                    gVar = new com.revolut.core.ui_kit.views.h(wVar.f256207b, wVar.f256206a);
                } else {
                    if (!(xVar instanceof v)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    v vVar = (v) xVar;
                    gVar = new com.revolut.core.ui_kit.views.g(vVar.f256200a, vVar.f256201b);
                }
                bVar = gVar;
            }
            gVar2 = new g(title, description, bVar, aVar, analyticsContext);
        }
        bottomExpandableDialogView.setItems(listL, gVar2);
        f3(uiState);
        if (iK == 0) {
            d1().post(new k0.b(this, uiState, 25));
        }
        this.N = uiState.k();
    }

    public abstract void i3(float f);

    public abstract void j3();
}
