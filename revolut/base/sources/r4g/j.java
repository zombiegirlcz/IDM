package r4g;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f251456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f251457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f251458c;

    public j(TextLocalisedClause navBarTitle, ArrayList items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarTitle, "navBarTitle");
        this.f251456a = items;
        this.f251457b = navBarTitle;
        this.f251458c = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f251456a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f251456a.equals(jVar.f251456a) && this.f251457b.equals(jVar.f251457b) && this.f251458c == jVar.f251458c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f251458c) + t61.a.a(this.f251456a.hashCode() * 31, 31, this.f251457b);
    }
}
