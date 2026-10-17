package q2j;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class w extends kotlin.jvm.internal.q implements Function1 {
    public static final w f = new w();

    public w() {
        super(1, Runnable.class, "run", "run()V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Runnable p0 = (Runnable) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        p0.run();
        return Unit.f186387a;
    }
}
