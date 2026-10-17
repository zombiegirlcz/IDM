package nfc;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f214892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f214893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f214894c;
    public final TextLocalisedClause d;
    public final boolean e;

    public h(TextLocalisedClause toolbarTitle, TextLocalisedClause toolbarDescription, TextLocalisedClause continueButton, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(toolbarDescription, "toolbarDescription");
        Intrinsics.checkNotNullParameter(continueButton, "continueButton");
        this.f214892a = items;
        this.f214893b = toolbarTitle;
        this.f214894c = toolbarDescription;
        this.d = continueButton;
        this.e = z;
    }

    @Override // jki.n
    public final List c() {
        return this.f214892a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f214892a, hVar.f214892a) && this.f214893b.equals(hVar.f214893b) && this.f214894c.equals(hVar.f214894c) && this.d.equals(hVar.d) && this.e == hVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + t61.a.a(t61.a.a(t61.a.a(this.f214892a.hashCode() * 31, 31, this.f214893b), 31, this.f214894c), 31, this.d);
    }
}
