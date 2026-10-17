package ekm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import zhm.a0;
import zhm.d0;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes14.dex */
public final class i implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f127198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f127199b;

    public /* synthetic */ i(k kVar, int i) {
        this.f127198a = i;
        this.f127199b = kVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f127198a) {
            case 0:
                k kVar = this.f127199b;
                List list = kVar.f127203a;
                DeserializedMemberScope deserializedMemberScope = kVar.f127211n;
                ArrayList arrayList = new ArrayList();
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    SimpleFunctionDescriptor simpleFunctionDescriptorLoadFunction = deserializedMemberScope.f187724a.getMemberDeserializer().loadFunction((ProtoBuf.Function) ((MessageLite) it8.next()));
                    if (!deserializedMemberScope.j(simpleFunctionDescriptorLoadFunction)) {
                        simpleFunctionDescriptorLoadFunction = null;
                    }
                    if (simpleFunctionDescriptorLoadFunction != null) {
                        arrayList.add(simpleFunctionDescriptorLoadFunction);
                    }
                }
                return arrayList;
            case 1:
                k kVar2 = this.f127199b;
                List list2 = kVar2.f127204b;
                DeserializedMemberScope deserializedMemberScope2 = kVar2.f127211n;
                ArrayList arrayList2 = new ArrayList();
                Iterator it9 = list2.iterator();
                while (it9.hasNext()) {
                    PropertyDescriptor propertyDescriptorLoadProperty$default = MemberDeserializer.loadProperty$default(deserializedMemberScope2.f187724a.getMemberDeserializer(), (ProtoBuf.Property) ((MessageLite) it9.next()), false, 2, null);
                    if (propertyDescriptorLoadProperty$default != null) {
                        arrayList2.add(propertyDescriptorLoadProperty$default);
                    }
                }
                return arrayList2;
            case 2:
                k kVar3 = this.f127199b;
                List list3 = kVar3.f127205c;
                DeserializedMemberScope deserializedMemberScope3 = kVar3.f127211n;
                ArrayList arrayList3 = new ArrayList();
                Iterator it10 = list3.iterator();
                while (it10.hasNext()) {
                    TypeAliasDescriptor typeAliasDescriptorLoadTypeAlias = deserializedMemberScope3.f187724a.getMemberDeserializer().loadTypeAlias((ProtoBuf.TypeAlias) ((MessageLite) it10.next()));
                    if (typeAliasDescriptorLoadTypeAlias != null) {
                        arrayList3.add(typeAliasDescriptorLoadTypeAlias);
                    }
                }
                return arrayList3;
            case 3:
                k kVar4 = this.f127199b;
                NotNullLazyValue notNullLazyValue = kVar4.d;
                List list4 = (List) StorageKt.getValue(notNullLazyValue, kVar4, k.o[0]);
                DeserializedMemberScope deserializedMemberScope4 = kVar4.f127211n;
                Set<Name> setG = deserializedMemberScope4.g();
                ArrayList arrayList4 = new ArrayList();
                for (Name name : setG) {
                    List list5 = (List) StorageKt.getValue(notNullLazyValue, kVar4, k.o[0]);
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj2 : list5) {
                        if (Intrinsics.f(((DeclarationDescriptor) obj2).getName(), name)) {
                            arrayList5.add(obj2);
                        }
                    }
                    int size = arrayList5.size();
                    deserializedMemberScope4.c(name, arrayList5);
                    a0.x(arrayList5.subList(size, arrayList5.size()), arrayList4);
                }
                return d0.E0(arrayList4, list4);
            case 4:
                k kVar5 = this.f127199b;
                NotNullLazyValue notNullLazyValue2 = kVar5.e;
                List list6 = (List) StorageKt.getValue(notNullLazyValue2, kVar5, k.o[1]);
                DeserializedMemberScope deserializedMemberScope5 = kVar5.f127211n;
                Set<Name> setH = deserializedMemberScope5.h();
                ArrayList arrayList6 = new ArrayList();
                for (Name name2 : setH) {
                    List list7 = (List) StorageKt.getValue(notNullLazyValue2, kVar5, k.o[1]);
                    ArrayList arrayList7 = new ArrayList();
                    for (Object obj3 : list7) {
                        if (Intrinsics.f(((DeclarationDescriptor) obj3).getName(), name2)) {
                            arrayList7.add(obj3);
                        }
                    }
                    int size2 = arrayList7.size();
                    deserializedMemberScope5.d(name2, arrayList7);
                    a0.x(arrayList7.subList(size2, arrayList7.size()), arrayList6);
                }
                return d0.E0(arrayList6, list6);
            case 5:
                k kVar6 = this.f127199b;
                List list8 = (List) StorageKt.getValue(kVar6.f, kVar6, k.o[2]);
                int iB = q0.b(w.t(list8, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (Object obj4 : list8) {
                    Name name3 = ((TypeAliasDescriptor) obj4).getName();
                    Intrinsics.checkNotNullExpressionValue(name3, "getName(...)");
                    linkedHashMap.put(name3, obj4);
                }
                return linkedHashMap;
            case 6:
                k kVar7 = this.f127199b;
                List list9 = (List) StorageKt.getValue(kVar7.f127206g, kVar7, k.o[3]);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Object obj5 : list9) {
                    Name name4 = ((SimpleFunctionDescriptor) obj5).getName();
                    Intrinsics.checkNotNullExpressionValue(name4, "getName(...)");
                    Object arrayList8 = linkedHashMap2.get(name4);
                    if (arrayList8 == null) {
                        arrayList8 = new ArrayList();
                        linkedHashMap2.put(name4, arrayList8);
                    }
                    ((List) arrayList8).add(obj5);
                }
                return linkedHashMap2;
            default:
                k kVar8 = this.f127199b;
                List list10 = (List) StorageKt.getValue(kVar8.f127207h, kVar8, k.o[4]);
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Object obj6 : list10) {
                    Name name5 = ((PropertyDescriptor) obj6).getName();
                    Intrinsics.checkNotNullExpressionValue(name5, "getName(...)");
                    Object arrayList9 = linkedHashMap3.get(name5);
                    if (arrayList9 == null) {
                        arrayList9 = new ArrayList();
                        linkedHashMap3.put(name5, arrayList9);
                    }
                    ((List) arrayList9).add(obj6);
                }
                return linkedHashMap3;
        }
    }
}
