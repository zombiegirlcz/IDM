package gk7;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f144336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f144337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f144338c;
    public final boolean d;
    public final boolean e;
    public final TextLocalisedClause f;

    public j(List items, TextLocalisedClause buttonText, boolean z, boolean z3, boolean z4, TextLocalisedClause subtitleText) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        Intrinsics.checkNotNullParameter(subtitleText, "subtitleText");
        this.f144336a = items;
        this.f144337b = buttonText;
        this.f144338c = z;
        this.d = z3;
        this.e = z4;
        this.f = subtitleText;
    }

    @Override // jki.n
    public final List c() {
        return this.f144336a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f144336a, jVar.f144336a) && this.f144337b.equals(jVar.f144337b) && this.f144338c == jVar.f144338c && this.d == jVar.d && this.e == jVar.e && this.f.equals(jVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + j6.a.c(j6.a.c(j6.a.c(t61.a.a(this.f144336a.hashCode() * 31, 31, this.f144337b), 31, this.f144338c), 31, this.d), 31, this.e);
    }
}
