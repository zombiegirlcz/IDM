package kjd;

import com.revolut.core.ui_kit.delegates.NotificationCentreItemDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import jid.t;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements cli.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f184384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f184385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f184386c;
    public final ArrayList d;
    public final boolean e;
    public final g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Clause f184387g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.revolut.feature.shops.impl.ui.map_view.c f184388h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f184389j;
    public final cr0.h k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f184390l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final koi.j f184391m;

    public k(t location, ArrayList verticalItems, List horizontalItems, ArrayList markers, boolean z, g gVar, TextLocalisedClause textLocalisedClause, com.revolut.feature.shops.impl.ui.map_view.c searchButtonState, boolean z3, boolean z4, cr0.h viewBottomSheetState, String str, NotificationCentreItemDelegate.Model model) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(verticalItems, "verticalItems");
        Intrinsics.checkNotNullParameter(horizontalItems, "horizontalItems");
        Intrinsics.checkNotNullParameter(markers, "markers");
        Intrinsics.checkNotNullParameter(searchButtonState, "searchButtonState");
        Intrinsics.checkNotNullParameter(viewBottomSheetState, "viewBottomSheetState");
        this.f184384a = location;
        this.f184385b = verticalItems;
        this.f184386c = horizontalItems;
        this.d = markers;
        this.e = z;
        this.f = gVar;
        this.f184387g = textLocalisedClause;
        this.f184388h = searchButtonState;
        this.i = z3;
        this.f184389j = z4;
        this.k = viewBottomSheetState;
        this.f184390l = str;
        this.f184391m = model;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        boolean z;
        boolean z3;
        boolean z4;
        boolean z6;
        boolean z11;
        boolean z12;
        boolean z29;
        boolean z31;
        boolean z41;
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (!(oldState instanceof k)) {
            return null;
        }
        k kVar = (k) oldState;
        boolean z49 = !Intrinsics.f(kVar.f184384a, this.f184384a);
        boolean z54 = !kVar.f184385b.equals(this.f184385b);
        boolean z74 = !Intrinsics.f(kVar.f184386c, this.f184386c);
        boolean z83 = !kVar.d.equals(this.d);
        boolean z89 = !Intrinsics.f(kVar.f, this.f);
        boolean z96 = !Intrinsics.f(kVar.f184387g, this.f184387g);
        boolean z100 = !kVar.f184388h.equals(this.f184388h);
        if (kVar.i != this.i) {
            z = true;
            z3 = z54;
            z4 = z74;
            z6 = z83;
            z11 = z89;
            z12 = z96;
            z29 = z100;
            z31 = true;
        } else {
            z = true;
            z3 = z54;
            z4 = z74;
            z6 = z83;
            z11 = z89;
            z12 = z96;
            z29 = z100;
            z31 = false;
        }
        if (kVar.f184389j != this.f184389j) {
            z41 = z;
        } else {
            z41 = z;
            z = false;
        }
        return new i(z49, z3, z4, z6, z11, z12, z29, z31, z, kVar.k != this.k ? z41 : false, Intrinsics.f(kVar.f184390l, this.f184390l) ^ z41, Intrinsics.f(kVar.f184391m, this.f184391m) ^ z41);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f184384a, kVar.f184384a) && this.f184385b.equals(kVar.f184385b) && Intrinsics.f(this.f184386c, kVar.f184386c) && this.d.equals(kVar.d) && this.e == kVar.e && Intrinsics.f(this.f, kVar.f) && Intrinsics.f(this.f184387g, kVar.f184387g) && this.f184388h.equals(kVar.f184388h) && this.i == kVar.i && this.f184389j == kVar.f184389j && this.k == kVar.k && Intrinsics.f(this.f184390l, kVar.f184390l) && Intrinsics.f(this.f184391m, kVar.f184391m);
    }

    public final int hashCode() {
        int iC = j6.a.c(com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, p.a.d(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f184385b, this.f184384a.hashCode() * 31, 31), 31, this.f184386c), 31), 31, this.e);
        g gVar = this.f;
        int iHashCode = (iC + (gVar == null ? 0 : gVar.hashCode())) * 31;
        Clause clause = this.f184387g;
        int iHashCode2 = (this.k.hashCode() + j6.a.c(j6.a.c((this.f184388h.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31)) * 31, 31, this.i), 31, this.f184389j)) * 31;
        String str = this.f184390l;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        koi.j jVar = this.f184391m;
        return iHashCode3 + (jVar != null ? jVar.hashCode() : 0);
    }
}
