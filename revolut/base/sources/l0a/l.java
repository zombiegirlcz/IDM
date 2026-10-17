package l0a;

import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import fy1.r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class l {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d3j.b f191203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lra.d f191204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aa6.c f191205c;
    public final ap5.b d;
    public final r e;
    public final co9.b f;

    public l(d3j.b beneficiaryInteractor, lra.d cardInteractor, aa6.c donationsInteractor, ap5.b cryptoInteractor, r apmRecipientsInteractor, co9.b paymentCounterpartyInteractor) {
        Intrinsics.checkNotNullParameter(beneficiaryInteractor, "beneficiaryInteractor");
        Intrinsics.checkNotNullParameter(cardInteractor, "cardInteractor");
        Intrinsics.checkNotNullParameter(donationsInteractor, "donationsInteractor");
        Intrinsics.checkNotNullParameter(cryptoInteractor, "cryptoInteractor");
        Intrinsics.checkNotNullParameter(apmRecipientsInteractor, "apmRecipientsInteractor");
        Intrinsics.checkNotNullParameter(paymentCounterpartyInteractor, "paymentCounterpartyInteractor");
        this.f191203a = beneficiaryInteractor;
        this.f191204b = cardInteractor;
        this.f191205c = donationsInteractor;
        this.d = cryptoInteractor;
        this.e = apmRecipientsInteractor;
        this.f = paymentCounterpartyInteractor;
    }

    public static efm.r a(efm.r rVar, ChatTransferRecipient chatTransferRecipient, Function1 function1) {
        efm.r rVarScan = rVar.scan(chatTransferRecipient, new kxj.e(new i(0, function1), 9));
        Intrinsics.checkNotNullExpressionValue(rVarScan, "scan(...)");
        return rVarScan;
    }
}
