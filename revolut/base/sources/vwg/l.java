package vwg;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f292741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f292742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f292743c;
    public final String d;
    public final String e;

    public /* synthetic */ l(int i, String str, String str2, String str3, String str4, String str5) {
        if (31 != (i & 31)) {
            j1.f(j.f292740a.getDescriptor(), i, 31);
            throw null;
        }
        this.f292741a = str;
        this.f292742b = str2;
        this.f292743c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f292741a, lVar.f292741a) && Intrinsics.f(this.f292742b, lVar.f292742b) && Intrinsics.f(this.f292743c, lVar.f292743c) && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f292741a.hashCode() * 31, 31, this.f292742b);
        String str = this.f292743c;
        return this.e.hashCode() + p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
    }

    public l(String key, String title, String str, String type, String icon) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f292741a = key;
        this.f292742b = title;
        this.f292743c = str;
        this.d = type;
        this.e = icon;
    }
}
