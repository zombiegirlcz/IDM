package hjm;

import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMethod;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class g extends q implements Function1 {
    public static final g f = new g(1, ReflectJavaMethod.class, "<init>", "<init>(Ljava/lang/reflect/Method;)V", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Method p0 = (Method) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return new ReflectJavaMethod(p0);
    }
}
