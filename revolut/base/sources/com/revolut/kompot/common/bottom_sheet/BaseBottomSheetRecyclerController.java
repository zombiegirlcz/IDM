package com.revolut.kompot.common.bottom_sheet;

import aii.r;
import android.view.View;
import aw0.i;
import cii.b;
import cli.j;
import cli.o;
import cli.q;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.a;
import dli.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lw0.m;
import te0.w;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00020\u00070\u0006B\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/r;", "Output", "Lcli/j;", "D", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetController;", "Ldli/a;", "Lcii/b;", "<init>", "()V", "kompot_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BaseBottomSheetRecyclerController<Output extends r, D extends j> extends BaseBottomSheetController<Output> implements a {
    public static final /* synthetic */ int P = 0;
    public final tw0.a N = new tw0.a();
    public final Object O = w.y0(new bvb.a(this, 19));

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        b uiState = (b) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        m mVar = uiState.f24554b;
        i iVar = uiState.f24555c;
        this.N.b(mVar != null, iVar != null);
        j3(new cii.a(uiState.f24554b, iVar));
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetController, com.revolut.kompot.navigable.vc.ViewController
    public void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.Y2(view);
        ScreenContentRecyclerView bottomSheetControllerBaseRecyclerView = g3().d;
        Intrinsics.checkNotNullExpressionValue(bottomSheetControllerBaseRecyclerView, "bottomSheetControllerBaseRecyclerView");
        this.N.a(bottomSheetControllerBaseRecyclerView);
        ScreenContentRecyclerView bottomSheetControllerBaseRecyclerView2 = g3().d;
        Intrinsics.checkNotNullExpressionValue(bottomSheetControllerBaseRecyclerView2, "bottomSheetControllerBaseRecyclerView");
        bottomSheetControllerBaseRecyclerView2.setVisibility(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: k3, reason: merged with bridge method [inline-methods] */
    public abstract dli.b R2();

    /* JADX INFO: renamed from: l3 */
    public abstract List getX();
}
