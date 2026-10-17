package lzi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f200972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f200973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f200974c;
    public final String d;
    public final String e;

    public a(String id10, String type, String title, String tip, String prompt) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(tip, "tip");
        Intrinsics.checkNotNullParameter(prompt, "prompt");
        this.f200972a = id10;
        this.f200973b = type;
        this.f200974c = title;
        this.d = tip;
        this.e = prompt;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f200972a, aVar.f200972a) && Intrinsics.f(this.f200973b, aVar.f200973b) && Intrinsics.f(this.f200974c, aVar.f200974c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c(p.a.c(p.a.c(this.f200972a.hashCode() * 31, 31, this.f200973b), 31, this.f200974c), 31, this.d);
    }
}
