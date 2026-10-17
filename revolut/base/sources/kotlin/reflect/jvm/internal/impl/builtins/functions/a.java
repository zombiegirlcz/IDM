package kotlin.reflect.jvm.internal.impl.builtins.functions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.utils.addToStdlib.AddToStdlibKt;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes14.dex */
public final class a extends AbstractClassTypeConstructor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FunctionClassDescriptor f186487c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(FunctionClassDescriptor functionClassDescriptor) {
        super(functionClassDescriptor.e);
        this.f186487c = functionClassDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    public final Collection b() {
        List listK;
        FunctionClassDescriptor functionClassDescriptor = this.f186487c;
        FunctionTypeKind functionTypeKind = functionClassDescriptor.getFunctionTypeKind();
        FunctionTypeKind.Function function = FunctionTypeKind.Function.INSTANCE;
        if (Intrinsics.f(functionTypeKind, function)) {
            listK = u.c(FunctionClassDescriptor.f186475l);
        } else if (Intrinsics.f(functionTypeKind, FunctionTypeKind.KFunction.INSTANCE)) {
            listK = v.k(FunctionClassDescriptor.f186476m, new ClassId(StandardNames.BUILT_INS_PACKAGE_FQ_NAME, function.numberedClassName(functionClassDescriptor.getArity())));
        } else {
            FunctionTypeKind.SuspendFunction suspendFunction = FunctionTypeKind.SuspendFunction.INSTANCE;
            if (Intrinsics.f(functionTypeKind, suspendFunction)) {
                listK = u.c(FunctionClassDescriptor.f186475l);
            } else {
                if (!Intrinsics.f(functionTypeKind, FunctionTypeKind.KSuspendFunction.INSTANCE)) {
                    AddToStdlibKt.shouldNotBeCalled$default(null, 1, null);
                    throw new KotlinNothingValueException();
                }
                listK = v.k(FunctionClassDescriptor.f186476m, new ClassId(StandardNames.COROUTINES_PACKAGE_FQ_NAME, suspendFunction.numberedClassName(functionClassDescriptor.getArity())));
            }
        }
        ModuleDescriptor containingDeclaration = functionClassDescriptor.f.getContainingDeclaration();
        List<ClassId> list = listK;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (ClassId classId : list) {
            ClassDescriptor classDescriptorFindClassAcrossModuleDependencies = FindClassInModuleKt.findClassAcrossModuleDependencies(containingDeclaration, classId);
            if (classDescriptorFindClassAcrossModuleDependencies == null) {
                throw new IllegalStateException(("Built-in class " + classId + " not found").toString());
            }
            List listW0 = d0.W0(classDescriptorFindClassAcrossModuleDependencies.getTypeConstructor().getParameters().size(), functionClassDescriptor.k);
            ArrayList arrayList2 = new ArrayList(w.t(listW0, 10));
            Iterator it8 = listW0.iterator();
            while (it8.hasNext()) {
                arrayList2.add(new TypeProjectionImpl(((TypeParameterDescriptor) it8.next()).getDefaultType()));
            }
            arrayList.add(KotlinTypeFactory.simpleNotNullType(TypeAttributes.Companion.getEmpty(), classDescriptorFindClassAcrossModuleDependencies, arrayList2));
        }
        return d0.d1(arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    public final SupertypeLoopChecker e() {
        return SupertypeLoopChecker.EMPTY.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: getDeclarationDescriptor */
    public final ClassDescriptor mo3795getDeclarationDescriptor() {
        return this.f186487c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final List getParameters() {
        return this.f186487c.k;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final boolean isDenotable() {
        return true;
    }

    public final String toString() {
        return this.f186487c.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: getDeclarationDescriptor */
    public final ClassifierDescriptor mo3795getDeclarationDescriptor() {
        return this.f186487c;
    }
}
