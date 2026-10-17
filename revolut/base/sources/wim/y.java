package wim;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class y extends kotlin.jvm.internal.q implements Function1 {
    public static final y f = new y();

    public y() {
        super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Class p0 = (Class) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return p0.getComponentType();
    }
}
