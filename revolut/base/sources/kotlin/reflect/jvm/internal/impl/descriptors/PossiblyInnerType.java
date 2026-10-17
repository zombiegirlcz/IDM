package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class PossiblyInnerType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClassifierDescriptorWithTypeParameters f186537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f186538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PossiblyInnerType f186539c;

    public PossiblyInnerType(@NotNull ClassifierDescriptorWithTypeParameters classifierDescriptor, @NotNull List<? extends TypeProjection> arguments, PossiblyInnerType possiblyInnerType) {
        Intrinsics.checkNotNullParameter(classifierDescriptor, "classifierDescriptor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        this.f186537a = classifierDescriptor;
        this.f186538b = arguments;
        this.f186539c = possiblyInnerType;
    }

    @NotNull
    public final List<TypeProjection> getArguments() {
        return this.f186538b;
    }

    @NotNull
    public final ClassifierDescriptorWithTypeParameters getClassifierDescriptor() {
        return this.f186537a;
    }

    public final PossiblyInnerType getOuterType() {
        return this.f186539c;
    }
}
