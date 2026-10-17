package ob1;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f223851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f223852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f223853c;
    public final TextLocalisedClause d;
    public final boolean e;

    public h(TextLocalisedClause toolbarTitle, TextLocalisedClause toolbarDescription, TextLocalisedClause continueButtonText, ArrayList items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(toolbarDescription, "toolbarDescription");
        Intrinsics.checkNotNullParameter(continueButtonText, "continueButtonText");
        this.f223851a = items;
        this.f223852b = toolbarTitle;
        this.f223853c = toolbarDescription;
        this.d = continueButtonText;
        this.e = z;
    }

    @Override // jki.n
    public final List c() {
        return this.f223851a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f223851a.equals(hVar.f223851a) && this.f223852b.equals(hVar.f223852b) && this.f223853c.equals(hVar.f223853c) && this.d.equals(hVar.d) && this.e == hVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + t61.a.a(t61.a.a(t61.a.a(this.f223851a.hashCode() * 31, 31, this.f223852b), 31, this.f223853c), 31, this.d);
    }
}
