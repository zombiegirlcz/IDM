package ggk;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f143708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f143709c;

    public d1(String title, String icon, List apps) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(apps, "apps");
        this.f143707a = title;
        this.f143708b = icon;
        this.f143709c = apps;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj2;
        return Intrinsics.f(this.f143707a, d1Var.f143707a) && Intrinsics.f(this.f143708b, d1Var.f143708b) && Intrinsics.f(this.f143709c, d1Var.f143709c);
    }

    public final int hashCode() {
        return this.f143709c.hashCode() + p.a.c(this.f143707a.hashCode() * 31, 31, this.f143708b);
    }
}
