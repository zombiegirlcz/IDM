package foa;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f136864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f136865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f136866c;
    public final Clause d;

    public d(TextLocalisedClause title, Clause description, aim.e items, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f136864a = title;
        this.f136865b = description;
        this.f136866c = items;
        this.d = textLocalisedClause;
    }

    @Override // cli.p
    public final List c() {
        return this.f136866c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f136864a.equals(dVar.f136864a) && this.f136865b.equals(dVar.f136865b) && Intrinsics.f(this.f136866c, dVar.f136866c) && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.b(this.f136864a.hashCode() * 31, 31, this.f136865b), 31, this.f136866c);
        Clause clause = this.d;
        return iD + (clause == null ? 0 : clause.hashCode());
    }
}
