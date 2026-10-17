package zim;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;

/* JADX INFO: loaded from: classes14.dex */
public final class s1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f322696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t1 f322697b;

    public /* synthetic */ s1(t1 t1Var, int i) {
        this.f322696a = i;
        this.f322697b = t1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f322696a) {
            case 0:
                t1 t1Var = this.f322697b;
                PropertySetterDescriptor setter = t1Var.r().j().getSetter();
                if (setter != null) {
                    return setter;
                }
                PropertyDescriptor propertyDescriptorJ = t1Var.r().j();
                Annotations.Companion companion = Annotations.Companion;
                PropertySetterDescriptorImpl propertySetterDescriptorImplCreateDefaultSetter = DescriptorFactory.createDefaultSetter(propertyDescriptorJ, companion.getEMPTY(), companion.getEMPTY());
                Intrinsics.checkNotNullExpressionValue(propertySetterDescriptorImplCreateDefaultSetter, "createDefaultSetter(...)");
                return propertySetterDescriptorImplCreateDefaultSetter;
            default:
                return v1.a(this.f322697b, false);
        }
    }
}
