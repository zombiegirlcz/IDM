package pjm;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes14.dex */
public final class f implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f236887b = new f(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f236888c = new f(1);
    public static final f d = new f(2);
    public static final f e = new f(3);
    public static final f f = new f(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f236889a;

    public /* synthetic */ f(int i) {
        this.f236889a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f236889a) {
            case 0:
                JavaMember it8 = (JavaMember) obj2;
                int i = LazyJavaClassMemberScope.u;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(!it8.isStatic());
            case 1:
                SimpleFunctionDescriptor selectMostSpecificInEachOverridableGroup = (SimpleFunctionDescriptor) obj2;
                KProperty[] kPropertyArr = LazyJavaScope.f186998l;
                Intrinsics.checkNotNullParameter(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
                return selectMostSpecificInEachOverridableGroup;
            case 2:
                JavaMember it9 = (JavaMember) obj2;
                int i2 = LazyJavaStaticClassScope.o;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.valueOf(it9.isStatic());
            case 3:
                MemberScope it10 = (MemberScope) obj2;
                int i3 = LazyJavaStaticClassScope.o;
                Intrinsics.checkNotNullParameter(it10, "it");
                return it10.getVariableNames();
            default:
                int i5 = LazyJavaStaticClassScope.o;
                ClassifierDescriptor classifierDescriptorMo3795getDeclarationDescriptor = ((KotlinType) obj2).getConstructor().mo3795getDeclarationDescriptor();
                if (classifierDescriptorMo3795getDeclarationDescriptor instanceof ClassDescriptor) {
                    return (ClassDescriptor) classifierDescriptorMo3795getDeclarationDescriptor;
                }
                return null;
        }
    }
}
