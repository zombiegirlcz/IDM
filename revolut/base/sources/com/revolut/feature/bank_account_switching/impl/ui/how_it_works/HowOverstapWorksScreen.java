package com.revolut.feature.bank_account_switching.impl.ui.how_it_works;

import aii.q;
import android.view.View;
import cli.k;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.bank_account_switching.impl.ui.how_it_works.HowOverstapWorksScreen;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import ko2.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import te0.w;
import ue0.e;
import vn2.h;
import vn2.u;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/how_it_works/HowOverstapWorksScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Lcli/k;", "<init>", "()V", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HowOverstapWorksScreen extends BaseBottomSheetRecyclerController<q, k> {
    public static final /* synthetic */ int T = 0;
    public final Object Q;
    public final Object R;
    public final List S;

    public HowOverstapWorksScreen() {
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: ko2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HowOverstapWorksScreen f186205b;

            {
                this.f186205b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                HowOverstapWorksScreen howOverstapWorksScreen = this.f186205b;
                switch (i2) {
                    case 0:
                        int i3 = HowOverstapWorksScreen.T;
                        return (d) ((u) howOverstapWorksScreen.R.getValue()).f290723a.get();
                    default:
                        int i5 = HowOverstapWorksScreen.T;
                        phm.a aVar = (phm.a) e.j(howOverstapWorksScreen.m2()).a().get(h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", h.class, " is not found"));
                        }
                        h hVar = ((h) aVar2.b()).f290682l;
                        u uVar = new u();
                        uVar.f290723a = e4m.b.b(new vk6.a(2));
                        return uVar;
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: ko2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HowOverstapWorksScreen f186205b;

            {
                this.f186205b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                HowOverstapWorksScreen howOverstapWorksScreen = this.f186205b;
                switch (i22) {
                    case 0:
                        int i3 = HowOverstapWorksScreen.T;
                        return (d) ((u) howOverstapWorksScreen.R.getValue()).f290723a.get();
                    default:
                        int i5 = HowOverstapWorksScreen.T;
                        phm.a aVar = (phm.a) e.j(howOverstapWorksScreen.m2()).a().get(h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", h.class, " is not found"));
                        }
                        h hVar = ((h) aVar2.b()).f290682l;
                        u uVar = new u();
                        uVar.f290723a = e4m.b.b(new vk6.a(2));
                        return uVar;
                }
            }
        });
        this.S = zhm.u.c(rowDelegate);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (u) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (d) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e3(), new ko2.b(this, null, 0), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (d) this.Q.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getS() {
        return this.S;
    }
}
