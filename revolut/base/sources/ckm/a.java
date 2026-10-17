package ckm;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClassId f24892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ClassData f24893b;

    public a(ClassId classId, ClassData classData) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        this.f24892a = classId;
        this.f24893b = classData;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof a) {
            return Intrinsics.f(this.f24892a, ((a) obj2).f24892a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f24892a.hashCode();
    }
}
