package rd6;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f253351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f253352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f253353c;

    public d(String title, String description, h hVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f253351a = title;
        this.f253352b = description;
        this.f253353c = hVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f253351a, dVar.f253351a) && Intrinsics.f(this.f253352b, dVar.f253352b) && Intrinsics.f(this.f253353c, dVar.f253353c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f253351a.hashCode() * 31, 31, this.f253352b);
        h hVar = this.f253353c;
        return iC + (hVar == null ? 0 : hVar.hashCode());
    }
}
