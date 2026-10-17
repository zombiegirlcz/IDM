package ekm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.CliSealedClassInheritorsProvider;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ValueClassUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import zhm.d0;
import zhm.f0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes14.dex */
public final class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f127188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DeserializedClassDescriptor f127189b;

    public /* synthetic */ a(DeserializedClassDescriptor deserializedClassDescriptor, int i) {
        this.f127188a = i;
        this.f127189b = deserializedClassDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object next;
        switch (this.f127188a) {
            case 0:
                DeserializedClassDescriptor deserializedClassDescriptor = this.f127189b;
                if (deserializedClassDescriptor.k.isSingleton()) {
                    ClassConstructorDescriptorImpl classConstructorDescriptorImplCreatePrimaryConstructorForObject = DescriptorFactory.createPrimaryConstructorForObject(deserializedClassDescriptor, SourceElement.NO_SOURCE);
                    classConstructorDescriptorImplCreatePrimaryConstructorForObject.setReturnType(deserializedClassDescriptor.getDefaultType());
                    return classConstructorDescriptorImplCreatePrimaryConstructorForObject;
                }
                List<ProtoBuf.Constructor> constructorList = deserializedClassDescriptor.e.getConstructorList();
                Intrinsics.checkNotNullExpressionValue(constructorList, "getConstructorList(...)");
                Iterator<T> it8 = constructorList.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (!Flags.IS_SECONDARY.get(((ProtoBuf.Constructor) next).getFlags()).booleanValue()) {
                        }
                    } else {
                        next = null;
                    }
                }
                ProtoBuf.Constructor constructor = (ProtoBuf.Constructor) next;
                if (constructor != null) {
                    return deserializedClassDescriptor.f187713l.getMemberDeserializer().loadConstructor(constructor, true);
                }
                return null;
            case 1:
                DeserializedClassDescriptor deserializedClassDescriptor2 = this.f127189b;
                DeserializationContext deserializationContext = deserializedClassDescriptor2.f187713l;
                List<ProtoBuf.Constructor> constructorList2 = deserializedClassDescriptor2.e.getConstructorList();
                Intrinsics.checkNotNullExpressionValue(constructorList2, "getConstructorList(...)");
                ArrayList<ProtoBuf.Constructor> arrayList = new ArrayList();
                for (Object obj2 : constructorList2) {
                    Boolean bool = Flags.IS_SECONDARY.get(((ProtoBuf.Constructor) obj2).getFlags());
                    Intrinsics.checkNotNullExpressionValue(bool, "get(...)");
                    if (bool.booleanValue()) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                for (ProtoBuf.Constructor constructor2 : arrayList) {
                    MemberDeserializer memberDeserializer = deserializationContext.getMemberDeserializer();
                    Intrinsics.h(constructor2);
                    arrayList2.add(memberDeserializer.loadConstructor(constructor2, false));
                }
                return d0.E0(deserializationContext.getComponents().getAdditionalClassPartsProvider().getConstructors(deserializedClassDescriptor2), d0.E0(v.l(deserializedClassDescriptor2.mo3786getUnsubstitutedPrimaryConstructor()), arrayList2));
            case 2:
                DeserializedClassDescriptor deserializedClassDescriptor3 = this.f127189b;
                ProtoBuf.Class r2 = deserializedClassDescriptor3.e;
                if (r2.hasCompanionObjectName()) {
                    ClassifierDescriptor classifierDescriptorMo3796getContributedClassifier = deserializedClassDescriptor3.b().mo3796getContributedClassifier(NameResolverUtilKt.getName(deserializedClassDescriptor3.f187713l.getNameResolver(), r2.getCompanionObjectName()), NoLookupLocation.FROM_DESERIALIZATION);
                    if (classifierDescriptorMo3796getContributedClassifier instanceof ClassDescriptor) {
                        return (ClassDescriptor) classifierDescriptorMo3796getContributedClassifier;
                    }
                }
                return null;
            case 3:
                DeserializedClassDescriptor deserializedClassDescriptor4 = this.f127189b;
                DeserializationContext deserializationContext2 = deserializedClassDescriptor4.f187713l;
                if (deserializedClassDescriptor4.i != Modality.SEALED) {
                    return f0.f322471a;
                }
                List<Integer> sealedSubclassFqNameList = deserializedClassDescriptor4.e.getSealedSubclassFqNameList();
                Intrinsics.h(sealedSubclassFqNameList);
                if (sealedSubclassFqNameList.isEmpty()) {
                    return CliSealedClassInheritorsProvider.INSTANCE.computeSealedSubclasses(deserializedClassDescriptor4, false);
                }
                ArrayList arrayList3 = new ArrayList();
                for (Integer num : sealedSubclassFqNameList) {
                    DeserializationComponents components = deserializationContext2.getComponents();
                    NameResolver nameResolver = deserializationContext2.getNameResolver();
                    Intrinsics.h(num);
                    ClassDescriptor classDescriptorDeserializeClass = components.deserializeClass(NameResolverUtilKt.getClassId(nameResolver, num.intValue()));
                    if (classDescriptorDeserializeClass != null) {
                        arrayList3.add(classDescriptorDeserializeClass);
                    }
                }
                return arrayList3;
            case 4:
                DeserializedClassDescriptor deserializedClassDescriptor5 = this.f127189b;
                DeserializationContext deserializationContext3 = deserializedClassDescriptor5.f187713l;
                if (deserializedClassDescriptor5.isInline() || deserializedClassDescriptor5.isValue()) {
                    boolean zIsAtLeast = deserializedClassDescriptor5.f.isAtLeast(1, 5, 1);
                    ValueClassRepresentation valueClassRepresentationLoadValueClassRepresentation = ValueClassUtilKt.loadValueClassRepresentation(deserializedClassDescriptor5.e, zIsAtLeast, deserializationContext3.getNameResolver(), deserializationContext3.getTypeTable(), new f(1, 0, TypeDeserializer.class, deserializationContext3.getTypeDeserializer(), "simpleType", "simpleType(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Type;Z)Lorg/jetbrains/kotlin/types/SimpleType;"), new eif.c(1, deserializedClassDescriptor5, DeserializedClassDescriptor.class, "getValueClassPropertyType", "getValueClassPropertyType(Lorg/jetbrains/kotlin/name/Name;)Lorg/jetbrains/kotlin/types/SimpleType;", 0, 8));
                    if (valueClassRepresentationLoadValueClassRepresentation != null) {
                        return valueClassRepresentationLoadValueClassRepresentation;
                    }
                    if (!zIsAtLeast) {
                        ClassConstructorDescriptor classConstructorDescriptorMo3786getUnsubstitutedPrimaryConstructor = deserializedClassDescriptor5.mo3786getUnsubstitutedPrimaryConstructor();
                        if (classConstructorDescriptorMo3786getUnsubstitutedPrimaryConstructor == null) {
                            throw new IllegalStateException(("Inline class has no primary constructor: " + deserializedClassDescriptor5).toString());
                        }
                        List<ValueParameterDescriptor> valueParameters = classConstructorDescriptorMo3786getUnsubstitutedPrimaryConstructor.getValueParameters();
                        Intrinsics.checkNotNullExpressionValue(valueParameters, "getValueParameters(...)");
                        Name name = ((ValueParameterDescriptor) d0.b0(valueParameters)).getName();
                        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                        SimpleType simpleTypeC = deserializedClassDescriptor5.c(name);
                        if (simpleTypeC != null) {
                            return new InlineClassRepresentation(name, simpleTypeC);
                        }
                        throw new IllegalStateException(("Value class has no underlying property: " + deserializedClassDescriptor5).toString());
                    }
                }
                return null;
            case 5:
                DeserializedClassDescriptor deserializedClassDescriptor6 = this.f127189b;
                return d0.d1(deserializedClassDescriptor6.f187713l.getComponents().getAnnotationAndConstantLoader().loadClassAnnotations(deserializedClassDescriptor6.f187721w));
            default:
                return TypeParameterUtilsKt.computeConstructorTypeParameters(this.f127189b);
        }
    }
}
