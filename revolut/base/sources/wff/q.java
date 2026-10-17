package wff;

import com.revolut.core.ui_kit.models.TextClause;
import ip0.v7;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class q implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f297099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f297100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextClause f297101c;
    public final List d;
    public final l e;

    public q(ArrayList items, TextClause title, TextClause textClause, List menuItems, l actionButtons) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(actionButtons, "actionButtons");
        this.f297099a = items;
        this.f297100b = title;
        this.f297101c = textClause;
        this.d = menuItems;
        this.e = actionButtons;
    }

    @Override // jki.n
    public final List c() {
        return this.f297099a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return this.f297099a.equals(qVar.f297099a) && this.f297100b.equals(qVar.f297100b) && Intrinsics.f(this.f297101c, qVar.f297101c) && Intrinsics.f(this.d, qVar.d) && this.e.equals(qVar.e);
    }

    public final int hashCode() {
        int iB = v7.b(this.f297099a.hashCode() * 31, 31, this.f297100b);
        TextClause textClause = this.f297101c;
        return this.e.hashCode() + p.a.d((iB + (textClause == null ? 0 : textClause.hashCode())) * 31, 31, this.d);
    }
}
