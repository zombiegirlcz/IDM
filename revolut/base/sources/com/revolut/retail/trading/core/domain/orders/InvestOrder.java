package com.revolut.retail.trading.core.domain.orders;

import android.os.Parcelable;
import bfl.g;
import cfl.j;
import dfl.o0;
import dfl.q;
import dj0.d;
import java.math.BigDecimal;
import java.time.Instant;
import k4l.e;
import k4l.q0;
import k4l.r0;
import kotlin.Metadata;
import kotlin.Pair;
import nel.z;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0006\u0004\u0005\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/trading/core/domain/orders/InvestOrder;", "Landroid/os/Parcelable;", "k4l/d", "InvestSecuritiesOrder", "Lcom/revolut/retail/trading/core/domain/orders/InvestCommodityOrder;", "Lcom/revolut/retail/trading/core/domain/orders/InvestFundOrder;", "Lcom/revolut/retail/trading/core/domain/orders/InvestMarginOrder;", "Lcom/revolut/retail/trading/core/domain/orders/InvestMutualFundOrder;", "Lcom/revolut/retail/trading/core/domain/orders/InvestOptionOrder;", "Lcom/revolut/retail/trading/core/domain/orders/InvestOrder$InvestSecuritiesOrder;", "trading_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InvestOrder extends Parcelable {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/trading/core/domain/orders/InvestOrder$InvestSecuritiesOrder;", "Lcom/revolut/retail/trading/core/domain/orders/InvestOrder;", "Lcom/revolut/retail/trading/core/domain/orders/InvestStockOrder;", "Lcom/revolut/retail/trading/core/domain/orders/InvestTaaOrder;", "trading_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface InvestSecuritiesOrder extends InvestOrder {
        d B1();

        sel.a L();

        String O1();

        d O4();

        Instant Q();

        q0 T2();

        d W1();

        e X();

        Instant Z7();

        String g();

        Instant g7();

        TradingAutoTopUp getAutoTopUp();

        String getSymbol();

        q getValue();

        Instant j0();

        BigDecimal j1();

        d k4();

        d q4();

        d r2();

        BigDecimal s3();
    }

    o0 K1();

    g K7();

    Instant M2();

    Instant O3();

    k4l.d T0();

    z a3();

    j b8();

    Pair c1();

    Instant getCreatedAt();

    String getId();

    k4l.o0 getState();

    String k5();

    r0 t();

    Boolean u3();
}
