package p3l;

import com.revolut.core.extensions.rx.BreadcrumbException;
import efm.k;
import iqi.h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.o0;
import o3l.d;
import o3l.g;
import om4.m1;
import ozc.z;
import p2i.l;
import pri.c;
import pri.f;
import rfm.b;
import rfm.m;
import rfm.w;
import ypi.i;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends c implements f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f232766h = 1;
    public final d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f232767j;

    public a(h twinVerticalButtonView, d presentationModel) {
        Intrinsics.checkNotNullParameter(twinVerticalButtonView, "twinVerticalButtonView");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        this.f232767j = twinVerticalButtonView;
        this.i = presentationModel;
    }

    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        switch (this.f232766h) {
            case 0:
                g view = (g) aVar;
                Intrinsics.checkNotNullParameter(view, "view");
                super.h(view);
                ((i) this.f232767j).setEnabled(true);
                d dVar = this.i;
                k kVarFirstElement = dVar.O2().firstElement();
                Intrinsics.checkNotNullExpressionValue(kVarFirstElement, "firstElement(...)");
                w wVarH = o70.a.h(kVarFirstElement);
                m1 m1Var = new m1(1, (i) this.f232767j, i.class, "setVisible", "setVisible(Z)V", 0, 14);
                Function1 function1K = K();
                Function0 function0J = J();
                m mVar = new m(wVarH, new m3l.d(13, new l(new BreadcrumbException(), 7)), 2);
                Intrinsics.checkNotNullExpressionValue(mVar, "onErrorResumeNext(...)");
                b bVar = new b(new o9h.d(4, m1Var), new o9h.d(4, function1K), new z(3, function0J));
                mVar.i(bVar);
                Intrinsics.checkNotNullExpressionValue(bVar, "subscribe(...)");
                ifm.b bVar2 = this.f239031a;
                te0.w.j0(bVar2, bVar);
                k kVarFirstElement2 = dVar.D0().firstElement();
                Intrinsics.checkNotNullExpressionValue(kVarFirstElement2, "firstElement(...)");
                w wVarH2 = o70.a.h(kVarFirstElement2);
                m1 m1Var2 = new m1(1, (i) this.f232767j, i.class, "setText", "setText(Lcom/revolut/core/ui_kit/models/Clause;)V", 0, 15);
                Function1 function1K2 = K();
                Function0 function0J2 = J();
                m mVar2 = new m(wVarH2, new m3l.d(13, new l(new BreadcrumbException(), 8)), 2);
                Intrinsics.checkNotNullExpressionValue(mVar2, "onErrorResumeNext(...)");
                b bVar3 = new b(new o9h.d(4, m1Var2), new o9h.d(4, function1K2), new z(3, function0J2));
                mVar2.i(bVar3);
                Intrinsics.checkNotNullExpressionValue(bVar3, "subscribe(...)");
                te0.w.j0(bVar2, bVar3);
                break;
            default:
                g view2 = (g) aVar;
                Intrinsics.checkNotNullParameter(view2, "view");
                super.h(view2);
                iqi.b bVar4 = (iqi.b) ((h) this.f232767j);
                bVar4.Z(true);
                bVar4.b0(true);
                bVar4.V(false);
                d dVar2 = this.i;
                k kVarFirstElement3 = dVar2.D0().firstElement();
                Intrinsics.checkNotNullExpressionValue(kVarFirstElement3, "firstElement(...)");
                w wVarH3 = o70.a.h(kVarFirstElement3);
                m1 m1Var3 = new m1(1, (h) this.f232767j, h.class, "setLargeButtonText", "setLargeButtonText(Lcom/revolut/core/ui_kit/models/Clause;)V", 0, 16);
                Function1 function1K3 = K();
                Function0 function0J3 = J();
                m mVar3 = new m(wVarH3, new o0(7, new l(new BreadcrumbException(), 9)), 2);
                Intrinsics.checkNotNullExpressionValue(mVar3, "onErrorResumeNext(...)");
                b bVar5 = new b(new lhi.b(18, m1Var3), new lhi.b(18, function1K3), new z(4, function0J3));
                mVar3.i(bVar5);
                Intrinsics.checkNotNullExpressionValue(bVar5, "subscribe(...)");
                ifm.b bVar6 = this.f239031a;
                te0.w.j0(bVar6, bVar5);
                k kVarFirstElement4 = dVar2.F2().firstElement();
                Intrinsics.checkNotNullExpressionValue(kVarFirstElement4, "firstElement(...)");
                w wVarH4 = o70.a.h(kVarFirstElement4);
                m1 m1Var4 = new m1(1, (h) this.f232767j, h.class, "setSecondaryButtonText", "setSecondaryButtonText(Lcom/revolut/core/ui_kit/models/Clause;)V", 0, 17);
                Function1 function1K4 = K();
                Function0 function0J4 = J();
                m mVar4 = new m(wVarH4, new o0(7, new l(new BreadcrumbException(), 10)), 2);
                Intrinsics.checkNotNullExpressionValue(mVar4, "onErrorResumeNext(...)");
                b bVar7 = new b(new lhi.b(18, m1Var4), new lhi.b(18, function1K4), new z(4, function0J4));
                mVar4.i(bVar7);
                Intrinsics.checkNotNullExpressionValue(bVar7, "subscribe(...)");
                te0.w.j0(bVar6, bVar7);
                k kVarFirstElement5 = dVar2.O2().firstElement();
                Intrinsics.checkNotNullExpressionValue(kVarFirstElement5, "firstElement(...)");
                w wVarH5 = o70.a.h(kVarFirstElement5);
                m1 m1Var5 = new m1(1, (h) this.f232767j, h.class, "setVisible", "setVisible(Z)V", 0, 18);
                Function1 function1K5 = K();
                Function0 function0J5 = J();
                m mVar5 = new m(wVarH5, new o0(7, new l(new BreadcrumbException(), 11)), 2);
                Intrinsics.checkNotNullExpressionValue(mVar5, "onErrorResumeNext(...)");
                b bVar8 = new b(new lhi.b(18, m1Var5), new lhi.b(18, function1K5), new z(4, function0J5));
                mVar5.i(bVar8);
                Intrinsics.checkNotNullExpressionValue(bVar8, "subscribe(...)");
                te0.w.j0(bVar6, bVar8);
                k kVarFirstElement6 = dVar2.Q1().firstElement();
                Intrinsics.checkNotNullExpressionValue(kVarFirstElement6, "firstElement(...)");
                w wVarH6 = o70.a.h(kVarFirstElement6);
                m1 m1Var6 = new m1(1, (h) this.f232767j, h.class, "setSecondaryButtonVisible", "setSecondaryButtonVisible(Z)V", 0, 19);
                Function1 function1K6 = K();
                Function0 function0J6 = J();
                m mVar6 = new m(wVarH6, new o0(7, new l(new BreadcrumbException(), 12)), 2);
                Intrinsics.checkNotNullExpressionValue(mVar6, "onErrorResumeNext(...)");
                b bVar9 = new b(new lhi.b(18, m1Var6), new lhi.b(18, function1K6), new z(4, function0J6));
                mVar6.i(bVar9);
                Intrinsics.checkNotNullExpressionValue(bVar9, "subscribe(...)");
                te0.w.j0(bVar6, bVar9);
                break;
        }
    }

    public a(i nextButtonView, d presentationModel) {
        Intrinsics.checkNotNullParameter(nextButtonView, "nextButtonView");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        this.f232767j = nextButtonView;
        this.i = presentationModel;
    }
}
