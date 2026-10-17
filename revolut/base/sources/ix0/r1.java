package ix0;

import java.util.Stack;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f169285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Stack f169286b = new Stack();

    public final q1 a() {
        Stack stack = this.f169286b;
        if (stack.isEmpty()) {
            return null;
        }
        Object objPeek = stack.peek();
        Intrinsics.checkNotNullExpressionValue(objPeek, "peek(...)");
        q1 q1Var = (q1) objPeek;
        int size = stack.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return q1Var;
            }
            if (((q1) stack.get(size)).a().a() > q1Var.a().a()) {
                Object obj2 = stack.get(size);
                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                q1Var = (q1) obj2;
            }
        }
    }
}
