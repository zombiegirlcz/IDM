package vwg;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class u {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f292753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f292754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f292755c;

    public /* synthetic */ u(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            j1.f(s.f292752a.getDescriptor(), i, 7);
            throw null;
        }
        this.f292753a = str;
        this.f292754b = str2;
        this.f292755c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f292753a, uVar.f292753a) && Intrinsics.f(this.f292754b, uVar.f292754b) && Intrinsics.f(this.f292755c, uVar.f292755c);
    }

    public final int hashCode() {
        return this.f292755c.hashCode() + p.a.c(this.f292753a.hashCode() * 31, 31, this.f292754b);
    }

    public u(String icon, String title, String description) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f292753a = icon;
        this.f292754b = title;
        this.f292755c = description;
    }
}
