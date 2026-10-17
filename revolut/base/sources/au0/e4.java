package au0;

import android.graphics.Rect;
import android.util.ArrayMap;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class e4 implements j2 {

    @NotNull
    public static final a4 Companion = new a4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f9178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aqe.a f9179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f9180c;
    public final RecyclerView d;
    public final g4 e;
    public final aqd.h1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ro0.q f9181g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayMap f9182h;
    public ro0.p i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public d4 f9183j;
    public RecyclerView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f9184l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f9185m;

    public e4(View navBarView, aqe.a blurProgressProvider, List items, RecyclerView recyclerView, g4 g4Var, aqd.h1 delegateProvider) {
        Intrinsics.checkNotNullParameter(navBarView, "navBarView");
        Intrinsics.checkNotNullParameter(blurProgressProvider, "blurProgressProvider");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(delegateProvider, "delegateProvider");
        this.f9178a = navBarView;
        this.f9179b = blurProgressProvider;
        this.f9180c = items;
        this.d = recyclerView;
        this.e = g4Var;
        this.f = delegateProvider;
        this.f9182h = new ArrayMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void h(e4 e4Var, View item) {
        ro0.q qVar;
        ArrayMap arrayMap = e4Var.f9182h;
        if (e4Var.f9185m && (qVar = e4Var.f9181g) != null) {
            b4 b4Var = (b4) arrayMap.remove(item);
            if (b4Var != null) {
                twg.c cVar = b4Var.f9150a;
                c4 c4Var = (c4) cVar.f275019c;
                if (c4Var != null) {
                    c4Var.cancel();
                }
                cVar.f275019c = null;
                b4Var.f9151b.e();
            }
            twg.c cVar2 = new twg.c();
            Intrinsics.checkNotNullParameter(item, "item");
            cVar2.d = e4Var;
            cVar2.f275017a = item;
            cVar2.f275018b = new Rect(0, 0, 0, 0);
            cVar2.P();
            jx0.b bVar = item instanceof jx0.b ? (jx0.b) item : null;
            arrayMap.put(item, new b4(cVar2, ro0.q.e(qVar, item, cVar2, new ro0.n(new z3(e4Var, item), bVar != null ? bVar.getCutoutReceiverForBlur() : null, 1), null, null, 56)));
        }
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
    public final void a() {
        ro0.q qVar = this.f9181g;
        if (qVar == null) {
            return;
        }
        ro0.p pVar = this.i;
        if (pVar != null) {
            pVar.e();
        }
        View view = this.f9178a;
        this.i = ro0.q.e(qVar, view, new x3(com.google.android.gms.internal.mlkit_vision_face.a.a(view, "getContext(...)", 32.0f), 1), new ro0.k(ro0.j.BLURRED_TOP, 8.0f, 32.0f), new aqe.a(this, 14), null, 16);
        if (this.f9184l) {
            List list = this.f9180c;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                h(this, (View) list.get(i));
            }
            RecyclerView recyclerView = this.d;
            if (recyclerView != null) {
                this.k = recyclerView;
                d4 d4Var = new d4(this, recyclerView);
                this.f9183j = d4Var;
                recyclerView.addOnChildAttachStateChangeListener(d4Var);
                int childCount = recyclerView.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = recyclerView.getChildAt(i2);
                    Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
                    if (!(recyclerView.getChildViewHolder(childAt) instanceof x)) {
                        h(this, childAt);
                    }
                }
            }
            this.f9184l = false;
        }
    }

    @Override // au0.j2
    public final void b(aw0.v1 colorScheme) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        this.e.b(colorScheme);
    }

    @Override // au0.j2
    public final void c(float f, int i) {
    }

    @Override // au0.j2
    public final void d() {
        ArrayMap arrayMap = this.f9182h;
        Collection collectionValues = arrayMap.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        Iterator it8 = collectionValues.iterator();
        while (it8.hasNext()) {
            ((b4) it8.next()).f9150a.P();
        }
        ro0.p pVar = this.i;
        if (pVar != null) {
            pVar.b();
        }
        Collection collectionValues2 = arrayMap.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues2, "<get-values>(...)");
        Iterator it9 = collectionValues2.iterator();
        while (it9.hasNext()) {
            ((b4) it9.next()).f9151b.b();
        }
    }

    @Override // au0.j2
    public final void e(float f, Integer num) {
        this.f9185m = true;
        this.f9184l = true;
        g4 g4Var = this.e;
        if (g4Var != null) {
            g4Var.i(0.6f);
        }
        a();
    }

    @Override // au0.j2
    public final void f(float f) {
        ro0.p pVar = this.i;
        if (pVar != null) {
            pVar.c();
        }
        Collection collectionValues = this.f9182h.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        Iterator it8 = collectionValues.iterator();
        while (it8.hasNext()) {
            ((b4) it8.next()).f9151b.c();
        }
        Object parent = this.f9178a.getParent();
        View view = parent instanceof View ? (View) parent : null;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // au0.j2
    public final void g(Integer num) {
        RecyclerView recyclerView;
        this.f9185m = false;
        if (num != null) {
            this.f9178a.setBackgroundColor(num.intValue());
        }
        ro0.p pVar = this.i;
        if (pVar != null) {
            pVar.e();
        }
        this.i = null;
        ArrayMap arrayMap = this.f9182h;
        Collection<b4> collectionValues = arrayMap.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        for (b4 b4Var : collectionValues) {
            twg.c cVar = b4Var.f9150a;
            c4 c4Var = (c4) cVar.f275019c;
            if (c4Var != null) {
                c4Var.cancel();
            }
            cVar.f275019c = null;
            b4Var.f9151b.e();
        }
        arrayMap.clear();
        d4 d4Var = this.f9183j;
        if (d4Var != null && (recyclerView = this.k) != null) {
            recyclerView.removeOnChildAttachStateChangeListener(d4Var);
        }
        this.k = null;
        this.f9183j = null;
        this.f9184l = false;
        this.e.reset();
    }

    @Override // au0.j2
    public final boolean isActive() {
        return this.f9185m;
    }

    @Override // au0.j2
    public final void onAttachedToWindow() {
        ro0.q qVar = (ro0.q) this.f.invoke(this.f9178a, ro0.e0.REFLECTIVE_SURFACE);
        if (qVar == null) {
            return;
        }
        this.f9181g = qVar;
        if (this.f9185m) {
            a();
        }
    }

    @Override // au0.j2
    public final void onDetachedFromWindow() {
        g(null);
    }
}
