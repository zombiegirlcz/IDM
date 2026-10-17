package ys;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class u implements cli.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f316362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f316363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f316364c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextLocalisedClause f316365g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f316366h;
    public final boolean i;

    public u(TextLocalisedClause title, TextLocalisedClause description, TextLocalisedClause calendar, String year, String month, String day, TextLocalisedClause yearPlaceholder, int i, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(calendar, "calendar");
        Intrinsics.checkNotNullParameter(year, "year");
        Intrinsics.checkNotNullParameter(month, "month");
        Intrinsics.checkNotNullParameter(day, "day");
        Intrinsics.checkNotNullParameter(yearPlaceholder, "yearPlaceholder");
        this.f316362a = title;
        this.f316363b = description;
        this.f316364c = calendar;
        this.d = year;
        this.e = month;
        this.f = day;
        this.f316365g = yearPlaceholder;
        this.f316366h = i;
        this.i = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return this.f316362a.equals(uVar.f316362a) && this.f316363b.equals(uVar.f316363b) && this.f316364c.equals(uVar.f316364c) && Intrinsics.f(this.d, uVar.d) && Intrinsics.f(this.e, uVar.e) && Intrinsics.f(this.f, uVar.f) && this.f316365g.equals(uVar.f316365g) && this.f316366h == uVar.f316366h && this.i == uVar.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + j6.a.b(this.f316366h, t61.a.a(p.a.c(p.a.c(p.a.c(t61.a.a(t61.a.a(this.f316362a.hashCode() * 31, 31, this.f316363b), 31, this.f316364c), 31, this.d), 31, this.e), 31, this.f), 31, this.f316365g), 31);
    }
}
