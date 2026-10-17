package com.revolut.core.ui_kit.internal.views.conditional_amount;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import au0.r2;
import com.revolut.core.ui_kit.R$id;
import com.revolut.flexbox.FlexboxLayoutManager;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import fp0.p;
import fq7.j;
import ft0.d;
import ft0.e;
import ihm.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import or0.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0003\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/conditional_amount/ConditionalAmountActionChipDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lft0/e;", "Lft0/a;", "<init>", "()V", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ConditionalAmountActionChipDelegate extends BaseRecyclerViewDelegate<e, ft0.a> {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f56869c;

    public static final class a {
        private a() {
        }
    }

    public ConditionalAmountActionChipDelegate() {
        super(R$id.internal_conditional_amount_action_chip_delegate_view_type, new j(7));
        this.f56869c = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        st0.a aVar = new st0.a(context, null, 6, 0);
        Context context2 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        FlexboxLayoutManager.LayoutParams layoutParams = new FlexboxLayoutManager.LayoutParams(-2, kli.a.k(context2, 40.0f));
        Context context3 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        layoutParams.setMarginEnd(kli.a.k(context3, 6.0f));
        aVar.setLayoutParams(layoutParams);
        return new ft0.a(aVar);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ft0.a holder, e data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        st0.a aVar = holder.f;
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof d)) {
                payloads = null;
                break;
            }
            i2++;
        }
        List list = payloads;
        boolean z = list == null || list.isEmpty();
        if (payloads != null) {
            int size2 = payloads.size();
            for (int i3 = 0; i3 < size2; i3++) {
                z = z || ((d) payloads.get(i3)).f137753a;
            }
        }
        if (z) {
            aVar.setModel(data.f137754a);
        }
        p clickHandler$ui_kit_components_release = aVar.getClickHandler$ui_kit_components_release();
        p.b(clickHandler$ui_kit_components_release, true);
        View view = clickHandler$ui_kit_components_release.f137029a;
        m.a(view);
        view.setOnClickListener(new r2(this, data, 2));
    }
}
