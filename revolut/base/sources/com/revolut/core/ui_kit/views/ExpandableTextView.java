package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bp0.y;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.g0;
import ix0.c0;
import ix0.c2;
import ix0.w0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx0.q5;
import mx0.s5;
import mx0.t5;
import mx0.u5;
import mx0.v5;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0019\u001cB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\r2\b\b\u0001\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\r2\b\b\u0001\u0010\u0017\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0016J#\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001b\u0010(\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010$R\u001b\u0010-\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\"\u001a\u0004\b+\u0010,R\u001b\u00102\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\"\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Lcom/revolut/core/ui_kit/views/ExpandableTextView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lix0/w0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "image", "", "setImageWithVisibility", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;)V", "Lcom/revolut/core/ui_kit/models/Clause;", "text", "setText", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "attr", "setTextColorAttr", "(I)V", "attrRes", "setTextAppearanceAttr", "Lmx0/v5;", "state", "", "Lmx0/q5;", "links", "setLinks", "(Lmx0/v5;Ljava/util/List;)V", "Landroidx/appcompat/widget/AppCompatTextView;", "k", "Le8/q;", "getTextView", "()Landroidx/appcompat/widget/AppCompatTextView;", "textView", "l", "getActionView", "actionView", "Landroidx/recyclerview/widget/RecyclerView;", "m", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroid/widget/ImageView;", "n", "getImageView", "()Landroid/widget/ImageView;", "imageView", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ExpandableTextView extends ConstraintLayout implements w0 {
    public static final /* synthetic */ int o = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c2 f58530b;
    public final ihm.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ihm.f f58531g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ListCellDelegate f58532h;
    public v5 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f58533j;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final e8.q textView;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final e8.q actionView;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final e8.q recyclerView;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final e8.q imageView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpandableTextView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final AppCompatTextView getActionView() {
        return (AppCompatTextView) this.actionView.f();
    }

    private final ImageView getImageView() {
        return (ImageView) this.imageView.f();
    }

    private final RecyclerView getRecyclerView() {
        return (RecyclerView) this.recyclerView.f();
    }

    private final AppCompatTextView getTextView() {
        return (AppCompatTextView) this.textView.f();
    }

    public final void f0(v5 newState) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        this.f58533j = true;
        this.i = newState;
        AppCompatTextView textView = getTextView();
        int i = newState.d;
        int i2 = newState.f210049c;
        textView.setGravity(i);
        AppCompatTextView textView2 = getTextView();
        if (!(newState instanceof u5) && (newState instanceof s5)) {
            i2 = ((s5) newState).f;
        }
        textView2.setMaxLines(i2);
        ty0.c.b(or0.u.k(this).b0(), newState.f210047a, getActionView(), null, null, 12);
        requestLayout();
    }

    @Override // ix0.w0, ix0.v0
    public /* bridge */ boolean getInsetsAdjustable() {
        return super.getInsetsAdjustable();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        return this.f58530b.c(insets);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r5, int r6) {
        /*
            r4 = this;
            super.onMeasure(r5, r6)
            boolean r0 = r4.f58533j
            if (r0 == 0) goto L4a
            androidx.appcompat.widget.AppCompatTextView r0 = r4.getTextView()
            int r0 = r0.getMeasuredWidth()
            if (r0 <= 0) goto L4a
            r0 = 0
            r4.f58533j = r0
            androidx.appcompat.widget.AppCompatTextView r1 = r4.getTextView()
            int r1 = r1.getLineCount()
            mx0.v5 r2 = r4.i
            int r2 = r2.a()
            r3 = 8
            if (r1 <= r2) goto L40
            mx0.v5 r1 = r4.i
            boolean r2 = r1 instanceof mx0.s5
            if (r2 != 0) goto L30
            boolean r1 = r1 instanceof mx0.u5
            if (r1 == 0) goto L40
        L30:
            androidx.appcompat.widget.AppCompatTextView r1 = r4.getActionView()
            mx0.v5 r2 = r4.i
            com.revolut.core.ui_kit.models.Clause r2 = r2.f210047a
            if (r2 == 0) goto L3b
            goto L3c
        L3b:
            r0 = r3
        L3c:
            r1.setVisibility(r0)
            goto L47
        L40:
            androidx.appcompat.widget.AppCompatTextView r0 = r4.getActionView()
            r0.setVisibility(r3)
        L47:
            super.onMeasure(r5, r6)
        L4a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.ExpandableTextView.onMeasure(int, int):void");
    }

    public final void setImageWithVisibility(Image image) {
        ImageView imageView = getImageView();
        imageView.setVisibility(image != null ? 0 : 8);
        yy0.f.e(or0.u.k(imageView).Q(), image, imageView, null, null, 12);
    }

    public final void setLinks(@NotNull v5 state, @NotNull List<q5> links) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(links, "links");
        RecyclerView recyclerView = getRecyclerView();
        recyclerView.setVisibility(((state instanceof s5) || links.isEmpty()) ? 8 : 0);
        if (recyclerView.getAdapter() == null) {
            recyclerView.setAdapter(new z4l.j(7, zhm.u.c(this.f58532h), false));
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        Intrinsics.i(adapter, "null cannot be cast to non-null type com.revolut.rxdiffadapter.RxDiffAdapter");
        z4l.j jVar = (z4l.j) adapter;
        List<q5> list = links;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (q5 q5Var : list) {
            String str = q5Var.f209956a;
            j8 j8Var = new j8(q5Var.f209957b);
            TextLocalisedClause textLocalisedClause = q5Var.f209958c;
            int i = R$attr.uikit_dp0;
            arrayList.add(new ListCellDelegate.Model(str, j8Var, textLocalisedClause, null, true, q5Var, null, 0, 0, i, i, 968));
        }
        jVar.c(arrayList);
    }

    public final void setText(@NotNull Clause text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f58533j = true;
        kli.a.e(getTextView(), text, new mm7.h(1, this.f, ihm.k.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 27), null, 0, 12);
    }

    public final void setTextAppearanceAttr(int attrRes) {
        jb3.l.e(getTextView(), attrRes);
    }

    public final void setTextColorAttr(int attr) {
        AppCompatTextView textView = getTextView();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        textView.setTextColor(kli.a.s(attr, context));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpandableTextView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandableTextView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f58530b = new c2(this);
        this.f = v0.a.d("create(...)");
        this.f58531g = v0.a.d("create(...)");
        this.f58532h = new ListCellDelegate();
        this.i = t5.e;
        this.f58533j = true;
        this.textView = kli.a.J(R$id.viewExpandableTextLinks_text, this);
        this.actionView = kli.a.J(R$id.viewExpandableTextLinks_action, this);
        this.recyclerView = kli.a.J(R$id.viewExpandableTextLinks_recyclerView, this);
        this.imageView = kli.a.J(R$id.viewExpandableTextLinks_imageView, this);
        View.inflate(context, R$layout.internal_view_expandable_text_links, this);
        getTextView().setMovementMethod(c0.f169220a);
        j01.d dVar = j01.e.Companion;
        AppCompatTextView actionView = getActionView();
        dVar.getClass();
        j01.d.a(actionView);
        getActionView().setOnClickListener(new g0(this, 28));
        ((y) or0.u.k(getActionView()).b0()).s(getActionView(), true);
    }

    public /* synthetic */ ExpandableTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
