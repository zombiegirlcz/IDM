package jra;

import dj0.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b extends q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, kqa.a.class, "ensureDataCorrect", "ensureDataCorrect()Lcom/revolut/feature/push_to_card/impl/domain/FeeQuote;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        kqa.a p0 = (kqa.a) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        kqa.b bVar = p0.f188353g;
        d dVar = p0.f188351b;
        d dVar2 = p0.f188350a;
        if (!Intrinsics.f(dVar2.f115083b, p0.f188352c.f115083b)) {
            throw new IllegalStateException("from.currency != fxFee.currency");
        }
        if (!Intrinsics.f(dVar2.f115083b, p0.d.f115083b)) {
            throw new IllegalStateException("from.currency != fee.currency");
        }
        if (!Intrinsics.f(dVar.f115083b, bVar.f188360b.f115083b)) {
            throw new IllegalStateException("to.currency != transferLimits.upper.currency");
        }
        if (Intrinsics.f(dVar.f115083b, bVar.f188359a.f115083b)) {
            return p0;
        }
        throw new IllegalStateException("to.currency != transferLimits.lower.currency");
    }
}
