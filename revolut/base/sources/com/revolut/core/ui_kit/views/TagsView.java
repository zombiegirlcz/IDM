package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.delegates.TagDelegate;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.flexbox.FlexboxLayoutManager;
import ip0.vj0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx0.bc;
import mx0.oc;
import mx0.pc;
import mx0.qc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\u000e\u0018B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/revolut/core/ui_kit/views/TagsView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "maxLines", "", "setMaxLines", "(Ljava/lang/Integer;)V", "Lmx0/qc;", "model", "setModel", "(Lmx0/qc;)V", "Lcom/revolut/core/ui_kit/delegates/TagDelegate;", "d", "Lkotlin/Lazy;", "getTagDelegate", "()Lcom/revolut/core/ui_kit/delegates/TagDelegate;", "tagDelegate", "mx0/pc", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TagsView extends FrameLayout {
    public static final /* synthetic */ int e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z4l.j f58898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f58899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f58900c;
    public final Object d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TagsView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final TagDelegate getTagDelegate() {
        return (TagDelegate) this.d.getValue();
    }

    private final void setMaxLines(Integer maxLines) {
        RecyclerView recyclerView = this.f58899b;
        RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        FlexboxLayoutManager flexboxLayoutManager = layoutManager instanceof FlexboxLayoutManager ? (FlexboxLayoutManager) layoutManager : null;
        if (flexboxLayoutManager != null) {
            int iIntValue = maxLines != null ? maxLines.intValue() : -1;
            if (flexboxLayoutManager.e != iIntValue) {
                flexboxLayoutManager.e = iIntValue;
                flexboxLayoutManager.requestLayout();
            }
        }
    }

    public final efm.r a() {
        efm.r map = getTagDelegate().d.map(new bc(new oc(0), 2));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final void setModel(@NotNull qc model) {
        Intrinsics.checkNotNullParameter(model, "model");
        List list = model.f209964a;
        Integer num = model.f209965b;
        if (!list.isEmpty() || this.f58900c) {
            if (!this.f58900c) {
                RecyclerView recyclerView = new RecyclerView(getContext());
                recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                addView(recyclerView);
                recyclerView.setOverScrollMode(2);
                FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(recyclerView.getContext(), 1);
                flexboxLayoutManager.z(0);
                flexboxLayoutManager.A(1);
                flexboxLayoutManager.B(0);
                flexboxLayoutManager.y(0);
                int iIntValue = num != null ? num.intValue() : -1;
                if (flexboxLayoutManager.e != iIntValue) {
                    flexboxLayoutManager.e = iIntValue;
                    flexboxLayoutManager.requestLayout();
                }
                recyclerView.setLayoutManager(flexboxLayoutManager);
                this.f58899b = recyclerView;
                z4l.j jVar = new z4l.j(7, zhm.u.c(getTagDelegate()), false);
                this.f58898a = jVar;
                RecyclerView recyclerView2 = this.f58899b;
                if (recyclerView2 != null) {
                    recyclerView2.setAdapter(jVar);
                }
                this.f58900c = true;
            }
            setMaxLines(num);
            z4l.j jVar2 = this.f58898a;
            if (jVar2 == null) {
                Intrinsics.r("adapter");
                throw null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            int i = 0;
            while (i < size) {
                pc pcVar = (pc) list.get(i);
                String str = pcVar.f209943a;
                TagViewData tagViewData = pcVar.f209944b;
                Object obj2 = pcVar.f209945c;
                boolean z = num != null && i == list.size() - 1;
                int i2 = R$attr.uikit_dp8;
                int i3 = R$attr.uikit_dp0;
                arrayList.add(new vj0(str, tagViewData, z, obj2, i2, i3, i3, i2, 4));
                i++;
            }
            jVar2.c(arrayList);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TagsView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TagsView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.d = te0.w.y0(new mw1.a(17));
    }

    public /* synthetic */ TagsView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
