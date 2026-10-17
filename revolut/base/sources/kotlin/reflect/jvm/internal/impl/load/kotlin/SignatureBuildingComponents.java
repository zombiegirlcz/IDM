package kotlin.reflect.jvm.internal.impl.load.kotlin;

import a10.b;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sjm.d;
import zhm.d0;

/* JADX INFO: loaded from: classes14.dex */
public final class SignatureBuildingComponents {

    @NotNull
    public static final SignatureBuildingComponents INSTANCE = new SignatureBuildingComponents();

    @NotNull
    public final String[] constructors(@NotNull String... signatures) {
        Intrinsics.checkNotNullParameter(signatures, "signatures");
        ArrayList arrayList = new ArrayList(signatures.length);
        for (String str : signatures) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    @NotNull
    public final Set<String> inClass(@NotNull String internalName, @NotNull String... signatures) {
        Intrinsics.checkNotNullParameter(internalName, "internalName");
        Intrinsics.checkNotNullParameter(signatures, "signatures");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : signatures) {
            linkedHashSet.add(internalName + CoreConstants.DOT + str);
        }
        return linkedHashSet;
    }

    @NotNull
    public final Set<String> inJavaLang(@NotNull String name, @NotNull String... signatures) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signatures, "signatures");
        return inClass(javaLang(name), (String[]) Arrays.copyOf(signatures, signatures.length));
    }

    @NotNull
    public final Set<String> inJavaUtil(@NotNull String name, @NotNull String... signatures) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signatures, "signatures");
        return inClass(javaUtil(name), (String[]) Arrays.copyOf(signatures, signatures.length));
    }

    @NotNull
    public final String javaFunction(@NotNull String str) {
        return b.t(str, "name", "java/util/function/", str);
    }

    @NotNull
    public final String javaLang(@NotNull String str) {
        return b.t(str, "name", "java/lang/", str);
    }

    @NotNull
    public final String javaUtil(@NotNull String str) {
        return b.t(str, "name", "java/util/", str);
    }

    @NotNull
    public final String javaUtilConcurrentAtomic(@NotNull String str) {
        return b.t(str, "name", "java/util/concurrent/atomic/", str);
    }

    @NotNull
    public final String jvmDescriptor(@NotNull String name, @NotNull List<String> parameters, @NotNull String ret) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(ret, "ret");
        StringBuilder sb6 = new StringBuilder();
        sb6.append(name);
        sb6.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
        sb6.append(d0.k0(parameters, "", null, null, 0, d.f263746a, 30));
        sb6.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        if (ret.length() > 1) {
            ret = p.a.l(';', "L", ret);
        }
        sb6.append(ret);
        return sb6.toString();
    }

    @NotNull
    public final String signature(@NotNull String internalName, @NotNull String jvmDescriptor) {
        Intrinsics.checkNotNullParameter(internalName, "internalName");
        Intrinsics.checkNotNullParameter(jvmDescriptor, "jvmDescriptor");
        return internalName + CoreConstants.DOT + jvmDescriptor;
    }
}
