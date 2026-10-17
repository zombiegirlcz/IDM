package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import kotlin.text.a0;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes14.dex */
public final class PropertiesConventionUtilKt {
    public static Name a(Name name, String str, String str2, int i) {
        char cCharAt;
        boolean z = (i & 4) != 0;
        if ((i & 8) != 0) {
            str2 = null;
        }
        if (!name.isSpecial()) {
            String identifier = name.getIdentifier();
            Intrinsics.checkNotNullExpressionValue(identifier, "getIdentifier(...)");
            if (a0.H(identifier, str, false) && identifier.length() != str.length() && ('a' > (cCharAt = identifier.charAt(str.length())) || cCharAt >= '{')) {
                if (str2 != null) {
                    StringBuilder sbS = p.a.s(str2);
                    sbS.append(d0.e0(identifier, str));
                    return Name.identifier(sbS.toString());
                }
                if (!z) {
                    return name;
                }
                String strDecapitalizeSmartForCompiler = CapitalizeDecapitalizeKt.decapitalizeSmartForCompiler(d0.e0(identifier, str), true);
                if (Name.isValidIdentifier(strDecapitalizeSmartForCompiler)) {
                    return Name.identifier(strDecapitalizeSmartForCompiler);
                }
            }
        }
        return null;
    }

    @NotNull
    public static final List<Name> getPropertyNamesCandidatesByAccessorName(@NotNull Name name) {
        Intrinsics.checkNotNullParameter(name, "name");
        String strAsString = name.asString();
        Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
        return JvmAbi.isGetterName(strAsString) ? v.l(propertyNameByGetMethodName(name)) : JvmAbi.isSetterName(strAsString) ? propertyNamesBySetMethodName(name) : BuiltinSpecialProperties.INSTANCE.getPropertyNameCandidatesBySpecialGetterName(name);
    }

    public static final Name propertyNameByGetMethodName(@NotNull Name methodName) {
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Name nameA = a(methodName, "get", null, 12);
        return nameA == null ? a(methodName, "is", null, 8) : nameA;
    }

    public static final Name propertyNameBySetMethodName(@NotNull Name methodName, boolean z) {
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        return a(methodName, "set", z ? "is" : null, 4);
    }

    @NotNull
    public static final List<Name> propertyNamesBySetMethodName(@NotNull Name methodName) {
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Name[] elements = {propertyNameBySetMethodName(methodName, false), propertyNameBySetMethodName(methodName, true)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return d.L(elements);
    }
}
