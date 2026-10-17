package wp2;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f299012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f299013b;

    public e(TextLocalisedClause subtitleText, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(subtitleText, "subtitleText");
        this.f299012a = items;
        this.f299013b = subtitleText;
    }

    @Override // cli.p
    public final List c() {
        return this.f299012a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f299012a.equals(eVar.f299012a) && this.f299013b.equals(eVar.f299013b);
    }

    public final int hashCode() {
        return this.f299013b.hashCode() + (this.f299012a.hashCode() * 31);
    }
}
