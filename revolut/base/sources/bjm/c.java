package bjm;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16201b;

    public /* synthetic */ c(Object obj2, int i) {
        this.f16200a = i;
        this.f16201b = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f16200a) {
            case 0:
                Name name = (Name) obj2;
                ClassifierDescriptor classifierDescriptorMo3796getContributedClassifier = ((KotlinBuiltIns) this.f16201b).getBuiltInsPackageScope().mo3796getContributedClassifier(name, NoLookupLocation.FROM_BUILTINS);
                if (classifierDescriptorMo3796getContributedClassifier == null) {
                    throw new AssertionError("Built-in class " + StandardNames.BUILT_INS_PACKAGE_FQ_NAME.child(name) + " is not found");
                }
                if (classifierDescriptorMo3796getContributedClassifier instanceof ClassDescriptor) {
                    return (ClassDescriptor) classifierDescriptorMo3796getContributedClassifier;
                }
                throw new AssertionError("Must be a class descriptor " + name + ", but was " + classifierDescriptorMo3796getContributedClassifier);
            case 1:
                ((ifm.c) this.f16201b).dispose();
                return Unit.f186387a;
            case 2:
                KotlinTypeRefiner kotlinTypeRefiner = (KotlinTypeRefiner) obj2;
                fjm.a aVar = (fjm.a) this.f16201b;
                ClassifierDescriptor classifierDescriptorRefineDescriptor = kotlinTypeRefiner.refineDescriptor(aVar.f135680b);
                return classifierDescriptorRefineDescriptor == null ? (SimpleType) aVar.f135680b.f186565b.invoke() : classifierDescriptorRefineDescriptor instanceof TypeAliasDescriptor ? KotlinTypeFactory.computeExpandedType((TypeAliasDescriptor) classifierDescriptorRefineDescriptor, TypeUtils.getDefaultTypeProjections(classifierDescriptorRefineDescriptor.getTypeConstructor().getParameters())) : classifierDescriptorRefineDescriptor instanceof ModuleAwareClassDescriptor ? TypeUtils.makeUnsubstitutedType(classifierDescriptorRefineDescriptor.getTypeConstructor().refine(kotlinTypeRefiner), ((ModuleAwareClassDescriptor) classifierDescriptorRefineDescriptor).getUnsubstitutedMemberScope(kotlinTypeRefiner), this) : classifierDescriptorRefineDescriptor.getDefaultType();
            default:
                ((lcm.a) this.f16201b).cancel(false);
                return Unit.f186387a;
        }
    }
}
