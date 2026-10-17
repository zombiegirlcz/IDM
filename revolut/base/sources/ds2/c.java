package ds2;

import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.ContentUser;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.details.BlockedMerchantDetailsScreen;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.details.BlockedMerchantDetailsScreenContract$InputData;
import ip0.um0;
import ip0.x10;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import yji.l;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ BlockedMerchantDetailsScreen f117177w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(BlockedMerchantDetailsScreen blockedMerchantDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f117177w = blockedMerchantDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f117177w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            case 1:
                c cVar2 = new c(this.f117177w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
            default:
                c cVar3 = new c(this.f117177w, continuation, 2);
                cVar3.v = obj2;
                return cVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((c) create((um0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        BlockedMerchantDetailsScreen blockedMerchantDetailsScreen = this.f117177w;
        switch (i) {
            case 0:
                x10 clickData = (x10) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                g gVarG3 = blockedMerchantDetailsScreen.T2();
                Intrinsics.h(clickData);
                i iVar = (i) gVarG3;
                iVar.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                if (Intrinsics.f(clickData.f167082b.f58316a, "LIST_ID_UNBLOCK_WIDGET")) {
                    oce.h hVar = iVar.u;
                    BlockedMerchantDetailsScreenContract$InputData blockedMerchantDetailsScreenContract$InputData = iVar.f117181p;
                    kr2.e eVar = blockedMerchantDetailsScreenContract$InputData.f64250b;
                    String str = eVar.f188643a;
                    String str2 = eVar.f188645c;
                    ContentUser contentUser = blockedMerchantDetailsScreenContract$InputData.f64249a;
                    ContentUser.Junior junior = contentUser instanceof ContentUser.Junior ? (ContentUser.Junior) contentUser : null;
                    iVar.v = l.a1(iVar, rd0.e.b(oce.h.c(hVar, str, str2, null, junior != null ? junior.f64236c : null, 12)), null, null, new dlk.k(iVar, (Continuation) null, 19), 3);
                }
                break;
            case 1:
                um0 model = (um0) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                g gVarG32 = blockedMerchantDetailsScreen.T2();
                Intrinsics.h(model);
                i iVar2 = (i) gVarG32;
                iVar2.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                if (Intrinsics.f(model.f166695a, "unblock_merchant_dialog_action")) {
                    j60.a.v(iVar2.f117183r, false, null, 3);
                }
                break;
            default:
                um0 model2 = (um0) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                g gVarG33 = blockedMerchantDetailsScreen.T2();
                Intrinsics.h(model2);
                i iVar3 = (i) gVarG33;
                iVar3.getClass();
                Intrinsics.checkNotNullParameter(model2, "model");
                if (Intrinsics.f(model2.f166695a, "unblock_merchant_dialog_action")) {
                    iVar3.l2(new cq6.k(iVar3, null, 29), new yi5.b(26));
                    j60.a.v(iVar3.f117183r, false, null, 3);
                }
                break;
        }
        return Unit.f186387a;
    }
}
