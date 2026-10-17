package ekm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import zhm.f0;

/* JADX INFO: loaded from: classes14.dex */
public final class k implements h {
    public static final /* synthetic */ KProperty[] o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f127203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f127204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f127205c;
    public final NotNullLazyValue d;
    public final NotNullLazyValue e;
    public final NotNullLazyValue f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final NotNullLazyValue f127206g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final NotNullLazyValue f127207h;
    public final NotNullLazyValue i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final NotNullLazyValue f127208j;
    public final NotNullLazyValue k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final NotNullLazyValue f127209l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final NotNullLazyValue f127210m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ DeserializedMemberScope f127211n;

    static {
        h0 h0Var = new h0(k.class, "declaredFunctions", "getDeclaredFunctions()Ljava/util/List;", 0);
        p0 p0Var = o0.f186429a;
        o = new KProperty[]{p0Var.j(h0Var), p.a.y(k.class, "declaredProperties", "getDeclaredProperties()Ljava/util/List;", 0, p0Var), p.a.y(k.class, "allTypeAliases", "getAllTypeAliases()Ljava/util/List;", 0, p0Var), p.a.y(k.class, "allFunctions", "getAllFunctions()Ljava/util/List;", 0, p0Var), p.a.y(k.class, "allProperties", "getAllProperties()Ljava/util/List;", 0, p0Var), p.a.y(k.class, "typeAliasesByName", "getTypeAliasesByName()Ljava/util/Map;", 0, p0Var), p.a.y(k.class, "functionsByName", "getFunctionsByName()Ljava/util/Map;", 0, p0Var), p.a.y(k.class, "propertiesByName", "getPropertiesByName()Ljava/util/Map;", 0, p0Var), p.a.y(k.class, "functionNames", "getFunctionNames()Ljava/util/Set;", 0, p0Var), p.a.y(k.class, "variableNames", "getVariableNames()Ljava/util/Set;", 0, p0Var)};
    }

    public k(DeserializedMemberScope deserializedMemberScope, List functionList, List propertyList, List typeAliasList) {
        Intrinsics.checkNotNullParameter(functionList, "functionList");
        Intrinsics.checkNotNullParameter(propertyList, "propertyList");
        Intrinsics.checkNotNullParameter(typeAliasList, "typeAliasList");
        this.f127211n = deserializedMemberScope;
        this.f127203a = functionList;
        this.f127204b = propertyList;
        DeserializationContext deserializationContext = deserializedMemberScope.f187724a;
        this.f127205c = deserializationContext.getComponents().getConfiguration().getTypeAliasesAllowed() ? typeAliasList : f0.f322471a;
        this.d = deserializationContext.getStorageManager().createLazyValue(new i(this, 0));
        this.e = deserializationContext.getStorageManager().createLazyValue(new i(this, 1));
        this.f = deserializationContext.getStorageManager().createLazyValue(new i(this, 2));
        this.f127206g = deserializationContext.getStorageManager().createLazyValue(new i(this, 3));
        this.f127207h = deserializationContext.getStorageManager().createLazyValue(new i(this, 4));
        this.i = deserializationContext.getStorageManager().createLazyValue(new i(this, 5));
        this.f127208j = deserializationContext.getStorageManager().createLazyValue(new i(this, 6));
        this.k = deserializationContext.getStorageManager().createLazyValue(new i(this, 7));
        this.f127209l = deserializationContext.getStorageManager().createLazyValue(new j(this, deserializedMemberScope, 0));
        this.f127210m = deserializationContext.getStorageManager().createLazyValue(new j(this, deserializedMemberScope, 1));
    }

    @Override // ekm.h
    public final TypeAliasDescriptor a(Name name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return (TypeAliasDescriptor) ((Map) StorageKt.getValue(this.i, this, o[5])).get(name);
    }

    @Override // ekm.h
    public final Set b() {
        List list = this.f127205c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            linkedHashSet.add(NameResolverUtilKt.getName(this.f127211n.f187724a.getNameResolver(), ((ProtoBuf.TypeAlias) ((MessageLite) it8.next())).getName()));
        }
        return linkedHashSet;
    }

    @Override // ekm.h
    public final void c(ArrayList result, DescriptorKindFilter kindFilter, Function1 nameFilter, LookupLocation location) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        Intrinsics.checkNotNullParameter(location, "location");
        boolean zAcceptsKinds = kindFilter.acceptsKinds(DescriptorKindFilter.Companion.getVARIABLES_MASK());
        KProperty[] kPropertyArr = o;
        if (zAcceptsKinds) {
            for (Object obj2 : (List) StorageKt.getValue(this.f127207h, this, kPropertyArr[4])) {
                Name name = ((PropertyDescriptor) obj2).getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                if (((Boolean) nameFilter.invoke(name)).booleanValue()) {
                    result.add(obj2);
                }
            }
        }
        if (kindFilter.acceptsKinds(DescriptorKindFilter.Companion.getFUNCTIONS_MASK())) {
            for (Object obj3 : (List) StorageKt.getValue(this.f127206g, this, kPropertyArr[3])) {
                Name name2 = ((SimpleFunctionDescriptor) obj3).getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                if (((Boolean) nameFilter.invoke(name2)).booleanValue()) {
                    result.add(obj3);
                }
            }
        }
    }

    @Override // ekm.h
    public final Collection getContributedFunctions(Name name, LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        if (!getFunctionNames().contains(name)) {
            return f0.f322471a;
        }
        Collection collection = (Collection) ((Map) StorageKt.getValue(this.f127208j, this, o[6])).get(name);
        return collection == null ? f0.f322471a : collection;
    }

    @Override // ekm.h
    public final Collection getContributedVariables(Name name, LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        if (!getVariableNames().contains(name)) {
            return f0.f322471a;
        }
        Collection collection = (Collection) ((Map) StorageKt.getValue(this.k, this, o[7])).get(name);
        return collection == null ? f0.f322471a : collection;
    }

    @Override // ekm.h
    public final Set getFunctionNames() {
        return (Set) StorageKt.getValue(this.f127209l, this, o[8]);
    }

    @Override // ekm.h
    public final Set getVariableNames() {
        return (Set) StorageKt.getValue(this.f127210m, this, o[9]);
    }
}
