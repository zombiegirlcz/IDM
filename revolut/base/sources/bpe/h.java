package bpe;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw0.a f17615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f17616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f17617c;

    public h(lw0.a header, TextLocalisedClause actionButtonText, f0 items) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(actionButtonText, "actionButtonText");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f17615a = header;
        this.f17616b = actionButtonText;
        this.f17617c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f17617c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f17615a.equals(hVar.f17615a) && this.f17616b.equals(hVar.f17616b) && Intrinsics.f(this.f17617c, hVar.f17617c);
    }

    public final int hashCode() {
        return this.f17617c.hashCode() + t61.a.a(this.f17615a.hashCode() * 31, 31, this.f17616b);
    }
}
