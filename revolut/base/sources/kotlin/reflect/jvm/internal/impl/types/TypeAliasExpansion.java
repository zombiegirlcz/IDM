package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes14.dex */
public final class TypeAliasExpansion {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TypeAliasExpansion f187795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TypeAliasDescriptor f187796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f187797c;
    public final Map d;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final TypeAliasExpansion create(TypeAliasExpansion typeAliasExpansion, @NotNull TypeAliasDescriptor typeAliasDescriptor, @NotNull List<? extends TypeProjection> arguments) {
            Intrinsics.checkNotNullParameter(typeAliasDescriptor, "typeAliasDescriptor");
            Intrinsics.checkNotNullParameter(arguments, "arguments");
            List<TypeParameterDescriptor> parameters = typeAliasDescriptor.getTypeConstructor().getParameters();
            Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
            List<TypeParameterDescriptor> list = parameters;
            ArrayList arrayList = new ArrayList(w.t(list, 10));
            Iterator<T> it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(((TypeParameterDescriptor) it8.next()).getOriginal());
            }
            return new TypeAliasExpansion(typeAliasExpansion, typeAliasDescriptor, arguments, r0.t(d0.l1(arrayList, arguments)), null);
        }
    }

    public TypeAliasExpansion(TypeAliasExpansion typeAliasExpansion, TypeAliasDescriptor typeAliasDescriptor, List list, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this.f187795a = typeAliasExpansion;
        this.f187796b = typeAliasDescriptor;
        this.f187797c = list;
        this.d = map;
    }

    @NotNull
    public final List<TypeProjection> getArguments() {
        return this.f187797c;
    }

    @NotNull
    public final TypeAliasDescriptor getDescriptor() {
        return this.f187796b;
    }

    public final TypeProjection getReplacement(@NotNull TypeConstructor constructor) {
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        ClassifierDescriptor classifierDescriptorMo3795getDeclarationDescriptor = constructor.mo3795getDeclarationDescriptor();
        if (classifierDescriptorMo3795getDeclarationDescriptor instanceof TypeParameterDescriptor) {
            return (TypeProjection) this.d.get(classifierDescriptorMo3795getDeclarationDescriptor);
        }
        return null;
    }

    public final boolean isRecursion(@NotNull TypeAliasDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (Intrinsics.f(this.f187796b, descriptor)) {
            return true;
        }
        TypeAliasExpansion typeAliasExpansion = this.f187795a;
        return typeAliasExpansion != null ? typeAliasExpansion.isRecursion(descriptor) : false;
    }
}
