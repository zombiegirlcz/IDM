package d62;

import com.revolut.feature.apm.iris.impl.qr.IrisQrHandlerImpl$NullBarcode;
import com.revolut.retail.feature.beneficiary.api.domain.PaymentCode;
import efm.d0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import xo9.i;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xq2.a f111436b;

    public /* synthetic */ a(i iVar, xq2.a aVar, int i) {
        this.f111435a = i;
        this.f111436b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String str;
        String str2;
        switch (this.f111435a) {
            case 0:
                Boolean isEnabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(isEnabled, "isEnabled");
                if (!isEnabled.booleanValue()) {
                    throw new IllegalArgumentException() { // from class: com.revolut.feature.apm.iris.impl.qr.IrisQrHandlerImpl$NotSupportedException
                    };
                }
                xq2.a aVar = this.f111436b;
                if (aVar == null || (str = aVar.f308049a) == null) {
                    throw new IrisQrHandlerImpl$NullBarcode();
                }
                if (a0.H(str, "IRISCOM", false)) {
                    return new d(str);
                }
                throw new IllegalArgumentException() { // from class: com.revolut.feature.apm.iris.impl.qr.IrisQrHandlerImpl$NotSupportedException
                };
            case 1:
                PaymentCode it8 = (PaymentCode) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                String str3 = this.f111436b.f308049a;
                if (str3 == null) {
                    str3 = "";
                }
                return new e3j.d(it8, str3);
            case 2:
                Boolean isEnabled2 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(isEnabled2, "isEnabled");
                if (!isEnabled2.booleanValue()) {
                    throw new IllegalArgumentException() { // from class: com.revolut.feature.apm.wero.impl.qr.WeroQrHandlerImpl$NotSupportedException
                    };
                }
                xq2.a aVar2 = this.f111436b;
                if (aVar2 == null || (str2 = aVar2.f308049a) == null) {
                    throw new IllegalStateException() { // from class: com.revolut.feature.apm.wero.impl.qr.WeroQrHandlerImpl$NullBarcode
                    };
                }
                if (ch.qos.logback.core.util.a.x("^https://pay\\.(werouat|weropay)\\.eu/(?<consentId>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12})([?&](?<query>.*))?$|(?i:^https://(ext\\.)?pay\\.wero\\.ideal\\.nl/(?<routingAdviceId>.+?)(\\?.*)?$)", str2)) {
                    return new rh2.b(str2);
                }
                throw new IllegalArgumentException() { // from class: com.revolut.feature.apm.wero.impl.qr.WeroQrHandlerImpl$NotSupportedException
                };
            case 3:
                Boolean isEnabled3 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(isEnabled3, "isEnabled");
                return isEnabled3.booleanValue() ? new ufm.c(new e3j.b(this.f111436b, 4), 2) : d0.l(new IllegalArgumentException("Aani QR code is not supported"));
            default:
                Boolean enabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(enabled, "enabled");
                return enabled.booleanValue() ? new ufm.c(new e3j.b(this.f111436b, 5), 2) : d0.l(new IllegalArgumentException("PagoPA QR code is not supported"));
        }
    }

    public /* synthetic */ a(xq2.a aVar, int i) {
        this.f111435a = i;
        this.f111436b = aVar;
    }
}
