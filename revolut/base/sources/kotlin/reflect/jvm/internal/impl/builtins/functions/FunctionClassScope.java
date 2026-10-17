package kotlin.reflect.jvm.internal.impl.builtins.functions;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes14.dex */
public final class FunctionClassScope extends GivenFunctionsMemberScope {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FunctionClassScope(@NotNull StorageManager storageManager, @NotNull FunctionClassDescriptor containingClass) {
        super(storageManager, containingClass);
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(containingClass, "containingClass");
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope
    public final List a() {
        ClassDescriptor classDescriptor = this.f187616a;
        Intrinsics.i(classDescriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.builtins.functions.FunctionClassDescriptor");
        FunctionTypeKind functionTypeKind = ((FunctionClassDescriptor) classDescriptor).getFunctionTypeKind();
        return Intrinsics.f(functionTypeKind, FunctionTypeKind.Function.INSTANCE) ? u.c(FunctionInvokeDescriptor.Factory.create((FunctionClassDescriptor) classDescriptor, false)) : Intrinsics.f(functionTypeKind, FunctionTypeKind.SuspendFunction.INSTANCE) ? u.c(FunctionInvokeDescriptor.Factory.create((FunctionClassDescriptor) classDescriptor, true)) : f0.f322471a;
    }
}
