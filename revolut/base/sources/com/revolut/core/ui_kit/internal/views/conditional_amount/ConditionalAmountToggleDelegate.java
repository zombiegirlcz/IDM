package com.revolut.core.ui_kit.internal.views.conditional_amount;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import au0.t1;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.ConditionalAmountDelegate$ConditionalAmountItem$Toggle;
import com.revolut.core.ui_kit.internal.views.SuggestionView;
import com.revolut.core.ui_kit.internal.views.SuggestionViewStyle;
import com.revolut.flexbox.FlexboxLayoutManager;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import fq7.j;
import ft0.k;
import ft0.l;
import ft0.t;
import ihm.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import or0.m;
import or0.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0003\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/conditional_amount/ConditionalAmountToggleDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lft0/l;", "Lft0/t;", "<init>", "()V", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ConditionalAmountToggleDelegate extends BaseRecyclerViewDelegate<l, t> {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f56871c;

    public static final class a {
        private a() {
        }
    }

    public ConditionalAmountToggleDelegate() {
        super(R$id.internal_conditional_amount_toggle_delegate_view_type, new j(11));
        this.f56871c = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        SuggestionView suggestionView = new SuggestionView(context, null, 6, 0);
        suggestionView.g0(new SuggestionViewStyle.Semiaccent((Object) null));
        Context context2 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        FlexboxLayoutManager.LayoutParams layoutParams = new FlexboxLayoutManager.LayoutParams(-2, kli.a.k(context2, 30.0f));
        Context context3 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        layoutParams.setMarginEnd(kli.a.k(context3, 6.0f));
        suggestionView.setLayoutParams(layoutParams);
        return new t(suggestionView);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(t holder, l data, int i, List payloads) {
        boolean z;
        boolean z3;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        SuggestionView suggestionView = holder.f;
        ConditionalAmountDelegate$ConditionalAmountItem$Toggle conditionalAmountDelegate$ConditionalAmountItem$Toggle = data.f137765a;
        boolean z4 = conditionalAmountDelegate$ConditionalAmountItem$Toggle.d;
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof k)) {
                payloads = null;
                break;
            }
            i2++;
        }
        List list = payloads;
        boolean z6 = list == null || list.isEmpty();
        if (payloads != null) {
            int size2 = payloads.size();
            z = z6;
            z3 = z;
            for (int i3 = 0; i3 < size2; i3++) {
                k kVar = (k) payloads.get(i3);
                z6 = z6 || kVar.f137762a;
                z = z || kVar.f137763b;
                z3 = z3 || kVar.f137764c;
            }
        } else {
            z = z6;
            z3 = z;
        }
        if (z6) {
            suggestionView.setText(conditionalAmountDelegate$ConditionalAmountItem$Toggle.f52121b);
        }
        if (z) {
            suggestionView.setIcon(conditionalAmountDelegate$ConditionalAmountItem$Toggle.f52122c);
        }
        if (z3) {
            suggestionView.setEnabled(z4);
        }
        m.a(suggestionView);
        if (z4) {
            suggestionView.setOnClickListener(new t1(conditionalAmountDelegate$ConditionalAmountItem$Toggle, 4, this, conditionalAmountDelegate$ConditionalAmountItem$Toggle));
        } else {
            u.o(suggestionView);
        }
    }
}
