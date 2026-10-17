package idc;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f160465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f160466b;

    public a(aim.e items, TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f160465a = items;
        this.f160466b = title;
    }

    @Override // cli.p
    public final List c() {
        return this.f160465a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f160465a, aVar.f160465a) && this.f160466b.equals(aVar.f160466b);
    }

    public final int hashCode() {
        return this.f160466b.hashCode() + (this.f160465a.hashCode() * 31);
    }
}
