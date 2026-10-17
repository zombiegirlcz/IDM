package p4i;

import java.util.Stack;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class q extends kotlin.jvm.internal.q implements Function1 {
    public static final q f = new q();

    public q() {
        super(1, Stack.class, "isEmpty", "isEmpty()Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Stack p0 = (Stack) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return Boolean.valueOf(p0.isEmpty());
    }
}
