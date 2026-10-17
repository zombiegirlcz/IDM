package rp8;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f256282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f256283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f256284c;

    public m(aim.e items, TextLocalisedClause navBarTitle, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarTitle, "navBarTitle");
        this.f256282a = items;
        this.f256283b = navBarTitle;
        this.f256284c = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f256282a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f256282a, mVar.f256282a) && this.f256283b.equals(mVar.f256283b) && this.f256284c == mVar.f256284c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f256284c) + t61.a.a(this.f256282a.hashCode() * 31, 31, this.f256283b);
    }
}
