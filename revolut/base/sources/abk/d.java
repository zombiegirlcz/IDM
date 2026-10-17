package abk;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sak.j;
import urf.g;
import yqi.f;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements f {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static yqi.d a(j validationData) {
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        dj0.d dVar = validationData.f261453b;
        xi0.b bVar = dVar.f115083b;
        long j2 = dVar.f115082a;
        xi0.b bVar2 = validationData.f261454c;
        long j3 = validationData.f261452a.f115082a;
        Long l2 = validationData.d;
        long jLongValue = l2 != null ? l2.longValue() : Intrinsics.f(bVar2, bVar) ? j2 : -1L;
        if (j2 == 0) {
            return new yqi.d(validationData, g.f282312a);
        }
        srf.a aVar = srf.a.f265206a;
        if (jLongValue != -1 && jLongValue <= j3) {
            yqi.d.Companion.getClass();
            return yqi.c.a(validationData);
        }
        return new yqi.d(validationData, aVar);
    }

    @Override // yqi.f
    public final /* bridge */ /* synthetic */ yqi.d validate(Object obj2) {
        return a((j) obj2);
    }
}
