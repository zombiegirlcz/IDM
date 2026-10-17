package akb;

import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.PairedImage;
import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PairedImage f5776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f5777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MoneyClause f5778c;
    public final TextLocalisedClause d;
    public final List e;

    public n(PairedImage icon, TextLocalisedClause actionStatusLabel, MoneyClause title, TextLocalisedClause description, List actions) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(actionStatusLabel, "actionStatusLabel");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f5776a = icon;
        this.f5777b = actionStatusLabel;
        this.f5778c = title;
        this.d = description;
        this.e = actions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f5776a.equals(nVar.f5776a) && this.f5777b.equals(nVar.f5777b) && this.f5778c.equals(nVar.f5778c) && this.d.equals(nVar.d) && Intrinsics.f(this.e, nVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + t61.a.a(v7.a(t61.a.a(this.f5776a.hashCode() * 31, 31, this.f5777b), 31, this.f5778c), 31, this.d);
    }
}
