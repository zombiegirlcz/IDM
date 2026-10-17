package zim;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorVisitorEmptyBodies;

/* JADX INFO: loaded from: classes14.dex */
public class f extends DeclarationDescriptorVisitorEmptyBodies {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f322634a;

    public f(l0 container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f322634a = container;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorVisitorEmptyBodies, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public final Object visitFunctionDescriptor(FunctionDescriptor descriptor, Object obj2) {
        Unit data = (Unit) obj2;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(data, "data");
        return new n0(this.f322634a, descriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorVisitorEmptyBodies, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public final Object visitPropertyDescriptor(PropertyDescriptor descriptor, Object obj2) {
        int i;
        Unit data = (Unit) obj2;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(data, "data");
        List<ReceiverParameterDescriptor> contextReceiverParameters = descriptor.getContextReceiverParameters();
        Intrinsics.checkNotNullExpressionValue(contextReceiverParameters, "getContextReceiverParameters(...)");
        if (contextReceiverParameters.isEmpty()) {
            i = (descriptor.getDispatchReceiverParameter() != null ? 1 : 0) + (descriptor.getExtensionReceiverParameter() != null ? 1 : 0);
        } else {
            i = -1;
        }
        boolean zIsVar = descriptor.isVar();
        l0 l0Var = this.f322634a;
        if (zIsVar) {
            if (i == -1) {
                return new v0(l0Var, descriptor);
            }
            if (i == 0) {
                return new p0(l0Var, descriptor);
            }
            if (i == 1) {
                return new r0(l0Var, descriptor);
            }
            if (i == 2) {
                return new t0(l0Var, descriptor);
            }
        } else {
            if (i == -1) {
                return new x1(l0Var, descriptor);
            }
            if (i == 0) {
                return new g1(l0Var, descriptor);
            }
            if (i == 1) {
                return new j1(l0Var, descriptor);
            }
            if (i == 2) {
                return new m1(l0Var, descriptor);
            }
        }
        throw new KotlinReflectionInternalError("Unsupported property: " + descriptor);
    }
}
