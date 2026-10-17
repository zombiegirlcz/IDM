package ggk;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f143716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f143717c;
    public final Integer d;

    public f1(List iconsListUrls, String title, String icon, Integer num) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(iconsListUrls, "iconsListUrls");
        this.f143715a = title;
        this.f143716b = icon;
        this.f143717c = iconsListUrls;
        this.d = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj2;
        return Intrinsics.f(this.f143715a, f1Var.f143715a) && Intrinsics.f(this.f143716b, f1Var.f143716b) && Intrinsics.f(this.f143717c, f1Var.f143717c) && Intrinsics.f(this.d, f1Var.d);
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.c(this.f143715a.hashCode() * 31, 31, this.f143716b), 31, this.f143717c);
        Integer num = this.d;
        return iD + (num == null ? 0 : num.hashCode());
    }
}
