package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.StandardClassIds;
import org.jetbrains.annotations.NotNull;
import zhm.r0;

/* JADX INFO: loaded from: classes14.dex */
public final class FakePureImplementationsProvider {

    @NotNull
    public static final FakePureImplementationsProvider INSTANCE = new FakePureImplementationsProvider();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f186863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f186864b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f186863a = linkedHashMap;
        StandardClassIds standardClassIds = StandardClassIds.INSTANCE;
        b(standardClassIds.getMutableList(), a("java.util.ArrayList", "java.util.LinkedList"));
        b(standardClassIds.getMutableSet(), a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        b(standardClassIds.getMutableMap(), a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        ClassId.Companion companion = ClassId.Companion;
        b(companion.topLevel(new FqName("java.util.function.Function")), a("java.util.function.UnaryOperator"));
        b(companion.topLevel(new FqName("java.util.function.BiFunction")), a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new Pair(((ClassId) entry.getKey()).asSingleFqName(), ((ClassId) entry.getValue()).asSingleFqName()));
        }
        f186864b = r0.t(arrayList);
    }

    public static ArrayList a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(ClassId.Companion.topLevel(new FqName(str)));
        }
        return arrayList;
    }

    public static void b(ClassId classId, ArrayList arrayList) {
        for (Object obj2 : arrayList) {
            f186863a.put(obj2, classId);
        }
    }

    public final FqName getPurelyImplementedInterface(@NotNull FqName classFqName) {
        Intrinsics.checkNotNullParameter(classFqName, "classFqName");
        return (FqName) f186864b.get(classFqName);
    }
}
