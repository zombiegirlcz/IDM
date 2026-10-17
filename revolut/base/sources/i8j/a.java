package i8j;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f159542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f159543b;

    public a(TextLocalisedClause textLocalisedClause, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f159542a = textLocalisedClause;
        this.f159543b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f159543b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f159542a.equals(aVar.f159542a) && this.f159543b.equals(aVar.f159543b);
    }

    public final int hashCode() {
        return this.f159543b.hashCode() + (this.f159542a.hashCode() * 31);
    }
}
