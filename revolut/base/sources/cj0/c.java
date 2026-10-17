package cj0;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f24572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f24573b;

    public c(UUID id10, d type) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f24572a = id10;
        this.f24573b = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f24572a, cVar.f24572a) && this.f24573b == cVar.f24573b;
    }

    public final int hashCode() {
        return this.f24573b.hashCode() + (this.f24572a.hashCode() * 31);
    }
}
