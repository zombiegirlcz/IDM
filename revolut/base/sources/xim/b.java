package xim;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionBase;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import wim.c;
import wim.t;
import zhm.v;
import zhm.w;
import zim.c2;
import zim.f0;

/* JADX INFO: loaded from: classes13.dex */
public abstract class b {
    public static final c2 a(c cVar, List arguments, boolean z, List annotations) {
        ClassifierDescriptor descriptor;
        TypeProjectionBase starProjectionImpl;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        f0 f0Var = cVar instanceof f0 ? (f0) cVar : null;
        if (f0Var == null || (descriptor = f0Var.getDescriptor()) == null) {
            throw new KotlinReflectionInternalError("Cannot create type for an unsupported classifier: " + cVar + " (" + cVar.getClass() + CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        TypeConstructor typeConstructor = descriptor.getTypeConstructor();
        Intrinsics.checkNotNullExpressionValue(typeConstructor, "getTypeConstructor(...)");
        List<TypeParameterDescriptor> parameters = typeConstructor.getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
        if (parameters.size() != arguments.size()) {
            throw new IllegalArgumentException("Class declares " + parameters.size() + " type parameters, but " + arguments.size() + " were provided.");
        }
        TypeAttributes empty = annotations.isEmpty() ? TypeAttributes.Companion.getEmpty() : TypeAttributes.Companion.getEmpty();
        List<TypeParameterDescriptor> parameters2 = typeConstructor.getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters2, "getParameters(...)");
        List list = arguments;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            KTypeProjection kTypeProjection = (KTypeProjection) obj2;
            c2 c2Var = (c2) kTypeProjection.f186456b;
            KotlinType kotlinType = c2Var != null ? c2Var.f322615a : null;
            t tVar = kTypeProjection.f186455a;
            int i3 = tVar == null ? -1 : a.f306434a[tVar.ordinal()];
            if (i3 == -1) {
                TypeParameterDescriptor typeParameterDescriptor = parameters2.get(i);
                Intrinsics.checkNotNullExpressionValue(typeParameterDescriptor, "get(...)");
                starProjectionImpl = new StarProjectionImpl(typeParameterDescriptor);
            } else if (i3 == 1) {
                Variance variance = Variance.INVARIANT;
                Intrinsics.h(kotlinType);
                starProjectionImpl = new TypeProjectionImpl(variance, kotlinType);
            } else if (i3 == 2) {
                Variance variance2 = Variance.IN_VARIANCE;
                Intrinsics.h(kotlinType);
                starProjectionImpl = new TypeProjectionImpl(variance2, kotlinType);
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                Variance variance3 = Variance.OUT_VARIANCE;
                Intrinsics.h(kotlinType);
                starProjectionImpl = new TypeProjectionImpl(variance3, kotlinType);
            }
            arrayList.add(starProjectionImpl);
            i = i2;
        }
        return new c2(KotlinTypeFactory.simpleType$default(empty, typeConstructor, arrayList, z, (KotlinTypeRefiner) null, 16, (Object) null), null);
    }

    public static c2 b(c cVar, ArrayList arrayList, int i) {
        List list = arrayList;
        if ((i & 1) != 0) {
            list = zhm.f0.f322471a;
        }
        return a(cVar, list, false, zhm.f0.f322471a);
    }
}
