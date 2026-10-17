package vaj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f287311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f287312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f287313c;

    public /* synthetic */ i(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            j1.f(g.f287310a.getDescriptor(), i, 7);
            throw null;
        }
        this.f287311a = str;
        this.f287312b = str2;
        this.f287313c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f287311a, iVar.f287311a) && Intrinsics.f(this.f287312b, iVar.f287312b) && Intrinsics.f(this.f287313c, iVar.f287313c);
    }

    public final int hashCode() {
        return this.f287313c.hashCode() + p.a.c(this.f287311a.hashCode() * 31, 31, this.f287312b);
    }

    public i(String type, String value, String icon) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f287311a = type;
        this.f287312b = value;
        this.f287313c = icon;
    }
}
