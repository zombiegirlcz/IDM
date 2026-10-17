package zim;

import ch.qos.logback.core.CoreConstants;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* JADX INFO: loaded from: classes14.dex */
public final class v implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f322712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f322713b;

    public /* synthetic */ v(e0 e0Var, int i) {
        this.f322712a = i;
        this.f322713b = e0Var;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws InvocationTargetException {
        KotlinClassHeader classHeader;
        int i = this.f322712a;
        KotlinClassHeader.Kind kind = null;
        e0 e0Var = this.f322713b;
        switch (i) {
            case 0:
                return new b0(e0Var);
            case 1:
                return e0Var.o(e0Var.getDescriptor().getDefaultType().getMemberScope(), j0.DECLARED);
            case 2:
                MemberScope staticScope = e0Var.getDescriptor().getStaticScope();
                Intrinsics.checkNotNullExpressionValue(staticScope, "getStaticScope(...)");
                return e0Var.o(staticScope, j0.DECLARED);
            case 3:
                return e0Var.o(e0Var.getDescriptor().getDefaultType().getMemberScope(), j0.INHERITED);
            case 4:
                MemberScope staticScope2 = e0Var.getDescriptor().getStaticScope();
                Intrinsics.checkNotNullExpressionValue(staticScope2, "getStaticScope(...)");
                return e0Var.o(staticScope2, j0.INHERITED);
            case 5:
                x xVar = e0.Companion;
                ClassId classIdX = e0Var.x();
                Class<?> cls = e0Var.f322627b;
                h2 h2Var = ((b0) e0Var.f322628c.getValue()).f322648a;
                KProperty kProperty = i0.f322647b[0];
                Object objInvoke = h2Var.invoke();
                Intrinsics.checkNotNullExpressionValue(objInvoke, "getValue(...)");
                RuntimeModuleData runtimeModuleData = (RuntimeModuleData) objInvoke;
                ClassDescriptor classDescriptorDeserializeClass = (classIdX.isLocal() && cls.isAnnotationPresent(Metadata.class)) ? runtimeModuleData.getDeserialization().deserializeClass(classIdX) : FindClassInModuleKt.findClassAcrossModuleDependencies(runtimeModuleData.getModule(), classIdX);
                if (classDescriptorDeserializeClass != null) {
                    return classDescriptorDeserializeClass;
                }
                if (cls.isSynthetic()) {
                    return e0.w(classIdX, runtimeModuleData);
                }
                ReflectKotlinClass reflectKotlinClassCreate = ReflectKotlinClass.Factory.create(cls);
                if (reflectKotlinClassCreate != null && (classHeader = reflectKotlinClassCreate.getClassHeader()) != null) {
                    kind = classHeader.getKind();
                }
                switch (kind == null ? -1 : c0.f322612a[kind.ordinal()]) {
                    case -1:
                    case 6:
                        throw new KotlinReflectionInternalError("Unresolved class: " + cls + " (kind = " + kind + CoreConstants.RIGHT_PARENTHESIS_CHAR);
                    case 0:
                    default:
                        throw new NoWhenBranchMatchedException();
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        return e0.w(classIdX, runtimeModuleData);
                    case 5:
                        throw new KotlinReflectionInternalError("Unknown class: " + cls + " (kind = " + kind + CoreConstants.RIGHT_PARENTHESIS_CHAR);
                }
            case 6:
                Annotation[] annotations = e0Var.f322627b.getAnnotations();
                Intrinsics.checkNotNullExpressionValue(annotations, "getAnnotations(...)");
                ArrayList arrayList = new ArrayList();
                for (Annotation annotation : annotations) {
                    if (!e0.d.contains(nim.a.o(nim.a.l(annotation)).getName())) {
                        arrayList.add(annotation);
                    }
                }
                return o2.l(arrayList);
            case 7:
                Class cls2 = e0Var.f322627b;
                if (cls2.isAnonymousClass()) {
                    return null;
                }
                ClassId classIdX2 = e0Var.x();
                if (!classIdX2.isLocal()) {
                    String strAsString = classIdX2.getShortClassName().asString();
                    Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
                    return strAsString;
                }
                String simpleName = cls2.getSimpleName();
                Method enclosingMethod = cls2.getEnclosingMethod();
                if (enclosingMethod != null) {
                    return kotlin.text.d0.v0(simpleName, enclosingMethod.getName() + CoreConstants.DOLLAR, simpleName);
                }
                Constructor<?> enclosingConstructor = cls2.getEnclosingConstructor();
                if (enclosingConstructor == null) {
                    return kotlin.text.d0.u0(CoreConstants.DOLLAR, simpleName, simpleName);
                }
                return kotlin.text.d0.v0(simpleName, enclosingConstructor.getName() + CoreConstants.DOLLAR, simpleName);
            case 8:
                if (e0Var.f322627b.isAnonymousClass()) {
                    return null;
                }
                ClassId classIdX3 = e0Var.x();
                if (classIdX3.isLocal()) {
                    return null;
                }
                return classIdX3.asSingleFqName().asString();
            default:
                Collection collectionG = e0Var.g();
                ArrayList arrayList2 = new ArrayList(zhm.w.t(collectionG, 10));
                Iterator it8 = collectionG.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(new n0(e0Var, (ConstructorDescriptor) it8.next()));
                }
                return arrayList2;
        }
    }

    public v(e0 e0Var, b0 b0Var) {
        this.f322712a = 7;
        this.f322713b = e0Var;
    }
}
