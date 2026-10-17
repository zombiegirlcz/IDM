package ud3;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class h0 extends kotlin.jvm.internal.q implements Function1 {
    public static final h0 f = new h0();

    public h0() {
        super(1, Integer.TYPE, "inc", "inc()I", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return Integer.valueOf(((Number) obj2).intValue() + 1);
    }
}
