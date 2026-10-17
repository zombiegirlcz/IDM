package twb;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.views.navbar.WallpaperAssetSwitcher;
import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.crypto.withdraw.impl.ui.withdrawtoaddress.flow.CryptoWithdrawToAddressContract$FundingSourceInput;
import com.revolut.feature.payments.transfers.personalisation.models.P2pPersonalisation;
import com.revolut.feature.rev_points.giftcards.api.model.UserVoucherDetails;
import com.revolut.feature.tax_residency.api.stamp_duty.models.StampDutyAccount;
import com.revolut.feature.transfer.core.models.FundingSource;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.trustdockekyc.core.backend.domain.model.AppError;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import lhi.i0;
import ukm.j0;
import vkm.t0;

/* JADX INFO: loaded from: classes6.dex */
public final class b0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f274970w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f274971x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f274972y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b0(com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow.f fVar, String str, Continuation continuation, Function1 function1) {
        super(2, continuation);
        this.u = 5;
        this.f274970w = fVar;
        this.f274971x = str;
        this.f274972y = (gim.i) function1;
    }

    private final Object b(Object obj2) {
        StampDutyAccount stampDutyAccount = (StampDutyAccount) this.f274972y;
        jf0.c cVar = (jf0.c) this.f274970w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            HashMap map = cVar.d;
            HashMap map2 = cVar.d;
            String id10 = (String) map.get("walletId");
            dne.a aVar2 = null;
            if (id10 != null) {
                Intrinsics.checkNotNullParameter(id10, "id");
            } else {
                id10 = null;
            }
            if (id10 == null) {
                IllegalStateException illegalStateException = new IllegalStateException("No wallet specified in deeplink uri=" + cVar.f173629c + ", parameters=" + map2);
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                return dne.b.f116290a;
            }
            String str = (String) map2.get("amount");
            Long lN = str != null ? kotlin.text.z.n(str) : null;
            Object obj3 = map2.get("currency");
            if (lN != null && obj3 != null) {
                long jLongValue = lN.longValue();
                xi0.b.Companion.getClass();
                aVar2 = new dne.a(stampDutyAccount, new dj0.d(jLongValue, xi0.a.a((String) obj3)));
            }
            if (aVar2 != null) {
                return aVar2;
            }
            cne.a aVar3 = ((uoe.c) this.f274971x).f281643b;
            this.v = 1;
            obj2 = ((yoe.c) aVar3).a(stampDutyAccount, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return (dne.c) obj2;
    }

    private final Object c(Object obj2) {
        od0.h hVar;
        Exception e;
        FundingSource fundingSource;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        try {
            if (i == 0) {
                yhm.o.b(obj2);
                od0.h hVar2 = od0.i.Companion;
                up5.a0 a0Var = (up5.a0) this.f274971x;
                CryptoWithdrawToAddressContract$FundingSourceInput cryptoWithdrawToAddressContract$FundingSourceInput = (CryptoWithdrawToAddressContract$FundingSourceInput) this.f274972y;
                try {
                    opf.z zVar = a0Var.o;
                    k1j.a aVar2 = cryptoWithdrawToAddressContract$FundingSourceInput.f71172a;
                    AccountId accountId = cryptoWithdrawToAddressContract$FundingSourceInput.f71173b;
                    String str = cryptoWithdrawToAddressContract$FundingSourceInput.f71174c;
                    this.f274970w = hVar2;
                    this.v = 1;
                    Object objD = zVar.d(accountId, this, str, aVar2);
                    if (objD == aVar) {
                        return aVar;
                    }
                    hVar = hVar2;
                    obj2 = objD;
                } catch (Exception e2) {
                    hVar = hVar2;
                    e = e2;
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                    fundingSource = null;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hVar = (od0.h) this.f274970w;
                try {
                    yhm.o.b(obj2);
                } catch (Exception e4) {
                    e = e4;
                    zhm.h0 h0Var2 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e, h0Var2);
                    fundingSource = null;
                }
            }
            fundingSource = (FundingSource) obj2;
            hVar.getClass();
            return od0.h.a(fundingSource);
        } catch (CancellationException e5) {
            throw e5;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        if (r0.emit(r7, r6) == r1) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object n(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f274971x
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r6.v
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L25
            if (r2 == r4) goto L1d
            if (r2 != r3) goto L15
            yhm.o.b(r7)
            goto L54
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            java.lang.Object r0 = r6.f274970w
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            yhm.o.b(r7)
            goto L41
        L25:
            yhm.o.b(r7)
            java.lang.Object r7 = r6.f274972y
            upd.p r7 = (upd.p) r7
            ang.f r7 = r7.f281983a
            zmg.d r7 = r7.d
            efm.k r7 = r7.c()
            r6.f274971x = r5
            r6.f274970w = r0
            r6.v = r4
            java.lang.Object r7 = nim.a.h(r7, r6)
            if (r7 != r1) goto L41
            goto L53
        L41:
            r2 = 0
            r4 = 3
            com.revolut.data.model.Data r7 = zi0.c.P(r7, r2, r5, r4)
            r6.f274971x = r5
            r6.f274970w = r5
            r6.v = r3
            java.lang.Object r7 = r0.emit(r7, r6)
            if (r7 != r1) goto L54
        L53:
            return r1
        L54:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: twb.b0.n(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [gim.i, kotlin.jvm.functions.Function3] */
    /* JADX WARN: Type inference failed for: r1v4, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b0((com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcarddetails.a) this.f274970w, (UserVoucherDetails) this.f274971x, (kwb.b) this.f274972y, continuation, 0);
            case 1:
                return new b0((WallpaperAssetSwitcher) this.f274970w, (Drawable) this.f274971x, (NavBarWithContainerBackground) this.f274972y, continuation, 1);
            case 2:
                b0 b0Var = new b0((u12.c) this.f274972y, continuation, 2);
                b0Var.f274971x = obj2;
                return b0Var;
            case 3:
                return new b0((u1m.o) this.f274970w, (Context) this.f274971x, (AppError) this.f274972y, continuation, 3);
            case 4:
                b0 b0Var2 = new b0((u2a.g) this.f274971x, (P2pPersonalisation) this.f274972y, continuation, 4);
                b0Var2.f274970w = obj2;
                return b0Var2;
            case 5:
                return new b0((com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow.f) this.f274970w, (String) this.f274971x, continuation, (Function1) this.f274972y);
            case 6:
                return new b0((qk.d) this.f274970w, (u6k.c) this.f274971x, (MoneyRequest) this.f274972y, continuation, 6);
            case 7:
                b0 b0Var3 = new b0((u8e.a) this.f274971x, (String) this.f274972y, continuation, 7);
                b0Var3.f274970w = obj2;
                return b0Var3;
            case 8:
                return new b0((dj0.d) this.f274970w, (ua5.e) this.f274971x, (String) this.f274972y, continuation, 8);
            case 9:
                b0 b0Var4 = new b0((ubd.i) this.f274972y, continuation, 9);
                b0Var4.f274971x = obj2;
                return b0Var4;
            case 10:
                return new b0((ubj.h) this.f274970w, (String) this.f274971x, (String) this.f274972y, continuation, 10);
            case 11:
                b0 b0Var5 = new b0((uck.f) this.f274971x, (List) this.f274972y, continuation, 11);
                b0Var5.f274970w = obj2;
                return b0Var5;
            case 12:
                return new b0((udk.z) this.f274970w, (xck.u) this.f274971x, (skm.r) this.f274972y, continuation, 12);
            case 13:
                b0 b0Var6 = new b0((Function3) this.f274971x, (ve7.k) this.f274972y, continuation);
                b0Var6.f274970w = obj2;
                return b0Var6;
            case 14:
                b0 b0Var7 = new b0((uec.e) this.f274971x, (Address) this.f274972y, continuation, 14);
                b0Var7.f274970w = obj2;
                return b0Var7;
            case 15:
                b0 b0Var8 = new b0((t38.e) this.f274971x, continuation, (String) this.f274972y);
                b0Var8.f274970w = obj2;
                return b0Var8;
            case 16:
                b0 b0Var9 = new b0((uh2.g) this.f274972y, continuation, 16);
                b0Var9.f274971x = obj2;
                return b0Var9;
            case 17:
                return new b0((com.revolut.retail.feature.esim.impl.ui.screens.gift_recipient_selection.a) this.f274970w, (EsimGiftRecipient) this.f274971x, (String) this.f274972y, continuation, 17);
            case 18:
                b0 b0Var10 = new b0((uk2.p) this.f274971x, (uk2.v) this.f274972y, continuation, 18);
                b0Var10.f274970w = obj2;
                return b0Var10;
            case 19:
                return new b0((ukm.d) this.f274970w, this.f274971x, (flm.i) this.f274972y, continuation, 19);
            case 20:
                b0 b0Var11 = new b0((j0) this.f274971x, this.f274972y, continuation, 20);
                b0Var11.f274970w = obj2;
                return b0Var11;
            case 21:
                b0 b0Var12 = new b0((t0) this.f274971x, (Function1) this.f274972y, continuation, 21);
                b0Var12.f274970w = obj2;
                return b0Var12;
            case 22:
                b0 b0Var13 = new b0((List) this.f274971x, (ulf.b) this.f274972y, continuation, 22);
                b0Var13.f274970w = obj2;
                return b0Var13;
            case 23:
                return new b0((un8.h) this.f274970w, (String) this.f274971x, (in8.d) this.f274972y, continuation, 23);
            case 24:
                return new b0((jf0.c) this.f274970w, (uoe.c) this.f274971x, (StampDutyAccount) this.f274972y, continuation, 24);
            case 25:
                return new b0((up5.a0) this.f274971x, (CryptoWithdrawToAddressContract$FundingSourceInput) this.f274972y, continuation, 25);
            case 26:
                return new b0((up5.a0) this.f274970w, (xi0.b) this.f274971x, (CryptoAddress) this.f274972y, continuation, 26);
            case 27:
                return new b0((f88.f) this.f274971x, (upc.a) this.f274972y, continuation, 27);
            case 28:
                b0 b0Var14 = new b0((upd.p) this.f274972y, continuation, 28);
                b0Var14.f274971x = obj2;
                return b0Var14;
            default:
                return new b0((i0) this.f274970w, (String) this.f274971x, (String) this.f274972y, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((b0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((b0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((b0) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((b0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((b0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((b0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((b0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((b0) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((b0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((b0) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((b0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((b0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((b0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((b0) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((b0) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((b0) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((b0) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((b0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((b0) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((b0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((b0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((b0) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((b0) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((b0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((b0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((b0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((b0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((b0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((b0) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((b0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:591:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:602:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:609:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v57, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r0v58, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v64, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v76, types: [gim.i, kotlin.jvm.functions.Function3] */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [pck.j] */
    /* JADX WARN: Type inference failed for: r9v7, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 2540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: twb.b0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f274970w = obj2;
        this.f274971x = obj3;
        this.f274972y = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f274971x = obj2;
        this.f274972y = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f274972y = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b0(Function3 function3, ve7.k kVar, Continuation continuation) {
        super(2, continuation);
        this.u = 13;
        this.f274971x = (gim.i) function3;
        this.f274972y = kVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(t38.e eVar, Continuation continuation, String str) {
        super(2, continuation);
        this.u = 15;
        this.f274971x = eVar;
        this.f274972y = str;
    }
}
