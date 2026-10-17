package uce;

import aii.e;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f279032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f279033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f279034c;

    public a(LocalDate localDate, TextLocalisedClause title, TextLocalisedClause actionText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(actionText, "actionText");
        this.f279032a = localDate;
        this.f279033b = title;
        this.f279034c = actionText;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f279032a, aVar.f279032a) && this.f279033b.equals(aVar.f279033b) && this.f279034c.equals(aVar.f279034c);
    }

    public final int hashCode() {
        LocalDate localDate = this.f279032a;
        return this.f279034c.hashCode() + t61.a.a((localDate == null ? 0 : localDate.hashCode()) * 31, 31, this.f279033b);
    }
}
