package vx7;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zw7.c0;
import zw7.z;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f292844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f292845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f292846c;
    public final z d;

    public b(String name, c0 type, List genders, z selected) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(genders, "genders");
        Intrinsics.checkNotNullParameter(selected, "selected");
        this.f292844a = name;
        this.f292845b = type;
        this.f292846c = genders;
        this.d = selected;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f292844a, bVar.f292844a) && this.f292845b == bVar.f292845b && Intrinsics.f(this.f292846c, bVar.f292846c) && this.d == bVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d((this.f292845b.hashCode() + (this.f292844a.hashCode() * 31)) * 31, 31, this.f292846c);
    }
}
