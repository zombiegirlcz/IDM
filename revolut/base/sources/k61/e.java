package k61;

import com.revolut.core.model.account.AccountId;
import com.revolut.data.network.models.transfer.PocketExchangeRequestDto;
import com.revolut.data.network.services.TransferService;
import efm.d0;
import i31.l;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xhf.d1;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f181596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f181597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f181598c;
    public final /* synthetic */ String d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f181599g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Double f181600h;
    public final /* synthetic */ Double i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f181601j;
    public final /* synthetic */ AccountId k;

    public /* synthetic */ e(i iVar, String str, String str2, long j2, long j3, boolean z, Double d, Double d5, String str3, AccountId accountId, int i) {
        this.f181596a = i;
        this.f181597b = iVar;
        this.f181598c = str;
        this.d = str2;
        this.e = j2;
        this.f = j3;
        this.f181599g = z;
        this.f181600h = d;
        this.i = d5;
        this.f181601j = str3;
        this.k = accountId;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f181596a) {
            case 0:
                String walletId = (String) obj2;
                Intrinsics.checkNotNullParameter(walletId, "walletId");
                i iVar = this.f181597b;
                l lVar = (l) iVar.f181611a;
                String pocketIdFrom = this.f181598c;
                Intrinsics.checkNotNullParameter(pocketIdFrom, "pocketIdFrom");
                String pocketIdTo = this.d;
                Intrinsics.checkNotNullParameter(pocketIdTo, "pocketIdTo");
                Intrinsics.checkNotNullParameter(walletId, "walletId");
                TransferService transferService = lVar.f158085b;
                Long lValueOf = Long.valueOf(this.e);
                Double d = this.f181600h;
                String strValueOf = d != null ? String.valueOf(d.doubleValue()) : null;
                Double d5 = this.i;
                d0<List<d1>> d0VarRequestPocketExchange = transferService.requestPocketExchange(new PocketExchangeRequestDto(pocketIdFrom, pocketIdTo, this.f, lValueOf, null, strValueOf, d5 != null ? String.valueOf(d5.doubleValue()) : null, this.f181601j, 16, null), lVar.f.b("payments_exchange"));
                i31.e eVar = new i31.e(3, new i31.h(0, pocketIdFrom, this.f181599g, pocketIdTo, walletId));
                d0VarRequestPocketExchange.getClass();
                ufm.i iVar2 = new ufm.i(d0VarRequestPocketExchange, eVar, 1);
                Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                return new ufm.i(w.i0(iVar2), new k3k.l(new g(iVar, this.k, 0), 28), 0);
            default:
                String walletId2 = (String) obj2;
                Intrinsics.checkNotNullParameter(walletId2, "walletId");
                i iVar3 = this.f181597b;
                l lVar2 = (l) iVar3.f181611a;
                String pocketIdFrom2 = this.f181598c;
                Intrinsics.checkNotNullParameter(pocketIdFrom2, "pocketIdFrom");
                String pocketIdTo2 = this.d;
                Intrinsics.checkNotNullParameter(pocketIdTo2, "pocketIdTo");
                Intrinsics.checkNotNullParameter(walletId2, "walletId");
                TransferService transferService2 = lVar2.f158085b;
                Long lValueOf2 = Long.valueOf(this.e);
                Double d6 = this.f181600h;
                String strValueOf2 = d6 != null ? String.valueOf(d6.doubleValue()) : null;
                Double d10 = this.i;
                d0<List<d1>> d0VarRequestPocketExchange2 = transferService2.requestPocketExchange(new PocketExchangeRequestDto(pocketIdFrom2, pocketIdTo2, this.f, null, lValueOf2, strValueOf2, d10 != null ? String.valueOf(d10.doubleValue()) : null, this.f181601j, 8, null), lVar2.f.b("payments_exchange"));
                i31.e eVar2 = new i31.e(4, new i31.h(1, pocketIdFrom2, this.f181599g, pocketIdTo2, walletId2));
                d0VarRequestPocketExchange2.getClass();
                ufm.i iVar4 = new ufm.i(d0VarRequestPocketExchange2, eVar2, 1);
                Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                return new ufm.i(w.i0(iVar4), new k3k.l(new g(iVar3, this.k, 1), 29), 0);
        }
    }
}
