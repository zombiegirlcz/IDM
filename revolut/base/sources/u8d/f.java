package u8d;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f278171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f278172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f278173c;

    public f(TextLocalisedClause title, ArrayList items, List menuItems) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f278171a = title;
        this.f278172b = items;
        this.f278173c = menuItems;
    }

    @Override // jki.n
    public final List c() {
        return this.f278172b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f278171a.equals(fVar.f278171a) && this.f278172b.equals(fVar.f278172b) && Intrinsics.f(this.f278173c, fVar.f278173c);
    }

    public final int hashCode() {
        return this.f278173c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f278172b, this.f278171a.hashCode() * 31, 31);
    }
}
