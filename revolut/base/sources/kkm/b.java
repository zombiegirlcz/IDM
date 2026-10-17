package kkm;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes14.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TypeParameterDescriptor f185137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KotlinType f185138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KotlinType f185139c;

    public b(TypeParameterDescriptor typeParameter, KotlinType inProjection, KotlinType outProjection) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        Intrinsics.checkNotNullParameter(inProjection, "inProjection");
        Intrinsics.checkNotNullParameter(outProjection, "outProjection");
        this.f185137a = typeParameter;
        this.f185138b = inProjection;
        this.f185139c = outProjection;
    }
}
