package nwc;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f219827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f219828b;

    public m(TextLocalisedClause subtitle, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f219827a = items;
        this.f219828b = subtitle;
    }

    @Override // cli.p
    public final List c() {
        return this.f219827a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f219827a.equals(mVar.f219827a) && this.f219828b.equals(mVar.f219828b);
    }

    public final int hashCode() {
        return this.f219828b.hashCode() + (this.f219827a.hashCode() * 31);
    }
}
