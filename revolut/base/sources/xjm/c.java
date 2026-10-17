package xjm;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;

/* JADX INFO: loaded from: classes14.dex */
public final class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CallableDescriptor f306588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CallableDescriptor f306589b;

    public c(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        this.f306588a = callableDescriptor;
        this.f306589b = callableDescriptor2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return Boolean.valueOf(Intrinsics.f((DeclarationDescriptor) obj2, this.f306588a) && Intrinsics.f((DeclarationDescriptor) obj3, this.f306589b));
    }
}
