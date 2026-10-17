package kotlin.reflect.jvm.internal.impl.km.jvm;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class JvmMemberSignatureKt {
    @NotNull
    public static final JvmMethodSignature wrapAsPublic(@NotNull JvmMemberSignature.Method method) {
        Intrinsics.checkNotNullParameter(method, "<this>");
        return new JvmMethodSignature(method.getName(), method.getDesc());
    }

    @NotNull
    public static final JvmFieldSignature wrapAsPublic(@NotNull JvmMemberSignature.Field field) {
        Intrinsics.checkNotNullParameter(field, "<this>");
        return new JvmFieldSignature(field.getName(), field.getDesc());
    }
}
