package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.fg0;
import ip0.je0;
import ip0.qg0;
import ip0.rg0;
import ip0.w10;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00042\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0005\u0003\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/SmartTileSendMoneyDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/SmartTileSendMoneyDelegate$Model;", "Lip0/rg0;", "Companion", "Model", "ip0/qg0", "com/revolut/core/ui_kit/delegates/ch", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SmartTileSendMoneyDelegate extends BaseRecyclerViewDelegate<Model, rg0> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function2 f53441c;
    public final e01.a d;
    public final e01.a e;
    public final e01.a f;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/SmartTileSendMoneyDelegate$Model;", "Lqv0/i;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Lqv0/p;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.i, TrackableItem, qv0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f53442a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final aw0.v9 f53443b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public qv0.c f53444c;
        public p31.c d;
        public p31.c e;
        public p31.c f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public p31.c f53445g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final o97.y f53446h;
        public Parcelable i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f53447j;
        public int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f53448l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f53449m;

        public Model(aw0.u9 recipientData, aw0.t9 amountData, TextLocalisedClause buttonText, LargeActionButton.ButtonStyle.DefaultFilledButton buttonStyle, boolean z, o97.y yVar) {
            Intrinsics.checkNotNullParameter("send_money_tile", "listId");
            Intrinsics.checkNotNullParameter(recipientData, "recipientData");
            Intrinsics.checkNotNullParameter(amountData, "amountData");
            Intrinsics.checkNotNullParameter(buttonText, "buttonText");
            Intrinsics.checkNotNullParameter(buttonStyle, "buttonStyle");
            aw0.v9 v9Var = new aw0.v9(recipientData, amountData, buttonStyle, buttonText, z);
            this.f53442a = "send_money_tile";
            this.f53443b = v9Var;
            this.f53444c = c.d.f249513a;
            this.d = null;
            this.e = null;
            this.f = null;
            this.f53445g = null;
            this.f53446h = yVar;
            this.i = null;
            int i = R$attr.uikit_dp0;
            this.f53447j = i;
            this.k = i;
            this.f53448l = i;
            this.f53449m = i;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new SmartTileSendMoneyDelegate(null);
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getI() {
            return this.f53446h;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF53442a() {
            return this.f53442a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f53442a, model.f53442a) && Intrinsics.f(this.f53443b, model.f53443b) && Intrinsics.f(this.f53444c, model.f53444c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f53445g, model.f53445g) && Intrinsics.f(this.f53446h, model.f53446h) && Intrinsics.f(this.i, model.i);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF53447j() {
            return this.f53447j;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f53447j = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getD() {
            return this.i;
        }

        public final int hashCode() {
            int i = h30.l.i(this.f53444c, (this.f53443b.hashCode() + (this.f53442a.hashCode() * 31)) * 31, 31);
            p31.c cVar = this.d;
            int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.e;
            int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f;
            int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f53445g;
            int iHashCode4 = (iHashCode3 + (cVar4 == null ? 0 : cVar4.hashCode())) * 31;
            o97.y yVar = this.f53446h;
            int iHashCode5 = (iHashCode4 + (yVar == null ? 0 : yVar.hashCode())) * 31;
            Parcelable parcelable = this.i;
            return iHashCode5 + (parcelable != null ? parcelable.hashCode() : 0);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getD() {
            return this.d;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f53444c = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getE() {
            return this.e;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getK() {
            return this.k;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF53449m() {
            return this.f53449m;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.k = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF53444c() {
            return this.f53444c;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF53445g() {
            return this.f53445g;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF() {
            return this.f;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.d = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.i = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF53448l() {
            return this.f53448l;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.e = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f53445g = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) != null) {
                return new qg0(or0.b.l(this, (qv0.i) oldItem), !Intrinsics.f(this.f53443b, r0.f53443b));
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.SmartTileSendMoneyDelegate$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public SmartTileSendMoneyDelegate() {
        this(null);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ms0.r4 r4Var = new ms0.r4(context, null, 6, 0);
        r4Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new rg0(r4Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v8, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(rg0 holder, Model data, int i, List payloads) {
        SmartTileSendMoneyDelegate smartTileSendMoneyDelegate;
        Model model;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        this.f.c(holder);
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof qg0)) {
                payloads = null;
                break;
            }
            i2++;
        }
        if (payloads == null) {
            payloads = zhm.f0.f322471a;
        }
        boolean zIsEmpty = payloads.isEmpty();
        int size2 = payloads.size();
        boolean z = zIsEmpty;
        for (int i3 = 0; i3 < size2; i3++) {
            qg0 qg0Var = (qg0) payloads.get(i3);
            zIsEmpty = zIsEmpty || qg0Var.f165976a;
            z = z || qg0Var.f165977b;
        }
        if (zIsEmpty) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            smartTileSendMoneyDelegate = this;
            model = data;
            or0.b.c(smartTileSendMoneyDelegate, model, itemView, false, null, 28);
        } else {
            smartTileSendMoneyDelegate = this;
            model = data;
        }
        ms0.r4 r4Var = holder.f;
        r4Var.setMaskBinder(new fb.c(this, model, 20));
        r4Var.setRecipientClickListener$ui_kit_components_release(model, model.f53443b.f10578a.f10565a, new ip0.md(this, model, 8));
        if (z) {
            r4Var.setModel(model.f53443b);
        }
        efm.r map = r4Var.f208402j.o.map(new fg0(new w10(model, 17), 2));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        smartTileSendMoneyDelegate.e.a(map, holder);
    }

    public SmartTileSendMoneyDelegate(l0c.v vVar) {
        super(R$id.smartTileSendMoneyDelegate, new je0(15));
        this.f53441c = vVar;
        this.d = new e01.a();
        this.e = new e01.a();
        this.f = new e01.a();
    }
}
