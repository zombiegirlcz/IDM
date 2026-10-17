package gaf;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f142163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.i f142164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f142165c;

    public h(aw0.e eVar, TextLocalisedClause title, List items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f142163a = title;
        this.f142164b = eVar;
        this.f142165c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f142165c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f142163a.equals(hVar.f142163a) && Intrinsics.f(this.f142164b, hVar.f142164b) && this.f142165c.equals(hVar.f142165c);
    }

    public final int hashCode() {
        int iHashCode = this.f142163a.hashCode() * 31;
        aw0.i iVar = this.f142164b;
        return this.f142165c.hashCode() + ((iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31);
    }
}
