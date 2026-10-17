package ekm;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.MemberComparator;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import zhm.f0;
import zhm.q0;
import zhm.r0;
import zhm.w;
import zhm.z;

/* JADX INFO: loaded from: classes13.dex */
public final class n implements h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f127217j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f127218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f127219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f127220c;
    public final MemoizedFunctionToNotNull d;
    public final MemoizedFunctionToNotNull e;
    public final MemoizedFunctionToNullable f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final NotNullLazyValue f127221g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final NotNullLazyValue f127222h;
    public final /* synthetic */ DeserializedMemberScope i;

    static {
        h0 h0Var = new h0(n.class, "functionNames", "getFunctionNames()Ljava/util/Set;", 0);
        p0 p0Var = o0.f186429a;
        f127217j = new KProperty[]{p0Var.j(h0Var), p.a.y(n.class, "variableNames", "getVariableNames()Ljava/util/Set;", 0, p0Var)};
    }

    public n(DeserializedMemberScope deserializedMemberScope, List functionList, List propertyList, List typeAliasList) throws IOException {
        Object objG;
        Intrinsics.checkNotNullParameter(functionList, "functionList");
        Intrinsics.checkNotNullParameter(propertyList, "propertyList");
        Intrinsics.checkNotNullParameter(typeAliasList, "typeAliasList");
        this.i = deserializedMemberScope;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : functionList) {
            Name name = NameResolverUtilKt.getName(deserializedMemberScope.f187724a.getNameResolver(), ((ProtoBuf.Function) ((MessageLite) obj2)).getName());
            Object arrayList = linkedHashMap.get(name);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(name, arrayList);
            }
            ((List) arrayList).add(obj2);
        }
        this.f127218a = d(linkedHashMap);
        DeserializedMemberScope deserializedMemberScope2 = this.i;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj3 : propertyList) {
            Name name2 = NameResolverUtilKt.getName(deserializedMemberScope2.f187724a.getNameResolver(), ((ProtoBuf.Property) ((MessageLite) obj3)).getName());
            Object arrayList2 = linkedHashMap2.get(name2);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap2.put(name2, arrayList2);
            }
            ((List) arrayList2).add(obj3);
        }
        this.f127219b = d(linkedHashMap2);
        if (this.i.f187724a.getComponents().getConfiguration().getTypeAliasesAllowed()) {
            DeserializedMemberScope deserializedMemberScope3 = this.i;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Object obj4 : typeAliasList) {
                Name name3 = NameResolverUtilKt.getName(deserializedMemberScope3.f187724a.getNameResolver(), ((ProtoBuf.TypeAlias) ((MessageLite) obj4)).getName());
                Object arrayList3 = linkedHashMap3.get(name3);
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                    linkedHashMap3.put(name3, arrayList3);
                }
                ((List) arrayList3).add(obj4);
            }
            objG = d(linkedHashMap3);
        } else {
            objG = r0.g();
        }
        this.f127220c = objG;
        this.d = this.i.f187724a.getStorageManager().createMemoizedFunction(new l(this, 0));
        this.e = this.i.f187724a.getStorageManager().createMemoizedFunction(new l(this, 1));
        this.f = this.i.f187724a.getStorageManager().createMemoizedFunctionWithNullableValues(new l(this, 2));
        this.f127221g = this.i.f187724a.getStorageManager().createLazyValue(new m(this, this.i, 0));
        this.f127222h = this.i.f187724a.getStorageManager().createLazyValue(new m(this, this.i, 1));
    }

    public static LinkedHashMap d(LinkedHashMap linkedHashMap) throws IOException {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(q0.b(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(w.t(iterable, 10));
            Iterator it8 = iterable.iterator();
            while (it8.hasNext()) {
                ((AbstractMessageLite) it8.next()).writeDelimitedTo(byteArrayOutputStream);
                arrayList.add(Unit.f186387a);
            }
            linkedHashMap2.put(key, byteArrayOutputStream.toByteArray());
        }
        return linkedHashMap2;
    }

    @Override // ekm.h
    public final TypeAliasDescriptor a(Name name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return (TypeAliasDescriptor) this.f.invoke(name);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // ekm.h
    public final Set b() {
        return this.f127220c.keySet();
    }

    @Override // ekm.h
    public final void c(ArrayList result, DescriptorKindFilter kindFilter, Function1 nameFilter, LookupLocation location) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        Intrinsics.checkNotNullParameter(location, "location");
        if (kindFilter.acceptsKinds(DescriptorKindFilter.Companion.getVARIABLES_MASK())) {
            Set<Name> variableNames = getVariableNames();
            ArrayList arrayList = new ArrayList();
            for (Name name : variableNames) {
                if (((Boolean) nameFilter.invoke(name)).booleanValue()) {
                    arrayList.addAll(getContributedVariables(name, location));
                }
            }
            MemberComparator.NameAndTypeMemberComparator INSTANCE = MemberComparator.NameAndTypeMemberComparator.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(INSTANCE, "INSTANCE");
            z.w(arrayList, INSTANCE);
            result.addAll(arrayList);
        }
        if (kindFilter.acceptsKinds(DescriptorKindFilter.Companion.getFUNCTIONS_MASK())) {
            Set<Name> functionNames = getFunctionNames();
            ArrayList arrayList2 = new ArrayList();
            for (Name name2 : functionNames) {
                if (((Boolean) nameFilter.invoke(name2)).booleanValue()) {
                    arrayList2.addAll(getContributedFunctions(name2, location));
                }
            }
            MemberComparator.NameAndTypeMemberComparator INSTANCE2 = MemberComparator.NameAndTypeMemberComparator.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(INSTANCE2, "INSTANCE");
            z.w(arrayList2, INSTANCE2);
            result.addAll(arrayList2);
        }
    }

    @Override // ekm.h
    public final Collection getContributedFunctions(Name name, LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return !getFunctionNames().contains(name) ? f0.f322471a : (Collection) this.d.invoke(name);
    }

    @Override // ekm.h
    public final Collection getContributedVariables(Name name, LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return !getVariableNames().contains(name) ? f0.f322471a : (Collection) this.e.invoke(name);
    }

    @Override // ekm.h
    public final Set getFunctionNames() {
        return (Set) StorageKt.getValue(this.f127221g, this, f127217j[0]);
    }

    @Override // ekm.h
    public final Set getVariableNames() {
        return (Set) StorageKt.getValue(this.f127222h, this, f127217j[1]);
    }
}
