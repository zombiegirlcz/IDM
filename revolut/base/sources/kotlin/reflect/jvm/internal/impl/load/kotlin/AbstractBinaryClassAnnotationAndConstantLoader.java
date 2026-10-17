package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import ro7.n;

/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractBinaryClassAnnotationAndConstantLoader<A, C> extends AbstractBinaryClassAnnotationLoader<A, AnnotationsContainerWithConstants<? extends A, ? extends C>> implements AnnotationAndConstantLoader<A, C> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f187047c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MemoizedFunctionToNotNull f187048b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractBinaryClassAnnotationAndConstantLoader(@NotNull StorageManager storageManager, @NotNull KotlinClassFinder kotlinClassFinder) {
        super(kotlinClassFinder);
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
        this.f187048b = storageManager.createMemoizedFunction(new n(this, 9));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader
    public AbstractBinaryClassAnnotationLoader.AnnotationsContainer getAnnotationsContainer(KotlinJvmBinaryClass binaryClass) {
        Intrinsics.checkNotNullParameter(binaryClass, "binaryClass");
        return (AnnotationsContainerWithConstants) this.f187048b.invoke(binaryClass);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer r9, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property r10, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r11, kotlin.reflect.jvm.internal.impl.types.KotlinType r12, kotlin.jvm.functions.Function2 r13) throws java.io.IOException {
        /*
            r8 = this;
            kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader$Companion r0 = kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.Companion
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags$BooleanFlagField r1 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_CONST
            int r2 = r10.getFlags()
            java.lang.Boolean r4 = r1.get(r2)
            boolean r5 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil.isMovedFromInterfaceCompanion(r10)
            kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder r6 = r8.f187055a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion r7 = r8.getMetadataVersion()
            r2 = 1
            r3 = 1
            r1 = r9
            kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass r9 = r0.getSpecialCaseContainerClass(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r0 = "container"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = 0
            if (r9 != 0) goto L40
            boolean r9 = r1 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class
            if (r9 == 0) goto L3f
            r9 = r1
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer$Class r9 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class) r9
            kotlin.reflect.jvm.internal.impl.descriptors.SourceElement r9 = r9.getSource()
            boolean r2 = r9 instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinarySourceElement
            if (r2 == 0) goto L37
            kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinarySourceElement r9 = (kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinarySourceElement) r9
            goto L38
        L37:
            r9 = r0
        L38:
            if (r9 == 0) goto L3f
            kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass r9 = r9.getBinaryClass()
            goto L40
        L3f:
            r9 = r0
        L40:
            if (r9 != 0) goto L43
            goto L70
        L43:
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r2 = r9.getClassHeader()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion r2 = r2.getMetadataVersion()
            kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver$Companion r3 = kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver.Companion
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion r3 = r3.getKOTLIN_1_3_RC_METADATA_VERSION$descriptors_jvm()
            boolean r2 = r2.isAtLeast(r3)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver r3 = r1.getNameResolver()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable r1 = r1.getTypeTable()
            kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature r10 = kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.c(r10, r3, r1, r11, r2)
            if (r10 != 0) goto L64
            goto L70
        L64:
            kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull r11 = r8.f187048b
            java.lang.Object r9 = r11.invoke(r9)
            java.lang.Object r9 = r13.invoke(r9, r10)
            if (r9 != 0) goto L71
        L70:
            return r0
        L71:
            boolean r10 = kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes.isUnsignedType(r12)
            if (r10 == 0) goto L7b
            java.lang.Object r9 = r8.transformToUnsignedConstant(r9)
        L7b:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.i(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind, kotlin.reflect.jvm.internal.impl.types.KotlinType, kotlin.jvm.functions.Function2):java.lang.Object");
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    public C loadAnnotationDefaultValue(@NotNull ProtoContainer container, @NotNull ProtoBuf.Property proto, @NotNull KotlinType expectedType) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(expectedType, "expectedType");
        return (C) i(container, proto, AnnotatedCallableKind.PROPERTY_GETTER, expectedType, sjm.a.f263742b);
    }

    public abstract Object loadConstant(String str, Object obj2);

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    public C loadPropertyConstant(@NotNull ProtoContainer container, @NotNull ProtoBuf.Property proto, @NotNull KotlinType expectedType) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(expectedType, "expectedType");
        return (C) i(container, proto, AnnotatedCallableKind.PROPERTY, expectedType, sjm.a.f263743c);
    }

    public abstract Object transformToUnsignedConstant(Object obj2);
}
