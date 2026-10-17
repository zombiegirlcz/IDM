package tcl;

import java.math.BigDecimal;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f269881a = r0.k(new Pair("PRICE_PRECISE", eel.i.PRICE), new Pair("YTM", eel.i.YTM));

    public static final adl.j a(eel.c cVar, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        switch (e.f269880b[cVar.ordinal()]) {
            case 1:
                return adl.d.f3462b;
            case 2:
                return adl.f.f3464b;
            case 3:
                return adl.e.f3463b;
            case 4:
                return adl.h.f3466b;
            case 5:
                return adl.g.f3465b;
            case 6:
                return adl.c.f3461b;
            case 7:
                return adl.i.f3467b;
            case 8:
                return adl.a.f3459b;
            case 9:
                return new adl.b(((l80.f) dateProvider).f().getDayOfYear());
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final eel.l b(icl.c cVar) {
        ko3.b bVar = cVar.e;
        String str = cVar.f160306a;
        long j2 = cVar.f160308c;
        if (bVar != null) {
            ej0.b value = cp5.c.I(bVar);
            Intrinsics.checkNotNullParameter(value, "value");
            return new eel.l(str, j2, new eel.f(value));
        }
        BigDecimal value2 = cVar.f;
        if (value2 == null) {
            throw new IllegalStateException("provide handling for new branch");
        }
        Intrinsics.checkNotNullParameter(value2, "value");
        return new eel.l(str, j2, new eel.g(value2));
    }
}
