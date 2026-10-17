package com.revolut.core.ui_kit.delegates;

import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.media.Media;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import com.youTransactor.uCube.rpc.Constants;
import ip0.k20;
import ip0.tz;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0004\u0003\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/PlanTileDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/PlanTileDelegate$Model;", "Lip0/k20;", "Model", "ip0/j20", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlanTileDelegate extends BaseRecyclerViewDelegate<Model, k20> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f52942c;
    public final ihm.f d;
    public final ihm.f e;
    public final xt0.a f;

    public PlanTileDelegate() {
        this(0);
    }

    public static Clause q(Clause clause, Integer num, aw0.db dbVar) {
        Custom custom;
        aw0.fa faVar = clause instanceof aw0.fa ? (aw0.fa) clause : null;
        Style f = faVar != null ? faVar.getF57837c() : null;
        Custom custom2 = f instanceof Custom ? (Custom) f : null;
        Clause clause2 = clause instanceof Clause ? clause : null;
        if (clause2 == null) {
            return clause;
        }
        List listC = zhm.u.c(clause2);
        if (custom2 != null) {
            Custom.Color solid = custom2.f57757a;
            if (solid == null) {
                solid = num != null ? new Custom.Color.Solid(num.intValue()) : null;
            }
            custom = Custom.a(custom2, solid, dbVar, Constants.TAG_SUPPORTED_LOCALE_LIST);
        } else {
            custom = new Custom(num, false, dbVar, false, null, Constants.TAG_SUPPORTED_LOCALE_LIST);
        }
        return new CompositeClause(listC, null, custom, null, 10);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new k20(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_plan_tile));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:278:0x05f4  */
    /* JADX WARN: Type inference failed for: r0v125, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v140, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v157 */
    /* JADX WARN: Type inference failed for: r0v158 */
    /* JADX WARN: Type inference failed for: r0v159 */
    /* JADX WARN: Type inference failed for: r0v33, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(ip0.k20 r38, com.revolut.core.ui_kit.delegates.PlanTileDelegate.Model r39, int r40, java.util.List r41) {
        /*
            Method dump skipped, instruction units count: 1745
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.delegates.PlanTileDelegate.p(ip0.k20, com.revolut.core.ui_kit.delegates.PlanTileDelegate$Model, int, java.util.List):void");
    }

    public PlanTileDelegate(int i) {
        super(R$layout.internal_delegate_plan_tile, new tz(17));
        this.f52942c = v0.a.d("create(...)");
        this.d = v0.a.d("create(...)");
        this.e = v0.a.d("create(...)");
        this.f = null;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u0007\b\t\nJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/PlanTileDelegate$Model;", "Lqv0/i;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/delegates/cb", "com/revolut/core/ui_kit/delegates/fb", "com/revolut/core/ui_kit/delegates/ya", "com/revolut/core/ui_kit/delegates/va", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.i, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52943a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final cb f52944b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TagViewData f52945c;
        public final Media d;
        public final boolean e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Object f52946g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Parcelable f52947h;
        public int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f52948j;
        public final int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f52949l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final va f52950m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public qv0.c f52951n;
        public p31.c o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p31.c f52952p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p31.c f52953q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p31.c f52954r;

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, fb title, ya subtitle, Clause clause, TagViewData tagViewData, Media media, int i) {
            Clause clause2 = (i & 16) != 0 ? null : clause;
            TagViewData tagViewData2 = (i & 32) != 0 ? null : tagViewData;
            Media media2 = (i & 64) != 0 ? null : media;
            boolean z = (i & 128) == 0;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            this(listId, new ab(title, subtitle, clause2), tagViewData2, media2, z, false, null, null, 3840);
        }

        @Override // koi.j
        public final koi.k T1() {
            return new PlanTileDelegate(0);
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF53559c() {
            return this.f52946g;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF53557a() {
            return this.f52943a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f52943a, model.f52943a) && Intrinsics.f(this.f52944b, model.f52944b) && Intrinsics.f(this.f52945c, model.f52945c) && Intrinsics.f(this.d, model.d) && this.e == model.e && this.f == model.f && Intrinsics.f(this.f52946g, model.f52946g) && Intrinsics.f(this.f52947h, model.f52947h) && this.i == model.i && this.f52948j == model.f52948j && this.k == model.k && this.f52949l == model.f52949l;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF52479r() {
            return this.i;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.i = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getD() {
            return this.f52947h;
        }

        public final int hashCode() {
            int iHashCode = (this.f52944b.hashCode() + (this.f52943a.hashCode() * 31)) * 31;
            TagViewData tagViewData = this.f52945c;
            int iHashCode2 = (iHashCode + (tagViewData == null ? 0 : tagViewData.hashCode())) * 31;
            Media media = this.d;
            int iC = j6.a.c(j6.a.c((iHashCode2 + (media == null ? 0 : media.hashCode())) * 31, 31, this.e), 31, this.f);
            Object obj2 = this.f52946g;
            int iHashCode3 = (iC + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.f52947h;
            return Integer.hashCode(this.f52949l) + j6.a.b(this.k, j6.a.b(this.f52948j, j6.a.b(this.i, (iHashCode3 + (parcelable != null ? parcelable.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF52476n() {
            return this.o;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f52951n = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getO() {
            return this.f52952p;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f52953q = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF52480s() {
            return this.f52948j;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getU() {
            return this.f52949l;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f52948j = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF52475m() {
            return this.f52951n;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF52478q() {
            return this.f52954r;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF52477p() {
            return this.f52953q;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.o = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f52947h = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF52481t() {
            return this.k;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f52952p = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f52954r = cVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00a7  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00c1  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0129  */
        @Override // koi.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object z(java.lang.Object r22) {
            /*
                Method dump skipped, instruction units count: 355
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.delegates.PlanTileDelegate.Model.z(java.lang.Object):java.lang.Object");
        }

        public Model(String listId, cb textModel, TagViewData tagViewData, Media media, boolean z, boolean z3, Object obj2, AnalyticsContext analyticsContext, int i) {
            tagViewData = (i & 4) != 0 ? null : tagViewData;
            media = (i & 8) != 0 ? null : media;
            z = (i & 16) != 0 ? false : z;
            z3 = (i & 32) != 0 ? false : z3;
            obj2 = (i & 64) != 0 ? null : obj2;
            analyticsContext = (i & 128) != 0 ? null : analyticsContext;
            int i2 = R$attr.uikit_dp0;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(textModel, "textModel");
            this.f52943a = listId;
            this.f52944b = textModel;
            this.f52945c = tagViewData;
            this.d = media;
            this.e = z;
            this.f = z3;
            this.f52946g = obj2;
            this.f52947h = analyticsContext;
            this.i = i2;
            this.f52948j = i2;
            this.k = i2;
            this.f52949l = i2;
            this.f52950m = media != null ? ta.f54762a : ua.f54826a;
            this.f52951n = c.d.f249513a;
        }
    }
}
