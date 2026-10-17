package qlm;

import ch.qos.logback.core.CoreConstants;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.EnumDescriptor;

/* JADX INFO: loaded from: classes14.dex */
public abstract class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final KSerializer[] f247666a = new KSerializer[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f247667b = new Object();

    public static final b0 a(String serialName, Enum[] values, String[] names, Annotation[][] entryAnnotations) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(names, "names");
        Intrinsics.checkNotNullParameter(entryAnnotations, "entryAnnotations");
        EnumDescriptor descriptor = new EnumDescriptor(serialName, values.length);
        int length = values.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            Enum r72 = values[i];
            int i3 = i2 + 1;
            String strName = (String) kotlin.collections.d.W(i2, names);
            if (strName == null) {
                strName = r72.name();
            }
            descriptor.j(strName, false);
            Annotation[] annotationArr = (Annotation[]) kotlin.collections.d.W(i2, entryAnnotations);
            if (annotationArr != null) {
                for (Annotation annotation : annotationArr) {
                    descriptor.k(annotation);
                }
            }
            i++;
            i2 = i3;
        }
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        b0 b0Var = new b0(serialName, values);
        b0Var.f247615b = descriptor;
        return b0Var;
    }

    public static final b0 b(String serialName, Enum[] values) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(values, "values");
        return new b0(serialName, values);
    }

    public static final int c(SerialDescriptor serialDescriptor, SerialDescriptor[] typeParams) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(typeParams, "typeParams");
        int iHashCode = (serialDescriptor.e().hashCode() * 31) + Arrays.hashCode(typeParams);
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        int iC = serialDescriptor.c();
        int i = 1;
        while (true) {
            int iHashCode2 = 0;
            if (!(iC > 0)) {
                break;
            }
            int i2 = iC - 1;
            int i3 = i * 31;
            String strE = serialDescriptor.b(serialDescriptor.c() - iC).e();
            if (strE != null) {
                iHashCode2 = strE.hashCode();
            }
            i = i3 + iHashCode2;
            iC = i2;
        }
        int iC2 = serialDescriptor.c();
        int iHashCode3 = 1;
        while (true) {
            if (!(iC2 > 0)) {
                return (((iHashCode * 31) + i) * 31) + iHashCode3;
            }
            int i5 = iC2 - 1;
            int i6 = iHashCode3 * 31;
            com.bumptech.glide.d kind = serialDescriptor.b(serialDescriptor.c() - iC2).getKind();
            iHashCode3 = i6 + (kind != null ? kind.hashCode() : 0);
            iC2 = i5;
        }
    }

    public static final Set d(SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        return h1.b(serialDescriptor);
    }

    public static final void e(int[] seenArray, int[] goldenMaskArray, SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(seenArray, "seenArray");
        Intrinsics.checkNotNullParameter(goldenMaskArray, "goldenMaskArray");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int length = goldenMaskArray.length;
        for (int i = 0; i < length; i++) {
            int i2 = goldenMaskArray[i] & (~seenArray[i]);
            if (i2 != 0) {
                for (int i3 = 0; i3 < 32; i3++) {
                    if ((i2 & 1) != 0) {
                        arrayList.add(descriptor.d((i * 32) + i3));
                    }
                    i2 >>>= 1;
                }
            }
        }
        throw new MissingFieldException(descriptor.e(), arrayList);
    }

    public static final void f(SerialDescriptor descriptor, int i, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        for (int i5 = 0; i5 < 32; i5++) {
            if ((i3 & 1) != 0) {
                arrayList.add(descriptor.d(i5));
            }
            i3 >>>= 1;
        }
        throw new MissingFieldException(descriptor.e(), arrayList);
    }

    public static final void g(String str, KClass baseClass) {
        String string;
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        String str2 = "in the polymorphic scope of '" + baseClass.m() + CoreConstants.SINGLE_QUOTE_CHAR;
        if (str == null) {
            string = p.a.l(CoreConstants.DOT, "Class discriminator was missing and no default serializers were registered ", str2);
        } else {
            StringBuilder sbM = v0.a.m("Serializer for subclass '", str, "' is not found ", str2, ".\nCheck if class with serial name '");
            j6.a.D(sbM, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            sbM.append(baseClass.m());
            sbM.append("' has to be sealed and '@Serializable'.");
            string = sbM.toString();
        }
        throw new SerializationException(string);
    }

    public static final void h(KClass subClass, KClass baseClass) {
        Intrinsics.checkNotNullParameter(subClass, "subClass");
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        String strM = subClass.m();
        if (strM == null) {
            strM = String.valueOf(subClass);
        }
        g(strM, baseClass);
        throw null;
    }

    public static final String i(SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        return zhm.d0.k0(kotlin.ranges.f.o(0, serialDescriptor.c()), ", ", serialDescriptor.e() + CoreConstants.LEFT_PARENTHESIS_CHAR, ")", 0, new qgf.o(serialDescriptor, 11), 24);
    }
}
