package com.revolut.feature.security_hub.impl.ui.linked_wallets_learn_more;

import a0.d;
import aii.q;
import android.view.View;
import cli.k;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.security_hub.impl.ui.linked_wallets_learn_more.LinkedWalletsLearnMoreScreen;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import te0.w;
import ue0.e;
import vtc.t;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/linked_wallets_learn_more/LinkedWalletsLearnMoreScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Lcli/k;", "<init>", "()V", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LinkedWalletsLearnMoreScreen extends BaseBottomSheetRecyclerController<q, k> {
    public static final /* synthetic */ int U = 0;
    public final LargeActionButtonDelegate Q = new LargeActionButtonDelegate();
    public final Object R;
    public final Object S;
    public final Object T;

    public LinkedWalletsLearnMoreScreen() {
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: zuc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LinkedWalletsLearnMoreScreen f325438b;

            {
                this.f325438b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                LinkedWalletsLearnMoreScreen linkedWalletsLearnMoreScreen = this.f325438b;
                switch (i2) {
                    case 0:
                        int i3 = LinkedWalletsLearnMoreScreen.U;
                        return v.k(new RowDelegate(null, null, 7), linkedWalletsLearnMoreScreen.Q);
                    case 1:
                        int i5 = LinkedWalletsLearnMoreScreen.U;
                        return (b) ((vtc.k) linkedWalletsLearnMoreScreen.T.getValue()).f291998a.get();
                    default:
                        int i6 = LinkedWalletsLearnMoreScreen.U;
                        phm.a aVar = (phm.a) e.j(linkedWalletsLearnMoreScreen.m2()).a().get(t.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", t.class, " is not found"));
                        }
                        t tVar = ((t) aVar2.b()).M;
                        vtc.k kVar = new vtc.k();
                        kVar.f291998a = e4m.b.b(new vk6.a(5));
                        return kVar;
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: zuc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LinkedWalletsLearnMoreScreen f325438b;

            {
                this.f325438b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                LinkedWalletsLearnMoreScreen linkedWalletsLearnMoreScreen = this.f325438b;
                switch (i22) {
                    case 0:
                        int i3 = LinkedWalletsLearnMoreScreen.U;
                        return v.k(new RowDelegate(null, null, 7), linkedWalletsLearnMoreScreen.Q);
                    case 1:
                        int i5 = LinkedWalletsLearnMoreScreen.U;
                        return (b) ((vtc.k) linkedWalletsLearnMoreScreen.T.getValue()).f291998a.get();
                    default:
                        int i6 = LinkedWalletsLearnMoreScreen.U;
                        phm.a aVar = (phm.a) e.j(linkedWalletsLearnMoreScreen.m2()).a().get(t.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", t.class, " is not found"));
                        }
                        t tVar = ((t) aVar2.b()).M;
                        vtc.k kVar = new vtc.k();
                        kVar.f291998a = e4m.b.b(new vk6.a(5));
                        return kVar;
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: zuc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LinkedWalletsLearnMoreScreen f325438b;

            {
                this.f325438b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                LinkedWalletsLearnMoreScreen linkedWalletsLearnMoreScreen = this.f325438b;
                switch (i22) {
                    case 0:
                        int i32 = LinkedWalletsLearnMoreScreen.U;
                        return v.k(new RowDelegate(null, null, 7), linkedWalletsLearnMoreScreen.Q);
                    case 1:
                        int i5 = LinkedWalletsLearnMoreScreen.U;
                        return (b) ((vtc.k) linkedWalletsLearnMoreScreen.T.getValue()).f291998a.get();
                    default:
                        int i6 = LinkedWalletsLearnMoreScreen.U;
                        phm.a aVar = (phm.a) e.j(linkedWalletsLearnMoreScreen.m2()).a().get(t.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", t.class, " is not found"));
                        }
                        t tVar = ((t) aVar2.b()).M;
                        vtc.k kVar = new vtc.k();
                        kVar.f291998a = e4m.b.b(new vk6.a(5));
                        return kVar;
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (vtc.k) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (zuc.b) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e3(), new zub.b(this, null, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (zuc.b) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3 */
    public final List getS() {
        return (List) this.R.getValue();
    }
}
