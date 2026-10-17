package hu3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f155547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f155548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f155549c;
    public final int d;
    public final List e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f155550g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f155551h;
    public final ArrayList i;

    public a(String title, String subtitle, int i, int i2, List disabledDays, String approximationCaveat, String buttonTitle, String parameterKey, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(disabledDays, "disabledDays");
        Intrinsics.checkNotNullParameter(approximationCaveat, "approximationCaveat");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        Intrinsics.checkNotNullParameter(parameterKey, "parameterKey");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f155547a = title;
        this.f155548b = subtitle;
        this.f155549c = i;
        this.d = i2;
        this.e = disabledDays;
        this.f = approximationCaveat;
        this.f155550g = buttonTitle;
        this.f155551h = parameterKey;
        this.i = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f155547a, aVar.f155547a) && Intrinsics.f(this.f155548b, aVar.f155548b) && this.f155549c == aVar.f155549c && this.d == aVar.d && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f155550g, aVar.f155550g) && Intrinsics.f(this.f155551h, aVar.f155551h) && this.i.equals(aVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + p.a.c(p.a.c(p.a.c(p.a.d(j6.a.b(this.d, j6.a.b(this.f155549c, p.a.c(this.f155547a.hashCode() * 31, 31, this.f155548b), 31), 31), 31, this.e), 31, this.f), 31, this.f155550g), 31, this.f155551h);
    }
}
