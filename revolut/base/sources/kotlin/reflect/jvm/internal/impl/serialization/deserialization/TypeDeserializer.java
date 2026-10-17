package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import ckm.f;
import ckm.g;
import ckm.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributeTranslator;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import nkm.t;
import nkm.y;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes13.dex */
public final class TypeDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeserializationContext f187702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TypeDeserializer f187703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f187704c;
    public final String d;
    public final MemoizedFunctionToNullable e;
    public final MemoizedFunctionToNullable f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f187705g;

    public TypeDeserializer(@NotNull DeserializationContext c2, TypeDeserializer typeDeserializer, @NotNull List<ProtoBuf.TypeParameter> typeParameterProtos, @NotNull String debugName, @NotNull String containerPresentableName) {
        Map linkedHashMap;
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(typeParameterProtos, "typeParameterProtos");
        Intrinsics.checkNotNullParameter(debugName, "debugName");
        Intrinsics.checkNotNullParameter(containerPresentableName, "containerPresentableName");
        this.f187702a = c2;
        this.f187703b = typeDeserializer;
        this.f187704c = debugName;
        this.d = containerPresentableName;
        this.e = c2.getStorageManager().createMemoizedFunctionWithNullableValues(new f(this, 0));
        this.f = c2.getStorageManager().createMemoizedFunctionWithNullableValues(new f(this, 1));
        if (typeParameterProtos.isEmpty()) {
            linkedHashMap = r0.g();
        } else {
            linkedHashMap = new LinkedHashMap();
            int i = 0;
            for (ProtoBuf.TypeParameter typeParameter : typeParameterProtos) {
                linkedHashMap.put(Integer.valueOf(typeParameter.getId()), new DeserializedTypeParameterDescriptor(this.f187702a, typeParameter, i));
                i++;
            }
        }
        this.f187705g = linkedHashMap;
    }

    public static SimpleType a(SimpleType simpleType, KotlinType kotlinType) {
        KotlinBuiltIns builtIns = TypeUtilsKt.getBuiltIns(simpleType);
        Annotations annotations = simpleType.getAnnotations();
        KotlinType receiverTypeFromFunctionType = FunctionTypesKt.getReceiverTypeFromFunctionType(simpleType);
        List<KotlinType> contextReceiverTypesFromFunctionType = FunctionTypesKt.getContextReceiverTypesFromFunctionType(simpleType);
        List listW = d0.W(1, FunctionTypesKt.getValueParameterTypesFromFunctionType(simpleType));
        ArrayList arrayList = new ArrayList(w.t(listW, 10));
        Iterator it8 = listW.iterator();
        while (it8.hasNext()) {
            arrayList.add(((TypeProjection) it8.next()).getType());
        }
        return FunctionTypesKt.createFunctionType(builtIns, annotations, receiverTypeFromFunctionType, contextReceiverTypesFromFunctionType, arrayList, null, kotlinType, true).makeNullableAsSpecified(simpleType.isMarkedNullable());
    }

    public static final ArrayList c(ProtoBuf.Type type, TypeDeserializer typeDeserializer) {
        List<ProtoBuf.Type.Argument> argumentList = type.getArgumentList();
        Intrinsics.checkNotNullExpressionValue(argumentList, "getArgumentList(...)");
        List<ProtoBuf.Type.Argument> list = argumentList;
        ProtoBuf.Type typeOuterType = ProtoTypeTableUtilKt.outerType(type, typeDeserializer.f187702a.getTypeTable());
        Iterable iterableC = typeOuterType != null ? c(typeOuterType, typeDeserializer) : null;
        if (iterableC == null) {
            iterableC = f0.f322471a;
        }
        return d0.E0(iterableC, list);
    }

    public static TypeAttributes d(List list, Annotations annotations, TypeConstructor typeConstructor, DeclarationDescriptor declarationDescriptor) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(((TypeAttributeTranslator) it8.next()).toAttributes(annotations, typeConstructor, declarationDescriptor));
        }
        return TypeAttributes.Companion.create(w.u(arrayList));
    }

    public static final ClassDescriptor e(TypeDeserializer typeDeserializer, ProtoBuf.Type type, int i) {
        DeserializationContext deserializationContext = typeDeserializer.f187702a;
        ClassId classId = NameResolverUtilKt.getClassId(deserializationContext.getNameResolver(), i);
        ArrayList arrayListK = y.K(y.x(t.g(type, new f(typeDeserializer, 2)), g.f24909a));
        int iJ = y.j(t.g(classId, h.f));
        while (arrayListK.size() < iJ) {
            arrayListK.add(0);
        }
        return deserializationContext.getComponents().getNotFoundClasses().getClass(classId, arrayListK);
    }

    public static /* synthetic */ SimpleType simpleType$default(TypeDeserializer typeDeserializer, ProtoBuf.Type type, boolean z, int i, Object obj2) {
        if ((i & 2) != 0) {
            z = true;
        }
        return typeDeserializer.simpleType(type, z);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final TypeParameterDescriptor b(int i) {
        TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) this.f187705g.get(Integer.valueOf(i));
        if (typeParameterDescriptor != null) {
            return typeParameterDescriptor;
        }
        TypeDeserializer typeDeserializer = this.f187703b;
        if (typeDeserializer != null) {
            return typeDeserializer.b(i);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @NotNull
    public final List<TypeParameterDescriptor> getOwnTypeParameters() {
        return d0.d1(this.f187705g.values());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014c  */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v57, types: [kotlin.reflect.jvm.internal.impl.types.SimpleType] */
    /* JADX WARN: Type inference failed for: r2v77 */
    /* JADX WARN: Type inference failed for: r2v78 */
    /* JADX WARN: Type inference failed for: r2v79 */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type r21, boolean r22) {
        /*
            Method dump skipped, instruction units count: 912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer.simpleType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type, boolean):kotlin.reflect.jvm.internal.impl.types.SimpleType");
    }

    @NotNull
    public String toString() {
        String str;
        StringBuilder sb6 = new StringBuilder();
        sb6.append(this.f187704c);
        TypeDeserializer typeDeserializer = this.f187703b;
        if (typeDeserializer == null) {
            str = "";
        } else {
            str = ". Child of " + typeDeserializer.f187704c;
        }
        sb6.append(str);
        return sb6.toString();
    }

    @NotNull
    public final KotlinType type(@NotNull ProtoBuf.Type proto) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        if (!proto.hasFlexibleTypeCapabilitiesId()) {
            return simpleType(proto, true);
        }
        DeserializationContext deserializationContext = this.f187702a;
        String string = deserializationContext.getNameResolver().getString(proto.getFlexibleTypeCapabilitiesId());
        SimpleType simpleTypeSimpleType$default = simpleType$default(this, proto, false, 2, null);
        ProtoBuf.Type typeFlexibleUpperBound = ProtoTypeTableUtilKt.flexibleUpperBound(proto, deserializationContext.getTypeTable());
        Intrinsics.h(typeFlexibleUpperBound);
        return deserializationContext.getComponents().getFlexibleTypeDeserializer().create(proto, string, simpleTypeSimpleType$default, simpleType$default(this, typeFlexibleUpperBound, false, 2, null));
    }
}
