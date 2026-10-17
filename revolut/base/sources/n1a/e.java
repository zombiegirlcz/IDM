package n1a;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f211302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f211303b;

    public e(TextLocalisedClause title, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f211302a = items;
        this.f211303b = title;
    }

    @Override // cli.p
    public final List c() {
        return this.f211302a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f211302a.equals(eVar.f211302a) && this.f211303b.equals(eVar.f211303b);
    }

    public final int hashCode() {
        return this.f211303b.hashCode() + (this.f211302a.hashCode() * 31);
    }
}
