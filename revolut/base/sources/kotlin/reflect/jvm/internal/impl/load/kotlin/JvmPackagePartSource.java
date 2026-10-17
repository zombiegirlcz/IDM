package kotlin.reflect.jvm.internal.impl.load.kotlin;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.PreReleaseInfo;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class JvmPackagePartSource implements DeserializedContainerSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JvmClassName f187086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JvmClassName f187087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KotlinJvmBinaryClass f187088c;

    public JvmPackagePartSource(@NotNull JvmClassName className, JvmClassName jvmClassName, JvmClassName jvmClassName2, @NotNull ProtoBuf.Package packageProto, @NotNull NameResolver nameResolver, IncompatibleVersionErrorData<MetadataVersion> incompatibleVersionErrorData, @NotNull PreReleaseInfo preReleaseInfo, @NotNull DeserializedContainerAbiStability abiStability, KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        Intrinsics.checkNotNullParameter(className, "className");
        Intrinsics.checkNotNullParameter(packageProto, "packageProto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(preReleaseInfo, "preReleaseInfo");
        Intrinsics.checkNotNullParameter(abiStability, "abiStability");
        this.f187086a = className;
        this.f187087b = jvmClassName;
        this.f187088c = kotlinJvmBinaryClass;
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Package, Integer> packageModuleName = JvmProtoBuf.packageModuleName;
        Intrinsics.checkNotNullExpressionValue(packageModuleName, "packageModuleName");
        Integer num = (Integer) ProtoBufUtilKt.getExtensionOrNull(packageProto, packageModuleName);
        if (num != null) {
            nameResolver.getString(num.intValue());
        }
    }

    @NotNull
    public final ClassId getClassId() {
        FqName packageFqName = getClassName().getPackageFqName();
        Intrinsics.checkNotNullExpressionValue(packageFqName, "getPackageFqName(...)");
        return new ClassId(packageFqName, getSimpleName());
    }

    @NotNull
    public JvmClassName getClassName() {
        return this.f187086a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
    @NotNull
    public SourceFile getContainingFile() {
        SourceFile NO_SOURCE_FILE = SourceFile.NO_SOURCE_FILE;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }

    public JvmClassName getFacadeClassName() {
        return this.f187087b;
    }

    public final KotlinJvmBinaryClass getKnownJvmBinaryClass() {
        return this.f187088c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource
    @NotNull
    public String getPresentableString() {
        return "Class '" + getClassId().asSingleFqName().asString() + CoreConstants.SINGLE_QUOTE_CHAR;
    }

    @NotNull
    public final Name getSimpleName() {
        String internalName = getClassName().getInternalName();
        Intrinsics.checkNotNullExpressionValue(internalName, "getInternalName(...)");
        Name nameIdentifier = Name.identifier(d0.w0('/', internalName, internalName));
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
        return nameIdentifier;
    }

    @NotNull
    public String toString() {
        return "JvmPackagePartSource: " + getClassName();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public JvmPackagePartSource(@NotNull KotlinJvmBinaryClass kotlinClass, @NotNull ProtoBuf.Package packageProto, @NotNull NameResolver nameResolver, IncompatibleVersionErrorData<MetadataVersion> incompatibleVersionErrorData, boolean z, @NotNull DeserializedContainerAbiStability abiStability) {
        JvmClassName jvmClassNameByInternalName;
        Intrinsics.checkNotNullParameter(kotlinClass, "kotlinClass");
        Intrinsics.checkNotNullParameter(packageProto, "packageProto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(abiStability, "abiStability");
        JvmClassName jvmClassNameByClassId = JvmClassName.byClassId(kotlinClass.getClassId());
        Intrinsics.checkNotNullExpressionValue(jvmClassNameByClassId, "byClassId(...)");
        String multifileClassName = kotlinClass.getClassHeader().getMultifileClassName();
        if (multifileClassName != null) {
            jvmClassNameByInternalName = multifileClassName.length() > 0 ? JvmClassName.byInternalName(multifileClassName) : null;
        } else {
            jvmClassNameByInternalName = null;
        }
        this(jvmClassNameByClassId, jvmClassNameByInternalName, null, packageProto, nameResolver, incompatibleVersionErrorData, new PreReleaseInfo(z, null, 2, null), abiStability, kotlinClass);
    }
}
