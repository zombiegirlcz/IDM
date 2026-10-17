package nu3;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f219205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f219206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f219207c;
    public final int d;
    public final List e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f219208g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f219209h;

    public g(String title, String subtitle, int i, int i2, List disabledDays, List items, String buttonTitle, String parameterKey) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(disabledDays, "disabledDays");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        Intrinsics.checkNotNullParameter(parameterKey, "parameterKey");
        this.f219205a = title;
        this.f219206b = subtitle;
        this.f219207c = i;
        this.d = i2;
        this.e = disabledDays;
        this.f = items;
        this.f219208g = buttonTitle;
        this.f219209h = parameterKey;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f219205a, gVar.f219205a) && Intrinsics.f(this.f219206b, gVar.f219206b) && this.f219207c == gVar.f219207c && this.d == gVar.d && Intrinsics.f(this.e, gVar.e) && Intrinsics.f(this.f, gVar.f) && Intrinsics.f(this.f219208g, gVar.f219208g) && Intrinsics.f(this.f219209h, gVar.f219209h);
    }

    public final int hashCode() {
        return this.f219209h.hashCode() + p.a.c(p.a.d(p.a.d(j6.a.b(this.d, j6.a.b(this.f219207c, p.a.c(this.f219205a.hashCode() * 31, 31, this.f219206b), 31), 31), 31, this.e), 31, this.f), 31, this.f219208g);
    }
}
