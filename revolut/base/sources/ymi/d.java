package ymi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f315008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f315009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f315010c;

    public d(String registeredIdentityId, a type, String name) {
        Intrinsics.checkNotNullParameter(registeredIdentityId, "registeredIdentityId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f315008a = registeredIdentityId;
        this.f315009b = type;
        this.f315010c = name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f315008a, dVar.f315008a) && this.f315009b == dVar.f315009b && Intrinsics.f(this.f315010c, dVar.f315010c);
    }

    public final int hashCode() {
        return this.f315010c.hashCode() + ((this.f315009b.hashCode() + (this.f315008a.hashCode() * 31)) * 31);
    }
}
