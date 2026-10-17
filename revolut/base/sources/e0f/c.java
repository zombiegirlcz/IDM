package e0f;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c extends kotlin.jvm.internal.q implements Function1 {
    public static final c f = new c();

    public c() {
        super(1, zi0.c.class, "toData", "toData(Ljava/lang/Throwable;)Lcom/revolut/data/model/Data;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Throwable p0 = (Throwable) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return zi0.c.O(p0);
    }
}
