package hu7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f155579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f155580b;

    public h(String id10, String subtype) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(subtype, "subtype");
        this.f155579a = id10;
        this.f155580b = subtype;
    }

    public final String a() {
        return a0.d.s("insurance-details-", this.f155579a, "-", this.f155580b);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f155579a, hVar.f155579a) && Intrinsics.f(this.f155580b, hVar.f155580b);
    }

    public final int hashCode() {
        return this.f155580b.hashCode() + (this.f155579a.hashCode() * 31);
    }
}
