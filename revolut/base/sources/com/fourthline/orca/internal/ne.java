package com.fourthline.orca.internal;

import com.fourthline.orca.internal.ke;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ne {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f31398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ke.a f31399b;

    public ne(String identifier, ke.a status) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f31398a = identifier;
        this.f31399b = status;
    }

    public final String a() {
        return this.f31398a;
    }

    public final ke.a b() {
        return this.f31399b;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ne)) {
            return false;
        }
        ne neVar = (ne) obj2;
        return Intrinsics.f(this.f31398a, neVar.f31398a) && Intrinsics.f(this.f31399b, neVar.f31399b);
    }

    public int hashCode() {
        return (this.f31398a.hashCode() * 31) + this.f31399b.hashCode();
    }

    public String toString() {
        return "DataWorkStatusUpdate(identifier=" + this.f31398a + ", status=" + this.f31399b + ")";
    }
}
