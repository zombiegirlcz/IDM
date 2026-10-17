package ma1;

import com.revolut.feature.acquiring.card_reader.data.api.domain.model.PairingInfo;
import com.revolut.feature.acquiring.card_reader.data.impl.domain.exception.ResourceFileNotImplementedException;
import efm.d0;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f203897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f203898b;

    public /* synthetic */ p(q qVar, int i) {
        this.f203897a = i;
        this.f203898b = qVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f203897a) {
            case 0:
                Throwable exception = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(exception, "exception");
                if (!(exception instanceof ResourceFileNotImplementedException)) {
                    return efm.b.n(exception);
                }
                q qVar = this.f203898b;
                PairingInfo pairingInfoC = ((ha1.f) qVar.f203900b).c();
                if (pairingInfoC != null) {
                    return new pfm.a(d0.m(pairingInfoC), new m78.e(new p(qVar, 1), 18), 4);
                }
                throw new IllegalArgumentException("Pairing info is required");
            default:
                PairingInfo pairingInfo = (PairingInfo) obj2;
                Intrinsics.checkNotNullParameter(pairingInfo, "pairingInfo");
                q qVar2 = this.f203898b;
                na1.h hVar = qVar2.f203901c;
                String terminalId = pairingInfo.f60566a;
                List plainEmvTags = pairingInfo.f60567b;
                List securedEmvTags = pairingInfo.f60568c;
                boolean z = pairingInfo.d;
                boolean z3 = pairingInfo.e;
                boolean z4 = pairingInfo.f;
                boolean z6 = pairingInfo.f60569g;
                boolean z11 = pairingInfo.f60570h;
                boolean z12 = pairingInfo.f60571j;
                String locale = pairingInfo.k;
                int i = pairingInfo.f60572l;
                fa1.f captureMode = pairingInfo.f60573m;
                dj0.d transactionLimit = pairingInfo.f60574n;
                fa1.k logLevel = pairingInfo.o;
                Intrinsics.checkNotNullParameter(terminalId, "terminalId");
                Intrinsics.checkNotNullParameter(plainEmvTags, "plainEmvTags");
                Intrinsics.checkNotNullParameter(securedEmvTags, "securedEmvTags");
                Intrinsics.checkNotNullParameter(locale, "locale");
                Intrinsics.checkNotNullParameter(captureMode, "captureMode");
                Intrinsics.checkNotNullParameter(transactionLimit, "transactionLimit");
                Intrinsics.checkNotNullParameter(logLevel, "logLevel");
                return hVar.b(new PairingInfo(terminalId, plainEmvTags, securedEmvTags, z, z3, z4, z6, z11, true, z12, locale, i, captureMode, transactionLimit, logLevel)).e(qVar2.f203899a.i(pairingInfo.k));
        }
    }
}
