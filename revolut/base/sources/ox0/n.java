package ox0;

import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class n {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f230489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f230490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f230491c;
    public final x d;
    public o6.a e;
    public m f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ifm.c f230492g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f230493h;

    public n(View collapsibleView, View scrollingView) {
        Intrinsics.checkNotNullParameter(collapsibleView, "collapsibleView");
        Intrinsics.checkNotNullParameter(scrollingView, "scrollingView");
        this.f230489a = collapsibleView;
        this.f230490b = scrollingView;
        this.f230491c = new Handler(Looper.getMainLooper());
        this.d = new x();
    }

    public final void a() {
        o6.a aVar = this.e;
        if (aVar != null) {
            this.f230491c.removeCallbacks(aVar);
        }
        this.e = null;
        View view = this.f230490b;
        if (view instanceof RecyclerView) {
            m mVar = this.f;
            if (mVar != null) {
                ((RecyclerView) view).removeOnScrollListener(mVar);
            }
        } else if (view instanceof NestedScrollView) {
            ((NestedScrollView) view).setOnScrollChangeListener((NestedScrollView.OnScrollChangeListener) null);
        } else if (view instanceof ScrollView) {
            view.setOnScrollChangeListener(null);
        }
        this.f = null;
        ifm.c cVar = this.f230492g;
        if (cVar != null) {
            cVar.dispose();
        }
        this.f230492g = null;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void b() {
        KeyEvent.Callback callback = this.f230489a;
        vy0.b bVar = callback instanceof vy0.b ? (vy0.b) callback : null;
        boolean z = (bVar == null || ((ActionFooterView) bVar).f58962q == null) ? false : true;
        if (((Boolean) jo0.g.Q.getValue()).booleanValue() && !z) {
            this.f230493h = true;
            Intrinsics.i(callback, "null cannot be cast to non-null type com.revolut.core.ui_kit_core.collapsing.Collapsible");
            ((vy0.a) callback).setCollapsed(false, true);
            return;
        }
        o6.a aVar = this.e;
        Handler handler = this.f230491c;
        if (aVar != null) {
            handler.removeCallbacks(aVar);
        }
        o6.a aVar2 = new o6.a(this, 3);
        handler.postDelayed(aVar2, 200L);
        this.e = aVar2;
    }

    public final void c(final boolean z) {
        View view = this.f230490b;
        if (view instanceof RecyclerView) {
            m mVar = new m(this, z);
            ((RecyclerView) view).addOnScrollListener(mVar);
            this.f = mVar;
        } else if (view instanceof NestedScrollView) {
            final int i = 0;
            view.setOnScrollChangeListener(new View.OnScrollChangeListener(this) { // from class: ox0.k

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ n f230485b;

                {
                    this.f230485b = this;
                }

                /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, kotlin.Lazy] */
                /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, kotlin.Lazy] */
                /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, kotlin.Lazy] */
                /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, kotlin.Lazy] */
                /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
                /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
                @Override // android.view.View.OnScrollChangeListener
                public final void onScrollChange(View view2, int i2, int i3, int i5, int i6) {
                    switch (i) {
                        case 0:
                            Intrinsics.i(view2, "null cannot be cast to non-null type androidx.core.widget.NestedScrollView");
                            boolean zCanScrollVertically = ((NestedScrollView) view2).canScrollVertically(1);
                            n nVar = this.f230485b;
                            if (!zCanScrollVertically && !((Boolean) jo0.g.Q.getValue()).booleanValue()) {
                                nVar.b();
                            } else if (((Boolean) jo0.g.Q.getValue()).booleanValue() && i3 != i6) {
                                nVar.g();
                            } else if (z || ((Boolean) jo0.g.Q.getValue()).booleanValue()) {
                                nVar.e();
                            }
                            break;
                        default:
                            Intrinsics.i(view2, "null cannot be cast to non-null type android.widget.ScrollView");
                            boolean zCanScrollVertically2 = ((ScrollView) view2).canScrollVertically(1);
                            n nVar2 = this.f230485b;
                            if (!zCanScrollVertically2 && !((Boolean) jo0.g.Q.getValue()).booleanValue()) {
                                nVar2.b();
                            } else if (((Boolean) jo0.g.Q.getValue()).booleanValue() && i3 != i6) {
                                nVar2.g();
                            } else if (z || ((Boolean) jo0.g.Q.getValue()).booleanValue()) {
                                nVar2.e();
                            }
                            break;
                    }
                }
            });
        } else if (view instanceof ScrollView) {
            final int i2 = 1;
            view.setOnScrollChangeListener(new View.OnScrollChangeListener(this) { // from class: ox0.k

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ n f230485b;

                {
                    this.f230485b = this;
                }

                /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, kotlin.Lazy] */
                /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, kotlin.Lazy] */
                /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, kotlin.Lazy] */
                /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, kotlin.Lazy] */
                /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
                /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
                @Override // android.view.View.OnScrollChangeListener
                public final void onScrollChange(View view2, int i22, int i3, int i5, int i6) {
                    switch (i2) {
                        case 0:
                            Intrinsics.i(view2, "null cannot be cast to non-null type androidx.core.widget.NestedScrollView");
                            boolean zCanScrollVertically = ((NestedScrollView) view2).canScrollVertically(1);
                            n nVar = this.f230485b;
                            if (!zCanScrollVertically && !((Boolean) jo0.g.Q.getValue()).booleanValue()) {
                                nVar.b();
                            } else if (((Boolean) jo0.g.Q.getValue()).booleanValue() && i3 != i6) {
                                nVar.g();
                            } else if (z || ((Boolean) jo0.g.Q.getValue()).booleanValue()) {
                                nVar.e();
                            }
                            break;
                        default:
                            Intrinsics.i(view2, "null cannot be cast to non-null type android.widget.ScrollView");
                            boolean zCanScrollVertically2 = ((ScrollView) view2).canScrollVertically(1);
                            n nVar2 = this.f230485b;
                            if (!zCanScrollVertically2 && !((Boolean) jo0.g.Q.getValue()).booleanValue()) {
                                nVar2.b();
                            } else if (((Boolean) jo0.g.Q.getValue()).booleanValue() && i3 != i6) {
                                nVar2.g();
                            } else if (z || ((Boolean) jo0.g.Q.getValue()).booleanValue()) {
                                nVar2.e();
                            }
                            break;
                    }
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(View buttonView) {
        Intrinsics.checkNotNullParameter(buttonView, "buttonView");
        ifm.c cVar = this.f230492g;
        if (cVar != null) {
            cVar.dispose();
        }
        this.f230492g = null;
        vy0.b bVar = buttonView instanceof vy0.b ? (vy0.b) buttonView : null;
        if (bVar == null) {
            return;
        }
        this.f230492g = ((ActionFooterView) bVar).f58964s.subscribe(new or2.e(new oqk.c(this, 26), 25));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
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
    public final void e() {
        Float fA;
        boolean zBooleanValue = ((Boolean) jo0.g.Q.getValue()).booleanValue();
        View view = this.f230489a;
        vy0.b bVar = view instanceof vy0.b ? (vy0.b) view : null;
        boolean z = (bVar == null || ((ActionFooterView) bVar).f58962q == null) ? false : true;
        if (!zBooleanValue || z) {
            f();
            return;
        }
        View view2 = this.f230490b;
        if (view2.getWidth() == 0 || view2.getHeight() == 0 || (fA = this.d.a(view2, view)) == null) {
            return;
        }
        boolean z3 = fA.floatValue() > BitmapDescriptorFactory.HUE_RED;
        if (this.f230493h && z3) {
            return;
        }
        Intrinsics.i(view, "null cannot be cast to non-null type com.revolut.core.ui_kit_core.collapsing.Collapsible");
        ((vy0.a) view).setCollapsed(z3, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public final void f() {
        View view = this.f230489a;
        Intrinsics.i(view, "null cannot be cast to non-null type com.revolut.core.ui_kit_core.collapsing.Collapsible");
        vy0.a aVar = (vy0.a) view;
        View view2 = this.f230490b;
        if ((view2 instanceof RecyclerView) || (view2 instanceof NestedScrollView)) {
            Float fA = this.d.a(view2, view);
            if (fA != null) {
                boolean z = fA.floatValue() > BitmapDescriptorFactory.HUE_RED;
                if (aVar.A() == z) {
                    return;
                }
                aVar.setCollapsed(z, true);
                return;
            }
            return;
        }
        if (view2 instanceof ScrollView) {
            if (view2.canScrollVertically(1)) {
                if (aVar.A()) {
                    return;
                }
                aVar.setCollapsed(true, true);
            } else if (aVar.A()) {
                aVar.setCollapsed(false, true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
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
    public final void g() {
        boolean zBooleanValue = ((Boolean) jo0.g.Q.getValue()).booleanValue();
        View view = this.f230489a;
        vy0.b bVar = view instanceof vy0.b ? (vy0.b) view : null;
        boolean z = (bVar == null || ((ActionFooterView) bVar).f58962q == null) ? false : true;
        if (!zBooleanValue || z) {
            f();
            return;
        }
        Float fA = this.d.a(this.f230490b, view);
        if (fA == null || fA.floatValue() > r6.b.a(view, "getContext(...)", 100.0f)) {
            return;
        }
        this.f230493h = true;
        Intrinsics.i(view, "null cannot be cast to non-null type com.revolut.core.ui_kit_core.collapsing.Collapsible");
        ((vy0.a) view).setCollapsed(false, true);
    }
}
