package com.revolut.core.ui_kit.delegates;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.o20;
import ip0.tz;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0005\u0007\b\u0003\t\nB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u000b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/PlanWidgetDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/PlanWidgetDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/bc;", "<init>", "()V", "Companion", "Model", "ip0/o20", "com/revolut/core/ui_kit/delegates/gb", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlanWidgetDelegate extends BaseRecyclerViewDelegate<Model, bc> {

    @NotNull
    private static final a Companion = new a();
    public static final ResourceImage f = new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f52955c;
    public final ihm.f d;
    public final e01.a e;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0006\u0007\b\t\n\u000b\fJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/PlanWidgetDelegate$Model;", "Lqv0/i;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/delegates/pb", "com/revolut/core/ui_kit/delegates/ac", "com/revolut/core/ui_kit/delegates/hb", "com/revolut/core/ui_kit/delegates/tb", "com/revolut/core/ui_kit/delegates/nb", "ActionsGlow", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.i, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52956a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f52957b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f52958c;
        public final tb d;
        public final ac e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final nb f52959g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f52960h;
        public final pb i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final List f52961j;
        public final ActionsGlow k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final hb f52962l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Parcelable f52963m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public qv0.c f52964n;
        public int o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f52965p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final int f52966q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final int f52967r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public p31.c f52968s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public p31.c f52969t;
        public p31.c u;
        public p31.c v;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/PlanWidgetDelegate$Model$ActionsGlow;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ActionsGlow implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<ActionsGlow> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Set f52970a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final AnimationRequest f52971b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    int i = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                    int iA = 0;
                    while (iA != i) {
                        iA = prk.o.a(parcel, linkedHashSet, iA, 1);
                    }
                    return new ActionsGlow(AnimationRequest.CREATOR.createFromParcel(parcel), linkedHashSet);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ActionsGlow[i];
                }
            }

            public ActionsGlow(AnimationRequest animationRequest, Set actionIds) {
                Intrinsics.checkNotNullParameter(actionIds, "actionIds");
                Intrinsics.checkNotNullParameter(animationRequest, "animationRequest");
                this.f52970a = actionIds;
                this.f52971b = animationRequest;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof ActionsGlow)) {
                    return false;
                }
                ActionsGlow actionsGlow = (ActionsGlow) obj2;
                return Intrinsics.f(this.f52970a, actionsGlow.f52970a) && Intrinsics.f(this.f52971b, actionsGlow.f52971b);
            }

            public final int hashCode() {
                return this.f52971b.hashCode() + (this.f52970a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Iterator itV = ehe.n.v(this.f52970a, dest);
                while (itV.hasNext()) {
                    dest.writeString((String) itV.next());
                }
                this.f52971b.writeToParcel(dest, i);
            }
        }

        public Model(String listId, Clause title, Clause subtitle, tb subtitleStyle, ac acVar, mb mbVar, pb pbVar, List actions, ActionsGlow actionsGlow, hb actionsLayout, int i) {
            mbVar = (i & 64) != 0 ? null : mbVar;
            pbVar = (i & 128) != 0 ? null : pbVar;
            actions = (i & 256) != 0 ? zhm.f0.f322471a : actions;
            actionsGlow = (i & 512) != 0 ? null : actionsGlow;
            actionsLayout = (i & 1024) != 0 ? hb.Scrollable : actionsLayout;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(subtitleStyle, "subtitleStyle");
            Intrinsics.checkNotNullParameter(actions, "actions");
            Intrinsics.checkNotNullParameter(actionsLayout, "actionsLayout");
            int i2 = R$attr.uikit_dp0;
            this.f52956a = listId;
            this.f52957b = title;
            this.f52958c = subtitle;
            this.d = subtitleStyle;
            this.e = acVar;
            this.f = true;
            this.f52959g = mbVar;
            this.f52960h = "profileScreen-planItem";
            this.i = pbVar;
            this.f52961j = actions;
            this.k = actionsGlow;
            this.f52962l = actionsLayout;
            this.f52963m = null;
            this.f52964n = c.d.f249513a;
            this.o = i2;
            this.f52965p = i2;
            this.f52966q = i2;
            this.f52967r = i2;
            this.f52968s = null;
            this.f52969t = null;
            this.u = null;
            this.v = null;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new PlanWidgetDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getF53564b() {
            return null;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF53563a() {
            return this.f52956a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f52956a, model.f52956a) && Intrinsics.f(this.f52957b, model.f52957b) && Intrinsics.f(this.f52958c, model.f52958c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && this.f == model.f && Intrinsics.f(this.f52959g, model.f52959g) && Intrinsics.f(this.f52960h, model.f52960h) && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f52961j, model.f52961j) && Intrinsics.f(this.k, model.k) && this.f52962l == model.f52962l && Intrinsics.f(this.f52963m, model.f52963m) && Intrinsics.f(this.f52964n, model.f52964n) && this.o == model.o && this.f52965p == model.f52965p && this.f52966q == model.f52966q && this.f52967r == model.f52967r && Intrinsics.f(this.f52968s, model.f52968s) && Intrinsics.f(this.f52969t, model.f52969t) && Intrinsics.f(this.u, model.u) && Intrinsics.f(this.v, model.v);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF53567h() {
            return this.o;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.o = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF() {
            return this.f52963m;
        }

        public final int hashCode() {
            int iHashCode = (this.d.hashCode() + p.a.b(p.a.b(this.f52956a.hashCode() * 31, 31, this.f52957b), 31, this.f52958c)) * 31;
            ac acVar = this.e;
            int iC = j6.a.c((iHashCode + (acVar == null ? 0 : acVar.hashCode())) * 31, 31, this.f);
            nb nbVar = this.f52959g;
            int iHashCode2 = (iC + (nbVar == null ? 0 : nbVar.hashCode())) * 31;
            String str = this.f52960h;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            pb pbVar = this.i;
            int iD = p.a.d((iHashCode3 + (pbVar == null ? 0 : pbVar.hashCode())) * 31, 31, this.f52961j);
            ActionsGlow actionsGlow = this.k;
            int iHashCode4 = (this.f52962l.hashCode() + ((iD + (actionsGlow == null ? 0 : actionsGlow.hashCode())) * 31)) * 961;
            Parcelable parcelable = this.f52963m;
            int iB = j6.a.b(this.f52967r, j6.a.b(this.f52966q, j6.a.b(this.f52965p, j6.a.b(this.o, h30.l.i(this.f52964n, (iHashCode4 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31), 31), 31), 31), 31);
            p31.c cVar = this.f52968s;
            int iHashCode5 = (iB + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f52969t;
            int iHashCode6 = (iHashCode5 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.u;
            int iHashCode7 = (iHashCode6 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.v;
            return iHashCode7 + (cVar4 != null ? cVar4.hashCode() : 0);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF53569l() {
            return this.f52968s;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f52964n = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF53570m() {
            return this.f52969t;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.u = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getI() {
            return this.f52965p;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getK() {
            return this.f52967r;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f52965p = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF53566g() {
            return this.f52964n;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getO() {
            return this.v;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF53571n() {
            return this.u;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f52968s = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f52963m = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF53568j() {
            return this.f52966q;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f52969t = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.v = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            return new o20(!Intrinsics.f(r0.f52957b, this.f52957b), !Intrinsics.f(r0.f52958c, this.f52958c), !Intrinsics.f(r0.d, this.d), !Intrinsics.f(r0.e, this.e), or0.b.l(this, (qv0.i) oldItem), !Intrinsics.f(r0.f52959g, this.f52959g), !Intrinsics.f(r0.f52960h, this.f52960h), !Intrinsics.f(r0.i, this.i), !Intrinsics.f(r0.f52961j, this.f52961j), !Intrinsics.f(r0.k, this.k), ((Model) oldItem).f52962l != this.f52962l);
        }
    }

    public static final class a {
        private a() {
        }
    }

    public PlanWidgetDelegate() {
        super(R$layout.internal_delegate_plan_widget, new tz(19));
        this.f52955c = v0.a.d("create(...)");
        this.d = v0.a.d("create(...)");
        this.e = new e01.a();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new bc(kotlin.jvm.internal.s.r(parent, this.f98535a));
    }

    public final void q(ms0.h4 h4Var, bc bcVar) {
        or0.b.i(this, null, bcVar.i, null);
        SmallActionButton smallActionButton = bcVar.f53722j;
        smallActionButton.i(h4Var);
        smallActionButton.setIcon(new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        smallActionButton.setVisibility(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x0260  */
    /* JADX WARN: Type inference failed for: r0v60, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r3v7, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v25, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(com.revolut.core.ui_kit.delegates.bc r33, com.revolut.core.ui_kit.delegates.PlanWidgetDelegate.Model r34, int r35, java.util.List r36) {
        /*
            Method dump skipped, instruction units count: 870
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.delegates.PlanWidgetDelegate.p(com.revolut.core.ui_kit.delegates.bc, com.revolut.core.ui_kit.delegates.PlanWidgetDelegate$Model, int, java.util.List):void");
    }
}
