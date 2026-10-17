package cjm;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import zhm.u;

/* JADX INFO: loaded from: classes14.dex */
public final class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JvmBuiltInsCustomizer f24730b;

    public /* synthetic */ e(JvmBuiltInsCustomizer jvmBuiltInsCustomizer, int i) {
        this.f24729a = i;
        this.f24730b = jvmBuiltInsCustomizer;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f24729a;
        boolean z = false;
        JvmBuiltInsCustomizer jvmBuiltInsCustomizer = this.f24730b;
        switch (i) {
            case 0:
                Pair pair = (Pair) obj2;
                KProperty[] kPropertyArr = JvmBuiltInsCustomizer.i;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                String str = (String) pair.f186385a;
                String str2 = (String) pair.f186386b;
                return Annotations.Companion.create(u.c(AnnotationUtilKt.createDeprecatedAnnotation(jvmBuiltInsCustomizer.f186508a.getBuiltIns(), j6.a.s("'", str, "()' member of List is redundant in Kotlin and might be removed soon. Please use '", str2, "()' stdlib extension instead"), a0.d.r(str2, "()"), "HIDDEN", false)));
            default:
                CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) obj2;
                KProperty[] kPropertyArr2 = JvmBuiltInsCustomizer.i;
                if (callableMemberDescriptor.getKind() == CallableMemberDescriptor.Kind.DECLARATION) {
                    JavaToKotlinClassMapper javaToKotlinClassMapper = jvmBuiltInsCustomizer.f186509b;
                    DeclarationDescriptor containingDeclaration = callableMemberDescriptor.getContainingDeclaration();
                    Intrinsics.i(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    if (javaToKotlinClassMapper.isMutable((ClassDescriptor) containingDeclaration)) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
