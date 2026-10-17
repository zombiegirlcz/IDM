package sh9;

import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import i1l.h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import urf.g;
import yqi.d;
import yqi.f;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements f {

    @NotNull
    public static final C1462a Companion = new C1462a();

    /* JADX INFO: renamed from: sh9.a$a, reason: collision with other inner class name */
    public static final class C1462a {
        private C1462a() {
        }
    }

    public static d a(c validationData) {
        dj0.d dVar;
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        xi0.b bVar = validationData.f263446c;
        xi0.b bVar2 = validationData.d;
        long j2 = validationData.f263445b;
        ApmQuote apmQuote = validationData.e;
        long j3 = validationData.f263444a;
        long j5 = (apmQuote == null || (dVar = apmQuote.f62212g) == null) ? Intrinsics.f(bVar2, bVar) ? j2 : -1L : dVar.f115082a;
        if (j2 < 0) {
            return new d(validationData, h.f157651a);
        }
        if (j2 == 0) {
            return new d(validationData, g.f282312a);
        }
        srf.a aVar = srf.a.f265206a;
        if (j5 != -1 && j5 <= j3) {
            b bVar3 = validationData.f;
            if (bVar3 == null) {
                d.Companion.getClass();
                return yqi.c.a(validationData);
            }
            dj0.d dVar2 = bVar3.f263442a;
            dj0.d dVar3 = bVar3.f263443b;
            yqi.b aVar2 = null;
            if (j2 != 0) {
                if (dVar2 != null && j2 < dVar2.f115082a) {
                    aVar2 = new urf.b(dVar2);
                } else if (dVar3 != null && j2 > dVar3.f115082a) {
                    aVar2 = new urf.a(dVar3);
                }
            }
            if (aVar2 != null) {
                return new d(validationData, aVar2);
            }
            d.Companion.getClass();
            return yqi.c.a(validationData);
        }
        return new d(validationData, aVar);
    }

    @Override // yqi.f
    public final /* bridge */ /* synthetic */ d validate(Object obj2) {
        return a((c) obj2);
    }
}
