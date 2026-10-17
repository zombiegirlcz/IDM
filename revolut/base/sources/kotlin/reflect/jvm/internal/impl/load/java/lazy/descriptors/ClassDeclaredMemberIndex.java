package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent;
import kotlin.reflect.jvm.internal.impl.name.Name;
import n8i.b1;
import nkm.g;
import nkm.h;
import nkm.y;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes14.dex */
public class ClassDeclaredMemberIndex implements DeclaredMemberIndex {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JavaClass f186958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f186959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b1 f186960c;
    public final LinkedHashMap d;
    public final LinkedHashMap e;
    public final LinkedHashMap f;

    public ClassDeclaredMemberIndex(@NotNull JavaClass jClass, @NotNull Function1<? super JavaMember, Boolean> memberFilter) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Intrinsics.checkNotNullParameter(memberFilter, "memberFilter");
        this.f186958a = jClass;
        this.f186959b = memberFilter;
        b1 b1Var = new b1(this, 14);
        this.f186960c = b1Var;
        h hVarN = y.n(d0.Q(jClass.getMethods()), b1Var);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        g gVar = new g(hVarN);
        while (gVar.hasNext()) {
            Object next = gVar.next();
            Name name = ((JavaMethod) next).getName();
            Object arrayList = linkedHashMap.get(name);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(name, arrayList);
            }
            ((List) arrayList).add(next);
        }
        this.d = linkedHashMap;
        h hVarN2 = y.n(d0.Q(this.f186958a.getFields()), this.f186959b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        g gVar2 = new g(hVarN2);
        while (gVar2.hasNext()) {
            Object next2 = gVar2.next();
            linkedHashMap2.put(((JavaField) next2).getName(), next2);
        }
        this.e = linkedHashMap2;
        Collection<JavaRecordComponent> recordComponents = this.f186958a.getRecordComponents();
        Function1 function1 = this.f186959b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : recordComponents) {
            if (((Boolean) function1.invoke(obj2)).booleanValue()) {
                arrayList2.add(obj2);
            }
        }
        int iB = q0.b(w.t(arrayList2, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iB < 16 ? 16 : iB);
        for (Object obj3 : arrayList2) {
            linkedHashMap3.put(((JavaRecordComponent) obj3).getName(), obj3);
        }
        this.f = linkedHashMap3;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    public JavaField findFieldByName(@NotNull Name name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return (JavaField) this.e.get(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    @NotNull
    public Collection<JavaMethod> findMethodsByName(@NotNull Name name) {
        Intrinsics.checkNotNullParameter(name, "name");
        List list = (List) this.d.get(name);
        return list != null ? list : f0.f322471a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    public JavaRecordComponent findRecordComponentByName(@NotNull Name name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return (JavaRecordComponent) this.f.get(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    @NotNull
    public Set<Name> getFieldNames() {
        h hVarN = y.n(d0.Q(this.f186958a.getFields()), this.f186959b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        g gVar = new g(hVarN);
        while (gVar.hasNext()) {
            linkedHashSet.add(((JavaField) gVar.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    @NotNull
    public Set<Name> getMethodNames() {
        h hVarN = y.n(d0.Q(this.f186958a.getMethods()), this.f186960c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        g gVar = new g(hVarN);
        while (gVar.hasNext()) {
            linkedHashSet.add(((JavaMethod) gVar.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    @NotNull
    public Set<Name> getRecordComponentNames() {
        return this.f.keySet();
    }
}
