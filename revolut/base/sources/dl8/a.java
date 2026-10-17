package dl8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f115714a;

    public a(String individualId) {
        Intrinsics.checkNotNullParameter(individualId, "individualId");
        this.f115714a = individualId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f115714a, ((a) obj2).f115714a);
    }

    public final int hashCode() {
        return this.f115714a.hashCode();
    }
}
