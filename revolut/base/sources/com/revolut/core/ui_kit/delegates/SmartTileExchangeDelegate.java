package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import aw0.l1;
import com.facebook.shimmer.ShimmerConstraintLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.chart.LineChartView;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.amount.AmountEditView;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.e30;
import ip0.eg0;
import ip0.fg0;
import ip0.gg0;
import ip0.hg0;
import ip0.ig0;
import ip0.je0;
import ip0.jg0;
import ip0.kg0;
import ip0.kt;
import ip0.lg0;
import ip0.mg0;
import ip0.ng0;
import ip0.og0;
import ip0.w10;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00042\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\t\u0003\u0005\u0006\u0007\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/SmartTileExchangeDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/SmartTileExchangeDelegate$Model;", "Lip0/ng0;", "Companion", "Model", "ip0/lg0", "com/revolut/core/ui_kit/delegates/yg", "com/revolut/core/ui_kit/delegates/zg", "ip0/gg0", "ip0/kg0", "ip0/mg0", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SmartTileExchangeDelegate extends BaseRecyclerViewDelegate<Model, ng0> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List f53419g = zhm.v.k(new aw0.y6(BitmapDescriptorFactory.HUE_RED, 100.0f), new aw0.y6(1000.0f, 100.0f));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final aw0.b7 f53420h = new aw0.b7(zhm.v.k(new aw0.t6(BitmapDescriptorFactory.HUE_RED, new TextClause("", (Style) null, (Integer) null, false, (aw0.o9) null, (List) null, 126)), new aw0.t6(150.0f, new TextClause("", (Style) null, (Integer) null, false, (aw0.o9) null, (List) null, 126))));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function3 f53421c;
    public final e01.a d;
    public final e01.a e;
    public final ihm.f f;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/SmartTileExchangeDelegate$Model;", "Lqv0/i;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Lqv0/p;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.i, TrackableItem, qv0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f53422a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final gg0 f53423b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final gg0 f53424c;
        public final LargeActionButton.ButtonStyle.DefaultFilledButton d;
        public final TextLocalisedClause e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final kg0 f53425g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public qv0.c f53426h;
        public p31.c i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public p31.c f53427j;
        public p31.c k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public p31.c f53428l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f53429m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f53430n;
        public final int o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f53431p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final o97.y f53432q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Parcelable f53433r;

        public Model(gg0 topAmountData, gg0 bottomAmountData, TextLocalisedClause buttonText, boolean z, kg0 chartData, o97.y yVar) {
            LargeActionButton.ButtonStyle.DefaultFilledButton buttonStyle = LargeActionButton.ButtonStyle.f58726b;
            Intrinsics.checkNotNullParameter("EXCHANGE_TILE_ID", "listId");
            Intrinsics.checkNotNullParameter(topAmountData, "topAmountData");
            Intrinsics.checkNotNullParameter(bottomAmountData, "bottomAmountData");
            Intrinsics.checkNotNullParameter(buttonText, "buttonText");
            Intrinsics.checkNotNullParameter(buttonStyle, "buttonStyle");
            Intrinsics.checkNotNullParameter(chartData, "chartData");
            int i = R$attr.uikit_dp0;
            this.f53422a = "EXCHANGE_TILE_ID";
            this.f53423b = topAmountData;
            this.f53424c = bottomAmountData;
            this.d = buttonStyle;
            this.e = buttonText;
            this.f = z;
            this.f53425g = chartData;
            this.f53426h = c.d.f249513a;
            this.i = null;
            this.f53427j = null;
            this.k = null;
            this.f53428l = null;
            this.f53429m = i;
            this.f53430n = i;
            this.o = i;
            this.f53431p = i;
            this.f53432q = yVar;
            this.f53433r = null;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new SmartTileExchangeDelegate(null);
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getF55231n() {
            return this.f53432q;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getE() {
            return this.f53422a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f53422a, model.f53422a) && Intrinsics.f(this.f53423b, model.f53423b) && Intrinsics.f(this.f53424c, model.f53424c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && this.f == model.f && Intrinsics.f(this.f53425g, model.f53425g) && Intrinsics.f(this.f53426h, model.f53426h) && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f53427j, model.f53427j) && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f53428l, model.f53428l) && this.f53429m == model.f53429m && this.f53430n == model.f53430n && this.o == model.o && this.f53431p == model.f53431p && Intrinsics.f(this.f53432q, model.f53432q) && Intrinsics.f(this.f53433r, model.f53433r);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF53429m() {
            return this.f53429m;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f53429m = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getI() {
            return this.f53433r;
        }

        public final int hashCode() {
            int i = h30.l.i(this.f53426h, (this.f53425g.hashCode() + j6.a.c(t61.a.a((this.d.hashCode() + ((this.f53424c.hashCode() + ((this.f53423b.hashCode() + (this.f53422a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e), 31, this.f)) * 31, 31);
            p31.c cVar = this.i;
            int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f53427j;
            int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.k;
            int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f53428l;
            int iB = j6.a.b(this.f53431p, j6.a.b(this.o, j6.a.b(this.f53430n, j6.a.b(this.f53429m, (iHashCode3 + (cVar4 == null ? 0 : cVar4.hashCode())) * 31, 31), 31), 31), 31);
            o97.y yVar = this.f53432q;
            int iHashCode4 = (iB + (yVar == null ? 0 : yVar.hashCode())) * 31;
            Parcelable parcelable = this.f53433r;
            return iHashCode4 + (parcelable != null ? parcelable.hashCode() : 0);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getI() {
            return this.i;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f53426h = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF53427j() {
            return this.f53427j;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.k = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF53430n() {
            return this.f53430n;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF53431p() {
            return this.f53431p;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f53430n = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF53426h() {
            return this.f53426h;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF53428l() {
            return this.f53428l;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getK() {
            return this.k;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.i = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f53433r = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getO() {
            return this.o;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f53427j = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f53428l = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            return new mg0(or0.b.l(this, (qv0.i) oldItem), !Intrinsics.f(r10.f53423b, this.f53423b), !Intrinsics.f(r10.f53424c, this.f53424c), !Intrinsics.f(r10.d, this.d), !Intrinsics.f(r10.e, this.e), ((Model) oldItem).f != this.f, !Intrinsics.f(r10.f53425g, this.f53425g));
        }
    }

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.SmartTileExchangeDelegate$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public SmartTileExchangeDelegate() {
        this(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void p(ip0.ng0 r22, ip0.gg0 r23, ip0.lg0 r24) {
        /*
            r0 = r22
            r1 = r23
            int r2 = r1.f164419g
            int[] r3 = ip0.og0.f165663a
            int r4 = r24.ordinal()
            r3 = r3[r4]
            r4 = 0
            r5 = 0
            r6 = 1
            if (r3 == r6) goto L38
            r7 = 2
            if (r3 != r7) goto L32
            com.revolut.core.ui_kit.views.amount.AmountEditView r3 = r0.f165508g
            android.text.InputFilter$LengthFilter r7 = r0.f165514p
            if (r7 == 0) goto L27
            int r8 = r7.getMax()
            if (r8 != r2) goto L23
            goto L24
        L23:
            r7 = r5
        L24:
            if (r7 == 0) goto L27
            goto L53
        L27:
            android.text.InputFilter$LengthFilter r7 = new android.text.InputFilter$LengthFilter
            if (r2 >= 0) goto L2c
            r2 = r4
        L2c:
            r7.<init>(r2)
            r0.f165514p = r7
            goto L53
        L32:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L38:
            com.revolut.core.ui_kit.views.amount.AmountEditView r3 = r0.f
            android.text.InputFilter$LengthFilter r7 = r0.o
            if (r7 == 0) goto L49
            int r8 = r7.getMax()
            if (r8 != r2) goto L45
            goto L46
        L45:
            r7 = r5
        L46:
            if (r7 == 0) goto L49
            goto L53
        L49:
            android.text.InputFilter$LengthFilter r7 = new android.text.InputFilter$LengthFilter
            if (r2 >= 0) goto L4e
            r2 = r4
        L4e:
            r7.<init>(r2)
            r0.o = r7
        L53:
            com.revolut.core.ui_kit.models.CurrencyClause r0 = r1.f164417b
            r3.setAmountType(r0)
            nx0.e r0 = nx0.e.NONE
            r3.setChevron(r0)
            com.revolut.core.ui_kit.models.AnimationRequest r0 = r1.f
            if (r0 == 0) goto L6c
            boolean r2 = r0.f57724a
            if (r2 == 0) goto L66
            goto L6c
        L66:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.f57724a = r6
            r14 = r2
            goto L6d
        L6c:
            r14 = r5
        L6d:
            java.lang.String r9 = r1.d
            java.lang.String r10 = r1.f164418c
            java.util.List r13 = zhm.u.c(r7)
            bw0.h r8 = new bw0.h
            r20 = 0
            r21 = 32708(0x7fc4, float:4.5834E-41)
            r11 = 0
            r12 = 1
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r3.setAmountInput(r8)
            bw0.n r0 = bw0.n.START
            r3.setHint(r5, r0)
            bw0.n r0 = bw0.n.END
            r3.setHint(r5, r0)
            com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage r0 = r1.e
            r3.setAmountTypeImage(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.delegates.SmartTileExchangeDelegate.p(ip0.ng0, ip0.gg0, ip0.lg0):void");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ng0(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_smart_tile_exchange));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void p(ng0 holder, Model data, int i, List list) {
        nx0.f fVar;
        boolean z;
        boolean z3;
        boolean z4;
        boolean z6;
        boolean z11;
        boolean z12;
        boolean z29;
        Model model;
        jg0 jg0Var;
        ig0 ig0Var;
        e01.a aVar;
        AmountEditView amountEditView;
        ShimmerConstraintLayout shimmerConstraintLayout;
        String str;
        AmountEditView amountEditView2;
        String str2;
        SmartTileExchangeDelegate smartTileExchangeDelegate;
        boolean z31;
        AmountEditView amountEditView3;
        AmountEditView amountEditView4;
        List<mg0> payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        e01.a aVar2 = this.d;
        aVar2.c(holder);
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof mg0)) {
                payloads = null;
                break;
            }
            i2++;
        }
        boolean zN = ue0.e.n(payloads);
        kg0 kg0Var = data.f53425g;
        View view = holder.itemView;
        AmountEditView amountEditView5 = holder.f165508g;
        AmountEditView amountEditView6 = holder.f;
        View view2 = holder.f165513n;
        View view3 = holder.f165512m;
        TextView textView = holder.f165511l;
        TextView textView2 = holder.k;
        LineChartView lineChartView = holder.f165510j;
        LargeActionButton largeActionButton = holder.f165509h;
        ShimmerConstraintLayout shimmerConstraintLayout2 = holder.i;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iH = c8g.c.H(context);
        jg0 jg0Var2 = jg0.f164834a;
        kg0 kg0Var2 = iH >= 360 ? kg0Var : jg0Var2;
        boolean z41 = kg0Var2 instanceof hg0;
        ig0 ig0Var2 = ig0.f164692a;
        if (z41 || Intrinsics.f(kg0Var2, ig0Var2)) {
            fVar = nx0.f.COMPACT;
        } else {
            if (!Intrinsics.f(kg0Var2, jg0Var2)) {
                throw new NoWhenBranchMatchedException();
            }
            fVar = nx0.f.NORMAL;
        }
        nx0.f fVar2 = fVar;
        if (payloads != null) {
            z = zN;
            z3 = z;
            z4 = z3;
            z6 = z4;
            z11 = z6;
            z12 = z11;
            z29 = z12;
            for (mg0 mg0Var : payloads) {
                kg0 kg0Var3 = kg0Var2;
                z = z || mg0Var.f165376a;
                z3 = z3 || mg0Var.f165377b;
                z4 = z4 || mg0Var.f165378c;
                z6 = z6 || mg0Var.d;
                z11 = z11 || mg0Var.e;
                z12 = z12 || mg0Var.f;
                z29 = z29 || mg0Var.f165379g;
                kg0Var2 = kg0Var3;
            }
        } else {
            z = zN;
            z3 = z;
            z4 = z3;
            z6 = z4;
            z11 = z6;
            z12 = z11;
            z29 = z12;
        }
        kg0 kg0Var4 = kg0Var2;
        if (z) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            aVar = aVar2;
            shimmerConstraintLayout = shimmerConstraintLayout2;
            ig0Var = ig0Var2;
            jg0Var = jg0Var2;
            amountEditView2 = amountEditView5;
            amountEditView = amountEditView6;
            str2 = "getContext(...)";
            str = "itemView";
            z31 = z41;
            smartTileExchangeDelegate = this;
            model = data;
            or0.b.c(smartTileExchangeDelegate, model, itemView, false, null, 28);
        } else {
            model = data;
            jg0Var = jg0Var2;
            ig0Var = ig0Var2;
            aVar = aVar2;
            amountEditView = amountEditView6;
            shimmerConstraintLayout = shimmerConstraintLayout2;
            str = "itemView";
            amountEditView2 = amountEditView5;
            str2 = "getContext(...)";
            smartTileExchangeDelegate = this;
            z31 = z41;
        }
        if (z3) {
            gg0 gg0Var = model.f53423b;
            lg0 lg0Var = lg0.TOP;
            p(holder, gg0Var, lg0Var);
            smartTileExchangeDelegate.r(holder, model, lg0Var);
        }
        if (z4) {
            gg0 gg0Var2 = model.f53424c;
            lg0 lg0Var2 = lg0.BOTTOM;
            p(holder, gg0Var2, lg0Var2);
            smartTileExchangeDelegate.r(holder, model, lg0Var2);
        }
        if (z6) {
            largeActionButton.o(model.d);
        }
        if (z11) {
            largeActionButton.setText(model.e);
        }
        if (z12) {
            largeActionButton.setEnabled(model.f);
        }
        if (z29) {
            if (z31) {
                shimmerConstraintLayout.setVisibility(0);
                shimmerConstraintLayout.g0();
                textView2.setVisibility(0);
                textView.setVisibility(0);
                view3.setVisibility(8);
                view2.setVisibility(8);
                ViewGroup.LayoutParams layoutParams = lineChartView.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                layoutParams2.topToBottom = R$id.exchangeSmartTile_bottomChartTitle;
                lineChartView.setLayoutParams(layoutParams2);
                hg0 hg0Var = (hg0) kg0Var4;
                lineChartView.setChartItems(hg0Var.f164550a);
                lineChartView.setColorScheme(hg0Var.f164551b);
                lineChartView.setBaseline(hg0Var.e);
                lineChartView.setInterpolationStrategy(aw0.m1.a(new l1.c(4.0f), lineChartView));
                Context context2 = holder.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, str2);
                lineChartView.setGraphLineWidth(kli.a.k(context2, 2.0f));
                lineChartView.setYAxis(null);
                View view4 = holder.itemView;
                ty0.c.b(h30.l.x(view4, str, view4), hg0Var.f164552c, holder.k, null, null, 12);
                View view5 = holder.itemView;
                ty0.c.b(h30.l.x(view5, str, view5), hg0Var.d, holder.f165511l, null, null, 12);
            } else if (Intrinsics.f(kg0Var4, ig0Var)) {
                shimmerConstraintLayout.setVisibility(0);
                shimmerConstraintLayout.j0();
                textView2.setVisibility(8);
                textView.setVisibility(8);
                view3.setVisibility(0);
                view2.setVisibility(0);
                ViewGroup.LayoutParams layoutParams3 = lineChartView.getLayoutParams();
                if (layoutParams3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
                layoutParams4.topToBottom = R$id.exchangeSmartTile_bottomChartTitleStub;
                lineChartView.setLayoutParams(layoutParams4);
                lineChartView.setChartItems(f53419g);
                INSTANCE.getClass();
                lineChartView.setColorScheme(new aw0.x6(zhm.u.c(new aw0.w6(R$attr.uikit_colorGreyTone50, R$attr.uikit_colorGreyTone20, R$attr.uikit_colorTransparent, BitmapDescriptorFactory.HUE_RED, 1000.0f, true, aw0.v6.SQUARE))));
                lineChartView.setBaseline(null);
                Context context3 = holder.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, str2);
                lineChartView.setGraphLineWidth(kli.a.k(context3, 1.0f));
                lineChartView.setYAxis(f53420h);
            } else {
                if (!Intrinsics.f(kg0Var4, jg0Var)) {
                    throw new NoWhenBranchMatchedException();
                }
                shimmerConstraintLayout.setVisibility(8);
                shimmerConstraintLayout.g0();
            }
            amountEditView4 = amountEditView;
            amountEditView4.h0(fVar2);
            amountEditView3 = amountEditView2;
            amountEditView3.h0(fVar2);
        } else {
            amountEditView3 = amountEditView2;
            amountEditView4 = amountEditView;
        }
        efm.r rVarMerge = efm.r.merge(amountEditView4.k().map(new e30(new eg0(amountEditView4, model, 0), 29)), amountEditView3.k().map(new fg0(new eg0(amountEditView3, model, 1), 0)));
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        aVar.a(rVarMerge, holder);
        efm.r map = largeActionButton.o.map(new fg0(new w10(model, 16), 1));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        smartTileExchangeDelegate.e.a(map, holder);
        kg0 kg0Var5 = model.f53425g;
        if (!(kg0Var5 instanceof hg0)) {
            or0.u.o(shimmerConstraintLayout);
            return;
        }
        py0.c cVar = new py0.c(((hg0) kg0Var5).d);
        or0.m.a(shimmerConstraintLayout);
        shimmerConstraintLayout.setOnClickListener(new kt(model, cVar, this, data, 20));
    }

    public final void r(ng0 ng0Var, Model model, lg0 lg0Var) {
        AmountEditView amountEditView;
        Function3 function3 = this.f53421c;
        if (function3 == null) {
            return;
        }
        int i = og0.f165663a[lg0Var.ordinal()];
        if (i == 1) {
            amountEditView = ng0Var.f;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            amountEditView = ng0Var.f165508g;
        }
        amountEditView.setMaskingDelegate((yz0.b) function3.invoke(model, lg0Var, amountEditView));
    }

    public SmartTileExchangeDelegate(kcg.j jVar) {
        super(R$layout.internal_delegate_smart_tile_exchange, new je0(13));
        this.f53421c = jVar;
        this.d = new e01.a();
        this.e = new e01.a();
        this.f = v0.a.d("create(...)");
    }
}
