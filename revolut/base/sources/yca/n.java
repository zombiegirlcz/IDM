package yca;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f312587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f312588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f312589c;
    public final TextLocalisedClause d;

    public n(TextLocalisedClause title, TextLocalisedClause description, ArrayList items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f312587a = items;
        this.f312588b = z;
        this.f312589c = title;
        this.d = description;
    }

    @Override // cli.p
    public final List c() {
        return this.f312587a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f312587a.equals(nVar.f312587a) && this.f312588b == nVar.f312588b && this.f312589c.equals(nVar.f312589c) && this.d.equals(nVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + t61.a.a(j6.a.c(this.f312587a.hashCode() * 31, 31, this.f312588b), 31, this.f312589c);
    }
}
