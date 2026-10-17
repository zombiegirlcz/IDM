package td4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f269920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f269921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f269922c;

    public a(TextLocalisedClause title, TextLocalisedClause description, TextLocalisedClause buttonTitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        this.f269920a = title;
        this.f269921b = description;
        this.f269922c = buttonTitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f269920a.equals(aVar.f269920a) && this.f269921b.equals(aVar.f269921b) && this.f269922c.equals(aVar.f269922c);
    }

    public final int hashCode() {
        return this.f269922c.hashCode() + t61.a.a(this.f269920a.hashCode() * 31, 31, this.f269921b);
    }
}
