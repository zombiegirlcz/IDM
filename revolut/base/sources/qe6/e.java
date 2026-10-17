package qe6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f245088a;

    public e(String authUri) {
        Intrinsics.checkNotNullParameter(authUri, "authUri");
        this.f245088a = authUri;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f245088a, ((e) obj2).f245088a);
    }

    public final int hashCode() {
        return this.f245088a.hashCode();
    }
}
