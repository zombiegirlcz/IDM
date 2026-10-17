package n65;

import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.s6;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import koi.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f212708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f212709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s6 f212710c;
    public final j d;

    public c(TextLocalisedClause title, TextLocalisedClause subtitle, s6 calendar, PlainTextDelegate.Model model) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(calendar, "calendar");
        this.f212708a = title;
        this.f212709b = subtitle;
        this.f212710c = calendar;
        this.d = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f212708a.equals(cVar.f212708a) && this.f212709b.equals(cVar.f212709b) && this.f212710c.equals(cVar.f212710c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f212710c.hashCode() + t61.a.a(this.f212708a.hashCode() * 31, 31, this.f212709b)) * 31;
        j jVar = this.d;
        return iHashCode + (jVar == null ? 0 : jVar.hashCode());
    }
}
