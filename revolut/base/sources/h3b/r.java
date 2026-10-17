package h3b;

import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f149095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f149096b;

    public /* synthetic */ r(s sVar, int i) {
        this.f149095a = i;
        this.f149096b = sVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        switch (this.f149095a) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                String str = (String) pair.f186385a;
                boolean zBooleanValue = ((Boolean) pair.f186386b).booleanValue();
                s sVar = this.f149096b;
                if (zBooleanValue) {
                    return nim.a.v(y1b.a.a(sVar.f149099c, str, null, 6), new r(sVar, 1));
                }
                xi0.a aVar = xi0.b.Companion;
                String str2 = sVar.f149097a.f82204a.f183148a.e;
                aVar.getClass();
                dj0.d dVar = new dj0.d(0L, xi0.a.a(str2));
                return zi0.c.i(new i(dVar, dVar, dVar, dVar));
            default:
                y49.f unrealisedPnL = (y49.f) obj2;
                Intrinsics.checkNotNullParameter(unrealisedPnL, "unrealisedPnL");
                Iterator it8 = unrealisedPnL.d.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (Intrinsics.f(((y49.c) next).f310834a, this.f149096b.f149097a.f82204a.f183148a.f183145a)) {
                        }
                    } else {
                        next = null;
                    }
                }
                if (next == null) {
                    throw new IllegalArgumentException("cash holding id does not match unrealised PnL cash balance");
                }
                y49.c cVar = (y49.c) next;
                return new i(unrealisedPnL.f310846c, unrealisedPnL.f310844a, cVar.e, cVar.f310836c);
        }
    }
}
