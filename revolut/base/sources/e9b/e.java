package e9b;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f123943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f123944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f123945c;
    public final Integer d;

    public e(TextLocalisedClause title, TextLocalisedClause textLocalisedClause, String str, Integer num) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter("RetailServerErrorHandler.showErrorMessage", "dialogBreadcrumb");
        this.f123943a = title;
        this.f123944b = textLocalisedClause;
        this.f123945c = str;
        this.d = num;
    }

    public final Clause a() {
        return this.f123944b;
    }

    public final Integer b() {
        return this.d;
    }

    public final String c() {
        return this.f123945c;
    }

    public final Clause d() {
        return this.f123943a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f123943a.equals(eVar.f123943a) && this.f123944b.equals(eVar.f123944b) && Intrinsics.f(this.f123945c, eVar.f123945c) && this.d.equals(eVar.d);
    }

    public final int hashCode() {
        int iHashCode = (((this.f123944b.hashCode() + (this.f123943a.hashCode() * 961)) * 31) + 1817639970) * 31;
        String str = this.f123945c;
        return this.d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
