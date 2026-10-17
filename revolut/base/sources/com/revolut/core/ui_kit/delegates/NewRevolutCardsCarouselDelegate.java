package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.NewRevolutCardDelegate;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.fv;
import ip0.ny;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00062\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0005\u0002\u0007\u0003\b\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/NewRevolutCardsCarouselDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/q9;", "Lcom/revolut/core/ui_kit/delegates/t9;", "<init>", "()V", "Companion", "ip0/ny", "com/revolut/core/ui_kit/delegates/r9", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NewRevolutCardsCarouselDelegate extends BaseRecyclerViewDelegate<q9, t9> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f52819c;
    public int d;
    public Bitmap e;
    public Bitmap f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e01.a f52820g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e01.a f52821h;
    public final e01.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e01.a f52822j;
    public final e01.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e01.a f52823l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e01.a f52824m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ihm.f f52825n;
    public final e01.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e01.a f52826p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ihm.f f52827q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ihm.f f52828r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f52829s;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.NewRevolutCardsCarouselDelegate$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
        public static boolean a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return ((Boolean) jo0.g.f176833q.getValue()).booleanValue() && ny0.i.d(context);
        }
    }

    public NewRevolutCardsCarouselDelegate() {
        super(R$layout.internal_delegate_new_revolut_cards, new fv(20));
        this.f52820g = new e01.a();
        this.f52821h = new e01.a();
        this.i = new e01.a();
        this.f52822j = new e01.a();
        this.k = new e01.a();
        this.f52823l = new e01.a();
        this.f52824m = new e01.a();
        this.f52825n = v0.a.d("create(...)");
        this.o = new e01.a();
        this.f52826p = new e01.a();
        this.f52827q = v0.a.d("create(...)");
        this.f52828r = v0.a.d("create(...)");
        this.f52829s = new ArrayList();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iQ = q(context);
        View viewR = kotlin.jvm.internal.s.r(parent, this.f98535a);
        Context context2 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        return new t9(this, viewR, p(context2), iQ);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    public final int p(Context context) {
        int i = this.d;
        if (i > 0) {
            return i;
        }
        this.d = (int) (q(context) * 0.92f);
        if (((Boolean) jo0.g.f176833q.getValue()).booleanValue() && ny0.i.d(context)) {
            int i2 = this.d;
            int iK = kli.a.k(context, 350.0f);
            if (i2 > iK) {
                i2 = iK;
            }
            this.d = i2;
        }
        return this.d;
    }

    public final int q(Context context) {
        Integer numValueOf = Integer.valueOf(this.f52819c);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        Integer numValueOf2 = Integer.valueOf(c8g.c.H(context));
        this.f52819c = numValueOf2.intValue();
        return numValueOf2.intValue();
    }

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
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final void p(t9 holder, q9 model, int i, List list) {
        ihm.f fVar;
        List payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(model, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, model, i, list);
        ViewPager2 viewPager2 = holder.f;
        NewRevolutCardDelegate newRevolutCardDelegate = holder.f54759g;
        Intrinsics.checkNotNullParameter(model, "data");
        View view = holder.itemView;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int i2 = model.f54626g;
        ArrayList arrayList = model.f54624b;
        int iW = kli.a.w(i2, context);
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int iW2 = kli.a.w(model.e, context2);
        Context context3 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int iW3 = kli.a.w(model.f54627h, context3);
        Context context4 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        view.setPadding(iW, iW2, iW3, kli.a.w(model.f, context4));
        int size = payloads.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            if (!(payloads.get(i3) instanceof ny)) {
                payloads = null;
                break;
            }
            i3++;
        }
        if (payloads == null) {
            payloads = zhm.f0.f322471a;
        }
        boolean zIsEmpty = payloads.isEmpty();
        int size2 = payloads.size();
        boolean z = zIsEmpty;
        boolean z3 = z;
        boolean z4 = z3;
        for (int i5 = 0; i5 < size2; i5++) {
            ny nyVar = (ny) payloads.get(i5);
            z = z || nyVar.f165587a;
            z3 = z3 || nyVar.f165588b;
            z4 = z4 || nyVar.f165589c;
        }
        int currentItem = viewPager2.getCurrentItem();
        int size3 = arrayList.size();
        int i6 = 0;
        while (true) {
            fVar = this.f52825n;
            if (i6 >= size3) {
                break;
            }
            NewRevolutCardDelegate.Model model2 = (NewRevolutCardDelegate.Model) arrayList.get(i6);
            NewRevolutCardDelegate.a aVar = model2.f52813j;
            int i21 = currentItem;
            if (currentItem != i6 && (aVar instanceof j9)) {
                AnimationRequest animationRequest = ((j9) aVar).f54325a;
                if (!animationRequest.f57724a) {
                    animationRequest.f57724a = true;
                    fVar.onNext(model2);
                }
            }
            i6++;
            currentItem = i21;
        }
        if (z4) {
            boolean z6 = model.d;
            boolean z11 = holder.i != z6;
            holder.i = z6;
            if (z11) {
                holder.I();
            }
        }
        Intrinsics.checkNotNullParameter(model, "model");
        holder.f54761j.c(arrayList);
        if (z3) {
            viewPager2.post(new fp0.l(holder, 11));
        }
        if (z) {
            if (viewPager2.isFakeDragging()) {
                viewPager2.endFakeDrag();
            }
            viewPager2.setCurrentItem(model.f54625c, !zIsEmpty);
            viewPager2.post(new fp0.l(holder, 11));
        }
        holder.f54760h = new u9(this, model);
        this.f52820g.a(newRevolutCardDelegate.f52802g.f121375b, holder);
        this.f52821h.a(newRevolutCardDelegate.f52803h.f121375b, holder);
        this.i.a(newRevolutCardDelegate.i.f121375b, holder);
        this.f52822j.a(newRevolutCardDelegate.f52804j.f121375b, holder);
        this.k.a(newRevolutCardDelegate.k.f121375b, holder);
        this.f52823l.a(newRevolutCardDelegate.f52805l.f121375b, holder);
        this.f52824m.a(newRevolutCardDelegate.f52806m.f121375b, holder);
        this.o.a(newRevolutCardDelegate.f52807n, holder);
        efm.r rVarMergeWith = newRevolutCardDelegate.o.mergeWith(fVar);
        Intrinsics.checkNotNullExpressionValue(rVarMergeWith, "mergeWith(...)");
        this.f52826p.a(rVarMergeWith, holder);
    }
}
