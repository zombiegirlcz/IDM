package k61;

import com.revolut.data.network.models.transfer.CurrencyExchangeFromRequestDto;
import com.revolut.data.network.models.transfer.CurrencyExchangeToRequestDto;
import efm.d0;
import i31.l;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xhf.d1;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f181602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f181603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f181604c;
    public final /* synthetic */ xi0.b d;
    public final /* synthetic */ xi0.b e;
    public final /* synthetic */ long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f181605g;

    public /* synthetic */ f(i iVar, long j2, xi0.b bVar, xi0.b bVar2, long j3, String str, int i) {
        this.f181602a = i;
        this.f181603b = iVar;
        this.f181604c = j2;
        this.d = bVar;
        this.e = bVar2;
        this.f = j3;
        this.f181605g = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f181602a) {
            case 0:
                String walletId = (String) obj2;
                Intrinsics.checkNotNullParameter(walletId, "walletId");
                i iVar = this.f181603b;
                l lVar = (l) iVar.f181611a;
                xi0.b fromCcy = this.d;
                Intrinsics.checkNotNullParameter(fromCcy, "fromCcy");
                xi0.b toCcy = this.e;
                Intrinsics.checkNotNullParameter(toCcy, "toCcy");
                Intrinsics.checkNotNullParameter(walletId, "walletId");
                d0<List<d1>> d0VarExchangeCurrencyFrom = lVar.f158085b.exchangeCurrencyFrom(new CurrencyExchangeFromRequestDto(fromCcy.f306286a, this.f181604c, toCcy.f306286a, this.f, null, this.f181605g), lVar.f.b("payments_exchange"));
                i2i.a aVar = new i2i.a(29, new i31.d(fromCcy, toCcy, walletId, 1));
                d0VarExchangeCurrencyFrom.getClass();
                ufm.i iVar2 = new ufm.i(d0VarExchangeCurrencyFrom, aVar, 1);
                Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                return new ufm.i(w.i0(iVar2), new k3k.l(new c(iVar, 2), 26), 0);
            default:
                String walletId2 = (String) obj2;
                Intrinsics.checkNotNullParameter(walletId2, "walletId");
                i iVar3 = this.f181603b;
                l lVar2 = (l) iVar3.f181611a;
                xi0.b fromCcy2 = this.d;
                Intrinsics.checkNotNullParameter(fromCcy2, "fromCcy");
                xi0.b toCcy2 = this.e;
                Intrinsics.checkNotNullParameter(toCcy2, "toCcy");
                Intrinsics.checkNotNullParameter(walletId2, "walletId");
                d0<List<d1>> d0VarExchangeCurrencyTo = lVar2.f158085b.exchangeCurrencyTo(new CurrencyExchangeToRequestDto(fromCcy2.f306286a, toCcy2.f306286a, this.f181604c, this.f, null, this.f181605g), lVar2.f.b("payments_exchange"));
                i31.e eVar = new i31.e(0, new i31.d(fromCcy2, toCcy2, walletId2, 0));
                d0VarExchangeCurrencyTo.getClass();
                ufm.i iVar4 = new ufm.i(d0VarExchangeCurrencyTo, eVar, 1);
                Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                return new ufm.i(w.i0(iVar4), new k3k.l(new c(iVar3, 1), 25), 0);
        }
    }
}
