package u85;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f278114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f278115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f278116c;
    public final h60.b d;
    public final List e;

    public i(TextLocalisedClause title, TextLocalisedClause description, TextLocalisedClause buttonText, h60.a aVar, List items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f278114a = title;
        this.f278115b = description;
        this.f278116c = buttonText;
        this.d = aVar;
        this.e = items;
    }

    @Override // cli.p
    public final List c() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f278114a.equals(iVar.f278114a) && this.f278115b.equals(iVar.f278115b) && this.f278116c.equals(iVar.f278116c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e);
    }

    public final int hashCode() {
        int iA = t61.a.a(t61.a.a(this.f278114a.hashCode() * 31, 31, this.f278115b), 31, this.f278116c);
        h60.b bVar = this.d;
        return this.e.hashCode() + ((iA + (bVar == null ? 0 : bVar.hashCode())) * 31);
    }
}
