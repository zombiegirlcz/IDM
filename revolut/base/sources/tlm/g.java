package tlm;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes13.dex */
public interface g {
    void b(KClass kClass, Function1 function1);

    void c(KClass kClass, Function1 function1);

    void d(KClass kClass, KClass kClass2, KSerializer kSerializer);

    default void f(KClass kClass, KSerializer serializer) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        i(kClass, new tjf.e(serializer, 10));
    }

    default void h(KClass baseClass, Function1 defaultDeserializerProvider) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
        ((f) this).b(baseClass, defaultDeserializerProvider);
    }

    void i(KClass kClass, Function1 function1);
}
