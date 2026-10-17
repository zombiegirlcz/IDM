package vwg;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class o {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f292745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f292746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f292747c;
    public final String d;
    public final l e;

    public /* synthetic */ o(int i, String str, String str2, String str3, String str4, l lVar) {
        if (31 != (i & 31)) {
            j1.f(m.f292744a.getDescriptor(), i, 31);
            throw null;
        }
        this.f292745a = str;
        this.f292746b = str2;
        this.f292747c = str3;
        this.d = str4;
        this.e = lVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f292745a, oVar.f292745a) && Intrinsics.f(this.f292746b, oVar.f292746b) && Intrinsics.f(this.f292747c, oVar.f292747c) && Intrinsics.f(this.d, oVar.d) && Intrinsics.f(this.e, oVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c(p.a.c(p.a.c(this.f292745a.hashCode() * 31, 31, this.f292746b), 31, this.f292747c), 31, this.d);
    }

    public o(String title, String subtitle, String description, String gauge, l details) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(gauge, "gauge");
        Intrinsics.checkNotNullParameter(details, "details");
        this.f292745a = title;
        this.f292746b = subtitle;
        this.f292747c = description;
        this.d = gauge;
        this.e = details;
    }
}
