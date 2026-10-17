package com.revolut.kompot.common.bottom_sheet;

import aii.r;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.i;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.e;
import jo0.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import mki.b;
import vc.s;
import vkm.d;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetController;", "Laii/r;", "Output", "Lcom/revolut/kompot/navigable/vc/ViewController;", "<init>", "()V", "cii/a", "kompot_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BaseBottomSheetController<Output extends r> extends ViewController<Output> {
    public static final /* synthetic */ KProperty[] M = {o0.f186429a.j(new h0(BaseBottomSheetController.class, "binding", "getBinding$kompot_common_release()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetBaseBinding;", 0))};
    public final h K = s.t(this, a.f);
    public final int L = R$layout.screen_bottom_sheet_base;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, e.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenBottomSheetBaseBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return e.a(p0);
        }
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getX() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        if (((Boolean) g.k.getValue()).booleanValue()) {
            b bVarQ2 = q2();
            ActionFooterView bottomSheetControllerBaseFooterView = g3().f174513b;
            Intrinsics.checkNotNullExpressionValue(bottomSheetControllerBaseFooterView, "bottomSheetControllerBaseFooterView");
            ofm.q.K(bVarQ2, bottomSheetControllerBaseFooterView);
        }
    }

    public final d d3() {
        return rd0.e.b(g3().f174513b.e);
    }

    public final d e3() {
        return rd0.e.b(g3().f174513b.f);
    }

    public final d f3() {
        return rd0.e.b(g3().f174513b.f58955g);
    }

    public final e g3() {
        ViewBinding value = this.K.getValue(this, M[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (e) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    public final d h3() {
        return rd0.e.b(g3().f174514c.F);
    }

    public final d i3() {
        return rd0.e.b(g3().f174514c.E);
    }

    public final void j3(cii.a model) {
        Intrinsics.checkNotNullParameter(model, "model");
        e eVarG3 = g3();
        eVarG3.f174514c.setHeaderModel(model.f24551a);
        ActionFooterView bottomSheetControllerBaseFooterView = eVarG3.f174513b;
        Intrinsics.checkNotNullExpressionValue(bottomSheetControllerBaseFooterView, "bottomSheetControllerBaseFooterView");
        i iVar = model.f24552b;
        bottomSheetControllerBaseFooterView.setVisibility(iVar != null ? 0 : 8);
        if (iVar != null) {
            Intrinsics.checkNotNullExpressionValue(bottomSheetControllerBaseFooterView, "bottomSheetControllerBaseFooterView");
            bottomSheetControllerBaseFooterView.setModel(iVar);
        }
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: r2 */
    public final Boolean getN() {
        return Boolean.TRUE;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return null;
    }
}
