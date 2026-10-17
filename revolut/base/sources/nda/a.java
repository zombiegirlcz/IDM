package nda;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f214350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f214351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f214352c;

    public a(TextLocalisedClause title, TextLocalisedClause description, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f214350a = title;
        this.f214351b = description;
        this.f214352c = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f214350a.equals(aVar.f214350a) && this.f214351b.equals(aVar.f214351b) && this.f214352c.equals(aVar.f214352c);
    }

    public final int hashCode() {
        return this.f214352c.hashCode() + t61.a.a(this.f214350a.hashCode() * 31, 31, this.f214351b);
    }
}
