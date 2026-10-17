package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import a0.d;
import ch.qos.logback.core.CoreConstants;
import iim.b;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;
import v0.a;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes14.dex */
public final class ClassMapperLite {

    @NotNull
    public static final ClassMapperLite INSTANCE = new ClassMapperLite();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f187447a = d0.k0(v.k('k', 'o', 't', 'l', 'i', 'n'), "", null, null, 0, null, 62);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f187448b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listK = v.k("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int iA = b.a(0, listK.size() - 1, 2);
        if (iA >= 0) {
            int i = 0;
            while (true) {
                StringBuilder sb6 = new StringBuilder();
                String str = f187447a;
                sb6.append(str);
                sb6.append('/');
                sb6.append((String) listK.get(i));
                int i2 = i + 1;
                linkedHashMap.put(sb6.toString(), listK.get(i2));
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str);
                sb9.append('/');
                linkedHashMap.put(a.i(sb9, (String) listK.get(i), "Array"), "[" + ((String) listK.get(i2)));
                if (i == iA) {
                    break;
                } else {
                    i += 2;
                }
            }
        }
        linkedHashMap.put(f187447a + "/Unit", "V");
        a("Any", "java/lang/Object", linkedHashMap);
        a("Nothing", "java/lang/Void", linkedHashMap);
        a("Annotation", "java/lang/annotation/Annotation", linkedHashMap);
        for (String str2 : v.k("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            a(str2, "java/lang/" + str2, linkedHashMap);
        }
        for (String str3 : v.k("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            a(j6.a.q("collections/", str3), "java/util/" + str3, linkedHashMap);
            a("collections/Mutable" + str3, "java/util/" + str3, linkedHashMap);
        }
        a("collections/Iterable", "java/lang/Iterable", linkedHashMap);
        a("collections/MutableIterable", "java/lang/Iterable", linkedHashMap);
        a("collections/Map.Entry", "java/util/Map$Entry", linkedHashMap);
        a("collections/MutableMap.MutableEntry", "java/util/Map$Entry", linkedHashMap);
        for (int i3 = 0; i3 < 23; i3++) {
            String strN = d.n("Function", i3);
            StringBuilder sb10 = new StringBuilder();
            String str4 = f187447a;
            sb10.append(str4);
            sb10.append("/jvm/functions/Function");
            sb10.append(i3);
            a(strN, sb10.toString(), linkedHashMap);
            a("reflect/KFunction" + i3, str4 + "/reflect/KFunction", linkedHashMap);
        }
        for (String str5 : v.k("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            a(d.r(str5, ".Companion"), j6.a.w(new StringBuilder(), f187447a, "/jvm/internal/", str5, "CompanionObject"), linkedHashMap);
        }
        f187448b = linkedHashMap;
    }

    public static final void a(String str, String str2, LinkedHashMap linkedHashMap) {
        linkedHashMap.put(p.a.q(new StringBuilder(), f187447a, '/', str), "L" + str2 + ';');
    }

    @NotNull
    public static final String mapClass(@NotNull String classId) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        String str = (String) f187448b.get(classId);
        if (str != null) {
            return str;
        }
        return "L" + a0.E(classId, CoreConstants.DOT, CoreConstants.DOLLAR) + ';';
    }
}
