package com.revolut.core.ui_kit.delegates.widgets;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import op0.f5;
import op0.g5;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0002\u0003\u0007\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/WidgetCarouselPageDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/z4;", "Lop0/f5;", "<init>", "()V", "Companion", "a", "op0/h5", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WidgetCarouselPageDelegate extends BaseRecyclerViewDelegate<z4, f5> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e01.a f55285c;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.widgets.WidgetCarouselPageDelegate$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public WidgetCarouselPageDelegate() {
        super(R$layout.internal_delegate_widget_carousel_page, new op0.v3(19));
        this.f55285c = new e01.a();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new f5(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_widget_carousel_page));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(f5 holder, z4 data, int i, List payloads) {
        int i2;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        koi.j jVar = holder.e;
        SmallActionButton smallActionButton = holder.f227259h;
        boolean z = jVar != data;
        super.p(holder, data, i, payloads);
        if (z) {
            BaseDraggableWidgetDelegate.Model model = data.f55580b;
            int i3 = g5.f227277a[model.getF54980n().ordinal()];
            if (i3 == 1) {
                i2 = 1;
            } else {
                if (i3 != 2 && i3 != 3 && i3 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = 2;
            }
            holder.k.c(zhm.u.c(model));
            float f = ((i2 * 1.0f) / 2) / 2.0f;
            holder.f.setGuidelinePercent(0.5f - f);
            holder.f227258g.setGuidelinePercent(f + 0.5f);
            Clause clause = data.f55581c;
            smallActionButton.setText(clause);
            smallActionButton.setVisibility(clause == null ? 8 : 0);
            efm.r map = smallActionButton.f56386h.map(new op0.o3(14, new ok7.c(data, 25)));
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            this.f55285c.a(map, holder);
            smallActionButton.setClickable(clause != null);
        }
    }
}
