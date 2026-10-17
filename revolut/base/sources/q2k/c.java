package q2k;

import com.revolut.feature.bank_transfer.models.UltimateDebtor;
import com.revolut.feature.transfer.core.models.DeFiBalanceSource;
import com.revolut.feature.transfer.core.models.FundingSource;
import com.revolut.feature.transfer.core.models.PocketSource;
import com.revolut.feature.transfer.core.models.SavingsAccount;
import com.revolut.feature.transfer.core.models.WealthPortfolio;
import com.revolut.feature.transfer.models.tracking.TransferAppSource;
import d9.t0;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kq2.g;
import kq2.m;
import kq2.o;
import od0.i;
import q03.h;
import ufm.n;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f241722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f241723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FundingSource f241724c;
    public final /* synthetic */ xi0.b d;
    public final /* synthetic */ xi0.b e;
    public final /* synthetic */ long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f241725g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ prf.f f241726h;
    public final /* synthetic */ UltimateDebtor i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m f241727j;
    public final /* synthetic */ TransferAppSource k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ rtf.c f241728l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kq2.c f241729m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ o f241730n;
    public final /* synthetic */ Map o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ g f241731p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f241732q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f241733r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Integer f241734s;

    public /* synthetic */ c(e eVar, String str, FundingSource fundingSource, xi0.b bVar, xi0.b bVar2, long j2, String str2, prf.f fVar, UltimateDebtor ultimateDebtor, m mVar, TransferAppSource transferAppSource, rtf.c cVar, kq2.c cVar2, o oVar, Map map, g gVar, String str3, String str4, Integer num) {
        this.f241722a = eVar;
        this.f241723b = str;
        this.f241724c = fundingSource;
        this.d = bVar;
        this.e = bVar2;
        this.f = j2;
        this.f241725g = str2;
        this.f241726h = fVar;
        this.i = ultimateDebtor;
        this.f241727j = mVar;
        this.k = transferAppSource;
        this.f241728l = cVar;
        this.f241729m = cVar2;
        this.f241730n = oVar;
        this.o = map;
        this.f241731p = gVar;
        this.f241732q = str3;
        this.f241733r = str4;
        this.f241734s = num;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        e eVar;
        n nVarB;
        i optionalHeaderLocation = (i) obj2;
        Intrinsics.checkNotNullParameter(optionalHeaderLocation, "optionalHeaderLocation");
        String str = (String) optionalHeaderLocation.g();
        FundingSource fundingSource = this.f241724c;
        boolean z = fundingSource instanceof PocketSource;
        e eVar2 = this.f241722a;
        String str2 = this.f241723b;
        xi0.b bVar = this.d;
        xi0.b bVar2 = this.e;
        long j2 = this.f;
        String str3 = this.f241725g;
        prf.f fVar = this.f241726h;
        UltimateDebtor ultimateDebtor = this.i;
        m mVar = this.f241727j;
        rtf.c cVar = this.f241728l;
        kq2.c cVar2 = this.f241729m;
        Map map = this.o;
        g gVar = this.f241731p;
        String str4 = this.f241732q;
        Integer num = this.f241734s;
        if (z) {
            String str5 = fundingSource.f92240a;
            f fVar2 = eVar2.f241738b;
            o oVar = this.f241730n;
            int i = oVar == null ? -1 : d.f241736b[oVar.ordinal()];
            t0 bVar3 = i != 1 ? i != 2 ? new c2k.b(str5) : new c2k.a(str5) : new c2k.c(str5);
            eVar = eVar2;
            nVarB = ((l2k.g) fVar2).b(str2, bVar3, bVar, bVar2, j2, str3, fVar, ultimateDebtor, mVar, this.k, cVar, cVar2, num, oVar, map, str, gVar, str4, this.f241733r);
        } else if (fundingSource instanceof WealthPortfolio) {
            f fVar3 = eVar2.f241738b;
            c2k.c cVar3 = new c2k.c(((WealthPortfolio) fundingSource).d);
            eVar = eVar2;
            nVarB = ((l2k.g) fVar3).b(str2, cVar3, bVar, bVar2, j2, str3, fVar, ultimateDebtor, mVar, null, cVar, cVar2, num, o.TRADING_WITHDRAWAL, map, str, gVar, str4, null);
        } else {
            if (!(fundingSource instanceof SavingsAccount)) {
                if (fundingSource instanceof DeFiBalanceSource) {
                    throw new IllegalStateException("DeFi is not supported as a bank transfer funding source");
                }
                throw new NoWhenBranchMatchedException();
            }
            f fVar4 = eVar2.f241738b;
            c2k.d dVar = new c2k.d(((SavingsAccount) fundingSource).e);
            eVar = eVar2;
            nVarB = ((l2k.g) fVar4).b(str2, dVar, bVar, bVar2, j2, str3, fVar, ultimateDebtor, mVar, null, cVar, cVar2, num, o.SAVINGS_WITHDRAWAL, map, str, gVar, str4, null);
        }
        return new ufm.f(nVarB, new q09.c(25, new h(eVar, 15)), 3);
    }
}
