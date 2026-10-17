package com.revolut.feature.card_design.impl.card_design.local_global_card_info;

import android.view.View;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.card_design.impl.card_design.local_global_card_info.LocalGlobalCardInfoController;
import com.revolut.feature.card_design.impl.card_design.local_global_card_info.LocalGlobalCardInfoScreenContract$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import gy2.i;
import hx2.k;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import te0.w;
import wq1.a;
import wuh.q;
import wx2.f;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/card_design/impl/card_design/local_global_card_info/LocalGlobalCardInfoController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lhx2/k;", "Lwx2/f;", "retail_feature_card_design_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LocalGlobalCardInfoController extends BaseBottomSheetRecyclerController<k, f> {
    public static final /* synthetic */ int V = 0;
    public final LocalGlobalCardInfoScreenContract$InputData Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final List U;

    public LocalGlobalCardInfoController(LocalGlobalCardInfoScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: wx2.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LocalGlobalCardInfoController f300737b;

            {
                this.f300737b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                LocalGlobalCardInfoController localGlobalCardInfoController = this.f300737b;
                switch (i2) {
                    case 0:
                        int i3 = LocalGlobalCardInfoController.V;
                        phm.a aVar = (phm.a) ue0.e.j(localGlobalCardInfoController.m2()).a().get(gy2.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gy2.d.class, " is not found"));
                        }
                        gy2.d dVar = ((gy2.d) aVar2.b()).f147796y;
                        LocalGlobalCardInfoScreenContract$InputData localGlobalCardInfoScreenContract$InputData = localGlobalCardInfoController.Q;
                        localGlobalCardInfoScreenContract$InputData.getClass();
                        return new i(dVar, localGlobalCardInfoScreenContract$InputData);
                    default:
                        int i5 = LocalGlobalCardInfoController.V;
                        return (e) ((i) localGlobalCardInfoController.R.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: wx2.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LocalGlobalCardInfoController f300737b;

            {
                this.f300737b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                LocalGlobalCardInfoController localGlobalCardInfoController = this.f300737b;
                switch (i22) {
                    case 0:
                        int i3 = LocalGlobalCardInfoController.V;
                        phm.a aVar = (phm.a) ue0.e.j(localGlobalCardInfoController.m2()).a().get(gy2.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gy2.d.class, " is not found"));
                        }
                        gy2.d dVar = ((gy2.d) aVar2.b()).f147796y;
                        LocalGlobalCardInfoScreenContract$InputData localGlobalCardInfoScreenContract$InputData = localGlobalCardInfoController.Q;
                        localGlobalCardInfoScreenContract$InputData.getClass();
                        return new i(dVar, localGlobalCardInfoScreenContract$InputData);
                    default:
                        int i5 = LocalGlobalCardInfoController.V;
                        return (e) ((i) localGlobalCardInfoController.R.getValue()).d.get();
                }
            }
        });
        Lazy lazyY0 = w.y0(new a(28));
        this.T = lazyY0;
        this.U = v.k(new ListSubheaderDelegate(), (RowDelegate) lazyY0.getValue());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (wx2.e) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.T.getValue()).f53226s), null, new q(this, (Continuation) null, 15), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (wx2.e) this.S.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getU() {
        return this.U;
    }
}
