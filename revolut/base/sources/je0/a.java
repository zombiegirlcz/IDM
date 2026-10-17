package je0;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KClass;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import zhm.w;
import zim.f0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public a() {
        ClassifierDescriptor descriptor;
        KClass kClassB = o0.f186429a.b(Enum.class);
        Intrinsics.checkNotNullParameter(kClassB, "<this>");
        f0 f0Var = kClassB instanceof f0 ? (f0) kClassB : null;
        if (f0Var == null || (descriptor = f0Var.getDescriptor()) == null) {
            xim.b.b(kClassB, null, 7);
        } else {
            List<TypeParameterDescriptor> parameters = descriptor.getTypeConstructor().getParameters();
            Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
            if (parameters.isEmpty()) {
                xim.b.b(kClassB, null, 7);
            } else {
                List<TypeParameterDescriptor> list = parameters;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                for (TypeParameterDescriptor typeParameterDescriptor : list) {
                    KTypeProjection.INSTANCE.getClass();
                    arrayList.add(KTypeProjection.f186454c);
                }
                xim.b.b(kClassB, arrayList, 6);
            }
        }
        new LinkedHashSet();
        new LinkedHashSet();
    }
}
