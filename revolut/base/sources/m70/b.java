package m70;

import a0.d;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends IllegalArgumentException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, String key) {
        super(d.s("Illegal value type = ", str == null ? "Unknown" : str, " for key = ", key));
        Intrinsics.checkNotNullParameter(key, "key");
        StackTraceElement[] stackTrace = getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        StackTraceElement stackTraceElement = (StackTraceElement) kotlin.collections.d.P(stackTrace);
        if (stackTraceElement != null) {
            String className = stackTraceElement.getClassName();
            StringBuilder sbT = p.a.t(stackTraceElement.getMethodName(), "(", key, ", ", str);
            sbT.append(")");
            StackTraceElement stackTraceElement2 = new StackTraceElement(className, sbT.toString(), stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
            s0 s0Var = new s0(2);
            s0Var.a(stackTraceElement2);
            s0Var.b(getStackTrace());
            ArrayList arrayList = s0Var.f186433a;
            setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[arrayList.size()]));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String msg) {
        super(msg);
        Intrinsics.checkNotNullParameter(msg, "msg");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(KClass baseClass, KClass concreteClass) {
        this("Serializer for " + concreteClass + " already registered in the scope of " + baseClass);
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(concreteClass, "concreteClass");
    }
}
