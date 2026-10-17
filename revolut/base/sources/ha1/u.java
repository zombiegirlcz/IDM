package ha1;

import com.revolut.core.network.exceptions.NetworkConnectException;
import com.revolut.feature.acquiring.card_reader.data.impl.data.network.CardReaderService;
import efm.c0;
import efm.d0;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import org.jetbrains.annotations.NotNull;
import qfm.i2;
import te0.w;

/* JADX INFO: loaded from: classes20.dex */
public final class u implements o {

    @NotNull
    public static final t Companion = new t();
    public static final List f = zhm.v.k(fa1.d.AUTHORISATION_STARTED, fa1.d.AUTHORISATION_PASSED);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardReaderService f150389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tl0.a f150390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ia1.d f150391c;
    public final bd1.a d;
    public final kg.o e;

    public u(CardReaderService service, tl0.a base64Util, ia1.d paymentMapper, bd1.a lineItemMapper, kg.o gson) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(base64Util, "base64Util");
        Intrinsics.checkNotNullParameter(paymentMapper, "paymentMapper");
        Intrinsics.checkNotNullParameter(lineItemMapper, "lineItemMapper");
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.f150389a = service;
        this.f150390b = base64Util;
        this.f150391c = paymentMapper;
        this.d = lineItemMapper;
        this.e = gson;
    }

    public final pfm.h a(String orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        efm.b bVarCancelOrder = this.f150389a.cancelOrder(orderId);
        ihm.f fVar = ea1.b.f124050a;
        pfm.h hVarQ = pyd.c.Q(w.g0(ea1.b.c(bVarCancelOrder, "POST: Cancelling order", fa1.k.INFO)), o0.f186429a.b(NetworkConnectException.class));
        Intrinsics.checkNotNullExpressionValue(hVarQ, "retryWhen$default(...)");
        return hVarQ;
    }

    public final ga1.o b(String str, fa1.j jVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, String str2, String str3, boolean z) {
        tl0.a aVar = this.f150390b;
        return new ga1.o(new ga1.q(str, aVar.d(bArr3), bArr4 != null ? aVar.d(bArr4) : null, bArr5 != null ? aVar.d(bArr5) : null, aVar.d(bArr), aVar.d(bArr2), jVar.a(), new ga1.a(str2, str3), z));
    }

    public final ufm.p c(String str) {
        d0<ga1.p> paymentAuthorization = this.f150389a.getPaymentAuthorization(str);
        j jVar = new j(23, new gwc.h(1, this.f150391c, ia1.d.class, "toDomain", "toDomain(Lcom/revolut/feature/acquiring/card_reader/data/impl/data/model/PaymentAuthorizationResponseDto;)Lcom/revolut/feature/acquiring/card_reader/data/api/domain/model/PaymentAuthorization;", 0, 22));
        paymentAuthorization.getClass();
        i2 i2VarP = new ufm.i(new ufm.i(paymentAuthorization, jVar, 1), new j(24, new gqh.a(str, 19)), 1).p(new j(25, new k(6)));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ufm.c cVarL = d0.l(new TimeoutException("Payment authorization timeout"));
        c0 c0Var = hhm.f.f152430b;
        mfm.f.b(timeUnit, "unit is null");
        mfm.f.b(c0Var, "scheduler is null");
        ufm.p pVar = new ufm.p(i2VarP, 15L, timeUnit, c0Var, cVarL);
        Intrinsics.checkNotNullExpressionValue(pVar, "timeout(...)");
        return pVar;
    }
}
