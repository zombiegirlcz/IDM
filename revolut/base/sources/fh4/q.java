package fh4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class q implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f135141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f135142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f135143c;
    public final TextLocalisedClause d;
    public final boolean e;
    public final int f;

    public q(ArrayList items, TextLocalisedClause navBarTitle, TextLocalisedClause textLocalisedClause, TextLocalisedClause buttonText, boolean z, int i) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarTitle, "navBarTitle");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        this.f135141a = items;
        this.f135142b = navBarTitle;
        this.f135143c = textLocalisedClause;
        this.d = buttonText;
        this.e = z;
        this.f = i;
    }

    @Override // cli.p
    public final List c() {
        return this.f135141a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return this.f135141a.equals(qVar.f135141a) && this.f135142b.equals(qVar.f135142b) && Intrinsics.f(this.f135143c, qVar.f135143c) && this.d.equals(qVar.d) && this.e == qVar.e && this.f == qVar.f;
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f135141a.hashCode() * 31, 31, this.f135142b);
        Clause clause = this.f135143c;
        return Integer.hashCode(this.f) + j6.a.c(t61.a.a((iA + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.d), 31, this.e);
    }
}
