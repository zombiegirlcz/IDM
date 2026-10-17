package ft0;

import android.content.Context;
import android.graphics.drawable.StateListDrawable;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.internal.views.conditional_amount.ConditionalAmountActionChipDelegate;
import com.revolut.core.ui_kit.internal.views.conditional_amount.ConditionalAmountAmountEditDelegate;
import com.revolut.core.ui_kit.internal.views.conditional_amount.ConditionalAmountLineBreakDelegate;
import com.revolut.core.ui_kit.internal.views.conditional_amount.ConditionalAmountTextDelegate;
import com.revolut.core.ui_kit.internal.views.conditional_amount.ConditionalAmountToggleDelegate;
import com.revolut.flexbox.FlexboxLayoutManager;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
public final class r extends FrameLayout {

    @NotNull
    private static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConditionalAmountActionChipDelegate f137768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConditionalAmountToggleDelegate f137769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z4l.j f137770c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context, p position, c64.a aVar) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(position, "position");
        ConditionalAmountTextDelegate conditionalAmountTextDelegate = new ConditionalAmountTextDelegate();
        ConditionalAmountActionChipDelegate conditionalAmountActionChipDelegate = new ConditionalAmountActionChipDelegate();
        this.f137768a = conditionalAmountActionChipDelegate;
        ConditionalAmountAmountEditDelegate conditionalAmountAmountEditDelegate = new ConditionalAmountAmountEditDelegate(aVar);
        ConditionalAmountToggleDelegate conditionalAmountToggleDelegate = new ConditionalAmountToggleDelegate();
        this.f137769b = conditionalAmountToggleDelegate;
        z4l.j jVar = new z4l.j(7, v.k(conditionalAmountTextDelegate, conditionalAmountActionChipDelegate, conditionalAmountAmountEditDelegate, conditionalAmountToggleDelegate, new ConditionalAmountLineBreakDelegate()), false);
        this.f137770c = jVar;
        int iK = kli.a.k(context, 16.0f);
        int iK2 = kli.a.k(context, 16.0f);
        setPadding(iK, iK2, iK, iK2);
        setBackground(a(position));
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        recyclerView.setOverScrollMode(2);
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(context, 1);
        flexboxLayoutManager.z(0);
        flexboxLayoutManager.A(1);
        flexboxLayoutManager.y(2);
        flexboxLayoutManager.B(0);
        recyclerView.setLayoutManager(flexboxLayoutManager);
        recyclerView.setAdapter(jVar);
        addView(recyclerView);
    }

    public final StateListDrawable a(p pVar) {
        Pair pair;
        float fA = qv0.h.EXTRA_LARGE.a();
        float fA2 = qv0.h.SMALL.a();
        int i = q.f137767a[pVar.ordinal()];
        if (i == 1) {
            pair = new Pair(Float.valueOf(fA), Float.valueOf(fA2));
        } else if (i == 2) {
            pair = new Pair(Float.valueOf(fA2), Float.valueOf(fA));
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            pair = new Pair(Float.valueOf(fA), Float.valueOf(fA));
        }
        float fFloatValue = ((Number) pair.f186385a).floatValue();
        float fFloatValue2 = ((Number) pair.f186386b).floatValue();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return dr0.l.f117054a.b(context, fFloatValue, fFloatValue2);
    }

    public final efm.r b() {
        efm.r rVarHide = this.f137769b.f56871c.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        efm.r rVarHide2 = this.f137768a.f56869c.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide2, "hide(...)");
        efm.r rVarMerge = efm.r.merge(rVarHide, rVarHide2);
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        return rVarMerge;
    }

    public final void setItems(@NotNull List<Object> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f137770c.c(items);
    }

    public final void setPosition(@NotNull p position) {
        Intrinsics.checkNotNullParameter(position, "position");
        setBackground(a(position));
    }
}
