package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyAccessorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import nyb.q;
import org.jetbrains.annotations.NotNull;
import ro7.n;
import xjm.b;
import xjm.e;
import xjm.f;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes13.dex */
public class OverridingUtil {
    public static final OverridingUtil DEFAULT;
    public static final List d = d0.d1(ServiceLoader.load(ExternalOverridabilityCondition.class, ExternalOverridabilityCondition.class.getClassLoader()));
    public static final f e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KotlinTypeRefiner f187560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KotlinTypePreparator f187561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KotlinTypeChecker.TypeConstructorEquality f187562c;

    /* JADX INFO: loaded from: classes14.dex */
    public static class OverrideCompatibilityInfo {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final OverrideCompatibilityInfo f187563c = new OverrideCompatibilityInfo(Result.OVERRIDABLE, "SUCCESS");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Result f187564a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f187565b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class Result {
            private static final /* synthetic */ Result[] $VALUES;
            public static final Result CONFLICT;
            public static final Result INCOMPATIBLE;
            public static final Result OVERRIDABLE;

            static {
                Result result = new Result("OVERRIDABLE", 0);
                OVERRIDABLE = result;
                Result result2 = new Result("INCOMPATIBLE", 1);
                INCOMPATIBLE = result2;
                Result result3 = new Result("CONFLICT", 2);
                CONFLICT = result3;
                $VALUES = new Result[]{result, result2, result3};
            }

            public static Result valueOf(String str) {
                return (Result) Enum.valueOf(Result.class, str);
            }

            public static Result[] values() {
                return (Result[]) $VALUES.clone();
            }
        }

