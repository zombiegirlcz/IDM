package jb1;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class l extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f172557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f172558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f172559c;
    public final TextLocalisedClause d;
    public final boolean e;

    public l(TextLocalisedClause toolbarTitle, TextLocalisedClause footer, TextLocalisedClause continueButton, ArrayList items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(footer, "footer");
        Intrinsics.checkNotNullParameter(continueButton, "continueButton");
        this.f172557a = items;
        this.f172558b = toolbarTitle;
        this.f172559c = footer;
        this.d = continueButton;
        this.e = z;
    }

    @Override // jki.n
    public final List c() {
        return this.f172557a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f172557a.equals(lVar.f172557a) && this.f172558b.equals(lVar.f172558b) && this.f172559c.equals(lVar.f172559c) && this.d.equals(lVar.d) && this.e == lVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + t61.a.a(t61.a.a(t61.a.a(this.f172557a.hashCode() * 31, 31, this.f172558b), 31, this.f172559c), 31, this.d);
    }
}
