package kotlin.reflect.jvm.internal.impl.km.jvm.internal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.jvm.internal.impl.km.KmAnnotation;
import kotlin.reflect.jvm.internal.impl.km.KmClass;
import kotlin.reflect.jvm.internal.impl.km.KmConstructor;
import kotlin.reflect.jvm.internal.impl.km.KmEnumEntry;
import kotlin.reflect.jvm.internal.impl.km.KmFunction;
import kotlin.reflect.jvm.internal.impl.km.KmPackage;
import kotlin.reflect.jvm.internal.impl.km.KmProperty;
import kotlin.reflect.jvm.internal.impl.km.KmPropertyAccessorAttributes;
import kotlin.reflect.jvm.internal.impl.km.KmType;
import kotlin.reflect.jvm.internal.impl.km.KmTypeAlias;
import kotlin.reflect.jvm.internal.impl.km.KmTypeParameter;
import kotlin.reflect.jvm.internal.impl.km.KmValueParameter;
import kotlin.reflect.jvm.internal.impl.km.internal.ReadContext;
import kotlin.reflect.jvm.internal.impl.km.internal.ReadUtilsKt;
import kotlin.reflect.jvm.internal.impl.km.internal.ReadersKt;
import kotlin.reflect.jvm.internal.impl.km.internal.WriteContext;
import kotlin.reflect.jvm.internal.impl.km.internal.WriteUtilsKt;
import kotlin.reflect.jvm.internal.impl.km.internal.WritersKt;
import kotlin.reflect.jvm.internal.impl.km.internal.common.KmModuleFragment;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmClassExtension;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmConstructorExtension;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmEnumEntryExtension;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmExtensionType;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmFunctionExtension;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmModuleFragmentExtension;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmPackageExtension;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmPropertyExtension;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmTypeAliasExtension;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmTypeExtension;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmTypeParameterExtension;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmValueParameterExtension;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions;
import kotlin.reflect.jvm.internal.impl.km.jvm.JvmFieldSignature;
import kotlin.reflect.jvm.internal.impl.km.jvm.JvmMemberSignatureKt;
import kotlin.reflect.jvm.internal.impl.km.jvm.JvmMethodSignature;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes14.dex */
public final class JvmMetadataExtensions implements MetadataExtensions {
    public static JvmProtoBuf.JvmMethodSignature a(JvmMethodSignature jvmMethodSignature, WriteContext writeContext) {
        JvmProtoBuf.JvmMethodSignature.Builder builderNewBuilder = JvmProtoBuf.JvmMethodSignature.newBuilder();
        builderNewBuilder.setName(writeContext.get(jvmMethodSignature.getName()));
        builderNewBuilder.setDesc(writeContext.get(jvmMethodSignature.getDescriptor()));
        JvmProtoBuf.JvmMethodSignature jvmMethodSignatureBuild = builderNewBuilder.build();
        Intrinsics.checkNotNullExpressionValue(jvmMethodSignatureBuild, "build(...)");
        return jvmMethodSignatureBuild;
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions
    @NotNull
    public KmClassExtension createClassExtension() {
        return new JvmClassExtension();
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions
    @NotNull
    public KmConstructorExtension createConstructorExtension() {
        return new JvmConstructorExtension();
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions
    public KmEnumEntryExtension createEnumEntryExtension() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions
    @NotNull
    public KmFunctionExtension createFunctionExtension() {
        return new JvmFunctionExtension();
    }

    @NotNull
    public KmModuleFragmentExtension createModuleFragmentExtensions() {
        return new KmModuleFragmentExtension() { // from class: kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmMetadataExtensions.createModuleFragmentExtensions.1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final KmExtensionType f186847a = new KmExtensionType(o0.f186429a.b(KmModuleFragmentExtension.class));

            @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmExtension
            public KmExtensionType getType() {
                return this.f186847a;
            }
        };
    }

    @NotNull
    public KmPackageExtension createPackageExtension() {
        return new JvmPackageExtension();
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions
    @NotNull
    public KmPropertyExtension createPropertyExtension() {
        return new JvmPropertyExtension();
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions
    public KmTypeAliasExtension createTypeAliasExtension() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions
    @NotNull
    public KmTypeExtension createTypeExtension() {
        return new JvmTypeExtension();
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions
    @NotNull
    public KmTypeParameterExtension createTypeParameterExtension() {
        return new JvmTypeParameterExtension();
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions
    public KmValueParameterExtension createValueParameterExtension() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions
    public void readClassExtensions(@NotNull KmClass kmClass, @NotNull ProtoBuf.Class proto, @NotNull ReadContext c2) {
        String str;
        Intrinsics.checkNotNullParameter(kmClass, "kmClass");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(c2, "c");
        JvmClassExtension jvm = JvmExtensionNodesKt.getJvm(kmClass);
        List<ProtoBuf.Annotation> annotationList = proto.getAnnotationList();
        Intrinsics.checkNotNullExpressionValue(annotationList, "getAnnotationList(...)");
        List<KmAnnotation> annotations = kmClass.getAnnotations();
        for (ProtoBuf.Annotation annotation : annotationList) {
            Intrinsics.h(annotation);
            annotations.add(ReadUtilsKt.readAnnotation(annotation, c2.getStrings()));
        }
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, Integer> anonymousObjectOriginName = JvmProtoBuf.anonymousObjectOriginName;
        Intrinsics.checkNotNullExpressionValue(anonymousObjectOriginName, "anonymousObjectOriginName");
        Integer num = (Integer) ProtoBufUtilKt.getExtensionOrNull(proto, anonymousObjectOriginName);
        if (num != null) {
            jvm.setAnonymousObjectOriginName(c2.get(num.intValue()));
        }
        for (ProtoBuf.Property property : (List) proto.getExtension(JvmProtoBuf.classLocalVariable)) {
            List<KmProperty> localDelegatedProperties = jvm.getLocalDelegatedProperties();
            Intrinsics.h(property);
            localDelegatedProperties.add(ReadersKt.toKmProperty(property, c2));
        }
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, Integer> classModuleName = JvmProtoBuf.classModuleName;
        Intrinsics.checkNotNullExpressionValue(classModuleName, "classModuleName");
        Integer num2 = (Integer) ProtoBufUtilKt.getExtensionOrNull(proto, classModuleName);
        if (num2 == null || (str = c2.get(num2.intValue())) == null) {
            str = "main";
        }
        jvm.setModuleName(str);
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, Integer> jvmClassFlags = JvmProtoBuf.jvmClassFlags;
        Intrinsics.checkNotNullExpressionValue(jvmClassFlags, "jvmClassFlags");
        Integer num3 = (Integer) ProtoBufUtilKt.getExtensionOrNull(proto, jvmClassFlags);
        if (num3 != null) {
            jvm.setJvmFlags(num3.intValue());
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions
    public void readConstructorExtensions(@NotNull KmConstructor kmConstructor, @NotNull ProtoBuf.Constructor proto, @NotNull ReadContext c2) throws IOException {
        Intrinsics.checkNotNullParameter(kmConstructor, "kmConstructor");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(c2, "c");
        JvmConstructorExtension jvm = JvmExtensionNodesKt.getJvm(kmConstructor);
        List<ProtoBuf.Annotation> annotationList = proto.getAnnotationList();
        Intrinsics.checkNotNullExpressionValue(annotationList, "getAnnotationList(...)");
        List<KmAnnotation> annotations = kmConstructor.getAnnotations();
        for (ProtoBuf.Annotation annotation : annotationList) {
            Intrinsics.h(annotation);
            annotations.add(ReadUtilsKt.readAnnotation(annotation, c2.getStrings()));
        }
        JvmMemberSignature.Method jvmConstructorSignature = JvmProtoBufUtil.INSTANCE.getJvmConstructorSignature(proto, c2.getStrings(), c2.getTypes());
        jvm.setSignature(jvmConstructorSignature != null ? JvmMemberSignatureKt.wrapAsPublic(jvmConstructorSignature) : null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions
    public void readEnumEntryExtensions(@NotNull KmEnumEntry kmEnumEntry, @NotNull ProtoBuf.EnumEntry proto, @NotNull ReadContext c2) {
        Intrinsics.checkNotNullParameter(kmEnumEntry, "kmEnumEntry");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(c2, "c");
        for (ProtoBuf.Annotation annotation : proto.getAnnotationList()) {
            List<KmAnnotation> annotations = kmEnumEntry.getAnnotations();
            Intrinsics.h(annotation);
            annotations.add(ReadUtilsKt.readAnnotation(annotation, c2.getStrings()));
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions
    public void readFunctionExtensions(@NotNull KmFunction kmFunction, @NotNull ProtoBuf.Function proto, @NotNull ReadContext c2) {
        Intrinsics.checkNotNullParameter(kmFunction, "kmFunction");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(c2, "c");
        JvmFunctionExtension jvm = JvmExtensionNodesKt.getJvm(kmFunction);
        List<ProtoBuf.Annotation> annotationList = proto.getAnnotationList();
        Intrinsics.checkNotNullExpressionValue(annotationList, "getAnnotationList(...)");
        List<KmAnnotation> annotations = kmFunction.getAnnotations();
        for (ProtoBuf.Annotation annotation : annotationList) {
            Intrinsics.h(annotation);
            annotations.add(ReadUtilsKt.readAnnotation(annotation, c2.getStrings()));
        }
        List<ProtoBuf.Annotation> extensionReceiverAnnotationList = proto.getExtensionReceiverAnnotationList();
        Intrinsics.checkNotNullExpressionValue(extensionReceiverAnnotationList, "getExtensionReceiverAnnotationList(...)");
        List<KmAnnotation> extensionReceiverParameterAnnotations = kmFunction.getExtensionReceiverParameterAnnotations();
        for (ProtoBuf.Annotation annotation2 : extensionReceiverAnnotationList) {
            Intrinsics.h(annotation2);
            extensionReceiverParameterAnnotations.add(ReadUtilsKt.readAnnotation(annotation2, c2.getStrings()));
        }
        JvmMemberSignature.Method jvmMethodSignature = JvmProtoBufUtil.INSTANCE.getJvmMethodSignature(proto, c2.getStrings(), c2.getTypes());
        jvm.setSignature(jvmMethodSignature != null ? JvmMemberSignatureKt.wrapAsPublic(jvmMethodSignature) : null);
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, Integer> lambdaClassOriginName = JvmProtoBuf.lambdaClassOriginName;
        Intrinsics.checkNotNullExpressionValue(lambdaClassOriginName, "lambdaClassOriginName");
        Integer num = (Integer) ProtoBufUtilKt.getExtensionOrNull(proto, lambdaClassOriginName);
        if (num != null) {
            jvm.setLambdaClassOriginName(c2.get(num.intValue()));
        }
    }

    public void readModuleFragmentExtensions(@NotNull KmModuleFragment kmModuleFragment, @NotNull ProtoBuf.PackageFragment proto, @NotNull ReadContext c2) {
        Intrinsics.checkNotNullParameter(kmModuleFragment, "kmModuleFragment");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(c2, "c");
    }

    public void readPackageExtensions(@NotNull KmPackage kmPackage, @NotNull ProtoBuf.Package proto, @NotNull ReadContext c2) {
        String str;
        Intrinsics.checkNotNullParameter(kmPackage, "kmPackage");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(c2, "c");
        JvmPackageExtension jvm = JvmExtensionNodesKt.getJvm(kmPackage);
        for (ProtoBuf.Property property : (List) proto.getExtension(JvmProtoBuf.packageLocalVariable)) {
            List<KmProperty> localDelegatedProperties = jvm.getLocalDelegatedProperties();
            Intrinsics.h(property);
            localDelegatedProperties.add(ReadersKt.toKmProperty(property, c2));
        }
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Package, Integer> packageModuleName = JvmProtoBuf.packageModuleName;
        Intrinsics.checkNotNullExpressionValue(packageModuleName, "packageModuleName");
        Integer num = (Integer) ProtoBufUtilKt.getExtensionOrNull(proto, packageModuleName);
        if (num == null || (str = c2.get(num.intValue())) == null) {
            str = "main";
        }
        jvm.setModuleName(str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions
    public void readPropertyExtensions(@NotNull KmProperty kmProperty, @NotNull ProtoBuf.Property proto, @NotNull ReadContext c2) {
        Intrinsics.checkNotNullParameter(kmProperty, "kmProperty");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(c2, "c");
        JvmPropertyExtension jvm = JvmExtensionNodesKt.getJvm(kmProperty);
        List<ProtoBuf.Annotation> annotationList = proto.getAnnotationList();
        Intrinsics.checkNotNullExpressionValue(annotationList, "getAnnotationList(...)");
        List<KmAnnotation> annotations = kmProperty.getAnnotations();
        for (ProtoBuf.Annotation annotation : annotationList) {
            Intrinsics.h(annotation);
            annotations.add(ReadUtilsKt.readAnnotation(annotation, c2.getStrings()));
        }
        List<ProtoBuf.Annotation> getterAnnotationList = proto.getGetterAnnotationList();
        Intrinsics.checkNotNullExpressionValue(getterAnnotationList, "getGetterAnnotationList(...)");
        List<KmAnnotation> annotations2 = kmProperty.getGetter().getAnnotations();
        for (ProtoBuf.Annotation annotation2 : getterAnnotationList) {
            Intrinsics.h(annotation2);
            annotations2.add(ReadUtilsKt.readAnnotation(annotation2, c2.getStrings()));
        }
        KmPropertyAccessorAttributes setter = kmProperty.getSetter();
        if (setter != null) {
            List<ProtoBuf.Annotation> setterAnnotationList = proto.getSetterAnnotationList();
            Intrinsics.checkNotNullExpressionValue(setterAnnotationList, "getSetterAnnotationList(...)");
            List<KmAnnotation> annotations3 = setter.getAnnotations();
            for (ProtoBuf.Annotation annotation3 : setterAnnotationList) {
                Intrinsics.h(annotation3);
                annotations3.add(ReadUtilsKt.readAnnotation(annotation3, c2.getStrings()));
            }
        }
        List<ProtoBuf.Annotation> extensionReceiverAnnotationList = proto.getExtensionReceiverAnnotationList();
        Intrinsics.checkNotNullExpressionValue(extensionReceiverAnnotationList, "getExtensionReceiverAnnotationList(...)");
        List<KmAnnotation> extensionReceiverParameterAnnotations = kmProperty.getExtensionReceiverParameterAnnotations();
        for (ProtoBuf.Annotation annotation4 : extensionReceiverAnnotationList) {
            Intrinsics.h(annotation4);
            extensionReceiverParameterAnnotations.add(ReadUtilsKt.readAnnotation(annotation4, c2.getStrings()));
        }
        List<ProtoBuf.Annotation> backingFieldAnnotationList = proto.getBackingFieldAnnotationList();
        Intrinsics.checkNotNullExpressionValue(backingFieldAnnotationList, "getBackingFieldAnnotationList(...)");
        List<KmAnnotation> backingFieldAnnotations = kmProperty.getBackingFieldAnnotations();
        for (ProtoBuf.Annotation annotation5 : backingFieldAnnotationList) {
            Intrinsics.h(annotation5);
            backingFieldAnnotations.add(ReadUtilsKt.readAnnotation(annotation5, c2.getStrings()));
        }
        List<ProtoBuf.Annotation> delegateFieldAnnotationList = proto.getDelegateFieldAnnotationList();
        Intrinsics.checkNotNullExpressionValue(delegateFieldAnnotationList, "getDelegateFieldAnnotationList(...)");
        List<KmAnnotation> delegateFieldAnnotations = kmProperty.getDelegateFieldAnnotations();
        for (ProtoBuf.Annotation annotation6 : delegateFieldAnnotationList) {
            Intrinsics.h(annotation6);
            delegateFieldAnnotations.add(ReadUtilsKt.readAnnotation(annotation6, c2.getStrings()));
        }
        JvmMemberSignature.Field jvmFieldSignature$default = JvmProtoBufUtil.getJvmFieldSignature$default(JvmProtoBufUtil.INSTANCE, proto, c2.getStrings(), c2.getTypes(), false, 8, null);
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, JvmProtoBuf.JvmPropertySignature> propertySignature = JvmProtoBuf.propertySignature;
        Intrinsics.checkNotNullExpressionValue(propertySignature, "propertySignature");
        JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) ProtoBufUtilKt.getExtensionOrNull(proto, propertySignature);
        JvmProtoBuf.JvmMethodSignature getter = (jvmPropertySignature == null || !jvmPropertySignature.hasGetter()) ? null : jvmPropertySignature.getGetter();
        JvmProtoBuf.JvmMethodSignature setter2 = (jvmPropertySignature == null || !jvmPropertySignature.hasSetter()) ? null : jvmPropertySignature.getSetter();
        Object extension = proto.getExtension(JvmProtoBuf.flags);
        Intrinsics.checkNotNullExpressionValue(extension, "getExtension(...)");
        jvm.setJvmFlags(((Number) extension).intValue());
        jvm.setFieldSignature(jvmFieldSignature$default != null ? JvmMemberSignatureKt.wrapAsPublic(jvmFieldSignature$default) : null);
        jvm.setGetterSignature(getter != null ? new JvmMethodSignature(c2.get(getter.getName()), c2.get(getter.getDesc())) : null);
        jvm.setSetterSignature(setter2 != null ? new JvmMethodSignature(c2.get(setter2.getName()), c2.get(setter2.getDesc())) : null);
        JvmProtoBuf.JvmMethodSignature syntheticMethod = (jvmPropertySignature == null || !jvmPropertySignature.hasSyntheticMethod()) ? null : jvmPropertySignature.getSyntheticMethod();
        jvm.setSyntheticMethodForAnnotations(syntheticMethod != null ? new JvmMethodSignature(c2.get(syntheticMethod.getName()), c2.get(syntheticMethod.getDesc())) : null);
        JvmProtoBuf.JvmMethodSignature delegateMethod = (jvmPropertySignature == null || !jvmPropertySignature.hasDelegateMethod()) ? null : jvmPropertySignature.getDelegateMethod();
        jvm.setSyntheticMethodForDelegate(delegateMethod != null ? new JvmMethodSignature(c2.get(delegateMethod.getName()), c2.get(delegateMethod.getDesc())) : null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions
    public void readTypeAliasExtensions(@NotNull KmTypeAlias kmTypeAlias, @NotNull ProtoBuf.TypeAlias proto, @NotNull ReadContext c2) {
        Intrinsics.checkNotNullParameter(kmTypeAlias, "kmTypeAlias");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(c2, "c");
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions
    public void readTypeExtensions(@NotNull KmType kmType, @NotNull ProtoBuf.Type proto, @NotNull ReadContext c2) {
        Intrinsics.checkNotNullParameter(kmType, "kmType");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(c2, "c");
        JvmTypeExtension jvm = JvmExtensionNodesKt.getJvm(kmType);
        Object extension = proto.getExtension(JvmProtoBuf.isRaw);
        Intrinsics.checkNotNullExpressionValue(extension, "getExtension(...)");
        jvm.setRaw(((Boolean) extension).booleanValue());
        for (ProtoBuf.Annotation annotation : (List) proto.getExtension(JvmProtoBuf.typeAnnotation)) {
            List<KmAnnotation> annotations = jvm.getAnnotations();
            Intrinsics.h(annotation);
            annotations.add(ReadUtilsKt.readAnnotation(annotation, c2.getStrings()));
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions
    public void readTypeParameterExtensions(@NotNull KmTypeParameter kmTypeParameter, @NotNull ProtoBuf.TypeParameter proto, @NotNull ReadContext c2) {
        Intrinsics.checkNotNullParameter(kmTypeParameter, "kmTypeParameter");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(c2, "c");
        JvmTypeParameterExtension jvm = JvmExtensionNodesKt.getJvm(kmTypeParameter);
        for (ProtoBuf.Annotation annotation : (List) proto.getExtension(JvmProtoBuf.typeParameterAnnotation)) {
            List<KmAnnotation> annotations = jvm.getAnnotations();
            Intrinsics.h(annotation);
            annotations.add(ReadUtilsKt.readAnnotation(annotation, c2.getStrings()));
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions
    public void readValueParameterExtensions(@NotNull KmValueParameter kmValueParameter, @NotNull ProtoBuf.ValueParameter proto, @NotNull ReadContext c2) {
        Intrinsics.checkNotNullParameter(kmValueParameter, "kmValueParameter");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(c2, "c");
        List<ProtoBuf.Annotation> annotationList = proto.getAnnotationList();
        Intrinsics.checkNotNullExpressionValue(annotationList, "getAnnotationList(...)");
        List<KmAnnotation> annotations = kmValueParameter.getAnnotations();
        for (ProtoBuf.Annotation annotation : annotationList) {
            Intrinsics.h(annotation);
            annotations.add(ReadUtilsKt.readAnnotation(annotation, c2.getStrings()));
        }
    }

    public void writeClassExtensions(@NotNull KmClass kmClass, @NotNull ProtoBuf.Class.Builder proto, @NotNull WriteContext c2) {
        Intrinsics.checkNotNullParameter(kmClass, "kmClass");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(c2, "c");
        JvmClassExtension jvm = JvmExtensionNodesKt.getJvm(kmClass);
        List<KmAnnotation> annotations = kmClass.getAnnotations();
        ArrayList arrayList = new ArrayList(w.t(annotations, 10));
        Iterator<T> it8 = annotations.iterator();
        while (it8.hasNext()) {
            arrayList.add(WriteUtilsKt.writeAnnotation((KmAnnotation) it8.next(), c2.getStrings()).build());
        }
        proto.addAllAnnotation(arrayList);
        String anonymousObjectOriginName = jvm.getAnonymousObjectOriginName();
        if (anonymousObjectOriginName != null) {
        }
        Iterator<T> it9 = jvm.getLocalDelegatedProperties().iterator();
        while (it9.hasNext()) {
            proto.addExtension(JvmProtoBuf.classLocalVariable, WritersKt.writeProperty(c2, (KmProperty) it9.next()).build());
        }
        String moduleName = jvm.getModuleName();
        if (moduleName != null && !moduleName.equals("main")) {
            proto.setExtension(JvmProtoBuf.classModuleName, Integer.valueOf(c2.get(moduleName)));
        }
        if (jvm.getJvmFlags() != 0) {
            proto.setExtension(JvmProtoBuf.jvmClassFlags, Integer.valueOf(jvm.getJvmFlags()));
        }
    }

    public void writeConstructorExtensions(@NotNull KmConstructor kmConstructor, @NotNull ProtoBuf.Constructor.Builder proto, @NotNull WriteContext c2) {
        Intrinsics.checkNotNullParameter(kmConstructor, "kmConstructor");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(c2, "c");
        JvmConstructorExtension jvm = JvmExtensionNodesKt.getJvm(kmConstructor);
        List<KmAnnotation> annotations = kmConstructor.getAnnotations();
        ArrayList arrayList = new ArrayList(w.t(annotations, 10));
        Iterator<T> it8 = annotations.iterator();
        while (it8.hasNext()) {
            arrayList.add(WriteUtilsKt.writeAnnotation((KmAnnotation) it8.next(), c2.getStrings()).build());
        }
        proto.addAllAnnotation(arrayList);
        JvmMethodSignature signature = jvm.getSignature();
        if (signature != null) {
            proto.setExtension(JvmProtoBuf.constructorSignature, a(signature, c2));
        }
    }

    public void writeEnumEntryExtensions(@NotNull KmEnumEntry enumEntry, @NotNull ProtoBuf.EnumEntry.Builder proto, @NotNull WriteContext c2) {
        Intrinsics.checkNotNullParameter(enumEntry, "enumEntry");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(c2, "c");
        Iterator<T> it8 = enumEntry.getAnnotations().iterator();
        while (it8.hasNext()) {
            proto.addAnnotation(WriteUtilsKt.writeAnnotation((KmAnnotation) it8.next(), c2.getStrings()).build());
        }
    }

    public void writeFunctionExtensions(@NotNull KmFunction kmFunction, @NotNull ProtoBuf.Function.Builder proto, @NotNull WriteContext c2) {
        Intrinsics.checkNotNullParameter(kmFunction, "kmFunction");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(c2, "c");
        JvmFunctionExtension jvm = JvmExtensionNodesKt.getJvm(kmFunction);
        List<KmAnnotation> annotations = kmFunction.getAnnotations();
        ArrayList arrayList = new ArrayList(w.t(annotations, 10));
        Iterator<T> it8 = annotations.iterator();
        while (it8.hasNext()) {
            arrayList.add(WriteUtilsKt.writeAnnotation((KmAnnotation) it8.next(), c2.getStrings()).build());
        }
        proto.addAllAnnotation(arrayList);
        List<KmAnnotation> extensionReceiverParameterAnnotations = kmFunction.getExtensionReceiverParameterAnnotations();
        ArrayList arrayList2 = new ArrayList(w.t(extensionReceiverParameterAnnotations, 10));
        Iterator<T> it9 = extensionReceiverParameterAnnotations.iterator();
        while (it9.hasNext()) {
            arrayList2.add(WriteUtilsKt.writeAnnotation((KmAnnotation) it9.next(), c2.getStrings()).build());
        }
        proto.addAllExtensionReceiverAnnotation(arrayList2);
        JvmMethodSignature signature = jvm.getSignature();
        if (signature != null) {
        }
        String lambdaClassOriginName = jvm.getLambdaClassOriginName();
        if (lambdaClassOriginName != null) {
        }
    }

    public void writeModuleFragmentExtensions(@NotNull KmModuleFragment kmModuleFragment, @NotNull ProtoBuf.PackageFragment.Builder proto, @NotNull WriteContext c2) {
        Intrinsics.checkNotNullParameter(kmModuleFragment, "kmModuleFragment");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(c2, "c");
    }

    public void writePackageExtensions(@NotNull KmPackage kmPackage, @NotNull ProtoBuf.Package.Builder proto, @NotNull WriteContext c2) {
        Intrinsics.checkNotNullParameter(kmPackage, "kmPackage");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(c2, "c");
        JvmPackageExtension jvm = JvmExtensionNodesKt.getJvm(kmPackage);
        Iterator<T> it8 = jvm.getLocalDelegatedProperties().iterator();
        while (it8.hasNext()) {
            proto.addExtension(JvmProtoBuf.packageLocalVariable, WritersKt.writeProperty(c2, (KmProperty) it8.next()).build());
        }
        String moduleName = jvm.getModuleName();
        if (moduleName == null || moduleName.equals("main")) {
            return;
        }
        proto.setExtension(JvmProtoBuf.packageModuleName, Integer.valueOf(c2.get(moduleName)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions
    public void writePropertyExtensions(@NotNull KmProperty kmProperty, @NotNull ProtoBuf.Property.Builder proto, @NotNull WriteContext c2) {
        boolean z;
        Intrinsics.checkNotNullParameter(kmProperty, "kmProperty");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(c2, "c");
        JvmPropertyExtension jvm = JvmExtensionNodesKt.getJvm(kmProperty);
        List<KmAnnotation> annotations = kmProperty.getAnnotations();
        ArrayList arrayList = new ArrayList(w.t(annotations, 10));
        Iterator<T> it8 = annotations.iterator();
        while (it8.hasNext()) {
            arrayList.add(WriteUtilsKt.writeAnnotation((KmAnnotation) it8.next(), c2.getStrings()).build());
        }
        proto.addAllAnnotation(arrayList);
        List<KmAnnotation> annotations2 = kmProperty.getGetter().getAnnotations();
        ArrayList arrayList2 = new ArrayList(w.t(annotations2, 10));
        Iterator<T> it9 = annotations2.iterator();
        while (it9.hasNext()) {
            arrayList2.add(WriteUtilsKt.writeAnnotation((KmAnnotation) it9.next(), c2.getStrings()).build());
        }
        proto.addAllGetterAnnotation(arrayList2);
        KmPropertyAccessorAttributes setter = kmProperty.getSetter();
        if (setter != null) {
            List<KmAnnotation> annotations3 = setter.getAnnotations();
            ArrayList arrayList3 = new ArrayList(w.t(annotations3, 10));
            Iterator<T> it10 = annotations3.iterator();
            while (it10.hasNext()) {
                arrayList3.add(WriteUtilsKt.writeAnnotation((KmAnnotation) it10.next(), c2.getStrings()).build());
            }
            proto.addAllSetterAnnotation(arrayList3);
        }
        List<KmAnnotation> extensionReceiverParameterAnnotations = kmProperty.getExtensionReceiverParameterAnnotations();
        ArrayList arrayList4 = new ArrayList(w.t(extensionReceiverParameterAnnotations, 10));
        Iterator<T> it11 = extensionReceiverParameterAnnotations.iterator();
        while (it11.hasNext()) {
            arrayList4.add(WriteUtilsKt.writeAnnotation((KmAnnotation) it11.next(), c2.getStrings()).build());
        }
        proto.addAllExtensionReceiverAnnotation(arrayList4);
        List<KmAnnotation> backingFieldAnnotations = kmProperty.getBackingFieldAnnotations();
        ArrayList arrayList5 = new ArrayList(w.t(backingFieldAnnotations, 10));
        Iterator<T> it12 = backingFieldAnnotations.iterator();
        while (it12.hasNext()) {
            arrayList5.add(WriteUtilsKt.writeAnnotation((KmAnnotation) it12.next(), c2.getStrings()).build());
        }
        proto.addAllBackingFieldAnnotation(arrayList5);
        List<KmAnnotation> delegateFieldAnnotations = kmProperty.getDelegateFieldAnnotations();
        ArrayList arrayList6 = new ArrayList(w.t(delegateFieldAnnotations, 10));
        Iterator<T> it13 = delegateFieldAnnotations.iterator();
        while (it13.hasNext()) {
            arrayList6.add(WriteUtilsKt.writeAnnotation((KmAnnotation) it13.next(), c2.getStrings()).build());
        }
        proto.addAllDelegateFieldAnnotation(arrayList6);
        JvmProtoBuf.JvmPropertySignature.Builder builderNewBuilder = JvmProtoBuf.JvmPropertySignature.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        boolean z3 = true;
        if (jvm.getFieldSignature() != null) {
            JvmProtoBuf.JvmFieldSignature.Builder builderNewBuilder2 = JvmProtoBuf.JvmFieldSignature.newBuilder();
            JvmFieldSignature fieldSignature = jvm.getFieldSignature();
            Intrinsics.h(fieldSignature);
            builderNewBuilder2.setName(c2.get(fieldSignature.getName()));
            JvmFieldSignature fieldSignature2 = jvm.getFieldSignature();
            Intrinsics.h(fieldSignature2);
            builderNewBuilder2.setDesc(c2.get(fieldSignature2.getDescriptor()));
            builderNewBuilder.setField(builderNewBuilder2.build());
            z = true;
        } else {
            z = false;
        }
        if (jvm.getGetterSignature() != null) {
            JvmMethodSignature getterSignature = jvm.getGetterSignature();
            Intrinsics.h(getterSignature);
            builderNewBuilder.setGetter(a(getterSignature, c2));
            z = true;
        }
        if (jvm.getSetterSignature() != null) {
            JvmMethodSignature setterSignature = jvm.getSetterSignature();
            Intrinsics.h(setterSignature);
            builderNewBuilder.setSetter(a(setterSignature, c2));
        } else {
            z3 = z;
        }
        if (z3 && jvm.getSyntheticMethodForAnnotations() != null) {
            JvmMethodSignature syntheticMethodForAnnotations = jvm.getSyntheticMethodForAnnotations();
            Intrinsics.h(syntheticMethodForAnnotations);
            builderNewBuilder.setSyntheticMethod(a(syntheticMethodForAnnotations, c2));
        }
        if (z3 && jvm.getSyntheticMethodForDelegate() != null) {
            JvmMethodSignature syntheticMethodForDelegate = jvm.getSyntheticMethodForDelegate();
            Intrinsics.h(syntheticMethodForDelegate);
            builderNewBuilder.setDelegateMethod(a(syntheticMethodForDelegate, c2));
        }
        int jvmFlags = jvm.getJvmFlags();
        ProtoBuf.Property defaultInstance = ProtoBuf.Property.getDefaultInstance();
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, Integer> generatedExtension = JvmProtoBuf.flags;
        Integer num = (Integer) defaultInstance.getExtension(generatedExtension);
        if (num == null || jvmFlags != num.intValue()) {
            proto.setExtension(generatedExtension, Integer.valueOf(jvm.getJvmFlags()));
        }
        if (z3) {
            proto.setExtension(JvmProtoBuf.propertySignature, builderNewBuilder.build());
        }
    }

    public void writeTypeAliasExtensions(@NotNull KmTypeAlias typeAlias, @NotNull ProtoBuf.TypeAlias.Builder proto, @NotNull WriteContext c2) {
        Intrinsics.checkNotNullParameter(typeAlias, "typeAlias");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(c2, "c");
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions
    public void writeTypeExtensions(@NotNull KmType type, @NotNull ProtoBuf.Type.Builder proto, @NotNull WriteContext c2) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(c2, "c");
        JvmTypeExtension jvm = JvmExtensionNodesKt.getJvm(type);
        if (jvm.isRaw()) {
            proto.setExtension(JvmProtoBuf.isRaw, Boolean.TRUE);
        }
        Iterator<T> it8 = jvm.getAnnotations().iterator();
        while (it8.hasNext()) {
            proto.addExtension(JvmProtoBuf.typeAnnotation, WriteUtilsKt.writeAnnotation((KmAnnotation) it8.next(), c2.getStrings()).build());
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions
    public void writeTypeParameterExtensions(@NotNull KmTypeParameter kmTypeParameter, @NotNull ProtoBuf.TypeParameter.Builder proto, @NotNull WriteContext c2) {
        Intrinsics.checkNotNullParameter(kmTypeParameter, "kmTypeParameter");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(c2, "c");
        Iterator<T> it8 = JvmExtensionNodesKt.getJvm(kmTypeParameter).getAnnotations().iterator();
        while (it8.hasNext()) {
            proto.addExtension(JvmProtoBuf.typeParameterAnnotation, WriteUtilsKt.writeAnnotation((KmAnnotation) it8.next(), c2.getStrings()).build());
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions
    public void writeValueParameterExtensions(@NotNull KmValueParameter valueParameter, @NotNull ProtoBuf.ValueParameter.Builder proto, @NotNull WriteContext c2) {
        Intrinsics.checkNotNullParameter(valueParameter, "valueParameter");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(c2, "c");
        List<KmAnnotation> annotations = valueParameter.getAnnotations();
        ArrayList arrayList = new ArrayList(w.t(annotations, 10));
        Iterator<T> it8 = annotations.iterator();
        while (it8.hasNext()) {
            arrayList.add(WriteUtilsKt.writeAnnotation((KmAnnotation) it8.next(), c2.getStrings()).build());
        }
        proto.addAllAnnotation(arrayList);
    }
}
