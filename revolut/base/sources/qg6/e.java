package qg6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f245663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f245664b;

    public e(String id10, String externalAuthorizationUri) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(externalAuthorizationUri, "externalAuthorizationUri");
        this.f245663a = id10;
        this.f245664b = externalAuthorizationUri;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f245663a, eVar.f245663a) && Intrinsics.f(this.f245664b, eVar.f245664b);
    }

    public final int hashCode() {
        return this.f245664b.hashCode() + (this.f245663a.hashCode() * 31);
    }
}
