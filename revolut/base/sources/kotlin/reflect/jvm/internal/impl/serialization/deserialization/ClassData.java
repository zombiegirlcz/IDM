package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ClassData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NameResolver f187656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProtoBuf.Class f187657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BinaryVersion f187658c;
    public final SourceElement d;

    public ClassData(@NotNull NameResolver nameResolver, @NotNull ProtoBuf.Class classProto, @NotNull BinaryVersion metadataVersion, @NotNull SourceElement sourceElement) {
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(classProto, "classProto");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        Intrinsics.checkNotNullParameter(sourceElement, "sourceElement");
        this.f187656a = nameResolver;
        this.f187657b = classProto;
        this.f187658c = metadataVersion;
        this.d = sourceElement;
    }

    @NotNull
    public final NameResolver component1() {
        return this.f187656a;
    }

    @NotNull
    public final ProtoBuf.Class component2() {
        return this.f187657b;
    }

    @NotNull
    public final BinaryVersion component3() {
        return this.f187658c;
    }

    @NotNull
    public final SourceElement component4() {
        return this.d;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ClassData)) {
            return false;
        }
        ClassData classData = (ClassData) obj2;
        return Intrinsics.f(this.f187656a, classData.f187656a) && Intrinsics.f(this.f187657b, classData.f187657b) && Intrinsics.f(this.f187658c, classData.f187658c) && Intrinsics.f(this.d, classData.d);
    }

    public int hashCode() {
        return this.d.hashCode() + ((this.f187658c.hashCode() + ((this.f187657b.hashCode() + (this.f187656a.hashCode() * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "ClassData(nameResolver=" + this.f187656a + ", classProto=" + this.f187657b + ", metadataVersion=" + this.f187658c + ", sourceElement=" + this.d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
