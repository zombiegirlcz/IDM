package com.revolut.feature.junior.accounts.impl.ui.total_wealth.dialog;

import aii.q;
import android.view.View;
import com.revolut.feature.junior.accounts.impl.ui.total_wealth.dialog.YouthTotalWealthInfoScreen;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import jm4.o3;
import k78.i;
import k78.k;
import k88.b;
import k88.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import ue0.e;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/junior/accounts/impl/ui/total_wealth/dialog/YouthTotalWealthInfoScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Lk88/b;", "<init>", "()V", "feature_junior_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class YouthTotalWealthInfoScreen extends BaseBottomSheetRecyclerController<q, b> {
    public static final /* synthetic */ int T = 0;
    public final f0 Q = f0.f322471a;
    public final Object R;
    public final Object S;

    public YouthTotalWealthInfoScreen() {
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: k88.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ YouthTotalWealthInfoScreen f182098b;

            {
                this.f182098b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                YouthTotalWealthInfoScreen youthTotalWealthInfoScreen = this.f182098b;
                switch (i2) {
                    case 0:
                        int i3 = YouthTotalWealthInfoScreen.T;
                        phm.a aVar = (phm.a) e.j(youthTotalWealthInfoScreen.m2()).a().get(r68.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", r68.b.class, " is not found"));
                        }
                        k78.b bVar = ((k78.b) ((k) aVar2.b())).Q;
                        i iVar = new i();
                        iVar.f181892a = e4m.b.b(new o3(iVar, 1, 15));
                        iVar.f181893b = e4m.b.b(new o3(iVar, 0, 15));
                        return iVar;
                    default:
                        int i5 = YouthTotalWealthInfoScreen.T;
                        return (c) ((i) youthTotalWealthInfoScreen.R.getValue()).f181893b.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: k88.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ YouthTotalWealthInfoScreen f182098b;

            {
                this.f182098b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                YouthTotalWealthInfoScreen youthTotalWealthInfoScreen = this.f182098b;
                switch (i22) {
                    case 0:
                        int i3 = YouthTotalWealthInfoScreen.T;
                        phm.a aVar = (phm.a) e.j(youthTotalWealthInfoScreen.m2()).a().get(r68.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", r68.b.class, " is not found"));
                        }
                        k78.b bVar = ((k78.b) ((k) aVar2.b())).Q;
                        i iVar = new i();
                        iVar.f181892a = e4m.b.b(new o3(iVar, 1, 15));
                        iVar.f181893b = e4m.b.b(new o3(iVar, 0, 15));
                        return iVar;
                    default:
                        int i5 = YouthTotalWealthInfoScreen.T;
                        return (c) ((i) youthTotalWealthInfoScreen.R.getValue()).f181893b.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (i) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (c) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e3(), new k22.c(this, null, 11), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (c) this.S.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3 */
    public final List getU() {
        return this.Q;
    }
}
