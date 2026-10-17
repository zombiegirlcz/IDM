package hjm;

import java.lang.reflect.Field;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaField;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class f extends q implements Function1 {
    public static final f f = new f(1, ReflectJavaField.class, "<init>", "<init>(Ljava/lang/reflect/Field;)V", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Field p0 = (Field) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return new ReflectJavaField(p0);
    }
}
