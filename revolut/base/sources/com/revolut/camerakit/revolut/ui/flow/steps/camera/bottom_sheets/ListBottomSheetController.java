package com.revolut.camerakit.revolut.ui.flow.steps.camera.bottom_sheets;

import android.view.View;
import cli.k;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import te0.w;
import ty.c;
import ty.f;
import ty.g;
import xki.a;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/camerakit/revolut/ui/flow/steps/camera/bottom_sheets/ListBottomSheetController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lty/f;", "Lcli/k;", "camera_kit_revolut_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ListBottomSheetController extends BaseBottomSheetRecyclerController<f, k> {
    public static final /* synthetic */ int V = 0;
    public final Object Q;
    public final Object R;
    public final g S;
    public final a T;
    public final List U;

    public ListBottomSheetController(c inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        g gVar = new g(inputData);
        Lazy lazyY0 = w.y0(new ty.a(0));
        this.Q = lazyY0;
        Lazy lazyY02 = w.y0(new ty.a(1));
        this.R = lazyY02;
        this.S = gVar;
        this.T = a.f306815a;
        this.U = v.k((RowDelegate) lazyY0.getValue(), (LargeActionButtonDelegate) lazyY02.getValue());
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return this.T;
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return this.S;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e3(), new ty.b(this, null, 0), 3);
        ViewController.P2(this, f3(), new ty.b(this, null, 1), 3);
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return this.S;
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getR() {
        return this.U;
    }
}
