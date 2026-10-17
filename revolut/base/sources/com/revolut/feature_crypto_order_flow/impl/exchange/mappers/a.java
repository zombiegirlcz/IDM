package com.revolut.feature_crypto_order_flow.impl.exchange.mappers;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.tracking.v3.RatesSourceContext;
import dj0.d;
import grl.g0;
import java.math.BigInteger;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kyh.f;
import l2i.b;
import org.jetbrains.annotations.NotNull;
import q0i.c;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    @NotNull
    public static final bzh.a Companion = new bzh.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f96762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w0 f96763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f96764c;

    public a(b cryptoExchangeInputAmountMapper, fzh.a revPointsAmountFormatter) {
        Intrinsics.checkNotNullParameter(cryptoExchangeInputAmountMapper, "cryptoExchangeInputAmountMapper");
        Intrinsics.checkNotNullParameter(revPointsAmountFormatter, "revPointsAmountFormatter");
        this.f96762a = cryptoExchangeInputAmountMapper;
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        RatesSourceContext.a aVarNewBuilder = RatesSourceContext.newBuilder();
        aVarNewBuilder.h(g0.CRYPTO);
        w0 w0VarA = aVarNewBuilder.a();
        companion.getClass();
        this.f96763b = AnalyticsContext.Companion.a(w0VarA);
        this.f96764c = v.k(f.FAILED_CRYPTO_LOWER_LIMIT, f.EXCEEDED_CRYPTO_LIMIT, f.EXCEEDED_BALANCE, f.AMOUNT_TOO_SMALL, f.AED_BALANCE_LIMIT_EXCEEDED);
    }

    public static boolean b(c cVar) {
        if (cVar instanceof q0i.b) {
            return ((q0i.b) cVar).f241280a > 0;
        }
        if (cVar instanceof q0i.a) {
            return ((q0i.a) cVar).f241279a.compareTo(BigInteger.ZERO) > 0;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static d c(com.revolut.feature_crypto_order_flow.api.exchange.a aVar) {
        c cVar = aVar.f96707b;
        xi0.b bVar = aVar.f96706a;
        d dVarC = cVar != null ? xam.a.C(cVar, bVar) : new d(0L, bVar);
        long j2 = dVarC.f115082a;
        return d.c(dVarC, j2 >= 0 ? j2 : 0L, null, 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00da A[PHI: r18
      0x00da: PHI (r18v1 kyh.g) = (r18v3 kyh.g), (r18v4 kyh.g) binds: [B:53:0x00d8, B:47:0x00ca] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit.delegates.CenteredAmountDelegate.Model a(kyh.b r43) {
        /*
            Method dump skipped, instruction units count: 1097
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature_crypto_order_flow.impl.exchange.mappers.a.a(kyh.b):com.revolut.core.ui_kit.delegates.CenteredAmountDelegate$Model");
    }
}
