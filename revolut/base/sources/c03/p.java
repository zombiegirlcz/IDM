package c03;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f20138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f20139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f20140c;
    public final List d;

    public p(TextLocalisedClause title, TextLocalisedClause description, TextLocalisedClause nextButtonLabel, List items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(nextButtonLabel, "nextButtonLabel");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f20138a = title;
        this.f20139b = description;
        this.f20140c = nextButtonLabel;
        this.d = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f20138a.equals(pVar.f20138a) && this.f20139b.equals(pVar.f20139b) && this.f20140c.equals(pVar.f20140c) && Intrinsics.f(this.d, pVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + t61.a.a(t61.a.a(this.f20138a.hashCode() * 31, 31, this.f20139b), 31, this.f20140c);
    }
}
