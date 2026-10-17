package ckm;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;

/* JADX INFO: loaded from: classes14.dex */
public final class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TypeDeserializer f24908b;

    public /* synthetic */ f(TypeDeserializer typeDeserializer, int i) {
        this.f24907a = i;
        this.f24908b = typeDeserializer;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f24907a) {
            case 0:
                int iIntValue = ((Number) obj2).intValue();
                DeserializationContext deserializationContext = this.f24908b.f187702a;
                ClassId classId = NameResolverUtilKt.getClassId(deserializationContext.getNameResolver(), iIntValue);
                return classId.isLocal() ? deserializationContext.getComponents().deserializeClass(classId) : FindClassInModuleKt.findClassifierAcrossModuleDependencies(deserializationContext.getComponents().getModuleDescriptor(), classId);
            case 1:
                int iIntValue2 = ((Number) obj2).intValue();
                DeserializationContext deserializationContext2 = this.f24908b.f187702a;
                ClassId classId2 = NameResolverUtilKt.getClassId(deserializationContext2.getNameResolver(), iIntValue2);
                if (classId2.isLocal()) {
                    return null;
                }
                return FindClassInModuleKt.findTypeAliasAcrossModuleDependencies(deserializationContext2.getComponents().getModuleDescriptor(), classId2);
            default:
                ProtoBuf.Type it8 = (ProtoBuf.Type) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return ProtoTypeTableUtilKt.outerType(it8, this.f24908b.f187702a.getTypeTable());
        }
    }
}
