package j94;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f172282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f172283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f172284c;
    public final boolean d;
    public final ArrayList e;
    public final ArrayList f;

    public i(TextLocalisedClause title, TextLocalisedClause textLocalisedClause, TextLocalisedClause button, boolean z, ArrayList menuItems, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f172282a = title;
        this.f172283b = textLocalisedClause;
        this.f172284c = button;
        this.d = z;
        this.e = menuItems;
        this.f = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f172282a.equals(iVar.f172282a) && Intrinsics.f(this.f172283b, iVar.f172283b) && this.f172284c.equals(iVar.f172284c) && this.d == iVar.d && this.e.equals(iVar.e) && this.f.equals(iVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f172282a.hashCode() * 31;
        Clause clause = this.f172283b;
        return this.f.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.e, j6.a.c(t61.a.a((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f172284c), 31, this.d), 31);
    }
}
