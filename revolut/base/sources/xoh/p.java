package xoh;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class p implements cli.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f307845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f307846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f307847c;
    public final String d;
    public final o e;

    public p(TextLocalisedClause title, List menuItems, ArrayList tabs, String selectedPagerItemId, o buttonState) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(selectedPagerItemId, "selectedPagerItemId");
        Intrinsics.checkNotNullParameter(buttonState, "buttonState");
        this.f307845a = title;
        this.f307846b = menuItems;
        this.f307847c = tabs;
        this.d = selectedPagerItemId;
        this.e = buttonState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f307845a.equals(pVar.f307845a) && Intrinsics.f(this.f307846b, pVar.f307846b) && this.f307847c.equals(pVar.f307847c) && Intrinsics.f(this.d, pVar.d) && this.e.equals(pVar.e);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.e.hashCode() + p.a.c(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f307847c, p.a.d(this.f307845a.hashCode() * 31, 31, this.f307846b), 31), 31, this.d)) * 31);
    }
}
