package slm;

import ch.qos.logback.core.CoreConstants;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.internal.JsonDecodingException;
import kotlinx.serialization.json.internal.JsonEncodingException;
import kotlinx.serialization.json.internal.JsonException;
import qlm.j1;
import zhm.r0;

/* JADX INFO: loaded from: classes13.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qf.b f264278a = new qf.b(14);

    public static final JsonEncodingException a(String output, Number value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(output, "output");
        return new JsonEncodingException("Unexpected special floating-point value " + value + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) o(-1, output)));
    }

    public static final JsonEncodingException b(SerialDescriptor keyDescriptor) {
        Intrinsics.checkNotNullParameter(keyDescriptor, "keyDescriptor");
        return new JsonEncodingException("Value of type '" + keyDescriptor.e() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + keyDescriptor.getKind() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final JsonDecodingException c(int i, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (i >= 0) {
            message = j6.a.m(i, "Unexpected JSON token at offset ", ": ", message);
        }
        return new JsonDecodingException(message);
    }

    public static final JsonDecodingException d(CharSequence input, int i, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(input, "input");
        return c(i, message + "\nJSON input: " + ((Object) o(i, input)));
    }

    public static final void e(mlm.h hVar, mlm.h hVar2, String str) {
        if ((hVar instanceof mlm.f) && j1.d(hVar2.getDescriptor()).contains(str)) {
            StringBuilder sbM = v0.a.m("Sealed class '", hVar2.getDescriptor().e(), "' cannot be serialized as base class '", ((mlm.f) hVar).getDescriptor().e(), "' because it has property name that conflicts with JSON class discriminator '");
            sbM.append(str);
            sbM.append("'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            throw new IllegalStateException(sbM.toString().toString());
        }
    }

    public static final void f(LinkedHashMap linkedHashMap, SerialDescriptor serialDescriptor, String str, int i) {
        String str2 = Intrinsics.f(serialDescriptor.getKind(), olm.j.f226486b) ? "enum value" : "property";
        if (!linkedHashMap.containsKey(str)) {
            linkedHashMap.put(str, Integer.valueOf(i));
            return;
        }
        throw new JsonException("The suggested name '" + str + "' for " + str2 + zsc.p.SPACE_CHAR + serialDescriptor.d(i) + " is already one of the names for " + str2 + zsc.p.SPACE_CHAR + serialDescriptor.d(((Number) r0.h(str, linkedHashMap)).intValue()) + " in " + serialDescriptor);
    }

    public static final SerialDescriptor g(SerialDescriptor serialDescriptor, tlm.e module) {
        SerialDescriptor serialDescriptorG;
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(module, "module");
        if (!Intrinsics.f(serialDescriptor.getKind(), olm.i.f226485b)) {
            return serialDescriptor.isInline() ? g(serialDescriptor.b(0), module) : serialDescriptor;
        }
        SerialDescriptor serialDescriptorV = ue8.c.v(serialDescriptor, module);
        return (serialDescriptorV == null || (serialDescriptorG = g(serialDescriptorV, module)) == null) ? serialDescriptor : serialDescriptorG;
    }

    public static final byte h(char c2) {
        if (c2 < '~') {
            return j.f264268b[c2];
        }
        return (byte) 0;
    }

    public static final void i(com.bumptech.glide.d kind) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        if (kind instanceof olm.j) {
            throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (kind instanceof olm.f) {
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (kind instanceof olm.d) {
            throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }

    public static final String j(SerialDescriptor serialDescriptor, Json json) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        for (Annotation annotation : serialDescriptor.getAnnotations()) {
            if (annotation instanceof rlm.g) {
                return ((rlm.g) annotation).discriminator();
            }
        }
        return json.f187948a.f255107g;
    }

    public static final int k(SerialDescriptor descriptor, Json json, String name) {
        Intrinsics.checkNotNullParameter(descriptor, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(name, "name");
        rlm.h hVar = json.f187948a;
        n nVar = json.f187950c;
        boolean z = hVar.i;
        qf.b key = f264278a;
        if (z && Intrinsics.f(descriptor.getKind(), olm.j.f226486b)) {
            String lowerCase = name.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            Intrinsics.checkNotNullParameter(json, "<this>");
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(json, "<this>");
            s86.a defaultValue = new s86.a(descriptor, json, 18);
            nVar.getClass();
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
            Object value = nVar.a(descriptor, key);
            if (value == null) {
                value = defaultValue.invoke();
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(value, "value");
                ConcurrentHashMap concurrentHashMap = nVar.f264273a;
                Object concurrentHashMap2 = concurrentHashMap.get(descriptor);
                if (concurrentHashMap2 == null) {
                    concurrentHashMap2 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(descriptor, concurrentHashMap2);
                }
                ((Map) concurrentHashMap2).put(key, value);
            }
            Integer num = (Integer) ((Map) value).get(lowerCase);
            if (num != null) {
                return num.intValue();
            }
            return -3;
        }
        p(descriptor, json);
        int iG = descriptor.g(name);
        if (iG != -3 || !json.f187948a.f255108h) {
            return iG;
        }
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(json, "<this>");
        s86.a defaultValue2 = new s86.a(descriptor, json, 18);
        nVar.getClass();
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue2, "defaultValue");
        Object value2 = nVar.a(descriptor, key);
        if (value2 == null) {
            value2 = defaultValue2.invoke();
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value2, "value");
            ConcurrentHashMap concurrentHashMap3 = nVar.f264273a;
            Object concurrentHashMap4 = concurrentHashMap3.get(descriptor);
            if (concurrentHashMap4 == null) {
                concurrentHashMap4 = new ConcurrentHashMap(2);
                concurrentHashMap3.put(descriptor, concurrentHashMap4);
            }
            ((Map) concurrentHashMap4).put(key, value2);
        }
        Integer num2 = (Integer) ((Map) value2).get(name);
        if (num2 != null) {
            return num2.intValue();
        }
        return -3;
    }

    public static final int l(SerialDescriptor serialDescriptor, Json json, String name, String suffix) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        int iK = k(serialDescriptor, json, name);
        if (iK != -3) {
            return iK;
        }
        throw new SerializationException(serialDescriptor.e() + " does not contain element with name '" + name + CoreConstants.SINGLE_QUOTE_CHAR + suffix);
    }

    public static final boolean m(SerialDescriptor serialDescriptor, Json json) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        if (json.f187948a.f255105b) {
            return true;
        }
        List annotations = serialDescriptor.getAnnotations();
        if ((annotations instanceof Collection) && annotations.isEmpty()) {
            return false;
        }
        Iterator it8 = annotations.iterator();
        while (it8.hasNext()) {
            if (((Annotation) it8.next()) instanceof rlm.n) {
                return true;
            }
        }
        return false;
    }

    public static final void n(a aVar, String entity) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(entity, "entity");
        aVar.q(aVar.f264232a - 1, "Trailing comma before the end of JSON ".concat(entity), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final CharSequence o(int i, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() >= 200) {
            if (i != -1) {
                int i2 = i - 30;
                int i3 = i + 30;
                String str = i2 <= 0 ? "" : ".....";
                String str2 = i3 >= charSequence.length() ? "" : ".....";
                StringBuilder sbS = p.a.s(str);
                if (i2 < 0) {
                    i2 = 0;
                }
                int length = charSequence.length();
                if (i3 > length) {
                    i3 = length;
                }
                sbS.append(charSequence.subSequence(i2, i3).toString());
                sbS.append(str2);
                return sbS.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static final void p(SerialDescriptor serialDescriptor, Json json) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        if (Intrinsics.f(serialDescriptor.getKind(), olm.k.f226487b)) {
            rlm.h hVar = json.f187948a;
        }
    }

    public static final j0 q(SerialDescriptor desc, Json json) {
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(desc, "desc");
        com.bumptech.glide.d kind = desc.getKind();
        if (kind instanceof olm.d) {
            return j0.POLY_OBJ;
        }
        if (Intrinsics.f(kind, olm.k.f226488c)) {
            return j0.LIST;
        }
        if (!Intrinsics.f(kind, olm.k.d)) {
            return j0.OBJ;
        }
        SerialDescriptor serialDescriptorG = g(desc.b(0), json.f187949b);
        com.bumptech.glide.d kind2 = serialDescriptorG.getKind();
        if ((kind2 instanceof olm.f) || Intrinsics.f(kind2, olm.j.f226486b)) {
            return j0.MAP;
        }
        throw b(serialDescriptorG);
    }

    public static final void r(a aVar, Number result) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(result, "result");
        a.r(aVar, "Unexpected special floating-point value " + result + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        throw null;
    }

    public static final void s(JsonElement element, String str) {
        Intrinsics.checkNotNullParameter(element, "element");
        StringBuilder sbX = com.google.android.gms.internal.mlkit_vision_face.a.x("Class with serial name ", str, " cannot be serialized polymorphically because it is represented as ");
        sbX.append(o0.f186429a.b(element.getClass()).m());
        sbX.append(". Make sure that its JsonTransformingSerializer returns JsonObject, so class discriminator can be added to it.");
        throw new JsonEncodingException(sbX.toString());
    }

    public static final String t(byte b4) {
        return b4 == 1 ? "quotation mark '\"'" : b4 == 2 ? "string escape sequence '\\'" : b4 == 4 ? "comma ','" : b4 == 5 ? "colon ':'" : b4 == 6 ? "start of the object '{'" : b4 == 7 ? "end of the object '}'" : b4 == 8 ? "start of the array '['" : b4 == 9 ? "end of the array ']'" : b4 == 10 ? "end of the input" : b4 == 127 ? "invalid token" : "valid token";
    }

    public static final String u(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) o(-1, str2));
    }
}
