package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.os.Parcelable;
import android.text.method.NumberKeyListener;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.recycler.BaseBoxRecyclerViewDelegate;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0006\u0006\u0007\b\u0003\t\nB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u000b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/AmountInputActionsDelegate;", "Lcom/revolut/core/ui_kit/recycler/BaseBoxRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/AmountInputActionsDelegate$Model;", "Lip0/w0;", "<init>", "()V", "com/revolut/core/ui_kit/delegates/e0", "com/revolut/core/ui_kit/delegates/x", "Model", "a", "ip0/v0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AmountInputActionsDelegate extends BaseBoxRecyclerViewDelegate<Model, ip0.w0> {
    public final e01.a e;
    public final ihm.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ihm.f f51639g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ihm.f f51640h;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0007\bJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/AmountInputActionsDelegate$Model;", "Lqv0/i;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/delegates/d0", "com/revolut/core/ui_kit/delegates/a0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.i, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f51641a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f51642b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d0 f51643c;
        public final a0 d;
        public final boolean e;
        public final o3b.w f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Parcelable f51644g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public qv0.c f51645h;
        public p31.c i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public p31.c f51646j;
        public p31.c k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public p31.c f51647l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f51648m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f51649n;
        public final int o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f51650p;

        public Model(String listId, Clause clause, d0 state, a0 inputType, boolean z, o3b.w wVar) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(inputType, "inputType");
            int i = R$attr.uikit_dp8;
            int i2 = R$attr.uikit_dp16;
            this.f51641a = listId;
            this.f51642b = clause;
            this.f51643c = state;
            this.d = inputType;
            this.e = z;
            this.f = wVar;
            this.f51644g = null;
            this.f51645h = c.d.f249513a;
            this.i = null;
            this.f51646j = null;
            this.k = null;
            this.f51647l = null;
            this.f51648m = i;
            this.f51649n = i;
            this.o = i2;
            this.f51650p = i2;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new AmountInputActionsDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getF() {
            return this.f;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF51641a() {
            return this.f51641a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f51641a, model.f51641a) && this.f51642b.equals(model.f51642b) && this.f51643c.equals(model.f51643c) && this.d.equals(model.d) && this.e == model.e && this.f.equals(model.f) && Intrinsics.f(this.f51644g, model.f51644g) && Intrinsics.f(this.f51645h, model.f51645h) && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f51646j, model.f51646j) && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f51647l, model.f51647l) && this.f51648m == model.f51648m && this.f51649n == model.f51649n && this.o == model.o && this.f51650p == model.f51650p;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF51648m() {
            return this.f51648m;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f51648m = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF51644g() {
            return this.f51644g;
        }

        public final int hashCode() {
            int iHashCode = (this.f.hashCode() + j6.a.c(j6.a.c((this.d.hashCode() + ((this.f51643c.hashCode() + p.a.b(this.f51641a.hashCode() * 31, 31, this.f51642b)) * 31)) * 31, 31, true), 31, this.e)) * 31;
            Parcelable parcelable = this.f51644g;
            int i = h30.l.i(this.f51645h, (iHashCode + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31);
            p31.c cVar = this.i;
            int iHashCode2 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f51646j;
            int iHashCode3 = (iHashCode2 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.k;
            int iHashCode4 = (iHashCode3 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f51647l;
            return Integer.hashCode(this.f51650p) + j6.a.b(this.o, j6.a.b(this.f51649n, j6.a.b(this.f51648m, (iHashCode4 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF51647l() {
            return this.f51647l;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f51645h = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getI() {
            return this.i;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f51646j = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF51649n() {
            return this.f51649n;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF51650p() {
            return this.f51650p;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f51649n = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF51645h() {
            return this.f51645h;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getK() {
            return this.k;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF51646j() {
            return this.f51646j;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f51647l = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f51644g = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getO() {
            return this.o;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.i = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.k = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Model model = oldItem instanceof Model ? (Model) oldItem : null;
            if (model == null) {
                return null;
            }
            return new ip0.v0(!model.f51642b.equals(this.f51642b), !model.f51643c.equals(this.f51643c), false, model.e != this.e, !model.d.equals(this.d), or0.b.l(model, this));
        }
    }

    public static final class a extends NumberKeyListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f51651a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final char[] f51652b;

        static {
            char[] charArray = "0123456789.,".toCharArray();
            Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
            f51652b = charArray;
        }

        private a() {
        }

        @Override // android.text.method.NumberKeyListener
        public final char[] getAcceptedChars() {
            return f51652b;
        }

        @Override // android.text.method.KeyListener
        public final int getInputType() {
            return 8194;
        }
    }

    public AmountInputActionsDelegate() {
        super(R$layout.internal_delegate_amount_input_actions, false, new ip0.c(12));
        this.e = new e01.a();
        this.f = v0.a.d("create(...)");
        this.f51639g = v0.a.d("create(...)");
        this.f51640h = v0.a.d("create(...)");
    }

    public static void q(SmallActionButton smallActionButton, int i) {
        smallActionButton.setIcon(new ResourceImage(i, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        smallActionButton.i(ms0.h4.LIGHT_ON_ACCENT);
        Context context = smallActionButton.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        smallActionButton.setContentPadding(kli.a.k(context, 12.0f));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ip0.w0 w0Var = new ip0.w0(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_amount_input_actions));
        w0Var.f.setSingleLine(true);
        q(w0Var.f166909g, R$drawable.uikit_icn_16_minus);
        q(w0Var.f166910h, R$drawable.uikit_icn_16_plus);
        return w0Var;
    }

    /* JADX WARN: Type inference failed for: r7v5, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // com.revolut.core.ui_kit.recycler.BaseBoxRecyclerViewDelegate
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final void p(ip0.w0 holder, Model data, int i, List payloads) {
        String strP;
        yz0.b yVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        SmallActionButton smallActionButton = holder.f166909g;
        SmallActionButton smallActionButton2 = holder.f166910h;
        InputText inputText = holder.f;
        List list = payloads;
        boolean zIsEmpty = list.isEmpty();
        boolean zIsEmpty2 = list.isEmpty();
        boolean zIsEmpty3 = list.isEmpty();
        boolean zIsEmpty4 = list.isEmpty();
        boolean zIsEmpty5 = list.isEmpty();
        Iterator it8 = payloads.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            if (next instanceof ip0.v0) {
                zIsEmpty = zIsEmpty || ((ip0.v0) next).f166749a;
                zIsEmpty2 = zIsEmpty2 || ((ip0.v0) next).f166750b;
                zIsEmpty5 = zIsEmpty5 || ((ip0.v0) next).e;
                zIsEmpty3 = zIsEmpty3 || ((ip0.v0) next).f166751c;
                zIsEmpty4 = zIsEmpty4 || ((ip0.v0) next).d;
            }
        }
        if (zIsEmpty2) {
            d0 d0Var = data.f51643c;
            if (d0Var.equals(b0.f53700a)) {
                inputText.setError(false);
                inputText.setHelperText((Clause) null);
                inputText.setEnabled(true);
                smallActionButton.setEnabled(true);
                smallActionButton2.setEnabled(true);
            } else {
                if (!(d0Var instanceof c0)) {
                    throw new NoWhenBranchMatchedException();
                }
                c0 c0Var = (c0) data.f51643c;
                inputText.setError(true);
                inputText.setHelperText(c0Var.f53739a);
                inputText.setEnabled(true);
                smallActionButton.setEnabled(true);
                smallActionButton2.setEnabled(true);
            }
        }
        if (zIsEmpty3) {
            data.getClass();
            inputText.setEnableQuickClear(true);
        }
        if (zIsEmpty5) {
            a0 a0Var = data.d;
            if (a0Var instanceof y) {
                String upperCase = ((y) a0Var).f55610b.f306286a.toUpperCase(Locale.ROOT);
                strP = t61.a.p(upperCase, "toUpperCase(...)", " ", upperCase);
            } else {
                if (!(a0Var instanceof z)) {
                    throw new NoWhenBranchMatchedException();
                }
                strP = "%";
            }
            inputText.setSuffixText(new TextClause(strP, (Style) null, (Integer) null, false, (aw0.o9) null, (List) null, 126));
            inputText.D0();
            a0 a0Var2 = data.d;
            if (a0Var2 instanceof y) {
                y yVar2 = (y) a0Var2;
                yVar = new zp0.d(inputText.getInnerEditText(), yVar2.f55610b, new u80.d(yVar2.f55609a), null, new f0(this, holder), false, false, yVar2.f55611c, false, null, 1704);
            } else {
                if (!(a0Var2 instanceof z)) {
                    throw new NoWhenBranchMatchedException();
                }
                String str = data.f51641a;
                z zVar = (z) a0Var2;
                yVar = new zp0.y(inputText.getInnerEditText(), zVar.f55658b, zVar.f55657a, new abf.c(this, holder, 23), str, a.f51651a, false, 64);
            }
            inputText.setMaskingDelegate(yVar);
        }
        if (zIsEmpty) {
            InputText.setText$default(inputText, data.f51642b, false, 2, null);
        }
        if (zIsEmpty4 && data.e) {
            inputText.getInnerEditText().clearFocus();
        }
        or0.m.a(smallActionButton);
        smallActionButton.setOnClickListener(new ip0.x0(data, this, data, 0));
        or0.m.a(smallActionButton2);
        smallActionButton2.setOnClickListener(new ip0.x0(data, this, data, 1));
        efm.r map = inputText.x0().map(new ip0.w(new ii4.b(data, 23), 13));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        this.e.a(map, holder);
    }
}
