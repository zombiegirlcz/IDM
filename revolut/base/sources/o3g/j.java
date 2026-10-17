package o3g;

import java.util.List;
import jki.m;
import jki.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f221814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f221815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f221816c;

    public j(d calendarModel, boolean z, List menuItems) {
        Intrinsics.checkNotNullParameter(calendarModel, "calendarModel");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f221814a = calendarModel;
        this.f221815b = z;
        this.f221816c = menuItems;
    }

    @Override // jki.m
    public final o b(m oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (!(oldState instanceof j)) {
            return null;
        }
        return new h(!r6.f221814a.equals(this.f221814a), ((j) oldState).f221815b != this.f221815b, !Intrinsics.f(r6.f221816c, this.f221816c));
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f221814a, jVar.f221814a) && this.f221815b == jVar.f221815b && Intrinsics.f(this.f221816c, jVar.f221816c);
    }

    public final int hashCode() {
        return this.f221816c.hashCode() + j6.a.c(this.f221814a.hashCode() * 31, 31, this.f221815b);
    }
}
