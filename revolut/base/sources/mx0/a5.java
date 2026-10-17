package mx0;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class a5 extends FrameLayout {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DefaultItemAnimator f209579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v4 f209580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScreenContentRecyclerView f209581c;
    public int d;
    public int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ValueAnimator f209582g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f209583h;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a5(@NotNull Context context) {
        this(context, null, 0, 14);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a() {
        ValueAnimator valueAnimator = this.f209582g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f209582g = null;
        int i = this.d;
        this.e = i;
        this.f = (i - getPaddingTop()) - getPaddingBottom();
        requestLayout();
    }

    public final boolean getCollapsable() {
        return this.f209583h;
    }

    @NotNull
    public final ScreenContentRecyclerView getRecyclerView() {
        return this.f209581c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        if (!this.f209583h) {
            super.onLayout(z, i, i2, i3, i5);
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingLeft2 = getPaddingLeft();
        ScreenContentRecyclerView screenContentRecyclerView = this.f209581c;
        screenContentRecyclerView.layout(paddingLeft, paddingTop, screenContentRecyclerView.getMeasuredWidth() + paddingLeft2, getPaddingTop() + this.f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        a5 a5Var;
        super.onMeasure(i, i2);
        boolean z = this.f209583h;
        ScreenContentRecyclerView screenContentRecyclerView = this.f209581c;
        if (!z || !isLaidOut()) {
            this.e = getMeasuredHeight();
            this.f = screenContentRecyclerView.getMeasuredHeight();
            this.d = getMeasuredHeight();
            return;
        }
        int i3 = this.d;
        int measuredHeight = getMeasuredHeight();
        this.d = measuredHeight;
        if (measuredHeight != i3) {
            this.f = Math.max(this.f, screenContentRecyclerView.getMeasuredHeight());
            ValueAnimator valueAnimator = this.f209582g;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.e, this.d);
            Intrinsics.h(valueAnimatorOfInt);
            a5Var = this;
            ap0.q qVar = new ap0.q(valueAnimatorOfInt, ref$BooleanRef, a5Var, ref$BooleanRef, 3);
            valueAnimatorOfInt.addListener(qVar);
            valueAnimatorOfInt.addUpdateListener(qVar);
            valueAnimatorOfInt.setDuration(250L);
            a5Var.f209582g = valueAnimatorOfInt;
            postOnAnimation(new kt0.d(this, 17));
        } else {
            a5Var = this;
        }
        setMeasuredDimension(getMeasuredWidth(), a5Var.e);
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
    public final void setCollapsable(boolean z) {
        RecyclerView.ItemAnimator itemAnimator;
        ScreenContentRecyclerView screenContentRecyclerView = this.f209581c;
        screenContentRecyclerView.setInteractionsEnabled(!z);
        if (this.f209583h != z) {
            this.f209583h = z;
            a();
            if (z) {
                v4 v4Var = this.f209580b;
                itemAnimator = v4Var;
                if (v4Var == null) {
                    v4 v4Var2 = new v4();
                    v4Var2.setChangeDuration(250L);
                    v4Var2.setRemoveDuration(250L);
                    v4Var2.setAddDuration(250L);
                    v4Var2.setMoveDuration(250L);
                    this.f209580b = v4Var2;
                    itemAnimator = v4Var2;
                }
            } else {
                itemAnimator = this.f209579a;
            }
            screenContentRecyclerView.setItemAnimator(itemAnimator);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a5(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a5(@NotNull Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a5(Context context, AttributeSet attributeSet, int i, int i2) {
        attributeSet = (i2 & 2) != 0 ? null : attributeSet;
        i = (i2 & 4) != 0 ? 0 : i;
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, attributeSet, i, 0);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        this.f209579a = defaultItemAnimator;
        ScreenContentRecyclerView screenContentRecyclerView = new ScreenContentRecyclerView(context, null, 6, 0);
        screenContentRecyclerView.setId(R$id.containerDelegate_recyclerView);
        screenContentRecyclerView.setLayoutManager(new LinearLayoutManager(context));
        screenContentRecyclerView.setItemAnimator(defaultItemAnimator);
        screenContentRecyclerView.addItemDecoration(new o31.b());
        this.f209581c = screenContentRecyclerView;
        addView(screenContentRecyclerView);
    }
}
