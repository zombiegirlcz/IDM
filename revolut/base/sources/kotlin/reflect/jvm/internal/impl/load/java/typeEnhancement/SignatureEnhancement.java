package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import rjm.e;
import rjm.g;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes13.dex */
public final class SignatureEnhancement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JavaTypeEnhancement f187038a;

    public SignatureEnhancement(@NotNull JavaTypeEnhancement typeEnhancement) {
        Intrinsics.checkNotNullParameter(typeEnhancement, "typeEnhancement");
        this.f187038a = typeEnhancement;
    }

    public final KotlinType a(JavaCallableMemberDescriptor javaCallableMemberDescriptor, CallableDescriptor callableDescriptor, boolean z, LazyJavaResolverContext lazyJavaResolverContext, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, TypeEnhancementInfo typeEnhancementInfo, boolean z3, Function1 function1) {
        g gVar = new g(callableDescriptor, z, lazyJavaResolverContext, annotationQualifierApplicabilityType);
        KotlinType kotlinType = (KotlinType) function1.invoke(javaCallableMemberDescriptor);
        Collection<? extends CallableMemberDescriptor> overriddenDescriptors = javaCallableMemberDescriptor.getOverriddenDescriptors();
        Intrinsics.checkNotNullExpressionValue(overriddenDescriptors, "getOverriddenDescriptors(...)");
        Collection<? extends CallableMemberDescriptor> collection = overriddenDescriptors;
        ArrayList arrayList = new ArrayList(w.t(collection, 10));
        for (CallableMemberDescriptor callableMemberDescriptor : collection) {
            Intrinsics.h(callableMemberDescriptor);
            arrayList.add((KotlinType) function1.invoke(callableMemberDescriptor));
        }
        return this.f187038a.enhance(kotlinType, gVar.computeIndexedQualifiers(kotlinType, arrayList, typeEnhancementInfo, z3), gVar.getSkipRawTypeArguments());
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016b  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <D extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> java.util.Collection<D> enhanceSignatures(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext r26, @org.jetbrains.annotations.NotNull java.util.Collection<? extends D> r27) {
        /*
            Method dump skipped, instruction units count: 863
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.enhanceSignatures(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext, java.util.Collection):java.util.Collection");
    }

    @NotNull
    public final KotlinType enhanceSuperType(@NotNull KotlinType type, @NotNull LazyJavaResolverContext context) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(context, "context");
        g gVar = new g(null, false, context, AnnotationQualifierApplicabilityType.TYPE_USE, true);
        KotlinType kotlinTypeEnhance = this.f187038a.enhance(type, gVar.computeIndexedQualifiers(type, f0.f322471a, null, false), gVar.getSkipRawTypeArguments());
        return kotlinTypeEnhance == null ? type : kotlinTypeEnhance;
    }

    @NotNull
    public final List<KotlinType> enhanceTypeParameterBounds(@NotNull TypeParameterDescriptor typeParameter, @NotNull List<? extends KotlinType> bounds, @NotNull LazyJavaResolverContext context) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(context, "context");
        List<? extends KotlinType> list = bounds;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (KotlinType kotlinType : list) {
            if (!TypeUtilsKt.contains(kotlinType, e.d)) {
                g gVar = new g(typeParameter, false, context, AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS);
                KotlinType kotlinTypeEnhance = this.f187038a.enhance(kotlinType, gVar.computeIndexedQualifiers(kotlinType, f0.f322471a, null, false), gVar.getSkipRawTypeArguments());
                if (kotlinTypeEnhance != null) {
                    kotlinType = kotlinTypeEnhance;
                }
            }
            arrayList.add(kotlinType);
        }
        return arrayList;
    }
}
