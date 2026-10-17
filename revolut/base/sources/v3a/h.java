package v3a;

import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId;
import com.revolut.feature.payments.who_to_transfer.api.navigation.RecipientSelectionFeatureConfig;
import com.revolut.feature.payments.who_to_transfer.api.navigation.RecipientSelectionInputData;
import com.revolut.feature.payments.who_to_transfer.api.navigation.RecipientSelectionType;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import efm.d0;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import q06.j;
import q06.k;
import sri.m;
import ufm.i;
import uyh.k0;
import v20.t;
import wp5.y;
import xx9.p;
import zhm.h0;
import zm3.l;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements jf0.d, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f285872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y8k.b f285873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x2k.e f285874c;
    public final m d;

    public h(p recentRecipientInteractor, y8k.b peerToPeerFeatureConfigProvider, x2k.e bankTransferNaviProvider, m navigator) {
        Intrinsics.checkNotNullParameter(recentRecipientInteractor, "recentRecipientInteractor");
        Intrinsics.checkNotNullParameter(peerToPeerFeatureConfigProvider, "peerToPeerFeatureConfigProvider");
        Intrinsics.checkNotNullParameter(bankTransferNaviProvider, "bankTransferNaviProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f285872a = recentRecipientInteractor;
        this.f285873b = peerToPeerFeatureConfigProvider;
        this.f285874c = bankTransferNaviProvider;
        this.d = navigator;
    }

    public static MainScreenFeatureConfig.WithInnerConfiguration b() {
        RecipientSelectionInputData recipientSelectionInputData = new RecipientSelectionInputData(null, true, true, com.revolut.feature.payments.who_to_transfer.api.common.a.f80009a, null, null, new RecipientSelectionType.Transfer(TransferFlowType.Default.f92257b, com.revolut.feature.payments.who_to_transfer.api.navigation.a.SEND, new TransferMoneyPocket(null, null, 3), null), null, 177);
        s49.a aVar = s49.a.SINGLE_TOP;
        MainContainerNavigationId.MainContainerScreenId mainContainerScreenId = t49.a.f267950b;
        m70.a.c(t0.f186434a);
        return new MainScreenFeatureConfig.WithInnerConfiguration(aVar, new MainContainerInnerConfiguration(mainContainerScreenId, null, gc0.c.f(new RecipientSelectionFeatureConfig("", recipientSelectionInputData)), 2));
    }

    public static e d(jf0.c cVar) {
        String strE = cVar.e(2);
        if (Intrinsics.f(strE, "p2p")) {
            return e.INTERNAL_P2P;
        }
        if (Intrinsics.f(strE, "bank")) {
            return e.EXTERNAL_BENEFICIARY;
        }
        throw new IllegalArgumentException(a0.d.s("Can't parse ", cVar.f173627a, " ; unknown type ", strE));
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "send-transfer") || Intrinsics.f(cVar.e(1), "send-payment");
    }

    public final d0 c(List list, e eVar, Long l2, String str) {
        xi0.b bVarA;
        xi0.b bVarA2;
        int i = f.f285869a[eVar.ordinal()];
        if (i == 1) {
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                jq9.k kVar = (jq9.k) it8.next();
                if (kVar instanceof jq9.p) {
                    zm3.a aVar = ((jq9.p) kVar).f177514b;
                    if (aVar instanceof l) {
                        if (str == null || str.length() == 0) {
                            xi0.b.Companion.getClass();
                            bVarA = xi0.b.f306273h;
                        } else {
                            xi0.b.Companion.getClass();
                            bVarA = xi0.a.a(str);
                        }
                        return new i(q8k.g.b(this.f285873b, aVar, null, TransferFlowType.Default.f92257b, new TransferMoneyPocket(new dj0.d(l2 != null ? l2.longValue() : 0L, bVarA), null, 2), null, null, null, 242), new t(new v2g.i(3), 24), 1);
                    }
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        for (Object obj2 : list) {
            if (((jq9.k) obj2) instanceof jq9.m) {
                Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.payments.core.models.PaymentRecentRecipientBeneficiary");
                f5j.a aVar2 = ((jq9.m) obj2).f177508b;
                String str2 = aVar2.f132337n;
                if (str2 == null || str2.length() == 0) {
                    xi0.b.Companion.getClass();
                    bVarA2 = xi0.b.f306273h;
                } else {
                    xi0.b.Companion.getClass();
                    bVarA2 = xi0.a.a(str2);
                }
                ufm.b bVarM = d0.m(d2k.g.a(this.f285874c, aVar2, null, null, new TransferMoneyPocket(new dj0.d(l2 != null ? l2.longValue() : 0L, bVarA2), null, 2), null, null, null, null, 1014));
                Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                return bVarM;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        if (Intrinsics.f(cVar.e(1), "send-payment")) {
            return new q06.h(new BridgeDestination(gc0.c.f(b())), null);
        }
        Object objG = g(cVar, (gim.c) continuation);
        return objG == fim.a.COROUTINE_SUSPENDED ? objG : (j) objG;
    }

    @Override // jf0.d
    public final d0 f(jf0.c cVar, boolean z) {
        if (y.D(cVar, "deeplink", 1, "send-payment")) {
            i iVar = new i(new ufm.f(new ufm.c(new a68.f(this, 18), 2), new t(new d(this, 0), 25), 3), new t(new v2g.i(4), 26), 1);
            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
            return ue0.e.I(iVar, h0.f322473a, new v2g.i(5));
        }
        i iVar2 = new i(new ufm.f(new i(new ufm.c(new fg8.b(this, cVar, 6), 2), new t(new k0(this, cVar, 16), 27), 0), new t(new d(this, 1), 21), 3), new t(new v2g.i(1), 22), 1);
        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
        return ue0.e.I(iVar2, h0.f322473a, new v2g.i(2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0094, code lost:
    
        if (r10 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(jf0.c r9, gim.c r10) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v3a.h.g(jf0.c, gim.c):java.lang.Object");
    }
}
