package pi5;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f236423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f236424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f236425c;
    public final ArrayList d;

    public e(TextLocalisedClause titleClause, TextLocalisedClause descriptionClause, TextLocalisedClause secondaryDescriptionClause, ArrayList items) {
        Intrinsics.checkNotNullParameter(titleClause, "titleClause");
        Intrinsics.checkNotNullParameter(descriptionClause, "descriptionClause");
        Intrinsics.checkNotNullParameter(secondaryDescriptionClause, "secondaryDescriptionClause");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f236423a = titleClause;
        this.f236424b = descriptionClause;
        this.f236425c = secondaryDescriptionClause;
        this.d = items;
    }

    @Override // cli.p
    public final List c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f236423a.equals(eVar.f236423a) && this.f236424b.equals(eVar.f236424b) && this.f236425c.equals(eVar.f236425c) && this.d.equals(eVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + t61.a.a(t61.a.a(this.f236423a.hashCode() * 31, 31, this.f236424b), 31, this.f236425c);
    }
}
