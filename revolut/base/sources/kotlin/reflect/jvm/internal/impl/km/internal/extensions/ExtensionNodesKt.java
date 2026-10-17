package kotlin.reflect.jvm.internal.impl.km.internal.extensions;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.km.KmClass;
import kotlin.reflect.jvm.internal.impl.km.KmConstructor;
import kotlin.reflect.jvm.internal.impl.km.KmFunction;
import kotlin.reflect.jvm.internal.impl.km.KmPackage;
import kotlin.reflect.jvm.internal.impl.km.KmProperty;
import kotlin.reflect.jvm.internal.impl.km.KmType;
import kotlin.reflect.jvm.internal.impl.km.KmTypeParameter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class ExtensionNodesKt {
    public static final KmExtension a(Collection collection, KmExtensionType kmExtensionType) {
        Iterator it8 = collection.iterator();
        KmExtension kmExtension = null;
        while (it8.hasNext()) {
            KmExtension kmExtension2 = (KmExtension) it8.next();
            if (Intrinsics.f(kmExtension2.getType(), kmExtensionType)) {
                if (kmExtension != null) {
                    throw new IllegalStateException("Multiple extensions handle the same extension type: " + kmExtensionType);
                }
                kmExtension = kmExtension2;
            }
        }
        if (kmExtension != null) {
            return kmExtension;
        }
        throw new IllegalStateException("No extensions handle the extension type: " + kmExtensionType);
    }

    @NotNull
    public static final KmClassExtension getExtension(@NotNull KmClass kmClass, @NotNull KmExtensionType type) {
        Intrinsics.checkNotNullParameter(kmClass, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        return (KmClassExtension) a(kmClass.getExtensions$kotlin_metadata(), type);
    }

    @NotNull
    public static final KmPackageExtension getExtension(@NotNull KmPackage kmPackage, @NotNull KmExtensionType type) {
        Intrinsics.checkNotNullParameter(kmPackage, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        return (KmPackageExtension) a(kmPackage.getExtensions$kotlin_metadata(), type);
    }

    @NotNull
    public static final KmFunctionExtension getExtension(@NotNull KmFunction kmFunction, @NotNull KmExtensionType type) {
        Intrinsics.checkNotNullParameter(kmFunction, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        return (KmFunctionExtension) a(kmFunction.getExtensions$kotlin_metadata(), type);
    }

    @NotNull
    public static final KmPropertyExtension getExtension(@NotNull KmProperty kmProperty, @NotNull KmExtensionType type) {
        Intrinsics.checkNotNullParameter(kmProperty, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        return (KmPropertyExtension) a(kmProperty.getExtensions$kotlin_metadata(), type);
    }

    @NotNull
    public static final KmConstructorExtension getExtension(@NotNull KmConstructor kmConstructor, @NotNull KmExtensionType type) {
        Intrinsics.checkNotNullParameter(kmConstructor, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        return (KmConstructorExtension) a(kmConstructor.getExtensions$kotlin_metadata(), type);
    }

    @NotNull
    public static final KmTypeParameterExtension getExtension(@NotNull KmTypeParameter kmTypeParameter, @NotNull KmExtensionType type) {
        Intrinsics.checkNotNullParameter(kmTypeParameter, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        return (KmTypeParameterExtension) a(kmTypeParameter.getExtensions$kotlin_metadata(), type);
    }

    @NotNull
    public static final KmTypeExtension getExtension(@NotNull KmType kmType, @NotNull KmExtensionType type) {
        Intrinsics.checkNotNullParameter(kmType, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        return (KmTypeExtension) a(kmType.getExtensions$kotlin_metadata(), type);
    }
}
