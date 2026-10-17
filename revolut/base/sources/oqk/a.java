package oqk;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
    public static final a f = new a();

    public a() {
        super(1, Double.TYPE, "toInt", "intValue()I", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return Integer.valueOf((int) ((Number) obj2).doubleValue());
    }
}
