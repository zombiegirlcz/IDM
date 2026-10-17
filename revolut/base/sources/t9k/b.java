package t9k;

import hx7.q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yqi.f;
import zm3.l;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements f {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static yqi.d a(c validationData) {
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        long j2 = validationData.f269048b;
        xi0.b bVar = validationData.f269049c;
        Long l2 = (Long) validationData.d.get(bVar.f306286a);
        long jLongValue = l2 != null ? l2.longValue() : 1L;
        zm3.a aVar = validationData.f269047a.f102270a;
        boolean z = aVar instanceof l;
        boolean z3 = q.D(aVar) != null;
        if (z && z3) {
            yqi.d.Companion.getClass();
            return yqi.c.a(validationData);
        }
        if (1 <= j2 && j2 < jLongValue) {
            return new yqi.d(validationData, new s9k.c(new dj0.d(jLongValue, bVar)));
        }
        yqi.d.Companion.getClass();
        return yqi.c.a(validationData);
    }

    @Override // yqi.f
    public final /* bridge */ /* synthetic */ yqi.d validate(Object obj2) {
        return a((c) obj2);
    }
}