        public OverrideCompatibilityInfo(@NotNull Result result, @NotNull String str) {
            if (result == null) {
                a(3);
                throw null;
            }
            if (str == null) {
                a(4);
                throw null;
            }
            this.f187564a = result;
            this.f187565b = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static /* synthetic */ void a(int r10) {
            /*
                r0 = 4
                r1 = 3
                r2 = 2
                r3 = 1
                if (r10 == r3) goto Lf
                if (r10 == r2) goto Lf
                if (r10 == r1) goto Lf
                if (r10 == r0) goto Lf
                java.lang.String r4 = "@NotNull method %s.%s must not return null"
                goto L11
            Lf:
                java.lang.String r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            L11:
                if (r10 == r3) goto L1b
                if (r10 == r2) goto L1b
                if (r10 == r1) goto L1b
                if (r10 == r0) goto L1b
                r5 = r2
                goto L1c
            L1b:
                r5 = r1
            L1c:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "success"
                java.lang.String r7 = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo"
                r8 = 0
                if (r10 == r3) goto L31
                if (r10 == r2) goto L31
                if (r10 == r1) goto L2e
                if (r10 == r0) goto L31
                r5[r8] = r7
                goto L35
            L2e:
                r5[r8] = r6
                goto L35
            L31:
                java.lang.String r9 = "debugMessage"
                r5[r8] = r9
            L35:
                switch(r10) {
                    case 1: goto L45;
                    case 2: goto L45;
                    case 3: goto L45;
                    case 4: goto L45;
                    case 5: goto L40;
                    case 6: goto L3b;
                    default: goto L38;
                }
            L38:
                r5[r3] = r6
                goto L47
            L3b:
                java.lang.String r6 = "getDebugMessage"
                r5[r3] = r6
                goto L47
            L40:
                java.lang.String r6 = "getResult"
                r5[r3] = r6
                goto L47
            L45:
                r5[r3] = r7
            L47:
                if (r10 == r3) goto L5a
                if (r10 == r2) goto L55
                if (r10 == r1) goto L50
                if (r10 == r0) goto L50
                goto L5e
            L50:
                java.lang.String r6 = "<init>"
                r5[r2] = r6
                goto L5e
            L55:
                java.lang.String r6 = "conflict"
                r5[r2] = r6
                goto L5e
            L5a:
                java.lang.String r6 = "incompatible"
                r5[r2] = r6
            L5e:
                java.lang.String r4 = java.lang.String.format(r4, r5)
                if (r10 == r3) goto L70
                if (r10 == r2) goto L70
                if (r10 == r1) goto L70
                if (r10 == r0) goto L70
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                r10.<init>(r4)
                goto L75
            L70:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                r10.<init>(r4)
            L75:
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.a(int):void");
        }

        @NotNull
        public static OverrideCompatibilityInfo conflict(@NotNull String str) {
            if (str != null) {
                return new OverrideCompatibilityInfo(Result.CONFLICT, str);
            }
            a(2);
            throw null;
        }

        @NotNull
        public static OverrideCompatibilityInfo incompatible(@NotNull String str) {
            if (str != null) {
                return new OverrideCompatibilityInfo(Result.INCOMPATIBLE, str);
            }
            a(1);
            throw null;
        }

        @NotNull
        public static OverrideCompatibilityInfo success() {
            OverrideCompatibilityInfo overrideCompatibilityInfo = f187563c;
            if (overrideCompatibilityInfo != null) {
                return overrideCompatibilityInfo;
            }
            a(0);
            throw null;
        }

        @NotNull
        public Result getResult() {
            Result result = this.f187564a;
            if (result != null) {
                return result;
            }
            a(5);
            throw null;
        }

        public String toString() {
            return this.f187564a + ": " + this.f187565b;
        }
    }

    static {
        f fVar = new f();
        e = fVar;
        DEFAULT = new OverridingUtil(fVar, KotlinTypeRefiner.Default.INSTANCE, KotlinTypePreparator.Default.INSTANCE);
    }

    public OverridingUtil(KotlinTypeChecker.TypeConstructorEquality typeConstructorEquality, KotlinTypeRefiner kotlinTypeRefiner, KotlinTypePreparator.Default r4) {
        if (typeConstructorEquality == null) {
            a(5);
            throw null;
        }
        if (kotlinTypeRefiner == null) {
            a(6);
            throw null;
        }
        if (r4 == null) {
            a(7);
            throw null;
        }
        this.f187562c = typeConstructorEquality;
        this.f187560a = kotlinTypeRefiner;
        this.f187561b = r4;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(int r25) {
        /*
            Method dump skipped, instruction units count: 1296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.a(int):void");
    }

    public static boolean b(KotlinType kotlinType, KotlinType kotlinType2, TypeCheckerState typeCheckerState) {
        if (kotlinType == null) {
            a(44);
            throw null;
        }
        if (kotlinType2 == null) {
            a(45);
            throw null;
        }
        if (typeCheckerState == null) {
            a(46);
            throw null;
        }
        if (KotlinTypeKt.isError(kotlinType) && KotlinTypeKt.isError(kotlinType2)) {
            return true;
        }
        return AbstractTypeChecker.INSTANCE.equalTypes(typeCheckerState, kotlinType.unwrap(), kotlinType2.unwrap());
    }

    public static void c(CallableMemberDescriptor callableMemberDescriptor, LinkedHashSet linkedHashSet) {
        if (callableMemberDescriptor == null) {
            a(17);
            throw null;
        }
        if (callableMemberDescriptor.getKind().isReal()) {
            linkedHashSet.add(callableMemberDescriptor);
            return;
        }
        if (callableMemberDescriptor.getOverriddenDescriptors().isEmpty()) {
            throw new IllegalStateException("No overridden descriptors found for (fake override) " + callableMemberDescriptor);
        }
        Iterator<? extends CallableMemberDescriptor> it8 = callableMemberDescriptor.getOverriddenDescriptors().iterator();
        while (it8.hasNext()) {
            c(it8.next(), linkedHashSet);
        }
    }

    @NotNull
    public static OverridingUtil create(@NotNull KotlinTypeRefiner kotlinTypeRefiner, @NotNull KotlinTypeChecker.TypeConstructorEquality typeConstructorEquality) {
        if (kotlinTypeRefiner == null) {
            a(3);
            throw null;
        }
        if (typeConstructorEquality != null) {
            return new OverridingUtil(typeConstructorEquality, kotlinTypeRefiner, KotlinTypePreparator.Default.INSTANCE);
        }
        a(4);
        throw null;
    }

    @NotNull
    public static OverridingUtil createWithTypeRefiner(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        if (kotlinTypeRefiner != null) {
            return new OverridingUtil(e, kotlinTypeRefiner, KotlinTypePreparator.Default.INSTANCE);
        }
        a(0);
        throw null;
    }

    public static ArrayList d(CallableDescriptor callableDescriptor) {
        ReceiverParameterDescriptor extensionReceiverParameter = callableDescriptor.getExtensionReceiverParameter();
        ArrayList arrayList = new ArrayList();
        if (extensionReceiverParameter != null) {
            arrayList.add(extensionReceiverParameter.getType());
        }
        Iterator<ValueParameterDescriptor> it8 = callableDescriptor.getValueParameters().iterator();
        while (it8.hasNext()) {
            arrayList.add(it8.next().getType());
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
    
        r8 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f2, code lost:
    
        if (r2 == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00f4, code lost:
    
        r0 = kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.INVISIBLE_FAKE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f8, code lost:
    
        r0 = kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.INHERITED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00fb, code lost:
    
        r13 = ((kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) selectMostSpecificMember(r12, new xjm.e(1))).copy(r13, r8, r0, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.FAKE_OVERRIDE, false);
        r14.setOverriddenDescriptors(r13, r12);
        r14.addFakeOverride(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0116, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(java.util.Collection r12, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r13, kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy r14) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.e(java.util.Collection, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy):void");
    }

    @NotNull
    public static <H> Collection<H> extractMembersOverridableInBothWays(@NotNull H h2, @NotNull Collection<H> collection, @NotNull Function1<H, CallableDescriptor> function1, @NotNull Function1<H, Unit> function12) {
        if (h2 == null) {
            a(97);
            throw null;
        }
        if (collection == null) {
            a(98);
            throw null;
        }
        if (function1 == null) {
            a(99);
            throw null;
        }
        if (function12 == null) {
            a(100);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(h2);
        CallableDescriptor callableDescriptor = (CallableDescriptor) function1.invoke(h2);
        Iterator<H> it8 = collection.iterator();
        while (it8.hasNext()) {
            H next = it8.next();
            CallableDescriptor callableDescriptor2 = (CallableDescriptor) function1.invoke(next);
            if (h2 == next) {
                it8.remove();
            } else {
                OverrideCompatibilityInfo.Result bothWaysOverridability = getBothWaysOverridability(callableDescriptor, callableDescriptor2);
                if (bothWaysOverridability == OverrideCompatibilityInfo.Result.OVERRIDABLE) {
                    arrayList.add(next);
                    it8.remove();
                } else if (bothWaysOverridability == OverrideCompatibilityInfo.Result.CONFLICT) {
                    function12.invoke(next);
                    it8.remove();
                }
            }
        }
        return arrayList;
    }

    @NotNull
    public static <D extends CallableDescriptor> Set<D> filterOutOverridden(@NotNull Set<D> set) {
        if (set != null) {
            return filterOverrides(set, !set.isEmpty() && DescriptorUtilsKt.isTypeRefinementEnabled(DescriptorUtilsKt.getModule(set.iterator().next())), null, new b(1));
        }
        a(8);
        throw null;
    }

    @NotNull
    public static <D> Set<D> filterOverrides(@NotNull Set<D> set, boolean z, Function0<?> function0, @NotNull Function2<? super D, ? super D, Pair<CallableDescriptor, CallableDescriptor>> function2) {
        if (set == null) {
            a(9);
            throw null;
        }
        if (function2 == null) {
            a(10);
            throw null;
        }
        if (set.size() <= 1) {
            return set;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (D d5 : set) {
            if (function0 != null) {
                function0.invoke();
            }
            Iterator it8 = linkedHashSet.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    linkedHashSet.add(d5);
                    break;
                }
                Pair pair = (Pair) function2.invoke(d5, it8.next());
                CallableDescriptor callableDescriptor = (CallableDescriptor) pair.f186385a;
                CallableDescriptor callableDescriptor2 = (CallableDescriptor) pair.f186386b;
                if (!overrides(callableDescriptor, callableDescriptor2, z, true)) {
                    if (overrides(callableDescriptor2, callableDescriptor, z, true)) {
                        break;
                    }
                } else {
                    it8.remove();
                }
            }
        }
        return linkedHashSet;
    }

    @NotNull
    public static Collection<CallableMemberDescriptor> filterVisibleFakeOverrides(@NotNull ClassDescriptor classDescriptor, @NotNull Collection<CallableMemberDescriptor> collection) {
        if (classDescriptor == null) {
            a(94);
            throw null;
        }
        if (collection != null) {
            return d0.Y(collection, new n(classDescriptor, 23));
        }
        a(95);
        throw null;
    }

    public static DescriptorVisibility findMaxVisibility(@NotNull Collection<? extends CallableMemberDescriptor> collection) {
        DescriptorVisibility descriptorVisibility;
        if (collection == null) {
            a(107);
            throw null;
        }
        if (collection.isEmpty()) {
            return DescriptorVisibilities.DEFAULT_VISIBILITY;
        }
        Iterator<? extends CallableMemberDescriptor> it8 = collection.iterator();
        loop0: while (true) {
            descriptorVisibility = null;
            while (it8.hasNext()) {
                DescriptorVisibility visibility = it8.next().getVisibility();
                if (descriptorVisibility != null) {
                    Integer numCompare = DescriptorVisibilities.compare(visibility, descriptorVisibility);
                    if (numCompare == null) {
                        break;
                    }
                    if (numCompare.intValue() > 0) {
                    }
                }
                descriptorVisibility = visibility;
            }
        }
        if (descriptorVisibility == null) {
            return null;
        }
        Iterator<? extends CallableMemberDescriptor> it9 = collection.iterator();
        while (it9.hasNext()) {
            Integer numCompare2 = DescriptorVisibilities.compare(descriptorVisibility, it9.next().getVisibility());
            if (numCompare2 == null || numCompare2.intValue() < 0) {
                return null;
            }
        }
        return descriptorVisibility;
    }

    public static boolean g(CallableDescriptor callableDescriptor, KotlinType kotlinType, CallableDescriptor callableDescriptor2, KotlinType kotlinType2, TypeCheckerState typeCheckerState) {
        if (kotlinType == null) {
            a(72);
            throw null;
        }
        if (kotlinType2 == null) {
            a(74);
            throw null;
        }
        if (typeCheckerState != null) {
            return AbstractTypeChecker.INSTANCE.isSubtypeOf(typeCheckerState, kotlinType.unwrap(), kotlinType2.unwrap());
        }
        a(75);
        throw null;
    }

    public static OverrideCompatibilityInfo getBasicOverridabilityProblem(@NotNull CallableDescriptor callableDescriptor, @NotNull CallableDescriptor callableDescriptor2) {
        boolean z;
        if (callableDescriptor == null) {
            a(38);
            throw null;
        }
        if (callableDescriptor2 == null) {
            a(39);
            throw null;
        }
        boolean z3 = callableDescriptor instanceof FunctionDescriptor;
        if ((z3 && !(callableDescriptor2 instanceof FunctionDescriptor)) || (((z = callableDescriptor instanceof PropertyDescriptor)) && !(callableDescriptor2 instanceof PropertyDescriptor))) {
            return OverrideCompatibilityInfo.incompatible("Member kind mismatch");
        }
        if (!z3 && !z) {
            throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + callableDescriptor);
        }
        if (!callableDescriptor.getName().equals(callableDescriptor2.getName())) {
            return OverrideCompatibilityInfo.incompatible("Name mismatch");
        }
        OverrideCompatibilityInfo overrideCompatibilityInfoIncompatible = (callableDescriptor.getExtensionReceiverParameter() == null) != (callableDescriptor2.getExtensionReceiverParameter() == null) ? OverrideCompatibilityInfo.incompatible("Receiver presence mismatch") : callableDescriptor.getValueParameters().size() != callableDescriptor2.getValueParameters().size() ? OverrideCompatibilityInfo.incompatible("Value parameter number mismatch") : null;
        if (overrideCompatibilityInfoIncompatible != null) {
            return overrideCompatibilityInfoIncompatible;
        }
        return null;
    }

    public static OverrideCompatibilityInfo.Result getBothWaysOverridability(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        OverridingUtil overridingUtil = DEFAULT;
        OverrideCompatibilityInfo.Result result = overridingUtil.isOverridableBy(callableDescriptor2, callableDescriptor, null).getResult();
        OverrideCompatibilityInfo.Result result2 = overridingUtil.isOverridableBy(callableDescriptor, callableDescriptor2, null).getResult();
        OverrideCompatibilityInfo.Result result3 = OverrideCompatibilityInfo.Result.OVERRIDABLE;
        if (result == result3 && result2 == result3) {
            return result3;
        }
        OverrideCompatibilityInfo.Result result4 = OverrideCompatibilityInfo.Result.CONFLICT;
        return (result == result4 || result2 == result4) ? result4 : OverrideCompatibilityInfo.Result.INCOMPATIBLE;
    }

    @NotNull
    public static Set<CallableMemberDescriptor> getOverriddenDeclarations(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        if (callableMemberDescriptor == null) {
            a(15);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        c(callableMemberDescriptor, linkedHashSet);
        return linkedHashSet;
    }

    public static boolean h(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        if (callableDescriptor == null) {
            a(67);
            throw null;
        }
        if (callableDescriptor2 != null) {
            Integer numCompare = DescriptorVisibilities.compare(callableDescriptor.getVisibility(), callableDescriptor2.getVisibility());
            return numCompare == null || numCompare.intValue() >= 0;
        }
        a(68);
        throw null;
    }

    public static boolean isMoreSpecific(@NotNull CallableDescriptor callableDescriptor, @NotNull CallableDescriptor callableDescriptor2) {
        if (callableDescriptor == null) {
            a(65);
            throw null;
        }
        if (callableDescriptor2 == null) {
            a(66);
            throw null;
        }
        KotlinType returnType = callableDescriptor.getReturnType();
        KotlinType returnType2 = callableDescriptor2.getReturnType();
        if (!h(callableDescriptor, callableDescriptor2)) {
            return false;
        }
        TypeCheckerState typeCheckerStateF = DEFAULT.f(callableDescriptor.getTypeParameters(), callableDescriptor2.getTypeParameters());
        if (callableDescriptor instanceof FunctionDescriptor) {
            return g(callableDescriptor, returnType, callableDescriptor2, returnType2, typeCheckerStateF);
        }
        if (!(callableDescriptor instanceof PropertyDescriptor)) {
            throw new IllegalArgumentException("Unexpected callable: " + callableDescriptor.getClass());
        }
        PropertyDescriptor propertyDescriptor = (PropertyDescriptor) callableDescriptor;
        PropertyDescriptor propertyDescriptor2 = (PropertyDescriptor) callableDescriptor2;
        PropertySetterDescriptor setter = propertyDescriptor.getSetter();
        PropertySetterDescriptor setter2 = propertyDescriptor2.getSetter();
        if ((setter == null || setter2 == null) ? true : h(setter, setter2)) {
            return (propertyDescriptor.isVar() && propertyDescriptor2.isVar()) ? AbstractTypeChecker.INSTANCE.equalTypes(typeCheckerStateF, returnType.unwrap(), returnType2.unwrap()) : (propertyDescriptor.isVar() || !propertyDescriptor2.isVar()) && g(callableDescriptor, returnType, callableDescriptor2, returnType2, typeCheckerStateF);
        }
        return false;
    }

    public static boolean isVisibleForOverride(@NotNull MemberDescriptor memberDescriptor, @NotNull MemberDescriptor memberDescriptor2, boolean z) {
        if (memberDescriptor == null) {
            a(55);
            throw null;
        }
        if (memberDescriptor2 != null) {
            return !DescriptorVisibilities.isPrivate(memberDescriptor2.getVisibility()) && DescriptorVisibilities.isVisibleIgnoringReceiver(memberDescriptor2, memberDescriptor, z);
        }
        a(56);
        throw null;
    }

    public static <D extends CallableDescriptor> boolean overrides(@NotNull D d5, @NotNull D d6, boolean z, boolean z3) {
        if (d5 == null) {
            a(13);
            throw null;
        }
        if (d6 == null) {
            a(14);
            throw null;
        }
        if (!d5.equals(d6) && DescriptorEquivalenceForOverrides.INSTANCE.areEquivalent(d5.getOriginal(), d6.getOriginal(), z, z3)) {
            return true;
        }
        CallableDescriptor original = d6.getOriginal();
        Iterator it8 = DescriptorUtils.getAllOverriddenDescriptors(d5).iterator();
        while (it8.hasNext()) {
            if (DescriptorEquivalenceForOverrides.INSTANCE.areEquivalent(original, (CallableDescriptor) it8.next(), z, z3)) {
                return true;
            }
        }
        return false;
    }

    public static void resolveUnknownVisibilityForMember(@NotNull CallableMemberDescriptor callableMemberDescriptor, Function1<CallableMemberDescriptor, Unit> function1) {
        DescriptorVisibility descriptorVisibility;
        if (callableMemberDescriptor == null) {
            a(105);
            throw null;
        }
        for (CallableMemberDescriptor callableMemberDescriptor2 : callableMemberDescriptor.getOverriddenDescriptors()) {
            if (callableMemberDescriptor2.getVisibility() == DescriptorVisibilities.INHERITED) {
                resolveUnknownVisibilityForMember(callableMemberDescriptor2, function1);
            }
        }
        if (callableMemberDescriptor.getVisibility() != DescriptorVisibilities.INHERITED) {
            return;
        }
        Collection<? extends CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
        DescriptorVisibility descriptorVisibilityFindMaxVisibility = findMaxVisibility(overriddenDescriptors);
        if (descriptorVisibilityFindMaxVisibility == null) {
            descriptorVisibilityFindMaxVisibility = null;
            break;
        }
        if (callableMemberDescriptor.getKind() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
            for (CallableMemberDescriptor callableMemberDescriptor3 : overriddenDescriptors) {
                if (callableMemberDescriptor3.getModality() != Modality.ABSTRACT && !callableMemberDescriptor3.getVisibility().equals(descriptorVisibilityFindMaxVisibility)) {
                    descriptorVisibilityFindMaxVisibility = null;
                    break;
                }
            }
        } else {
            descriptorVisibilityFindMaxVisibility = descriptorVisibilityFindMaxVisibility.normalize();
        }
        if (descriptorVisibilityFindMaxVisibility == null) {
            if (function1 != null) {
                function1.invoke(callableMemberDescriptor);
            }
            descriptorVisibility = DescriptorVisibilities.PUBLIC;
        } else {
            descriptorVisibility = descriptorVisibilityFindMaxVisibility;
        }
        if (callableMemberDescriptor instanceof PropertyDescriptorImpl) {
            ((PropertyDescriptorImpl) callableMemberDescriptor).setVisibility(descriptorVisibility);
            Iterator<PropertyAccessorDescriptor> it8 = ((PropertyDescriptor) callableMemberDescriptor).getAccessors().iterator();
            while (it8.hasNext()) {
                resolveUnknownVisibilityForMember(it8.next(), descriptorVisibilityFindMaxVisibility == null ? null : function1);
            }
            return;
        }
        if (callableMemberDescriptor instanceof FunctionDescriptorImpl) {
            ((FunctionDescriptorImpl) callableMemberDescriptor).setVisibility(descriptorVisibility);
            return;
        }
        PropertyAccessorDescriptorImpl propertyAccessorDescriptorImpl = (PropertyAccessorDescriptorImpl) callableMemberDescriptor;
        propertyAccessorDescriptorImpl.setVisibility(descriptorVisibility);
        if (descriptorVisibility != propertyAccessorDescriptorImpl.getCorrespondingProperty().getVisibility()) {
            propertyAccessorDescriptorImpl.setDefault(false);
        }
    }

    @NotNull
    public static <H> H selectMostSpecificMember(@NotNull Collection<H> collection, @NotNull Function1<H, CallableDescriptor> transform) {
        H h2;
        if (collection == null) {
            a(76);
            throw null;
        }
        if (transform == null) {
            a(77);
            throw null;
        }
        if (collection.size() == 1) {
            H h3 = (H) d0.a0(collection);
            if (h3 != null) {
                return h3;
            }
            a(78);
            throw null;
        }
        ArrayList arrayList = new ArrayList(2);
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList2 = new ArrayList(w.t(collection, 10));
        Iterator<T> it8 = collection.iterator();
        while (it8.hasNext()) {
            arrayList2.add(transform.invoke(it8.next()));
        }
        H h34 = (H) d0.a0(collection);
        CallableDescriptor callableDescriptor = (CallableDescriptor) transform.invoke(h34);
        for (H h42 : collection) {
            CallableDescriptor callableDescriptor2 = (CallableDescriptor) transform.invoke(h42);
            if (callableDescriptor2 == null) {
                a(69);
                throw null;
            }
            Iterator it9 = arrayList2.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    arrayList.add(h42);
                    break;
                }
                if (!isMoreSpecific(callableDescriptor2, (CallableDescriptor) it9.next())) {
                    break;
                }
            }
            if (isMoreSpecific(callableDescriptor2, callableDescriptor) && !isMoreSpecific(callableDescriptor, callableDescriptor2)) {
                h34 = h42;
            }
        }
        if (arrayList.isEmpty()) {
            if (h34 != null) {
                return h34;
            }
            a(79);
            throw null;
        }
        if (arrayList.size() == 1) {
            H h47 = (H) d0.a0(arrayList);
            if (h47 != null) {
                return h47;
            }
            a(80);
            throw null;
        }
        Iterator it10 = arrayList.iterator();
        while (true) {
            if (!it10.hasNext()) {
                h2 = null;
                break;
            }
            h2 = (H) it10.next();
            if (!FlexibleTypesKt.isFlexible(((CallableDescriptor) transform.invoke(h2)).getReturnType())) {
                break;
            }
        }
        if (h2 != null) {
            return h2;
        }
        H h49 = (H) d0.a0(arrayList);
        if (h49 != null) {
            return h49;
        }
        a(82);
        throw null;
    }

    public final TypeCheckerState f(List list, List list2) {
        if (list == null) {
            a(40);
            throw null;
        }
        if (list2 == null) {
            a(41);
            throw null;
        }
        if (list.isEmpty()) {
            TypeCheckerState typeCheckerStateNewTypeCheckerState = new OverridingUtilTypeSystemContext(null, this.f187562c, this.f187560a, this.f187561b, null).newTypeCheckerState(true, true, false);
            if (typeCheckerStateNewTypeCheckerState != null) {
                return typeCheckerStateNewTypeCheckerState;
            }
            a(42);
            throw null;
        }
        HashMap map = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            map.put(((TypeParameterDescriptor) list.get(i)).getTypeConstructor(), ((TypeParameterDescriptor) list2.get(i)).getTypeConstructor());
        }
        TypeCheckerState typeCheckerStateNewTypeCheckerState2 = new OverridingUtilTypeSystemContext(map, this.f187562c, this.f187560a, this.f187561b, null).newTypeCheckerState(true, true, false);
        if (typeCheckerStateNewTypeCheckerState2 != null) {
            return typeCheckerStateNewTypeCheckerState2;
        }
        a(43);
        throw null;
    }

    public void generateOverridesInFunctionGroup(@NotNull Name name, @NotNull Collection<? extends CallableMemberDescriptor> collection, @NotNull Collection<? extends CallableMemberDescriptor> collection2, @NotNull ClassDescriptor classDescriptor, @NotNull OverridingStrategy overridingStrategy) {
        if (name == null) {
            a(50);
            throw null;
        }
        if (collection == null) {
            a(51);
            throw null;
        }
        if (collection2 == null) {
            a(52);
            throw null;
        }
        if (classDescriptor == null) {
            a(53);
            throw null;
        }
        if (overridingStrategy == null) {
            a(54);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        for (CallableMemberDescriptor callableMemberDescriptor : collection2) {
            if (callableMemberDescriptor == null) {
                a(57);
                throw null;
            }
            ArrayList arrayList = new ArrayList(collection.size());
            SmartSet smartSetCreate = SmartSet.create();
            for (CallableMemberDescriptor callableMemberDescriptor2 : collection) {
                OverrideCompatibilityInfo.Result result = isOverridableBy(callableMemberDescriptor2, callableMemberDescriptor, classDescriptor).getResult();
                boolean zIsVisibleForOverride = isVisibleForOverride(callableMemberDescriptor, callableMemberDescriptor2, false);
                int i = a.f187572b[result.ordinal()];
                if (i == 1) {
                    if (zIsVisibleForOverride) {
                        smartSetCreate.add(callableMemberDescriptor2);
                    }
                    arrayList.add(callableMemberDescriptor2);
                } else if (i == 2) {
                    if (zIsVisibleForOverride) {
                        overridingStrategy.overrideConflict(callableMemberDescriptor2, callableMemberDescriptor);
                    }
                    arrayList.add(callableMemberDescriptor2);
                }
            }
            overridingStrategy.setOverriddenDescriptors(callableMemberDescriptor, smartSetCreate);
            linkedHashSet.removeAll(arrayList);
        }
        if (linkedHashSet.size() >= 2) {
            n predicate = new n(((CallableMemberDescriptor) linkedHashSet.iterator().next()).getContainingDeclaration(), 22);
            Intrinsics.checkNotNullParameter(linkedHashSet, "<this>");
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            if (!linkedHashSet.isEmpty()) {
                Iterator it8 = linkedHashSet.iterator();
                while (it8.hasNext()) {
                    if (!((Boolean) predicate.invoke(it8.next())).booleanValue()) {
                        LinkedList linkedList = new LinkedList(linkedHashSet);
                        while (!linkedList.isEmpty()) {
                            CallableMemberDescriptor callableMemberDescriptorFindMemberWithMaxVisibility = VisibilityUtilKt.findMemberWithMaxVisibility(linkedList);
                            if (callableMemberDescriptorFindMemberWithMaxVisibility == null) {
                                a(102);
                                throw null;
                            }
                            e(extractMembersOverridableInBothWays(callableMemberDescriptorFindMemberWithMaxVisibility, linkedList, new e(2), new q(overridingStrategy, callableMemberDescriptorFindMemberWithMaxVisibility, 28)), classDescriptor, overridingStrategy);
                        }
                        return;
                    }
                }
            }
        }
        Iterator it9 = linkedHashSet.iterator();
        while (it9.hasNext()) {
            e(Collections.singleton((CallableMemberDescriptor) it9.next()), classDescriptor, overridingStrategy);
        }
    }

    @NotNull
    public OverrideCompatibilityInfo isOverridableBy(@NotNull CallableDescriptor callableDescriptor, @NotNull CallableDescriptor callableDescriptor2, ClassDescriptor classDescriptor) {
        if (callableDescriptor == null) {
            a(19);
            throw null;
        }
        if (callableDescriptor2 == null) {
            a(20);
            throw null;
        }
        OverrideCompatibilityInfo overrideCompatibilityInfoIsOverridableBy = isOverridableBy(callableDescriptor, callableDescriptor2, classDescriptor, false);
        if (overrideCompatibilityInfoIsOverridableBy != null) {
            return overrideCompatibilityInfoIsOverridableBy;
        }
        a(21);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bf, code lost:
    
        r14.remove();
     */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo isOverridableByWithoutExternalConditions(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor r17, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.isOverridableByWithoutExternalConditions(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, boolean):kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo");
    }

    @NotNull
    public OverrideCompatibilityInfo isOverridableBy(@NotNull CallableDescriptor callableDescriptor, @NotNull CallableDescriptor callableDescriptor2, ClassDescriptor classDescriptor, boolean z) {
        if (callableDescriptor == null) {
            a(22);
            throw null;
        }
        if (callableDescriptor2 != null) {
            OverrideCompatibilityInfo overrideCompatibilityInfoIsOverridableByWithoutExternalConditions = isOverridableByWithoutExternalConditions(callableDescriptor, callableDescriptor2, z);
            boolean z3 = overrideCompatibilityInfoIsOverridableByWithoutExternalConditions.getResult() == OverrideCompatibilityInfo.Result.OVERRIDABLE;
            List<ExternalOverridabilityCondition> list = d;
            for (ExternalOverridabilityCondition externalOverridabilityCondition : list) {
                if (externalOverridabilityCondition.getContract() != ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY && (!z3 || externalOverridabilityCondition.getContract() != ExternalOverridabilityCondition.Contract.SUCCESS_ONLY)) {
                    int i = a.f187571a[externalOverridabilityCondition.isOverridable(callableDescriptor, callableDescriptor2, classDescriptor).ordinal()];
                    if (i == 1) {
                        z3 = true;
                    } else if (i == 2) {
                        OverrideCompatibilityInfo overrideCompatibilityInfoIncompatible = OverrideCompatibilityInfo.incompatible("External condition");
                        if (overrideCompatibilityInfoIncompatible != null) {
                            return overrideCompatibilityInfoIncompatible;
                        }
                        a(24);
                        throw null;
                    }
                }
            }
            if (!z3) {
                return overrideCompatibilityInfoIsOverridableByWithoutExternalConditions;
            }
            for (ExternalOverridabilityCondition externalOverridabilityCondition2 : list) {
                if (externalOverridabilityCondition2.getContract() == ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY) {
                    int i2 = a.f187571a[externalOverridabilityCondition2.isOverridable(callableDescriptor, callableDescriptor2, classDescriptor).ordinal()];
                    if (i2 == 1) {
                        throw new IllegalStateException("Contract violation in " + externalOverridabilityCondition2.getClass().getName() + " condition. It's not supposed to end with success");
                    }
                    if (i2 == 2) {
                        OverrideCompatibilityInfo overrideCompatibilityInfoIncompatible2 = OverrideCompatibilityInfo.incompatible("External condition");
                        if (overrideCompatibilityInfoIncompatible2 != null) {
                            return overrideCompatibilityInfoIncompatible2;
                        }
                        a(26);
                        throw null;
                    }
                }
            }
            OverrideCompatibilityInfo overrideCompatibilityInfoSuccess = OverrideCompatibilityInfo.success();
            if (overrideCompatibilityInfoSuccess != null) {
                return overrideCompatibilityInfoSuccess;
            }
            a(27);
            throw null;
        }
        a(23);
        throw null;
    }
}
