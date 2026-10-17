package kotlin.reflect.jvm.internal.impl.resolve;

import b9.u;
import java.util.Collection;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;
import xjm.b;
import zhm.d0;

/* JADX INFO: loaded from: classes14.dex */
public final class DescriptorEquivalenceForOverrides {

    @NotNull
    public static final DescriptorEquivalenceForOverrides INSTANCE = new DescriptorEquivalenceForOverrides();

    public static SourceElement a(CallableDescriptor callableDescriptor) {
        while (callableDescriptor instanceof CallableMemberDescriptor) {
            CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) callableDescriptor;
            if (callableMemberDescriptor.getKind() != CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
                break;
            }
            Collection<? extends CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
            Intrinsics.checkNotNullExpressionValue(overriddenDescriptors, "getOverriddenDescriptors(...)");
            callableDescriptor = (CallableMemberDescriptor) d0.L0(overriddenDescriptors);
            if (callableDescriptor == null) {
                return null;
            }
        }
        return callableDescriptor.getSource();
    }

    public static /* synthetic */ boolean areCallableDescriptorsEquivalent$default(DescriptorEquivalenceForOverrides descriptorEquivalenceForOverrides, CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, boolean z, boolean z3, boolean z4, KotlinTypeRefiner kotlinTypeRefiner, int i, Object obj2) {
        if ((i & 8) != 0) {
            z3 = true;
        }
        boolean z6 = z3;
        if ((i & 16) != 0) {
            z4 = false;
        }
        return descriptorEquivalenceForOverrides.areCallableDescriptorsEquivalent(callableDescriptor, callableDescriptor2, z, z6, z4, kotlinTypeRefiner);
    }

    public static /* synthetic */ boolean areEquivalent$default(DescriptorEquivalenceForOverrides descriptorEquivalenceForOverrides, DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2, boolean z, boolean z3, int i, Object obj2) {
        if ((i & 8) != 0) {
            z3 = true;
        }
        return descriptorEquivalenceForOverrides.areEquivalent(declarationDescriptor, declarationDescriptor2, z, z3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean areTypeParametersEquivalent$default(DescriptorEquivalenceForOverrides descriptorEquivalenceForOverrides, TypeParameterDescriptor typeParameterDescriptor, TypeParameterDescriptor typeParameterDescriptor2, boolean z, Function2 function2, int i, Object obj2) {
        if ((i & 8) != 0) {
            function2 = b.f306586b;
        }
        return descriptorEquivalenceForOverrides.areTypeParametersEquivalent(typeParameterDescriptor, typeParameterDescriptor2, z, function2);
    }

    public final boolean areCallableDescriptorsEquivalent(@NotNull CallableDescriptor a7, @NotNull CallableDescriptor b4, boolean z, boolean z3, boolean z4, @NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        if (!Intrinsics.f(a7, b4)) {
            if (Intrinsics.f(a7.getName(), b4.getName()) && ((!z3 || !(a7 instanceof MemberDescriptor) || !(b4 instanceof MemberDescriptor) || ((MemberDescriptor) a7).isExpect() == ((MemberDescriptor) b4).isExpect()) && ((!Intrinsics.f(a7.getContainingDeclaration(), b4.getContainingDeclaration()) || (z && Intrinsics.f(a(a7), a(b4)))) && !DescriptorUtils.isLocal(a7) && !DescriptorUtils.isLocal(b4)))) {
                DeclarationDescriptor containingDeclaration = a7.getContainingDeclaration();
                DeclarationDescriptor containingDeclaration2 = b4.getContainingDeclaration();
                if (((containingDeclaration instanceof CallableMemberDescriptor) || (containingDeclaration2 instanceof CallableMemberDescriptor)) ? false : areEquivalent$default(this, containingDeclaration, containingDeclaration2, z, false, 8, null)) {
                    u uVar = new u();
                    uVar.f13476a = z;
                    uVar.f13477b = a7;
                    uVar.f13478c = b4;
                    OverridingUtil overridingUtilCreate = OverridingUtil.create(kotlinTypeRefiner, uVar);
                    Intrinsics.checkNotNullExpressionValue(overridingUtilCreate, "create(...)");
                    boolean z6 = !z4;
                    OverridingUtil.OverrideCompatibilityInfo.Result result = overridingUtilCreate.isOverridableBy(a7, b4, null, z6).getResult();
                    OverridingUtil.OverrideCompatibilityInfo.Result result2 = OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE;
                    if (result != result2 || overridingUtilCreate.isOverridableBy(b4, a7, null, z6).getResult() != result2) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean areEquivalent(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2, boolean z, boolean z3) {
        return ((declarationDescriptor instanceof ClassDescriptor) && (declarationDescriptor2 instanceof ClassDescriptor)) ? Intrinsics.f(((ClassDescriptor) declarationDescriptor).getTypeConstructor(), ((ClassDescriptor) declarationDescriptor2).getTypeConstructor()) : ((declarationDescriptor instanceof TypeParameterDescriptor) && (declarationDescriptor2 instanceof TypeParameterDescriptor)) ? areTypeParametersEquivalent$default(this, (TypeParameterDescriptor) declarationDescriptor, (TypeParameterDescriptor) declarationDescriptor2, z, null, 8, null) : ((declarationDescriptor instanceof CallableDescriptor) && (declarationDescriptor2 instanceof CallableDescriptor)) ? areCallableDescriptorsEquivalent$default(this, (CallableDescriptor) declarationDescriptor, (CallableDescriptor) declarationDescriptor2, z, z3, false, KotlinTypeRefiner.Default.INSTANCE, 16, null) : ((declarationDescriptor instanceof PackageFragmentDescriptor) && (declarationDescriptor2 instanceof PackageFragmentDescriptor)) ? Intrinsics.f(((PackageFragmentDescriptor) declarationDescriptor).getFqName(), ((PackageFragmentDescriptor) declarationDescriptor2).getFqName()) : Intrinsics.f(declarationDescriptor, declarationDescriptor2);
    }

    public final boolean areTypeParametersEquivalent(@NotNull TypeParameterDescriptor a7, @NotNull TypeParameterDescriptor b4, boolean z) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        return areTypeParametersEquivalent$default(this, a7, b4, z, null, 8, null);
    }

    public final boolean areTypeParametersEquivalent(@NotNull TypeParameterDescriptor a7, @NotNull TypeParameterDescriptor b4, boolean z, @NotNull Function2<? super DeclarationDescriptor, ? super DeclarationDescriptor, Boolean> equivalentCallables) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        Intrinsics.checkNotNullParameter(equivalentCallables, "equivalentCallables");
        if (Intrinsics.f(a7, b4)) {
            return true;
        }
        if (Intrinsics.f(a7.getContainingDeclaration(), b4.getContainingDeclaration())) {
            return false;
        }
        DeclarationDescriptor containingDeclaration = a7.getContainingDeclaration();
        DeclarationDescriptor containingDeclaration2 = b4.getContainingDeclaration();
        return (((containingDeclaration instanceof CallableMemberDescriptor) || (containingDeclaration2 instanceof CallableMemberDescriptor)) ? ((Boolean) equivalentCallables.invoke(containingDeclaration, containingDeclaration2)).booleanValue() : areEquivalent$default(this, containingDeclaration, containingDeclaration2, z, false, 8, null)) && a7.getIndex() == b4.getIndex();
    }
}
