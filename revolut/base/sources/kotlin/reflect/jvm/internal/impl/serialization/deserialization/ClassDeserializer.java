package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import a26.p;
import ckm.a;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import org.jetbrains.annotations.NotNull;
import zhm.y0;

/* JADX INFO: loaded from: classes13.dex */
public final class ClassDeserializer {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f187659c = y0.b(ClassId.Companion.topLevel(StandardNames.FqNames.cloneable.toSafe()));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeserializationComponents f187660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MemoizedFunctionToNullable f187661b;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final Set<ClassId> getBLACK_LIST() {
            return ClassDeserializer.f187659c;
        }
    }

    public ClassDeserializer(@NotNull DeserializationComponents components) {
        Intrinsics.checkNotNullParameter(components, "components");
        this.f187660a = components;
        this.f187661b = components.getStorageManager().createMemoizedFunctionWithNullableValues(new p(this, 13));
    }

    public static /* synthetic */ ClassDescriptor deserializeClass$default(ClassDeserializer classDeserializer, ClassId classId, ClassData classData, int i, Object obj2) {
        if ((i & 2) != 0) {
            classData = null;
        }
        return classDeserializer.deserializeClass(classId, classData);
    }

    public final ClassDescriptor deserializeClass(@NotNull ClassId classId, ClassData classData) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        return (ClassDescriptor) this.f187661b.invoke(new a(classId, classData));
    }
}
