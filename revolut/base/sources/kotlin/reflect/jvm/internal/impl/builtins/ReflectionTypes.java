package kotlin.reflect.jvm.internal.impl.builtins;

import af.f;
import ajm.d;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import org.jetbrains.annotations.NotNull;
import p.a;
import yhm.j;
import yhm.k;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes13.dex */
public final class ReflectionTypes {

    @NotNull
    public static final Companion Companion;
    public static final /* synthetic */ KProperty[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NotFoundClasses f186466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f186467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f186468c;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final KotlinType createKPropertyStarType(@NotNull ModuleDescriptor module) {
            Intrinsics.checkNotNullParameter(module, "module");
            ClassDescriptor classDescriptorFindClassAcrossModuleDependencies = FindClassInModuleKt.findClassAcrossModuleDependencies(module, StandardNames.FqNames.kProperty);
            if (classDescriptorFindClassAcrossModuleDependencies == null) {
                return null;
            }
            TypeAttributes empty = TypeAttributes.Companion.getEmpty();
            List<TypeParameterDescriptor> parameters = classDescriptorFindClassAcrossModuleDependencies.getTypeConstructor().getParameters();
            Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
            Object objK0 = d0.K0(parameters);
            Intrinsics.checkNotNullExpressionValue(objK0, "single(...)");
            return KotlinTypeFactory.simpleNotNullType(empty, classDescriptorFindClassAcrossModuleDependencies, u.c(new StarProjectionImpl((TypeParameterDescriptor) objK0)));
        }
    }

    static {
        h0 h0Var = new h0(ReflectionTypes.class, "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0);
        p0 p0Var = o0.f186429a;
        d = new KProperty[]{p0Var.j(h0Var), a.y(ReflectionTypes.class, "kProperty", "getKProperty()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0, p0Var), a.y(ReflectionTypes.class, "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0, p0Var), a.y(ReflectionTypes.class, "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0, p0Var), a.y(ReflectionTypes.class, "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0, p0Var), a.y(ReflectionTypes.class, "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0, p0Var), a.y(ReflectionTypes.class, "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0, p0Var), a.y(ReflectionTypes.class, "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0, p0Var)};
        Companion = new Companion(null);
    }

    public ReflectionTypes(@NotNull ModuleDescriptor module, @NotNull NotFoundClasses notFoundClasses) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        this.f186466a = notFoundClasses;
        this.f186467b = j.c(k.PUBLICATION, new d(module, 1));
        this.f186468c = new f(1);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    public static final ClassDescriptor access$find(ReflectionTypes reflectionTypes, String str, int i) {
        reflectionTypes.getClass();
        Name nameIdentifier = Name.identifier(str);
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
        ClassifierDescriptor classifierDescriptorMo3796getContributedClassifier = ((MemberScope) reflectionTypes.f186467b.getValue()).mo3796getContributedClassifier(nameIdentifier, NoLookupLocation.FROM_REFLECTION);
        ClassDescriptor classDescriptor = classifierDescriptorMo3796getContributedClassifier instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo3796getContributedClassifier : null;
        return classDescriptor == null ? reflectionTypes.f186466a.getClass(new ClassId(StandardNames.KOTLIN_REFLECT_FQ_NAME, nameIdentifier), u.c(Integer.valueOf(i))) : classDescriptor;
    }

    @NotNull
    public final ClassDescriptor getKClass() {
        KProperty property = d[0];
        this.f186468c.getClass();
        Intrinsics.checkNotNullParameter(this, "types");
        Intrinsics.checkNotNullParameter(property, "property");
        return access$find(this, CapitalizeDecapitalizeKt.capitalizeAsciiOnly(property.getName()), 1);
    }
}
