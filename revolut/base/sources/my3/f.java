package my3;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f210312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f210313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f210314c;
    public final d d;
    public final List e;

    public f(String title, String subtitle, String continueButton, d addDebtItem, List debts) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(continueButton, "continueButton");
        Intrinsics.checkNotNullParameter(addDebtItem, "addDebtItem");
        Intrinsics.checkNotNullParameter(debts, "debts");
        this.f210312a = title;
        this.f210313b = subtitle;
        this.f210314c = continueButton;
        this.d = addDebtItem;
        this.e = debts;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f210312a, fVar.f210312a) && Intrinsics.f(this.f210313b, fVar.f210313b) && Intrinsics.f(this.f210314c, fVar.f210314c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + p.a.c(p.a.c(this.f210312a.hashCode() * 31, 31, this.f210313b), 31, this.f210314c)) * 31);
    }
}
