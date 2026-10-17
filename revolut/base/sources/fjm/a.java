package fjm;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyClassReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.InnerClassesScopeWrapper;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractClassDescriptor f135680b;

    public /* synthetic */ a(AbstractClassDescriptor abstractClassDescriptor, int i) {
        this.f135679a = i;
        this.f135680b = abstractClassDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f135679a) {
            case 0:
                AbstractClassDescriptor abstractClassDescriptor = this.f135680b;
                return TypeUtils.makeUnsubstitutedType(abstractClassDescriptor, abstractClassDescriptor.getUnsubstitutedMemberScope(), new bjm.c(this, 2));
            case 1:
                return new InnerClassesScopeWrapper(this.f135680b.getUnsubstitutedMemberScope());
            default:
                return new LazyClassReceiverParameterDescriptor(this.f135680b);
        }
    }
}
