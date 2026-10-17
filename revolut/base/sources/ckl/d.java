package ckl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24876c;
    public final String d;
    public final String e;

    public /* synthetic */ d(int i, String str, String str2, String str3, String str4, String str5) {
        if (7 != (i & 7)) {
            j1.f(b.f24873a.getDescriptor(), i, 7);
            throw null;
        }
        this.f24874a = str;
        this.f24875b = str2;
        this.f24876c = str3;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f24874a, dVar.f24874a) && Intrinsics.f(this.f24875b, dVar.f24875b) && Intrinsics.f(this.f24876c, dVar.f24876c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f24874a.hashCode() * 31, 31, this.f24875b), 31, this.f24876c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public d(String id10, String name, String iconUrl, String str, String str2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        this.f24874a = id10;
        this.f24875b = name;
        this.f24876c = iconUrl;
        this.d = str;
        this.e = str2;
    }
}
