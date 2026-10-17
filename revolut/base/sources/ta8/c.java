package ta8;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f269154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f269155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f269156c;

    public c(TextLocalisedClause title, TextLocalisedClause subtitle, TextLocalisedClause action) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f269154a = title;
        this.f269155b = subtitle;
        this.f269156c = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f269154a.equals(cVar.f269154a) && this.f269155b.equals(cVar.f269155b) && this.f269156c.equals(cVar.f269156c);
    }

    public final int hashCode() {
        return this.f269156c.hashCode() + t61.a.a(this.f269154a.hashCode() * 31, 31, this.f269155b);
    }
}
