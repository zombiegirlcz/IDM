package taj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f269345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f269346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f269347c;

    public d(e type, String value, String iconUrl) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        this.f269345a = type;
        this.f269346b = value;
        this.f269347c = iconUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f269345a == dVar.f269345a && Intrinsics.f(this.f269346b, dVar.f269346b) && Intrinsics.f(this.f269347c, dVar.f269347c);
    }

    public final int hashCode() {
        return this.f269347c.hashCode() + p.a.c(this.f269345a.hashCode() * 31, 31, this.f269346b);
    }
}
