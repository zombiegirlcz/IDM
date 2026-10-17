package wx0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.revolut.core.ui_kit.views.FloatingBottomBarView;
import efm.r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx0.r6;
import ny0.i;
import tx0.d5;
import wsg.k;
import wvg.r1;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f300709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f300710b;
    public FloatingBottomBarView d;
    public g e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.b f300711c = j6.a.h("create(...)");
    public boolean f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public r6 f300712g = r6.VISIBILITY;

    public a(int i, int i2) {
        this.f300709a = i;
        this.f300710b = i2;
    }

    @Override // wx0.b
    public final r a() {
        r rVarSwitchMap = this.f300711c.switchMap(new k(new r1(12), 23));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rVarSwitchMap;
    }

    @Override // wx0.b
    public final void b(String itemId) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        c().b(itemId);
    }

    public final b c() {
        Object objF = this.f300711c.f();
        if (objF != null) {
            return (b) objF;
        }
        throw new IllegalArgumentException("Navigation panel not initialized. Call setToLayout() first.");
    }

    @Override // wx0.b
    public final void d(String itemId, boolean z) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        c().d(itemId, z);
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
    public final void e(CoordinatorLayout containerLayout) {
        Intrinsics.checkNotNullParameter(containerLayout, "containerLayout");
        Context context = containerLayout.getContext();
        Intrinsics.h(context);
        boolean zEquals = i.a(context).equals(ny0.f.f220593a);
        ihm.b bVar = this.f300711c;
        b bVar2 = (b) bVar.f();
        int i = 6;
        AttributeSet attributeSet = null;
        int i2 = 0;
        int iD = -1;
        if (zEquals) {
            FloatingBottomBarView floatingBottomBarView = this.d;
            if (floatingBottomBarView == null) {
                floatingBottomBarView = new FloatingBottomBarView(context, attributeSet, i, i2);
                CoordinatorLayout.LayoutParams layoutParams = new CoordinatorLayout.LayoutParams(-1, -2);
                layoutParams.gravity = 80;
                floatingBottomBarView.setLayoutParams(layoutParams);
                floatingBottomBarView.setFitsSystemWindows(true);
                int iGenerateViewId = this.f300710b;
                if (iGenerateViewId == -1) {
                    iGenerateViewId = View.generateViewId();
                }
                floatingBottomBarView.setId(iGenerateViewId);
                containerLayout.addView(floatingBottomBarView);
            }
            g gVar = this.e;
            if (gVar != null) {
                gVar.setVisibility(8);
            }
            floatingBottomBarView.setVisibility(0);
            this.d = floatingBottomBarView;
            bVar.onNext(floatingBottomBarView);
            if (bVar2 != null && bVar2 != floatingBottomBarView) {
                bVar2.i(floatingBottomBarView);
            }
            floatingBottomBarView.setWithLabels(this.f);
            floatingBottomBarView.setScrollAnimationMode(this.f300712g);
        } else {
            g gVar2 = this.e;
            if (gVar2 == null) {
                gVar2 = new g(context, attributeSet, i, i2);
                CoordinatorLayout.LayoutParams layoutParams2 = new CoordinatorLayout.LayoutParams(-2, -1);
                layoutParams2.gravity = 8388611;
                gVar2.setLayoutParams(layoutParams2);
                gVar2.setId(View.generateViewId());
                containerLayout.addView(gVar2);
            }
            FloatingBottomBarView floatingBottomBarView2 = this.d;
            if (floatingBottomBarView2 != null) {
                floatingBottomBarView2.setVisibility(8);
            }
            gVar2.setVisibility(0);
            this.e = gVar2;
            bVar.onNext(gVar2);
            iD = d5.d(context);
            if (bVar2 != null && bVar2 != gVar2) {
                bVar2.i(gVar2);
            }
            gVar2.setWithLabels(this.f);
            gVar2.setScrollAnimationMode(this.f300712g);
        }
        View viewFindViewById = containerLayout.findViewById(this.f300709a);
        if (viewFindViewById != null) {
            ViewGroup.LayoutParams layoutParams3 = viewFindViewById.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams3.width = iD;
            viewFindViewById.setLayoutParams(layoutParams3);
        }
    }

    @Override // wx0.b
    public final r f() {
        r rVarSwitchMap = this.f300711c.switchMap(new k(new r1(11), 22));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rVarSwitchMap;
    }

    @Override // wx0.b
    public final void i(b other) {
        Intrinsics.checkNotNullParameter(other, "other");
        c().i(other);
    }

    @Override // wx0.b
    public final r j() {
        r rVarSwitchMap = this.f300711c.switchMap(new k(new r1(10), 21));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rVarSwitchMap;
    }

    @Override // wx0.b
    public final r k() {
        r rVarSwitchMap = this.f300711c.switchMap(new k(new r1(13), 24));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rVarSwitchMap;
    }

    @Override // wx0.b
    public final void setItems(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        c().setItems(items);
    }

    @Override // wx0.b
    public final void setScrollAnimationMode(r6 mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f300712g = mode;
        c().setScrollAnimationMode(mode);
    }

    @Override // wx0.b
    public final void setWithLabels(boolean z) {
        this.f = z;
        c().setWithLabels(z);
    }
}
