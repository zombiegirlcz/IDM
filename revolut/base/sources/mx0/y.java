package mx0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class y extends kotlin.jvm.internal.q implements Function1 {
    public static final y f = new y();

    public y() {
        super(1, jr0.g.class, "play", "play()V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        jr0.g p0 = (jr0.g) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        p0.c();
        return Unit.f186387a;
    }
}
