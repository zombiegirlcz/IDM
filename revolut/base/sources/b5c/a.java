package b5c;

import io3.d;
import io3.g;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n14.k;
import qta.c;
import zhm.d0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xi0.b f12485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xi0.b f12486c;

    public /* synthetic */ a(xi0.b bVar, xi0.b bVar2, int i) {
        this.f12484a = i;
        this.f12485b = bVar;
        this.f12486c = bVar2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f12484a) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list = (List) pair.f186385a;
                List list2 = (List) pair.f186386b;
                g gVar = (g) d0.d0(list);
                d dVar = gVar != null ? gVar.f163163a : null;
                long j2 = dVar != null ? dVar.i : 0L;
                long j3 = j2 + (dVar != null ? dVar.f163151l : 0L);
                c cVar = (c) d0.d0(k.N(list2));
                return new b(this.f12485b, this.f12486c, cVar != null ? cVar.f249048c : null, j3, j2);
            default:
                BigDecimal rate = (BigDecimal) obj2;
                Intrinsics.checkNotNullParameter(rate, "rate");
                return new n9l.a(rate.doubleValue(), this.f12485b, this.f12486c);
        }
    }
}
