package c5h;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f21559c;
    public final dj0.d d;

    public e(String title, String description, BigDecimal rate, dj0.d minFee) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(rate, "rate");
        Intrinsics.checkNotNullParameter(minFee, "minFee");
        this.f21557a = title;
        this.f21558b = description;
        this.f21559c = rate;
        this.d = minFee;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f21557a, eVar.f21557a) && Intrinsics.f(this.f21558b, eVar.f21558b) && Intrinsics.f(this.f21559c, eVar.f21559c) && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + t61.a.d(this.f21559c, p.a.c(this.f21557a.hashCode() * 31, 31, this.f21558b), 31);
    }
}
