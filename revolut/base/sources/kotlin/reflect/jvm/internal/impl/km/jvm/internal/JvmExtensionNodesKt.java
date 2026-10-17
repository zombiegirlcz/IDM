package kotlin.reflect.jvm.internal.impl.km.jvm.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.km.KmClass;
import kotlin.reflect.jvm.internal.impl.km.KmConstructor;
import kotlin.reflect.jvm.internal.impl.km.KmFunction;
import kotlin.reflect.jvm.internal.impl.km.KmPackage;
import kotlin.reflect.jvm.internal.impl.km.KmProperty;
import kotlin.reflect.jvm.internal.impl.km.KmType;
import kotlin.reflect.jvm.internal.impl.km.KmTypeParameter;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.ExtensionNodesKt;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmClassExtension;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmConstructorExtension;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmFunctionExtension;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmPackageExtension;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmPropertyExtension;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmTypeExtension;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmTypeParameterExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class JvmExtensionNodesKt {
    @NotNull
    public static final JvmClassExtension getJvm(@NotNull KmClass kmClass) {
        Intrinsics.checkNotNullParameter(kmClass, "<this>");
        KmClassExtension extension = ExtensionNodesKt.getExtension(kmClass, JvmClassExtension.Companion.getTYPE());
        Intrinsics.i(extension, "null cannot be cast to non-null type kotlin.metadata.jvm.internal.JvmClassExtension");
        return (JvmClassExtension) extension;
    }

    @NotNull
    public static final JvmPackageExtension getJvm(@NotNull KmPackage kmPackage) {
        Intrinsics.checkNotNullParameter(kmPackage, "<this>");
        KmPackageExtension extension = ExtensionNodesKt.getExtension(kmPackage, JvmPackageExtension.TYPE);
        Intrinsics.i(extension, "null cannot be cast to non-null type kotlin.metadata.jvm.internal.JvmPackageExtension");
        return (JvmPackageExtension) extension;
    }

    @NotNull
    public static final JvmFunctionExtension getJvm(@NotNull KmFunction kmFunction) {
        Intrinsics.checkNotNullParameter(kmFunction, "<this>");
        KmFunctionExtension extension = ExtensionNodesKt.getExtension(kmFunction, JvmFunctionExtension.TYPE);
        Intrinsics.i(extension, "null cannot be cast to non-null type kotlin.metadata.jvm.internal.JvmFunctionExtension");
        return (JvmFunctionExtension) extension;
    }

    @NotNull
    public static final JvmPropertyExtension getJvm(@NotNull KmProperty kmProperty) {
        Intrinsics.checkNotNullParameter(kmProperty, "<this>");
        KmPropertyExtension extension = ExtensionNodesKt.getExtension(kmProperty, JvmPropertyExtension.TYPE);
        Intrinsics.i(extension, "null cannot be cast to non-null type kotlin.metadata.jvm.internal.JvmPropertyExtension");
        return (JvmPropertyExtension) extension;
    }

    @NotNull
    public static final JvmConstructorExtension getJvm(@NotNull KmConstructor kmConstructor) {
        Intrinsics.checkNotNullParameter(kmConstructor, "<this>");
        KmConstructorExtension extension = ExtensionNodesKt.getExtension(kmConstructor, JvmConstructorExtension.TYPE);
        Intrinsics.i(extension, "null cannot be cast to non-null type kotlin.metadata.jvm.internal.JvmConstructorExtension");
        return (JvmConstructorExtension) extension;
    }

    @NotNull
    public static final JvmTypeParameterExtension getJvm(@NotNull KmTypeParameter kmTypeParameter) {
        Intrinsics.checkNotNullParameter(kmTypeParameter, "<this>");
        KmTypeParameterExtension extension = ExtensionNodesKt.getExtension(kmTypeParameter, JvmTypeParameterExtension.TYPE);
        Intrinsics.i(extension, "null cannot be cast to non-null type kotlin.metadata.jvm.internal.JvmTypeParameterExtension");
        return (JvmTypeParameterExtension) extension;
    }

    @NotNull
    public static final JvmTypeExtension getJvm(@NotNull KmType kmType) {
        Intrinsics.checkNotNullParameter(kmType, "<this>");
        KmTypeExtension extension = ExtensionNodesKt.getExtension(kmType, JvmTypeExtension.TYPE);
        Intrinsics.i(extension, "null cannot be cast to non-null type kotlin.metadata.jvm.internal.JvmTypeExtension");
        return (JvmTypeExtension) extension;
    }
}
