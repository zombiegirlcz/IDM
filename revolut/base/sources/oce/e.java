package oce;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.recurring_payments.api.data.models.RecurringPaymentWithExtra;
import com.revolut.feature.subscriptionscommon.impl.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k71.q;
import kotlin.jvm.internal.Intrinsics;
import qua.p;
import tof.a3;
import zhm.d0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xua.a f224226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ppg.b f224227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a9e.h f224228c;
    public final hj8.a d;
    public final nhf.a e;

    public e(xua.a recurringPaymentInteractor, ppg.b vaultsInteractor, a9e.h subscriptionsItemMapper, hj8.a juniorProfileInteractor, nhf.a unitedWalletInteractor) {
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(vaultsInteractor, "vaultsInteractor");
        Intrinsics.checkNotNullParameter(subscriptionsItemMapper, "subscriptionsItemMapper");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(unitedWalletInteractor, "unitedWalletInteractor");
        this.f224226a = recurringPaymentInteractor;
        this.f224227b = vaultsInteractor;
        this.f224228c = subscriptionsItemMapper;
        this.d = juniorProfileInteractor;
        this.e = unitedWalletInteractor;
    }

    public static List a(a3 a3Var) {
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("CONFIRM_BLOCK_MERCHANT_LIST_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.subscription_block_merchant_confirmation_sheet_confirm, null, null, 14), false, null, null, a3Var, null, 744);
        yp0.b.r(model, 0, 0, 0, 0, 15);
        LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("CANCEL_BLOCK_MERCHANT_LIST_ID", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.subscription_block_merchant_confirmation_sheet_cancel, null, null, 14), false, null, null, a3Var, null, 744);
        yp0.b.r(model2, 0, R$attr.uikit_dp24, 0, 0, 13);
        return v.k(model, model2);
    }

    public final List b(List list, List list2, a3 a3Var, q qVar) {
        List listP0 = d0.P0(list, new a());
        ArrayList arrayList = new ArrayList(w.t(listP0, 10));
        Iterator it8 = listP0.iterator();
        while (it8.hasNext()) {
            arrayList.add(a9e.h.d(this.f224228c, new RecurringPaymentWithExtra.General((p) it8.next()), list2, qVar, false, false, null, false, null, null, 504));
        }
        yp0.b.k(arrayList, 0, R$attr.uikit_dp24, 0, 0, 29);
        return i2b.a.o(arrayList, a(a3Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final efm.r c(tof.a3 r8) {
        /*
            r7 = this;
            java.lang.String r0 = "transaction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            qua.c r0 = new qua.c
            java.lang.String r1 = r8.f272581b
            r0.<init>(r1)
            xua.a r1 = r7.f224226a
            yua.q r1 = (yua.q) r1
            sfm.b r0 = r1.n(r0)
            pcd.d r1 = pcd.d.f234853b
            ppg.b r2 = r7.f224227b
            ypg.p r2 = (ypg.p) r2
            efm.r r1 = r2.e(r1)
            tof.f5 r2 = r8.y0
            od0.i r3 = od0.i.f224256b
            if (r2 == 0) goto L5f
            java.lang.String r2 = r2.f272749a
            if (r2 == 0) goto L5f
            hj8.a r4 = r7.d
            w4l.h r5 = w4l.h.f294642c
            akg.n r2 = hj8.a.a(r4, r2, r5)
            a07.p r4 = new a07.p
            r5 = 28
            r4.<init>(r2, r5)
            ob2.a r2 = new ob2.a
            r5 = 12
            r2.<init>(r5)
            r5 = 0
            r6 = 1
            jhi.b r2 = mo3.a.g(r4, r5, r2, r6)
            n33.r0 r4 = new n33.r0
            r5 = 15
            r4.<init>(r2, r5)
            kotlin.coroutines.g r2 = kotlin.coroutines.g.f186406a
            efm.r r2 = rd0.e.c(r4, r2)
            if (r2 == 0) goto L5f
            od0.h r4 = od0.i.Companion
            r4.getClass()
            efm.r r2 = ue0.e.E(r2, r3)
            if (r2 == 0) goto L5f
            goto L6d
        L5f:
            od0.h r2 = od0.i.Companion
            r2.getClass()
            efm.r r2 = efm.r.just(r3)
            java.lang.String r3 = "just(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
        L6d:
            nhf.a r3 = r7.e
            njf.j r3 = (njf.j) r3
            efm.r r3 = r3.f()
            efm.r r0 = te0.w.n(r0, r1, r2, r3)
            o54.a r1 = new o54.a
            r2 = 24
            r1.<init>(r8, r7, r2)
            oc8.e r8 = new oc8.e
            r2 = 1
            r8.<init>(r2, r1)
            efm.r r8 = r0.map(r8)
            efm.r r8 = r8.distinctUntilChanged()
            java.lang.String r0 = "distinctUntilChanged(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: oce.e.c(tof.a3):efm.r");
    }
}
