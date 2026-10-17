package bka;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class j {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16320c;

    public /* synthetic */ j(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            j1.f(h.f16316a.getDescriptor(), i, 7);
            throw null;
        }
        this.f16318a = str;
        this.f16319b = str2;
        this.f16320c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f16318a, jVar.f16318a) && Intrinsics.f(this.f16319b, jVar.f16319b) && Intrinsics.f(this.f16320c, jVar.f16320c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f16318a.hashCode() * 31, 31, this.f16319b);
        String str = this.f16320c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public j(String icon, String title, String str) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f16318a = icon;
        this.f16319b = title;
        this.f16320c = str;
    }
}
