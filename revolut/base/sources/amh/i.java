package amh;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f6404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f6405c;

    public i(TextLocalisedClause title, ArrayList items, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f6403a = z;
        this.f6404b = title;
        this.f6405c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f6405c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f6403a == iVar.f6403a && this.f6404b.equals(iVar.f6404b) && this.f6405c.equals(iVar.f6405c);
    }

    public final int hashCode() {
        return this.f6405c.hashCode() + t61.a.a(Boolean.hashCode(this.f6403a) * 31, 31, this.f6404b);
    }
}
