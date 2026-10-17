package m36;

import c36.c;
import com.revolut.feature.defi.common.models.domain.DeFiAssetAmount;
import com.revolut.feature.defi.common.models.domain.DeFiFee;
import com.revolut.feature.defi.common.models.domain.DeFiFiatAmount;
import com.revolut.feature.defi.common.models.dto.TokenAmountDto;
import com.revolut.feature.defi.exchange.impl.domain.model.DeFiSwapQuote;
import com.revolut.feature.defi.exchange.impl.domain.model.DeFiSwapRate;
import com.revolut.feature.defi.exchange.impl.domain.model.DeFiSwapSource;
import com.revolut.feature.defi.exchange.impl.domain.model.DeFiSwapSourceAmount;
import hx7.e;
import i26.l;
import java.math.BigDecimal;
import java.time.Instant;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import n36.a0;
import n36.b0;
import n36.q;
import n36.t;
import n36.w;
import n36.x;
import n36.z;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final DeFiSwapQuote a(x xVar) {
        DeFiSwapSourceAmount deFiSwapSourceAmount;
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        String str = xVar.f211906a;
        t tVar = xVar.f211909g;
        w wVar = xVar.f211907b;
        DeFiSwapSource deFiSwapSourceB = b(wVar.f211904a);
        TokenAmountDto tokenAmountDto = wVar.f211905b;
        DeFiSwapSourceAmount deFiSwapSourceAmount2 = new DeFiSwapSourceAmount(deFiSwapSourceB, tokenAmountDto.f71706a, tokenAmountDto.f71707b);
        DeFiFiatAmount deFiFiatAmountU = l.u(xVar.f211908c);
        DeFiAssetAmount deFiAssetAmountS = e.s(xVar.d);
        DeFiFiatAmount deFiFiatAmountU2 = l.u(xVar.e);
        q qVar = xVar.f;
        if (qVar != null) {
            DeFiSwapSource deFiSwapSourceB2 = b(qVar.f211897a);
            TokenAmountDto tokenAmountDto2 = qVar.f211898b;
            deFiSwapSourceAmount = new DeFiSwapSourceAmount(deFiSwapSourceB2, tokenAmountDto2.f71706a, tokenAmountDto2.f71707b);
        } else {
            deFiSwapSourceAmount = null;
        }
        DeFiSwapSource deFiSwapSourceB3 = b(tVar.f211900a);
        c cVar = tVar.f211901b;
        DeFiSwapRate deFiSwapRate = new DeFiSwapRate(deFiSwapSourceB3, cVar.f20897a, cVar.f20898b, new BigDecimal(tVar.f211902c));
        String str2 = xVar.f211910h;
        DeFiFee deFiFeeC0 = hx7.q.c0(xVar.i);
        Instant instantOfEpochMilli = Instant.ofEpochMilli(xVar.f211911j);
        Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
        return new DeFiSwapQuote(str, deFiSwapSourceAmount2, deFiFiatAmountU, deFiAssetAmountS, deFiFiatAmountU2, deFiSwapSourceAmount, deFiSwapRate, str2, deFiFeeC0, instantOfEpochMilli, xVar.k);
    }

    public static final DeFiSwapSource b(b0 b0Var) {
        if (b0Var instanceof z) {
            z zVar = (z) b0Var;
            return new DeFiSwapSource.DeFiAsset(zVar.f211913a, zVar.f211914b);
        }
        if (!(b0Var instanceof a0)) {
            throw new NoWhenBranchMatchedException();
        }
        a0 a0Var = (a0) b0Var;
        return new DeFiSwapSource.Pocket(a0Var.f211877a, a0Var.f211878b);
    }
}
