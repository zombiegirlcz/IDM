package com.revolut.feature.rev_points.buying.impl.ui.screen.info;

import aii.q;
import android.view.View;
import cli.k;
import com.revolut.feature.rev_points.buying.impl.ui.screen.info.RevPointsBuyingInfoControllerScreen;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import te0.w;
import ue0.e;
import vub.d;
import zhm.f0;
import zub.c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/rev_points/buying/impl/ui/screen/info/RevPointsBuyingInfoControllerScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Lcli/k;", "<init>", "()V", "feature_rev_points_buying_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevPointsBuyingInfoControllerScreen extends BaseBottomSheetRecyclerController<q, k> {
    public static final /* synthetic */ int T = 0;
    public final Object Q;
    public final Object R;
    public final f0 S = f0.f322471a;

    public RevPointsBuyingInfoControllerScreen() {
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: zub.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsBuyingInfoControllerScreen f325436b;

            {
                this.f325436b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RevPointsBuyingInfoControllerScreen revPointsBuyingInfoControllerScreen = this.f325436b;
                switch (i2) {
                    case 0:
                        int i3 = RevPointsBuyingInfoControllerScreen.T;
                        phm.a aVar = (phm.a) e.j(revPointsBuyingInfoControllerScreen.m2()).a().get(vub.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vub.a.class, " is not found"));
                        }
                        vub.a aVar3 = ((vub.a) aVar2.b()).i;
                        vub.d dVar = new vub.d();
                        dVar.f292293a = e4m.b.b(new v4d.a(dVar, 1, 27));
                        dVar.f292294b = e4m.b.b(new v4d.a(dVar, 0, 27));
                        return dVar;
                    default:
                        int i5 = RevPointsBuyingInfoControllerScreen.T;
                        return (c) ((vub.d) revPointsBuyingInfoControllerScreen.Q.getValue()).f292294b.get();
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: zub.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsBuyingInfoControllerScreen f325436b;

            {
                this.f325436b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RevPointsBuyingInfoControllerScreen revPointsBuyingInfoControllerScreen = this.f325436b;
                switch (i22) {
                    case 0:
                        int i3 = RevPointsBuyingInfoControllerScreen.T;
                        phm.a aVar = (phm.a) e.j(revPointsBuyingInfoControllerScreen.m2()).a().get(vub.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vub.a.class, " is not found"));
                        }
                        vub.a aVar3 = ((vub.a) aVar2.b()).i;
                        vub.d dVar = new vub.d();
                        dVar.f292293a = e4m.b.b(new v4d.a(dVar, 1, 27));
                        dVar.f292294b = e4m.b.b(new v4d.a(dVar, 0, 27));
                        return dVar;
                    default:
                        int i5 = RevPointsBuyingInfoControllerScreen.T;
                        return (c) ((vub.d) revPointsBuyingInfoControllerScreen.Q.getValue()).f292294b.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (d) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (c) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        a.g2(this, e3(), null, new zub.b(this, null, 0), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (c) this.R.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3 */
    public final List getS() {
        return this.S;
    }
}
