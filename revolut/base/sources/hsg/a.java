package hsg;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f155039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f155040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f155041c;

    public a(TextLocalisedClause header, TextLocalisedClause description, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f155039a = items;
        this.f155040b = header;
        this.f155041c = description;
    }

    @Override // cli.p
    public final List c() {
        return this.f155039a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f155039a, aVar.f155039a) && this.f155040b.equals(aVar.f155040b) && this.f155041c.equals(aVar.f155041c);
    }

    public final int hashCode() {
        return this.f155041c.hashCode() + t61.a.a(this.f155039a.hashCode() * 31, 31, this.f155040b);
    }
}
