package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Set;
import kotlin.collections.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData;
import org.jetbrains.annotations.NotNull;
import zhm.y0;

/* JADX INFO: loaded from: classes13.dex */
public final class DeserializedDescriptorResolver {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f187079a = y0.b(KotlinClassHeader.Kind.CLASS);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f187080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final MetadataVersion f187081c;
    public static final MetadataVersion d;
    public static final MetadataVersion e;
    public DeserializationComponents components;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final MetadataVersion getKOTLIN_1_3_RC_METADATA_VERSION$descriptors_jvm() {
            return DeserializedDescriptorResolver.e;
        }
    }

    static {
        KotlinClassHeader.Kind[] elements = {KotlinClassHeader.Kind.FILE_FACADE, KotlinClassHeader.Kind.MULTIFILE_CLASS_PART};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f187080b = d.y0(elements);
        f187081c = new MetadataVersion(1, 1, 2);
        d = new MetadataVersion(1, 1, 11);
        e = new MetadataVersion(1, 1, 13);
    }

    public final IncompatibleVersionErrorData a(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        if (getComponents().getConfiguration().getSkipMetadataVersionCheck() || kotlinJvmBinaryClass.getClassHeader().getMetadataVersion().isCompatible(getComponents().getConfiguration().getMetadataVersion())) {
            return null;
        }
        return new IncompatibleVersionErrorData(kotlinJvmBinaryClass.getClassHeader().getMetadataVersion(), MetadataVersion.INSTANCE, getComponents().getConfiguration().getMetadataVersion(), getComponents().getConfiguration().getMetadataVersion().lastSupportedVersionWithThisLanguageVersion(kotlinJvmBinaryClass.getClassHeader().getMetadataVersion().isStrictSemantics()), kotlinJvmBinaryClass.getLocation());
    }

    public final boolean b(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        if (getComponents().getConfiguration().getReportErrorsOnPreReleaseDependencies() && (kotlinJvmBinaryClass.getClassHeader().isPreRelease() || Intrinsics.f(kotlinJvmBinaryClass.getClassHeader().getMetadataVersion(), f187081c))) {
            return true;
        }
        return !getComponents().getConfiguration().getSkipPrereleaseCheck() && kotlinJvmBinaryClass.getClassHeader().isPreRelease() && Intrinsics.f(kotlinJvmBinaryClass.getClassHeader().getMetadataVersion(), d);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope createKotlinPackagePartScope(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor r12, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass r13) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver.createKotlinPackagePartScope(kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor, kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass):kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope");
    }

    @NotNull
    public final DeserializationComponents getComponents() {
        DeserializationComponents deserializationComponents = this.components;
        if (deserializationComponents != null) {
            return deserializationComponents;
        }
        Intrinsics.r("components");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData readClassData$descriptors_jvm(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass r9) {
        /*
            r8 = this;
            java.lang.String r0 = "Could not read data from "
            java.lang.String r1 = "kotlinClass"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r1 = r9.getClassHeader()
            java.lang.String[] r2 = r1.getData()
            if (r2 != 0) goto L15
            java.lang.String[] r2 = r1.getIncompatibleData()
        L15:
            r3 = 0
            if (r2 == 0) goto L25
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r1 = r1.getKind()
            java.util.Set r4 = kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver.f187079a
            boolean r1 = r4.contains(r1)
            if (r1 == 0) goto L25
            goto L26
        L25:
            r2 = r3
        L26:
            if (r2 != 0) goto L29
            goto L7d
        L29:
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r1 = r9.getClassHeader()
            java.lang.String[] r1 = r1.getStrings()
            if (r1 != 0) goto L34
            goto L7d
        L34:
            kotlin.Pair r0 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(r2, r1)     // Catch: java.lang.Throwable -> L39 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L3b
            goto L7b
        L39:
            r0 = move-exception
            goto L52
        L3b:
            r1 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L39
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L39
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L39
            java.lang.String r0 = r9.getLocation()     // Catch: java.lang.Throwable -> L39
            r4.append(r0)     // Catch: java.lang.Throwable -> L39
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L39
            r2.<init>(r0, r1)     // Catch: java.lang.Throwable -> L39
            throw r2     // Catch: java.lang.Throwable -> L39
        L52:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents r1 = r8.getComponents()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration r1 = r1.getConfiguration()
            boolean r1 = r1.getSkipMetadataVersionCheck()
            if (r1 != 0) goto Lc7
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r1 = r9.getClassHeader()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion r1 = r1.getMetadataVersion()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents r2 = r8.getComponents()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration r2 = r2.getConfiguration()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion r2 = r2.getMetadataVersion()
            boolean r1 = r1.isCompatible(r2)
            if (r1 != 0) goto Lc7
            r0 = r3
        L7b:
            if (r0 != 0) goto L7e
        L7d:
            return r3
        L7e:
            java.lang.Object r1 = r0.f186385a
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver r1 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver) r1
            java.lang.Object r0 = r0.f186386b
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r0 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class) r0
            kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinarySourceElement r2 = new kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinarySourceElement
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData r4 = r8.a(r9)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.PreReleaseInfo r5 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.PreReleaseInfo
            boolean r6 = r8.b(r9)
            r7 = 2
            r5.<init>(r6, r3, r7, r3)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents r3 = r8.getComponents()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration r3 = r3.getConfiguration()
            boolean r3 = r3.getAllowUnstableDependencies()
            if (r3 == 0) goto La7
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability r3 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability.STABLE
            goto Lb6
        La7:
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r3 = r9.getClassHeader()
            boolean r3 = r3.isUnstableJvmIrBinary()
            if (r3 == 0) goto Lb4
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability r3 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability.UNSTABLE
            goto Lb6
        Lb4:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability r3 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability.STABLE
        Lb6:
            r2.<init>(r9, r4, r5, r3)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData r3 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r9 = r9.getClassHeader()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion r9 = r9.getMetadataVersion()
            r3.<init>(r1, r0, r9, r2)
            return r3
        Lc7:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver.readClassData$descriptors_jvm(kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass):kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData");
    }

    public final ClassDescriptor resolveClass(@NotNull KotlinJvmBinaryClass kotlinClass) {
        Intrinsics.checkNotNullParameter(kotlinClass, "kotlinClass");
        ClassData classData$descriptors_jvm = readClassData$descriptors_jvm(kotlinClass);
        if (classData$descriptors_jvm == null) {
            return null;
        }
        return getComponents().getClassDeserializer().deserializeClass(kotlinClass.getClassId(), classData$descriptors_jvm);
    }

    public final void setComponents(@NotNull DeserializationComponents deserializationComponents) {
        Intrinsics.checkNotNullParameter(deserializationComponents, "<set-?>");
        this.components = deserializationComponents;
    }

    public final void setComponents(@NotNull DeserializationComponentsForJava components) {
        Intrinsics.checkNotNullParameter(components, "components");
        setComponents(components.getComponents());
    }
}
