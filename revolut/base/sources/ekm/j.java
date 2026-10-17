package ekm;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import zhm.a1;

/* JADX INFO: loaded from: classes14.dex */
public final class j implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f127200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f127201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DeserializedMemberScope f127202c;

    public /* synthetic */ j(k kVar, DeserializedMemberScope deserializedMemberScope, int i) {
        this.f127200a = i;
        this.f127201b = kVar;
        this.f127202c = deserializedMemberScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f127200a) {
            case 0:
                k kVar = this.f127201b;
                List list = kVar.f127203a;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                DeserializedMemberScope deserializedMemberScope = kVar.f127211n;
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    linkedHashSet.add(NameResolverUtilKt.getName(deserializedMemberScope.f187724a.getNameResolver(), ((ProtoBuf.Function) ((MessageLite) it8.next())).getName()));
                }
                return a1.l(linkedHashSet, this.f127202c.g());
            default:
                k kVar2 = this.f127201b;
                List list2 = kVar2.f127204b;
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                DeserializedMemberScope deserializedMemberScope2 = kVar2.f127211n;
                Iterator it9 = list2.iterator();
                while (it9.hasNext()) {
                    linkedHashSet2.add(NameResolverUtilKt.getName(deserializedMemberScope2.f187724a.getNameResolver(), ((ProtoBuf.Property) ((MessageLite) it9.next())).getName()));
                }
                return a1.l(linkedHashSet2, this.f127202c.h());
        }
    }
}
