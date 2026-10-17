package lnc;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f197141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f197142b;

    public e(TextLocalisedClause subtitle, List items) {
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f197141a = subtitle;
        this.f197142b = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f197142b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f197141a.equals(eVar.f197141a) && Intrinsics.f(this.f197142b, eVar.f197142b);
    }

    public final int hashCode() {
        return this.f197142b.hashCode() + (this.f197141a.hashCode() * 31);
    }
}
