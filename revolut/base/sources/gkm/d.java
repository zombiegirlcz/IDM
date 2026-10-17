package gkm;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: loaded from: classes14.dex */
public final class d implements TypeConstructor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KotlinTypeRefiner f144513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f144514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractTypeConstructor f144515c;

    public d(AbstractTypeConstructor abstractTypeConstructor, KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        this.f144515c = abstractTypeConstructor;
        this.f144513a = kotlinTypeRefiner;
        this.f144514b = yhm.j.c(yhm.k.PUBLICATION, new ajm.e(this, abstractTypeConstructor, 9));
    }

    public final boolean equals(Object obj2) {
        return this.f144515c.equals(obj2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final KotlinBuiltIns getBuiltIns() {
        KotlinBuiltIns builtIns = this.f144515c.getBuiltIns();
        Intrinsics.checkNotNullExpressionValue(builtIns, "getBuiltIns(...)");
        return builtIns;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: getDeclarationDescriptor */
    public final ClassifierDescriptor mo3795getDeclarationDescriptor() {
        return this.f144515c.mo3795getDeclarationDescriptor();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final List getParameters() {
        List<TypeParameterDescriptor> parameters = this.f144515c.getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
        return parameters;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final Collection getSupertypes() {
        return (List) this.f144514b.getValue();
    }

    public final int hashCode() {
        return this.f144515c.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final boolean isDenotable() {
        return this.f144515c.isDenotable();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final TypeConstructor refine(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this.f144515c.refine(kotlinTypeRefiner);
    }

    public final String toString() {
        return this.f144515c.toString();
    }
}
