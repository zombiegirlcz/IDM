package qe6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f245084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f245085b;

    public a(Long l2, String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f245084a = l2;
        this.f245085b = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f245084a, aVar.f245084a) && Intrinsics.f(this.f245085b, aVar.f245085b);
    }

    public final int hashCode() {
        Long l2 = this.f245084a;
        return this.f245085b.hashCode() + ((l2 == null ? 0 : l2.hashCode()) * 31);
    }
}
