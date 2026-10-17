package olm;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import qlm.j1;

/* JADX INFO: loaded from: classes14.dex */
public final class m implements SerialDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SerialDescriptor f226489a;

    public m(SerialDescriptor original) {
        Intrinsics.checkNotNullParameter("JSONObject", "serialName");
        Intrinsics.checkNotNullParameter(original, "original");
        this.f226489a = original;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor b(int i) {
        return this.f226489a.b(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c() {
        return this.f226489a.c();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String d(int i) {
        return this.f226489a.d(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e() {
        return "JSONObject";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && this.f226489a.equals(((m) obj2).f226489a);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean f() {
        return this.f226489a.f();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int g(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f226489a.g(name);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return this.f226489a.getAnnotations();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final com.bumptech.glide.d getKind() {
        return this.f226489a.getKind();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List h(int i) {
        return this.f226489a.h(i);
    }

    public final int hashCode() {
        return this.f226489a.hashCode() - 1510890855;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i) {
        return this.f226489a.i(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return this.f226489a.isInline();
    }

    public final String toString() {
        return j1.i(this);
    }
}
