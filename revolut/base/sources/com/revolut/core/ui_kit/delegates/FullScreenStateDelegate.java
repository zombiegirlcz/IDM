package com.revolut.core.ui_kit.delegates;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.recycler.BaseGroupRecyclerViewDelegate;
import com.revolut.core.ui_kit.views.FullScreenStateView;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.ak;
import ip0.bk;
import ip0.ck;
import ip0.yj;
import ip0.zj;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0005\u0006\u0003\u0007\b\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/FullScreenStateDelegate;", "Lcom/revolut/core/ui_kit/recycler/BaseGroupRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/FullScreenStateDelegate$Model;", "Lip0/bk;", "<init>", "()V", "Model", "ip0/ak", "ip0/zj", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FullScreenStateDelegate extends BaseGroupRecyclerViewDelegate<Model, bk> {
    public final ihm.f d;
    public final ihm.f e;
    public final e01.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e01.a f52370g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e01.a f52371h;
    public final e01.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e01.a f52372j;

    public static abstract class a {
        private a() {
        }
    }

    public FullScreenStateDelegate() {
        super(R$layout.internal_delegate_full_screen_state, new ip0.zf(29));
        this.d = v0.a.d("create(...)");
        this.e = v0.a.d("create(...)");
        this.f = new e01.a();
        this.f52370g = new e01.a();
        this.f52371h = new e01.a();
        this.i = new e01.a();
        this.f52372j = new e01.a();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new bk(kotlin.jvm.internal.s.r(parent, this.f58165c));
    }

    @Override // com.revolut.core.ui_kit.recycler.BaseGroupRecyclerViewDelegate
    public final void q(koi.b bVar, qv0.l lVar, int i, List list) {
        View.OnClickListener onClickListener;
        mx0.i1 i1Var;
        List payloads = list;
        bk holder = (bk) bVar;
        Model data = (Model) lVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.q(holder, data, i, payloads);
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                if (!(payloads instanceof List)) {
                    break;
                }
            } else if (!(payloads.get(i2) instanceof ak)) {
                break;
            } else {
                i2++;
            }
        }
        payloads = null;
        if (payloads == null) {
            payloads = zhm.f0.f322471a;
        }
        boolean zIsEmpty = payloads.isEmpty();
        int size2 = payloads.size();
        boolean z = zIsEmpty;
        boolean z3 = z;
        boolean z4 = z3;
        boolean z6 = z4;
        boolean z11 = z6;
        boolean z12 = z11;
        boolean z29 = z12;
        for (int i3 = 0; i3 < size2; i3++) {
            ak akVar = (ak) payloads.get(i3);
            z = z || akVar.f163460a;
            zIsEmpty = zIsEmpty || akVar.f163461b;
            z4 = z4 || akVar.f163462c;
            z6 = z6 || akVar.d;
            z11 = z11 || akVar.e;
            z12 = z12 || akVar.f163463g;
            z29 = z29 || akVar.f163464h;
            z3 = z3 || akVar.i;
        }
        FullScreenStateView fullScreenStateView = holder.f;
        Parcelable parcelable = data.f52379l;
        zj zjVar = data.f;
        ComplexImage complexImage = data.e;
        fullScreenStateView.setAnalyticsContext(parcelable);
        fullScreenStateView.getSmallActionButton().setAnalyticsContext(data.f52379l);
        fullScreenStateView.getPrimaryLargeActionButton().setAnalyticsContext(data.f52379l);
        fullScreenStateView.getSecondaryLargeActionButton().setAnalyticsContext(data.f52379l);
        fullScreenStateView.getHorizontalButtons().setPrimaryButtonAnalyticsContext(data.f52379l);
        fullScreenStateView.getHorizontalButtons().setSecondaryButtonAnalyticsContext(data.f52379l);
        if (zIsEmpty) {
            fullScreenStateView.setTitleStyle(data.f52375c);
        }
        if (z3 || zIsEmpty) {
            fullScreenStateView.setContentEnabled(data.f52378j);
        }
        if (z) {
            fullScreenStateView.setTitleText(data.f52374b);
        }
        if (z4) {
            fullScreenStateView.setCaptionText(data.d, new q6(1, 0, ihm.f.class, this.d, "onNext", "onNext(Ljava/lang/Object;)V"));
        }
        if (z6) {
            fullScreenStateView.setMainAction(data.f52377h);
        }
        if (!z11 && (!z12 || !(complexImage instanceof ComplexImage.Avatar))) {
            onClickListener = null;
        } else if (complexImage instanceof ComplexImage.Avatar) {
            ComplexImage.Avatar avatar = (ComplexImage.Avatar) complexImage;
            int i5 = ck.f163752a[zjVar.ordinal()];
            if (i5 == 1) {
                i1Var = mx0.i1.SIZE_56_56;
            } else if (i5 == 2) {
                i1Var = mx0.i1.SIZE_72_72;
            } else if (i5 == 3) {
                i1Var = mx0.i1.SIZE_100_100;
            } else {
                if (i5 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                i1Var = mx0.i1.SIZE_80_80;
            }
            fullScreenStateView.setAvatarImage$ui_kit_components_release(avatar, i1Var);
            onClickListener = null;
        } else {
            onClickListener = null;
            FullScreenStateView.setImage$default(fullScreenStateView, complexImage, null, 2, null);
        }
        if (data.f52376g) {
            fullScreenStateView.setImageClickListener$ui_kit_components_release(complexImage, new ap0.f(this, data, 27));
        } else {
            fullScreenStateView.setImageClickListener$ui_kit_components_release(complexImage, onClickListener);
        }
        if (z12) {
            fullScreenStateView.setImageSize(zjVar.c(), zjVar.a());
            fullScreenStateView.setImagePaddings(zjVar.b());
        }
        if (z29) {
            fullScreenStateView.setFitHeight(data.i);
        }
        efm.r map = fullScreenStateView.getSmallActionButton().f56386h.map(new ip0.qh(10, new yj(data, 0)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        this.f52371h.a(map, holder);
        efm.r map2 = fullScreenStateView.getPrimaryLargeActionButton().o.map(new ip0.qh(11, new yj(data, 1)));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        this.f.a(map2, holder);
        efm.r map3 = fullScreenStateView.getSecondaryLargeActionButton().o.map(new ip0.qh(12, new yj(data, 2)));
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        this.f52370g.a(map3, holder);
        efm.r map4 = fullScreenStateView.getHorizontalButtons().primaryActionButton.f56386h.map(new ip0.qh(13, new yj(data, 3)));
        Intrinsics.checkNotNullExpressionValue(map4, "map(...)");
        this.i.a(map4, holder);
        efm.r map5 = fullScreenStateView.getHorizontalButtons().secondaryActionButton.f56386h.map(new ip0.qh(9, new yj(data, 4)));
        Intrinsics.checkNotNullExpressionValue(map5, "map(...)");
        this.f52372j.a(map5, holder);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\bJ\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/FullScreenStateDelegate$Model;", "Lqv0/l;", "Lo31/c;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/delegates/p6", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.l, o31.c, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52373a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f52374b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final p6 f52375c;
        public final Clause d;
        public final ComplexImage e;
        public final zj f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f52376g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final a f52377h;
        public final boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f52378j;
        public final Object k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Parcelable f52379l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public qv0.c f52380m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public p31.c f52381n;
        public p31.c o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p31.c f52382p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p31.c f52383q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f52384r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f52385s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f52386t;
        public int u;
        public qv0.k v;

        public Model(String str, Clause clause, p6 p6Var, Clause clause2, ComplexImage complexImage, zj zjVar, boolean z, a aVar, boolean z3, boolean z4, Object obj2, Parcelable parcelable, qv0.c cVar, p31.c cVar2, p31.c cVar3, p31.c cVar4, p31.c cVar5, int i, int i2, int i3, int i5, qv0.k kVar) {
            this.f52373a = str;
            this.f52374b = clause;
            this.f52375c = p6Var;
            this.d = clause2;
            this.e = complexImage;
            this.f = zjVar;
            this.f52376g = z;
            this.f52377h = aVar;
            this.i = z3;
            this.f52378j = z4;
            this.k = obj2;
            this.f52379l = parcelable;
            this.f52380m = cVar;
            this.f52381n = cVar2;
            this.o = cVar3;
            this.f52382p = cVar4;
            this.f52383q = cVar5;
            this.f52384r = i;
            this.f52385s = i2;
            this.f52386t = i3;
            this.u = i5;
            this.v = kVar;
        }

        public static Model e(Model model, zj zjVar, int i) {
            String listId = model.f52373a;
            Clause clause = model.f52374b;
            p6 titleStyle = model.f52375c;
            Clause clause2 = model.d;
            ComplexImage complexImage = model.e;
            zj imageSize = (i & 32) != 0 ? model.f : zjVar;
            boolean z = model.f52376g;
            a aVar = model.f52377h;
            boolean z3 = model.i;
            boolean z4 = model.f52378j;
            Object obj2 = model.k;
            Parcelable parcelable = model.f52379l;
            qv0.c positionInBox = model.f52380m;
            p31.c cVar = model.f52381n;
            p31.c cVar2 = model.o;
            p31.c cVar3 = model.f52382p;
            p31.c cVar4 = model.f52383q;
            int i2 = model.f52384r;
            int i3 = model.f52385s;
            int i5 = model.f52386t;
            int i6 = model.u;
            qv0.k positionInGroup = model.v;
            model.getClass();
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(titleStyle, "titleStyle");
            Intrinsics.checkNotNullParameter(imageSize, "imageSize");
            Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
            Intrinsics.checkNotNullParameter(positionInGroup, "positionInGroup");
            return new Model(listId, clause, titleStyle, clause2, complexImage, imageSize, z, aVar, z3, z4, obj2, parcelable, positionInBox, cVar, cVar2, cVar3, cVar4, i2, i3, i5, i6, positionInGroup);
        }

        @Override // qv0.l
        /* JADX INFO: renamed from: C1 */
        public final boolean getF52234l() {
            return false;
        }

        @Override // qv0.l
        public final void R0(qv0.k kVar) {
            Intrinsics.checkNotNullParameter(kVar, "<set-?>");
            this.v = kVar;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new FullScreenStateDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF53195h() {
            return this.k;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF53191a() {
            return this.f52373a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f52373a, model.f52373a) && Intrinsics.f(this.f52374b, model.f52374b) && this.f52375c == model.f52375c && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && this.f == model.f && this.f52376g == model.f52376g && Intrinsics.f(this.f52377h, model.f52377h) && this.i == model.i && this.f52378j == model.f52378j && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f52379l, model.f52379l) && Intrinsics.f(this.f52380m, model.f52380m) && Intrinsics.f(this.f52381n, model.f52381n) && Intrinsics.f(this.o, model.o) && Intrinsics.f(this.f52382p, model.f52382p) && Intrinsics.f(this.f52383q, model.f52383q) && this.f52384r == model.f52384r && this.f52385s == model.f52385s && this.f52386t == model.f52386t && this.u == model.u && this.v == model.v;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getU() {
            return this.f52384r;
        }

        @Override // qv0.l
        /* JADX INFO: renamed from: f0, reason: from getter */
        public final qv0.k getO() {
            return this.v;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f52384r = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getI() {
            return this.f52379l;
        }

        public final int hashCode() {
            int iHashCode = this.f52373a.hashCode() * 31;
            Clause clause = this.f52374b;
            int iHashCode2 = (this.f52375c.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31)) * 31;
            Clause clause2 = this.d;
            int iHashCode3 = (iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
            ComplexImage complexImage = this.e;
            int iC = j6.a.c((this.f.hashCode() + ((iHashCode3 + (complexImage == null ? 0 : complexImage.hashCode())) * 31)) * 31, 31, this.f52376g);
            a aVar = this.f52377h;
            int iC2 = j6.a.c(j6.a.c((iC + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.i), 31, this.f52378j);
            Object obj2 = this.k;
            int iHashCode4 = (iC2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.f52379l;
            int i = h30.l.i(this.f52380m, (iHashCode4 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31);
            p31.c cVar = this.f52381n;
            int iHashCode5 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.o;
            int iHashCode6 = (iHashCode5 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f52382p;
            int iHashCode7 = (iHashCode6 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f52383q;
            return this.v.hashCode() + j6.a.b(this.u, j6.a.b(this.f52386t, j6.a.b(this.f52385s, j6.a.b(this.f52384r, (iHashCode7 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31), 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF52718q() {
            return this.f52381n;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f52380m = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF52719r() {
            return this.o;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f52382p = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getV() {
            return this.f52385s;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF52723x() {
            return this.u;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f52385s = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF52717p() {
            return this.f52380m;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF52721t() {
            return this.f52383q;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF52720s() {
            return this.f52382p;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f52381n = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f52379l = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF52722w() {
            return this.f52386t;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.o = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f52383q = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            boolean z;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if (!(oldItem instanceof Model)) {
                return null;
            }
            Model model = (Model) oldItem;
            boolean z3 = !Intrinsics.f(model.f52374b, this.f52374b);
            boolean z4 = false;
            if (model.f52375c != this.f52375c) {
                z = false;
                z4 = true;
            } else {
                z = false;
            }
            return new ak(z3, z4, !Intrinsics.f(model.d, this.d), !Intrinsics.f(model.f52377h, this.f52377h), !Intrinsics.f(model.e, this.e), model.f52376g != this.f52376g ? true : z, model.f != this.f ? true : z, model.i != this.i ? true : z, model.f52378j != this.f52378j ? true : z, or0.b.m(this, (qv0.l) oldItem));
        }

        public /* synthetic */ Model(String str, Clause clause, p6 p6Var, Clause clause2, ComplexImage complexImage, zj zjVar, boolean z, a aVar, boolean z3, Object obj2, Parcelable parcelable, int i, int i2, int i3, int i5, int i6) {
            this(str, clause, p6Var, clause2, complexImage, zjVar, z, aVar, z3, true, obj2, (i6 & 2048) != 0 ? null : parcelable, c.d.f249513a, null, null, null, null, i, (262144 & i6) != 0 ? R$attr.uikit_dp24 : i2, (524288 & i6) != 0 ? R$attr.uikit_dp16 : i3, (i6 & PKIFailureInfo.badCertTemplate) != 0 ? R$attr.uikit_dp16 : i5, qv0.k.OutOfGroup);
        }

        public Model(String listId, Clause clause, Clause clause2, ComplexImage complexImage, zj zjVar, Clause clause3, boolean z, Integer num, Object obj2, boolean z3, int i, int i2, int i3) {
            l6 l6Var;
            Clause clause4 = (i3 & 2) != 0 ? null : clause;
            Clause clause5 = (i3 & 4) != 0 ? null : clause2;
            ComplexImage complexImage2 = (i3 & 8) != 0 ? null : complexImage;
            zj imageSize = (i3 & 16) != 0 ? zj.REGULAR : zjVar;
            Clause clause6 = (i3 & 32) != 0 ? null : clause3;
            boolean z4 = (i3 & 64) != 0 ? false : z;
            Integer num2 = (i3 & 128) != 0 ? null : num;
            Object obj3 = (i3 & 512) != 0 ? null : obj2;
            boolean z6 = (i3 & 1024) != 0 ? false : z3;
            int i5 = (i3 & 2048) != 0 ? R$attr.uikit_dp16 : i;
            int i6 = (i3 & 4096) != 0 ? R$attr.uikit_dp24 : i2;
            int i21 = R$attr.uikit_dp16;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(imageSize, "imageSize");
            p6 p6Var = p6.EMPHASIS1;
            if (clause6 != null) {
                l6Var = new l6(8, clause6, num2 != null ? new ResourceImage(num2.intValue(), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : null, ms0.h4.ACCENT);
            } else {
                l6Var = null;
            }
            this(listId, clause4, p6Var, clause5, complexImage2, imageSize, z4, l6Var, z6, obj3, null, i5, i6, i21, i21, 2226688);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, Clause clause, Clause clause2, ComplexImage complexImage, a aVar, zj zjVar, boolean z, Object obj2, AnalyticsContext analyticsContext, p6 p6Var, int i) {
            Clause clause3 = (i & 2) != 0 ? null : clause;
            Clause clause4 = (i & 4) != 0 ? null : clause2;
            ComplexImage complexImage2 = (i & 8) != 0 ? null : complexImage;
            zj imageSize = (i & 32) != 0 ? zj.REGULAR : zjVar;
            boolean z3 = (i & 128) != 0 ? false : z;
            Object obj3 = (i & 256) != 0 ? null : obj2;
            AnalyticsContext analyticsContext2 = (i & 512) != 0 ? null : analyticsContext;
            p6 titleStyle = (i & 1024) != 0 ? p6.EMPHASIS1 : p6Var;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(imageSize, "imageSize");
            Intrinsics.checkNotNullParameter(titleStyle, "titleStyle");
            this(listId, clause3, titleStyle, clause4, complexImage2, imageSize, false, aVar, z3, obj3, analyticsContext2, R$attr.uikit_dp16, 0, 0, 0, 4059648);
        }
    }
}
