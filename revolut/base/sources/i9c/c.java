package i9c;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f159623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f159624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f159625c;
    public final aw0.e d;

    public c(aim.e items, TextLocalisedClause textLocalisedClause, Integer num, aw0.e actionFooterModel) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(actionFooterModel, "actionFooterModel");
        this.f159623a = items;
        this.f159624b = textLocalisedClause;
        this.f159625c = num;
        this.d = actionFooterModel;
    }

    @Override // cli.p
    public final List c() {
        return this.f159623a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f159623a, cVar.f159623a) && this.f159624b.equals(cVar.f159624b) && this.f159625c.equals(cVar.f159625c) && this.d.equals(cVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f159625c.hashCode() + t61.a.a(this.f159623a.hashCode() * 31, 31, this.f159624b)) * 31);
    }
}
