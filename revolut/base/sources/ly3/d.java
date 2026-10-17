package ly3;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f200662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f200663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f200664c;
    public final b d;
    public final a e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f200665g;

    public d(String title, String description, String buttonTitle, b calendarItem, a calendar, String periodsTitle, ArrayList periods) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        Intrinsics.checkNotNullParameter(calendarItem, "calendarItem");
        Intrinsics.checkNotNullParameter(calendar, "calendar");
        Intrinsics.checkNotNullParameter(periodsTitle, "periodsTitle");
        Intrinsics.checkNotNullParameter(periods, "periods");
        this.f200662a = title;
        this.f200663b = description;
        this.f200664c = buttonTitle;
        this.d = calendarItem;
        this.e = calendar;
        this.f = periodsTitle;
        this.f200665g = periods;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f200662a, dVar.f200662a) && Intrinsics.f(this.f200663b, dVar.f200663b) && Intrinsics.f(this.f200664c, dVar.f200664c) && this.d.equals(dVar.d) && this.e.equals(dVar.e) && Intrinsics.f(this.f, dVar.f) && this.f200665g.equals(dVar.f200665g);
    }

    public final int hashCode() {
        return this.f200665g.hashCode() + p.a.c((this.e.hashCode() + p.a.c(p.a.c(p.a.c(this.f200662a.hashCode() * 31, 31, this.f200663b), 31, this.f200664c), 31, this.d.f200659a)) * 31, 31, this.f);
    }
}
