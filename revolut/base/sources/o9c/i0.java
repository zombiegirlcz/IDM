package o9c;

import com.revolut.data.model.Data;
import com.revolut.feature.revolutpay.impl.ui.summary_screen.RevolutPaySummaryScreenContract$InputData;
import com.revolut.feature.revolutpay.shared.ui.summary_screen.mapper.RevPointsEarningItemMapper;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class i0 implements cli.n {

    @NotNull
    public static final h0 Companion = new h0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ydc.a f223196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ydc.c f223197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r9c.d f223198c;
    public final prl.e d;
    public final gec.c e;
    public final r9c.p f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r9c.h f223199g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r9c.n f223200h;
    public final RevolutPaySummaryScreenContract$InputData i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final r9c.e f223201j;

    public i0(r9c.j paymentOptionsMapper, ydc.a orderSummaryMapper, ydc.c paymentSummaryMapper, r9c.d buttonMapper, r9c.f errorMapper, prl.e paymentSectionMapper, gec.c insufficientFundsWidgetMapper, r9c.p analyticsMapper, r9c.h navBarMapper, r9c.n rampOrderSummaryMapper, RevPointsEarningItemMapper revPointsEarningItemMapper, r9c.a accountMapper, RevolutPaySummaryScreenContract$InputData inputData, r9c.e cashbackSectionMapper, gec.a authTransactionContentMapper) {
        Intrinsics.checkNotNullParameter(paymentOptionsMapper, "paymentOptionsMapper");
        Intrinsics.checkNotNullParameter(orderSummaryMapper, "orderSummaryMapper");
        Intrinsics.checkNotNullParameter(paymentSummaryMapper, "paymentSummaryMapper");
        Intrinsics.checkNotNullParameter(buttonMapper, "buttonMapper");
        Intrinsics.checkNotNullParameter(errorMapper, "errorMapper");
        Intrinsics.checkNotNullParameter(paymentSectionMapper, "paymentSectionMapper");
        Intrinsics.checkNotNullParameter(insufficientFundsWidgetMapper, "insufficientFundsWidgetMapper");
        Intrinsics.checkNotNullParameter(analyticsMapper, "analyticsMapper");
        Intrinsics.checkNotNullParameter(navBarMapper, "navBarMapper");
        Intrinsics.checkNotNullParameter(rampOrderSummaryMapper, "rampOrderSummaryMapper");
        Intrinsics.checkNotNullParameter(revPointsEarningItemMapper, "revPointsEarningItemMapper");
        Intrinsics.checkNotNullParameter(accountMapper, "accountMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cashbackSectionMapper, "cashbackSectionMapper");
        Intrinsics.checkNotNullParameter(authTransactionContentMapper, "authTransactionContentMapper");
        this.f223196a = orderSummaryMapper;
        this.f223197b = paymentSummaryMapper;
        this.f223198c = buttonMapper;
        this.d = paymentSectionMapper;
        this.e = insufficientFundsWidgetMapper;
        this.f = analyticsMapper;
        this.f223199g = navBarMapper;
        this.f223200h = rampOrderSummaryMapper;
        this.i = inputData;
        this.f223201j = cashbackSectionMapper;
    }

    public static Data a(s sVar) {
        Data data = sVar.e;
        try {
            Object content = data.getContent();
            return new Data(content != null ? hb9.b.C(((l71.d) content).a()) : null, data.getError(), data.getLoading());
        } catch (Throwable th10) {
            return new Data(null, th10, data.getLoading());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final aim.e b(o9c.s r27) {
        /*
            Method dump skipped, instruction units count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o9c.i0.b(o9c.s):aim.e");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x04ce  */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r64) {
        /*
            Method dump skipped, instruction units count: 1616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o9c.i0.c(cli.j):cli.o");
    }
}
