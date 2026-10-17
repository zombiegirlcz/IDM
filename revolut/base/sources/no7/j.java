package no7;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f217938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f217939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f217940c;

    public j(aim.e items, TextLocalisedClause footer, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(footer, "footer");
        this.f217938a = items;
        this.f217939b = footer;
        this.f217940c = z;
    }

    @Override // jki.n
    public final List c() {
        return this.f217938a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f217938a, jVar.f217938a) && this.f217939b.equals(jVar.f217939b) && this.f217940c == jVar.f217940c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f217940c) + t61.a.a(this.f217938a.hashCode() * 31, 31, this.f217939b);
    }
}
