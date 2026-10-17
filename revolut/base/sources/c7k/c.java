package c7k;

import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f22048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f22049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f22050c;
    public final boolean d;
    public final MoneyClause e;

    public c(ArrayList items, TextLocalisedClause navBarTitle, TextLocalisedClause buttonText, boolean z, MoneyClause amount) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarTitle, "navBarTitle");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f22048a = items;
        this.f22049b = navBarTitle;
        this.f22050c = buttonText;
        this.d = z;
        this.e = amount;
    }

    @Override // jki.n
    public final List c() {
        return this.f22048a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f22048a.equals(cVar.f22048a) && this.f22049b.equals(cVar.f22049b) && this.f22050c.equals(cVar.f22050c) && this.d == cVar.d && this.e.equals(cVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j6.a.c(t61.a.a(t61.a.a(this.f22048a.hashCode() * 31, 31, this.f22049b), 31, this.f22050c), 31, this.d);
    }
}
