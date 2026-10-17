package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.BubbleTooltipView;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.ax;
import ip0.bx;
import ip0.fv;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0003\u0007\u0002\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/MapPlainLoadingDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/e9;", "Lip0/ax;", "<init>", "()V", "Companion", "b", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MapPlainLoadingDelegate extends BaseRecyclerViewDelegate<e9, ax> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final List d = zhm.v.k(new f9(0.15f, 0.3f), new f9(0.5f, 0.8f), new f9(0.8f, 0.5f), new f9(0.4f, 0.1f));
    public static final List e = zhm.v.k(new g9(0.15f, 0.3f), new g9(0.5f, 0.8f), new g9(0.8f, 0.5f), new g9(0.4f, 0.1f));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f52774c;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.MapPlainLoadingDelegate$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static abstract class b {
        private b() {
        }

        public abstract float a();

        public abstract float b();
    }

    public MapPlainLoadingDelegate() {
        super(R$layout.internal_delegate_map_plain_loading, new fv(9));
        this.f52774c = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ax(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_map_plain_loading));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View, android.view.ViewGroup, androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r7v6, types: [com.revolut.core.ui_kit.views.BubbleTooltipView] */
    /* JADX WARN: Type inference failed for: r7v7, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r7v8, types: [ms0.b2] */
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
    public final void p(ax holder, e9 data, int i, List payloads) {
        int iA;
        ?? bubbleTooltipView;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        FrameLayout frameLayout = holder.f163502g;
        ?? r3 = holder.f163503h;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        int i2 = bx.f163658a[data.d.ordinal()];
        if (i2 == 1) {
            iA = com.google.android.gms.internal.mlkit_vision_face.a.a(holder.itemView, "getContext(...)", 120.0f);
        } else if (i2 == 2) {
            iA = com.google.android.gms.internal.mlkit_vision_face.a.a(holder.itemView, "getContext(...)", 180.0f);
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            iA = -1;
        }
        layoutParams.height = iA;
        frameLayout.setLayoutParams(layoutParams);
        AttributeSet attributeSet = null;
        knm.b.z(holder.i, data.f54093c, null, 14);
        holder.f.d(((c9.b) ((c9.b) ((c9.b) ((c9.b) new c9.b().i(true)).k(1000L)).j(1.0f)).l(0.5f)).c());
        r3.removeAllViews();
        for (b bVar : data.f54092b) {
            int i3 = 0;
            int i5 = 6;
            if (bVar instanceof f9) {
                Context context = holder.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                bubbleTooltipView = new ms0.b2(context, attributeSet, i5, i3);
                int i6 = R$attr.uikit_colorGreyTone5;
                m70.a.c(kotlin.jvm.internal.t0.f186434a);
                bubbleTooltipView.setContent(new ms0.x1(new TextClause("", (Style) null, (Integer) null, false, (aw0.o9) null, (List) null, 126), i6), null, null, ms0.z1.Marker40);
            } else {
                if (!(bVar instanceof g9)) {
                    throw new NoWhenBranchMatchedException();
                }
                Context context2 = holder.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                bubbleTooltipView = new BubbleTooltipView(context2, attributeSet, i5, i3);
                bubbleTooltipView.setText(new TextClause("            ", (Style) null, (Integer) null, false, (aw0.o9) null, (List) null, 126));
                bubbleTooltipView.f0(mx0.o2.GRAY);
            }
            ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(-2, -2);
            layoutParams2.horizontalBias = bVar.a();
            layoutParams2.verticalBias = bVar.b();
            layoutParams2.topToTop = r3.getId();
            layoutParams2.bottomToBottom = r3.getId();
            layoutParams2.startToStart = r3.getId();
            layoutParams2.endToEnd = r3.getId();
            bubbleTooltipView.setLayoutParams(layoutParams2);
            r3.addView(bubbleTooltipView);
        }
        if (Intrinsics.f(data.i, c.b.f249511a) || (data.i instanceof c.a)) {
            Context context3 = holder.itemView.getContext();
            or0.b.b(this, new c.e(qv0.h.LARGE, 2), holder.f163502g, false, null, null, null, 56);
            Intrinsics.h(context3);
            int iK = kli.a.k(context3, 4.0f);
            ViewGroup.LayoutParams layoutParams3 = frameLayout.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
            marginLayoutParams.setMargins(iK, iK, iK, iK);
            frameLayout.setLayoutParams(marginLayoutParams);
        }
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.c(this, data, itemView, false, null, 28);
        this.f52774c.onNext(Integer.valueOf(i));
    }
}
