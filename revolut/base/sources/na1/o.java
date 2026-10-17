package na1;

import com.revolut.feature.acquiring.card_reader.data.api.domain.model.CardReaderDevice;
import ha1.v;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n8i.q0;
import pfm.t;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f213699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f213700b;

    public /* synthetic */ o(q qVar, int i) {
        this.f213699a = i;
        this.f213700b = qVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        efm.f fVarE;
        switch (this.f213699a) {
            case 0:
                qa1.h firmwareFile = (qa1.h) obj2;
                en.a aVar = mfm.f.f205043c;
                dfm.c cVar = mfm.f.d;
                Intrinsics.checkNotNullParameter(firmwareFile, "firmwareFile");
                q qVar = this.f213700b;
                v vVar = qVar.f213702c;
                pfm.a aVarE = vVar.e(firmwareFile.d, firmwareFile.f243941c).e(vVar.f(firmwareFile.e).filter(new e(19, new q0(5))).doOnNext(new e(20, new o(qVar, 1))).ignoreElements());
                if (firmwareFile.f243940b) {
                    t tVar = new t(efm.b.A(30000L, TimeUnit.MILLISECONDS, hhm.f.f152430b), new e(15, new q0(4)), cVar, aVar, aVar, aVar, aVar);
                    da1.d dVar = qVar.d;
                    CardReaderDevice cardReaderDeviceB = ((ha1.f) qVar.e).b();
                    if (cardReaderDeviceB == null) {
                        throw new IllegalArgumentException("Card reader is not saved yet");
                    }
                    fVarE = tVar.e(((ma1.t) dVar).a(cardReaderDeviceB));
                } else {
                    fVarE = pfm.m.f235744a;
                }
                pfm.a aVarE2 = aVarE.e(fVarE);
                Intrinsics.checkNotNullExpressionValue(aVarE2, "andThen(...)");
                pfm.a aVar2 = new pfm.a(aVarE2, new e(14, new n45.b(firmwareFile, qVar, 24)), 2);
                Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
                return new t(aVar2, new e(13, new c(firmwareFile, 1)), cVar, aVar, aVar, aVar, aVar).l(new d(firmwareFile, 1));
            default:
                this.f213700b.a();
                return Unit.f186387a;
        }
    }
}
