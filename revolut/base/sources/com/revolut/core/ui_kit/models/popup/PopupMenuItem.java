package com.revolut.core.ui_kit.models.popup;

import a10.b;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NewBadgeContent;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import gv5.f;
import h30.l;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mw0.g;
import mw0.j;
import mw0.k;
import org.jetbrains.annotations.NotNull;
import qv0.c;
import qv0.i;
import qv0.p;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00042\u00020\u00012\u00020\u00022\u00020\u0003:\u0005\u0005\u0006\u0007\b\t\u0082\u0001\u0002\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/core/ui_kit/models/popup/PopupMenuItem;", "Lqv0/i;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Companion", "Cell", "mw0/j", "mw0/g", "NestedParent", "a", "Lcom/revolut/core/ui_kit/models/popup/PopupMenuItem$Cell;", "Lcom/revolut/core/ui_kit/models/popup/PopupMenuItem$NestedParent;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PopupMenuItem extends i, p, TrackableItem {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f58145a;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.models.popup.PopupMenuItem$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f58145a = new Companion();

        private Companion() {
        }

        public static Cell a(Companion companion, String listId, Clause title, boolean z, Image image, Object obj2, ResourceImage resourceImage, TextClause textClause, int i) {
            Image image2 = (i & 8) != 0 ? null : image;
            Object obj3 = (i & 16) != 0 ? null : obj2;
            ResourceImage resourceImage2 = (i & 32) != 0 ? null : resourceImage;
            TextClause textClause2 = (i & 64) != 0 ? null : textClause;
            companion.getClass();
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            mw0.i state = mw0.i.f209289a;
            Intrinsics.checkNotNullParameter(state, "state");
            return new Cell(listId, title, image2, resourceImage2, null, textClause2, state, z ? g.Selected : g.Unselected, obj3, null, 528);
        }
    }

    /* JADX INFO: renamed from: G */
    Clause getF58135b();

    /* JADX INFO: renamed from: c */
    Clause getD();

    /* JADX INFO: renamed from: getIcon */
    Image getF58136c();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/popup/PopupMenuItem$NestedParent;", "Lcom/revolut/core/ui_kit/models/popup/PopupMenuItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NestedParent implements PopupMenuItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f58134a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f58135b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Image f58136c;
        public final Clause d;
        public final List e;
        public final Object f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Parcelable f58137g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f58138h;
        public c i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public p31.c f58139j;
        public p31.c k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public p31.c f58140l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public p31.c f58141m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f58142n;
        public int o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f58143p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final int f58144q;

        /* JADX WARN: Illegal instructions before constructor call */
        public NestedParent(String listId, TextLocalisedClause title, Image icon, Collection subMenu, f fVar, AnalyticsContext analyticsContext, Clause clause, int i) {
            fVar = (i & 16) != 0 ? null : fVar;
            analyticsContext = (i & 32) != 0 ? null : analyticsContext;
            Clause clause2 = (i & 64) != 0 ? null : clause;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(subMenu, "subMenu");
            this(listId, title, icon, u.c(new mw0.p(null, d0.d1(subMenu))), fVar, analyticsContext, clause2);
        }

        public static NestedParent e(NestedParent nestedParent, boolean z) {
            String listId = nestedParent.f58134a;
            Clause title = nestedParent.f58135b;
            Image icon = nestedParent.f58136c;
            Clause clause = nestedParent.d;
            List subMenuSections = nestedParent.e;
            Object obj2 = nestedParent.f;
            Parcelable parcelable = nestedParent.f58137g;
            c positionInBox = nestedParent.i;
            p31.c cVar = nestedParent.f58139j;
            p31.c cVar2 = nestedParent.k;
            p31.c cVar3 = nestedParent.f58140l;
            p31.c cVar4 = nestedParent.f58141m;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(subMenuSections, "subMenuSections");
            Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
            return new NestedParent(listId, title, icon, clause, subMenuSections, obj2, parcelable, z, positionInBox, cVar, cVar2, cVar3, cVar4);
        }

        @Override // com.revolut.core.ui_kit.models.popup.PopupMenuItem
        /* JADX INFO: renamed from: G, reason: from getter */
        public final Clause getF58135b() {
            return this.f58135b;
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF53876p() {
            return this.f;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF55185b() {
            return this.f58134a;
        }

        @Override // com.revolut.core.ui_kit.models.popup.PopupMenuItem
        /* JADX INFO: renamed from: c, reason: from getter */
        public final Clause getD() {
            return this.d;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof NestedParent)) {
                return false;
            }
            NestedParent nestedParent = (NestedParent) obj2;
            return Intrinsics.f(this.f58134a, nestedParent.f58134a) && Intrinsics.f(this.f58135b, nestedParent.f58135b) && Intrinsics.f(this.f58136c, nestedParent.f58136c) && Intrinsics.f(this.d, nestedParent.d) && Intrinsics.f(this.e, nestedParent.e) && Intrinsics.f(this.f, nestedParent.f) && Intrinsics.f(this.f58137g, nestedParent.f58137g) && this.f58138h == nestedParent.f58138h && Intrinsics.f(this.i, nestedParent.i) && Intrinsics.f(this.f58139j, nestedParent.f58139j) && Intrinsics.f(this.k, nestedParent.k) && Intrinsics.f(this.f58140l, nestedParent.f58140l) && Intrinsics.f(this.f58141m, nestedParent.f58141m);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF51816m() {
            return this.f58142n;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f58142n = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getE() {
            return this.f58137g;
        }

        @Override // com.revolut.core.ui_kit.models.popup.PopupMenuItem
        /* JADX INFO: renamed from: getIcon, reason: from getter */
        public final Image getF58136c() {
            return this.f58136c;
        }

        public final int hashCode() {
            int iC = b.c(this.f58136c, p.a.a(this.f58134a.hashCode() * 31, 31, this.f58135b), 31);
            Clause clause = this.d;
            int iD = p.a.d((iC + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.e);
            Object obj2 = this.f;
            int iHashCode = (iD + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.f58137g;
            int i = l.i(this.i, j6.a.c((iHashCode + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31, this.f58138h), 31);
            p31.c cVar = this.f58139j;
            int iHashCode2 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.k;
            int iHashCode3 = (iHashCode2 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f58140l;
            int iHashCode4 = (iHashCode3 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f58141m;
            return iHashCode4 + (cVar4 != null ? cVar4.hashCode() : 0);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getI() {
            return this.f58139j;
        }

        @Override // qv0.i
        public final void j(c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.i = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF51814j() {
            return this.k;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f58140l = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF51817n() {
            return this.o;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF51818p() {
            return this.f58144q;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.o = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final c getF51812g() {
            return this.i;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF51815l() {
            return this.f58141m;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getK() {
            return this.f58140l;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f58139j = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f58137g = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getO() {
            return this.f58143p;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.k = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f58141m = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            NestedParent nestedParent = oldItem instanceof NestedParent ? (NestedParent) oldItem : null;
            if (nestedParent != null) {
                return new k(!Intrinsics.f(nestedParent.f58135b, this.f58135b), !Intrinsics.f(nestedParent.f58136c, this.f58136c), false, false, !Intrinsics.f(nestedParent.d, this.d), false, false, nestedParent.f58138h != this.f58138h, or0.b.l(this, nestedParent));
            }
            return null;
        }

        public NestedParent(String str, Clause clause, Image image, Clause clause2, List list, Object obj2, Parcelable parcelable, boolean z, c cVar, p31.c cVar2, p31.c cVar3, p31.c cVar4, p31.c cVar5) {
            this.f58134a = str;
            this.f58135b = clause;
            this.f58136c = image;
            this.d = clause2;
            this.e = list;
            this.f = obj2;
            this.f58137g = parcelable;
            this.f58138h = z;
            this.i = cVar;
            this.f58139j = cVar2;
            this.k = cVar3;
            this.f58140l = cVar4;
            this.f58141m = cVar5;
            int i = R$attr.uikit_dp0;
            this.f58142n = i;
            this.o = i;
            this.f58143p = i;
            this.f58144q = i;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public NestedParent(String listId, Clause title, Image icon, List subMenuSections, Object obj2, Parcelable parcelable, Clause clause) {
            this(listId, title, icon, clause, subMenuSections, obj2, parcelable, false, c.d.f249513a, null, null, null, null);
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(subMenuSections, "subMenuSections");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/popup/PopupMenuItem$Cell;", "Lcom/revolut/core/ui_kit/models/popup/PopupMenuItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Cell implements PopupMenuItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f58121a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f58122b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Image f58123c;
        public final Image d;
        public final NewBadgeContent e;
        public final Clause f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final j f58124g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final g f58125h;
        public final Object i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Parcelable f58126j;
        public c k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public p31.c f58127l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public p31.c f58128m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public p31.c f58129n;
        public p31.c o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f58130p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f58131q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final int f58132r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int f58133s;

        public Cell(String str, Clause clause, Image image, Image image2, NewBadgeContent newBadgeContent, Clause clause2, j jVar, g gVar, Object obj2, Parcelable parcelable, c cVar, p31.c cVar2, p31.c cVar3, p31.c cVar4, p31.c cVar5) {
            this.f58121a = str;
            this.f58122b = clause;
            this.f58123c = image;
            this.d = image2;
            this.e = newBadgeContent;
            this.f = clause2;
            this.f58124g = jVar;
            this.f58125h = gVar;
            this.i = obj2;
            this.f58126j = parcelable;
            this.k = cVar;
            this.f58127l = cVar2;
            this.f58128m = cVar3;
            this.f58129n = cVar4;
            this.o = cVar5;
            int i = R$attr.uikit_dp0;
            this.f58130p = i;
            this.f58131q = i;
            this.f58132r = i;
            this.f58133s = i;
        }

        public static Cell e(Cell cell, g gVar) {
            String listId = cell.f58121a;
            Clause title = cell.f58122b;
            Image image = cell.f58123c;
            Image image2 = cell.d;
            NewBadgeContent newBadgeContent = cell.e;
            Clause clause = cell.f;
            j state = cell.f58124g;
            Object obj2 = cell.i;
            Parcelable parcelable = cell.f58126j;
            c positionInBox = cell.k;
            p31.c cVar = cell.f58127l;
            p31.c cVar2 = cell.f58128m;
            p31.c cVar3 = cell.f58129n;
            p31.c cVar4 = cell.o;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
            return new Cell(listId, title, image, image2, newBadgeContent, clause, state, gVar, obj2, parcelable, positionInBox, cVar, cVar2, cVar3, cVar4);
        }

        @Override // com.revolut.core.ui_kit.models.popup.PopupMenuItem
        /* JADX INFO: renamed from: G, reason: from getter */
        public final Clause getF58135b() {
            return this.f58122b;
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF53876p() {
            return this.i;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF55185b() {
            return this.f58121a;
        }

        @Override // com.revolut.core.ui_kit.models.popup.PopupMenuItem
        /* JADX INFO: renamed from: c, reason: from getter */
        public final Clause getD() {
            return this.f;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Cell)) {
                return false;
            }
            Cell cell = (Cell) obj2;
            return Intrinsics.f(this.f58121a, cell.f58121a) && Intrinsics.f(this.f58122b, cell.f58122b) && Intrinsics.f(this.f58123c, cell.f58123c) && Intrinsics.f(this.d, cell.d) && Intrinsics.f(this.e, cell.e) && Intrinsics.f(this.f, cell.f) && Intrinsics.f(this.f58124g, cell.f58124g) && this.f58125h == cell.f58125h && Intrinsics.f(this.i, cell.i) && Intrinsics.f(this.f58126j, cell.f58126j) && Intrinsics.f(this.k, cell.k) && Intrinsics.f(this.f58127l, cell.f58127l) && Intrinsics.f(this.f58128m, cell.f58128m) && Intrinsics.f(this.f58129n, cell.f58129n) && Intrinsics.f(this.o, cell.o);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF51816m() {
            return this.f58130p;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f58130p = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getE() {
            return this.f58126j;
        }

        @Override // com.revolut.core.ui_kit.models.popup.PopupMenuItem
        /* JADX INFO: renamed from: getIcon, reason: from getter */
        public final Image getF58136c() {
            return this.f58123c;
        }

        public final int hashCode() {
            int iA = p.a.a(this.f58121a.hashCode() * 31, 31, this.f58122b);
            Image image = this.f58123c;
            int iHashCode = (iA + (image == null ? 0 : image.hashCode())) * 31;
            Image image2 = this.d;
            int iHashCode2 = (iHashCode + (image2 == null ? 0 : image2.hashCode())) * 31;
            NewBadgeContent newBadgeContent = this.e;
            int iHashCode3 = (iHashCode2 + (newBadgeContent == null ? 0 : newBadgeContent.hashCode())) * 31;
            Clause clause = this.f;
            int iHashCode4 = (this.f58124g.hashCode() + ((iHashCode3 + (clause == null ? 0 : clause.hashCode())) * 31)) * 31;
            g gVar = this.f58125h;
            int iHashCode5 = (iHashCode4 + (gVar == null ? 0 : gVar.hashCode())) * 31;
            Object obj2 = this.i;
            int iHashCode6 = (iHashCode5 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.f58126j;
            int i = l.i(this.k, (iHashCode6 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31);
            p31.c cVar = this.f58127l;
            int iHashCode7 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f58128m;
            int iHashCode8 = (iHashCode7 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f58129n;
            int iHashCode9 = (iHashCode8 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.o;
            return iHashCode9 + (cVar4 != null ? cVar4.hashCode() : 0);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getI() {
            return this.f58127l;
        }

        @Override // qv0.i
        public final void j(c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.k = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF51814j() {
            return this.f58128m;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f58129n = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF51817n() {
            return this.f58131q;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF51818p() {
            return this.f58133s;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f58131q = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final c getF51812g() {
            return this.k;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF51815l() {
            return this.o;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getK() {
            return this.f58129n;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f58127l = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f58126j = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getO() {
            return this.f58132r;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f58128m = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.o = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Cell cell = oldItem instanceof Cell ? (Cell) oldItem : null;
            if (cell != null) {
                return new k(!Intrinsics.f(cell.f58122b, this.f58122b), !Intrinsics.f(cell.f58123c, this.f58123c), !Intrinsics.f(cell.d, this.d), !Intrinsics.f(cell.e, this.e), !Intrinsics.f(cell.f, this.f), !Intrinsics.f(cell.f58124g, this.f58124g), cell.f58125h != this.f58125h, false, or0.b.l(this, cell));
            }
            return null;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Cell(String listId, Clause title, Image image, Image image2, NewBadgeContent newBadgeContent, Clause clause, j jVar, g gVar, Object obj2, Parcelable parcelable, int i) {
            Image image3 = (i & 4) != 0 ? null : image;
            Image image4 = (i & 8) != 0 ? null : image2;
            NewBadgeContent newBadgeContent2 = (i & 16) != 0 ? null : newBadgeContent;
            Clause clause2 = (i & 32) != 0 ? null : clause;
            j state = (i & 64) != 0 ? mw0.i.f209289a : jVar;
            g gVar2 = (i & 128) != 0 ? null : gVar;
            Object obj3 = (i & 256) != 0 ? null : obj2;
            Parcelable parcelable2 = (i & 512) != 0 ? null : parcelable;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(state, "state");
            this(listId, title, image3, image4, newBadgeContent2, clause2, state, gVar2, obj3, parcelable2, c.d.f249513a, null, null, null, null);
        }
    }
}
