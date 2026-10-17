package zim;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;

/* JADX INFO: loaded from: classes14.dex */
public final class q1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f322686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r1 f322687b;

    public /* synthetic */ q1(r1 r1Var, int i) {
        this.f322686a = i;
        this.f322687b = r1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f322686a) {
            case 0:
                r1 r1Var = this.f322687b;
                PropertyGetterDescriptor getter = r1Var.r().j().getGetter();
                if (getter != null) {
                    return getter;
                }
                PropertyGetterDescriptorImpl propertyGetterDescriptorImplCreateDefaultGetter = DescriptorFactory.createDefaultGetter(r1Var.r().j(), Annotations.Companion.getEMPTY());
                Intrinsics.checkNotNullExpressionValue(propertyGetterDescriptorImplCreateDefaultGetter, "createDefaultGetter(...)");
                return propertyGetterDescriptorImplCreateDefaultGetter;
            default:
                return v1.a(this.f322687b, true);
        }
    }
}
