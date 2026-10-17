package kxk;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class k implements cli.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f190603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f190604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f190605c;
    public final j d;
    public final List e;

    public k(TextLocalisedClause title, TextLocalisedClause description, List tabs, j scheduleSelection, List items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(scheduleSelection, "scheduleSelection");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f190603a = title;
        this.f190604b = description;
        this.f190605c = tabs;
        this.d = scheduleSelection;
        this.e = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f190603a.equals(kVar.f190603a) && this.f190604b.equals(kVar.f190604b) && Intrinsics.f(this.f190605c, kVar.f190605c) && this.d == kVar.d && Intrinsics.f(this.e, kVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + p.a.d(t61.a.a(this.f190603a.hashCode() * 31, 31, this.f190604b), 31, this.f190605c)) * 31);
    }
}
