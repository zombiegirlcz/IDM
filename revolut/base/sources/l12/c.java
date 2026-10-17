package l12;

import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements yqi.f {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static yqi.d a(d validationData) {
        dj0.d dVar;
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        hrf.f fVar = validationData.f;
        long j2 = validationData.f191420b;
        hrf.f fVar2 = hrf.f.INCOMING;
        urf.g gVar = urf.g.f282312a;
        if (fVar == fVar2) {
            if (j2 <= 0) {
                return new yqi.d(validationData, gVar);
            }
            yqi.d.Companion.getClass();
            return yqi.c.a(validationData);
        }
        xi0.b bVar = validationData.f191421c;
        xi0.b bVar2 = validationData.d;
        ApmQuote apmQuote = validationData.e;
        long j3 = validationData.f191419a;
        long j5 = (apmQuote == null || (dVar = apmQuote.f62212g) == null) ? Intrinsics.f(bVar2, bVar) ? j2 : -1L : dVar.f115082a;
        if (j2 == 0) {
            return new yqi.d(validationData, gVar);
        }
        srf.a aVar = srf.a.f265206a;
        if (j5 != -1 && j5 <= j3) {
            yqi.d.Companion.getClass();
            return yqi.c.a(validationData);
        }
        return new yqi.d(validationData, aVar);
    }

    @Override // yqi.f
    public final /* bridge */ /* synthetic */ yqi.d validate(Object obj2) {
        return a((d) obj2);
    }
}
