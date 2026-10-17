package com.revolut.feature_crypto_order_flow.impl.order_summary.account_balance_limit;

import aii.r;
import android.view.View;
import com.revolut.feature_crypto_order_flow.api.navigation.AccountBalanceLimitBottomSheetControllerProvider$InputData;
import com.revolut.feature_crypto_order_flow.impl.order_summary.account_balance_limit.AccountBalanceLimitBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import krc.h;
import kzh.b;
import te0.w;
import tyh.a;
import wp5.y;
import xki.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_crypto_order_flow/impl/order_summary/account_balance_limit/AccountBalanceLimitBottomSheetController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/r;", "Lkzh/b;", "feature_crypto_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AccountBalanceLimitBottomSheetController extends BaseBottomSheetRecyclerController<r, b> {
    public static final /* synthetic */ int U = 0;
    public final AccountBalanceLimitBottomSheetControllerProvider$InputData Q;
    public final Object R;
    public final Object S;
    public final List T;

    public AccountBalanceLimitBottomSheetController(AccountBalanceLimitBottomSheetControllerProvider$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: kzh.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountBalanceLimitBottomSheetController f191117b;

            {
                this.f191117b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AccountBalanceLimitBottomSheetController accountBalanceLimitBottomSheetController = this.f191117b;
                switch (i2) {
                    case 0:
                        int i3 = AccountBalanceLimitBottomSheetController.U;
                        phm.a aVar = (phm.a) ue0.e.j(accountBalanceLimitBottomSheetController.m2()).a().get(tyh.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", tyh.b.class, " is not found"));
                        }
                        tyh.b bVar = ((tyh.b) aVar2.b()).N;
                        AccountBalanceLimitBottomSheetControllerProvider$InputData accountBalanceLimitBottomSheetControllerProvider$InputData = accountBalanceLimitBottomSheetController.Q;
                        accountBalanceLimitBottomSheetControllerProvider$InputData.getClass();
                        return new tyh.a(bVar, accountBalanceLimitBottomSheetControllerProvider$InputData);
                    default:
                        int i5 = AccountBalanceLimitBottomSheetController.U;
                        return (a) ((tyh.a) accountBalanceLimitBottomSheetController.R.getValue()).f275585b.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: kzh.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountBalanceLimitBottomSheetController f191117b;

            {
                this.f191117b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AccountBalanceLimitBottomSheetController accountBalanceLimitBottomSheetController = this.f191117b;
                switch (i22) {
                    case 0:
                        int i3 = AccountBalanceLimitBottomSheetController.U;
                        phm.a aVar = (phm.a) ue0.e.j(accountBalanceLimitBottomSheetController.m2()).a().get(tyh.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", tyh.b.class, " is not found"));
                        }
                        tyh.b bVar = ((tyh.b) aVar2.b()).N;
                        AccountBalanceLimitBottomSheetControllerProvider$InputData accountBalanceLimitBottomSheetControllerProvider$InputData = accountBalanceLimitBottomSheetController.Q;
                        accountBalanceLimitBottomSheetControllerProvider$InputData.getClass();
                        return new tyh.a(bVar, accountBalanceLimitBottomSheetControllerProvider$InputData);
                    default:
                        int i5 = AccountBalanceLimitBottomSheetController.U;
                        return (a) ((tyh.a) accountBalanceLimitBottomSheetController.R.getValue()).f275585b.get();
                }
            }
        });
        this.T = y.w();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (a) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (kzh.a) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, e3(), new ko2.b(this, continuation, 12), 3);
        ViewController.P2(this, h3(), new h(this, continuation, 23), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (kzh.a) this.S.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getT() {
        return this.T;
    }
}
