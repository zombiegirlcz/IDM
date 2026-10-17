package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class LazyJavaResolverContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JavaResolverComponents f186952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TypeParameterResolver f186953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f186954c;
    public final JavaTypeResolver d;

    public LazyJavaResolverContext(@NotNull JavaResolverComponents components, @NotNull TypeParameterResolver typeParameterResolver, @NotNull Lazy delegateForDefaultTypeQualifiers) {
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(typeParameterResolver, "typeParameterResolver");
        Intrinsics.checkNotNullParameter(delegateForDefaultTypeQualifiers, "delegateForDefaultTypeQualifiers");
        this.f186952a = components;
        this.f186953b = typeParameterResolver;
        this.f186954c = delegateForDefaultTypeQualifiers;
        this.d = new JavaTypeResolver(this, typeParameterResolver);
    }

    @NotNull
    public final JavaResolverComponents getComponents() {
        return this.f186952a;
    }

    public final JavaTypeQualifiersByElementType getDefaultTypeQualifiers() {
        return (JavaTypeQualifiersByElementType) this.f186954c.getValue();
    }

    @NotNull
    public final Lazy getDelegateForDefaultTypeQualifiers$descriptors_jvm() {
        return this.f186954c;
    }

    @NotNull
    public final ModuleDescriptor getModule() {
        return this.f186952a.getModule();
    }

    @NotNull
    public final StorageManager getStorageManager() {
        return this.f186952a.getStorageManager();
    }

    @NotNull
    public final TypeParameterResolver getTypeParameterResolver() {
        return this.f186953b;
    }

    @NotNull
    public final JavaTypeResolver getTypeResolver() {
        return this.d;
    }
}
