package kotlin.reflect.jvm.internal.impl.load.java;

import a0.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;
import zhm.q0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes14.dex */
public final class BuiltinSpecialProperties {

    @NotNull
    public static final BuiltinSpecialProperties INSTANCE = new BuiltinSpecialProperties();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f186859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f186860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f186861c;
    public static final Set d;

    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, java.util.Map] */
    static {
        FqNameUnsafe fqNameUnsafe = StandardNames.FqNames._enum;
        Pair pair = new Pair(BuiltinSpecialPropertiesKt.access$childSafe(fqNameUnsafe, "name"), StandardNames.NAME);
        Pair pair2 = new Pair(BuiltinSpecialPropertiesKt.access$childSafe(fqNameUnsafe, "ordinal"), Name.identifier("ordinal"));
        Pair pair3 = new Pair(d.y("size", "identifier(...)", StandardNames.FqNames.collection), Name.identifier("size"));
        FqName fqName = StandardNames.FqNames.map;
        Map mapK = r0.k(pair, pair2, pair3, new Pair(d.y("size", "identifier(...)", fqName), Name.identifier("size")), new Pair(BuiltinSpecialPropertiesKt.access$childSafe(StandardNames.FqNames.charSequence, "length"), Name.identifier("length")), new Pair(d.y("keys", "identifier(...)", fqName), Name.identifier("keySet")), new Pair(d.y("values", "identifier(...)", fqName), Name.identifier("values")), new Pair(d.y("entries", "identifier(...)", fqName), Name.identifier("entrySet")), new Pair(d.y("size", "identifier(...)", StandardNames.FqNames.atomicIntArray), Name.identifier("length")), new Pair(d.y("size", "identifier(...)", StandardNames.FqNames.atomicLongArray), Name.identifier("length")), new Pair(d.y("size", "identifier(...)", StandardNames.FqNames.atomicArray), Name.identifier("length")));
        f186859a = mapK;
        Set<Map.Entry> setEntrySet = mapK.entrySet();
        ArrayList<Pair> arrayList = new ArrayList(w.t(setEntrySet, 10));
        for (Map.Entry entry : setEntrySet) {
            arrayList.add(new Pair(((FqName) entry.getKey()).shortName(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Pair pair4 : arrayList) {
            Name name = (Name) pair4.f186386b;
            Object arrayList2 = linkedHashMap.get(name);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(name, arrayList2);
            }
            ((List) arrayList2).add((Name) pair4.f186385a);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(q0.b(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), d0.U((Iterable) entry2.getValue()));
        }
        f186860b = linkedHashMap2;
        ?? r06 = f186859a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : r06.entrySet()) {
            ClassId classIdMapKotlinToJava = JavaToKotlinClassMap.INSTANCE.mapKotlinToJava(((FqName) entry3.getKey()).parent().toUnsafe());
            Intrinsics.h(classIdMapKotlinToJava);
            linkedHashSet.add(classIdMapKotlinToJava.asSingleFqName().child((Name) entry3.getValue()));
        }
        Set setKeySet = f186859a.keySet();
        f186861c = setKeySet;
        Set set = setKeySet;
        ArrayList arrayList3 = new ArrayList(w.t(set, 10));
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            arrayList3.add(((FqName) it8.next()).shortName());
        }
        d = d0.i1(arrayList3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<kotlin.reflect.jvm.internal.impl.name.FqName, kotlin.reflect.jvm.internal.impl.name.Name>] */
    @NotNull
    public final Map<FqName, Name> getPROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP() {
        return f186859a;
    }

    @NotNull
    public final List<Name> getPropertyNameCandidatesBySpecialGetterName(@NotNull Name name1) {
        Intrinsics.checkNotNullParameter(name1, "name1");
        List<Name> list = (List) f186860b.get(name1);
        return list == null ? f0.f322471a : list;
    }

    @NotNull
    public final Set<FqName> getSPECIAL_FQ_NAMES() {
        return f186861c;
    }

    @NotNull
    public final Set<Name> getSPECIAL_SHORT_NAMES() {
        return d;
    }
}
