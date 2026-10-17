package com.revolut.core.ui_kit.delegates;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.recycler.BaseBoxRecyclerViewDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.jl0;
import ip0.kl0;
import ip0.ri0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0002\u0003\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ToDoItemDelegate;", "Lcom/revolut/core/ui_kit/recycler/BaseBoxRecyclerViewDelegate;", "Lip0/jl0;", "Lip0/kl0;", "<init>", "()V", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ToDoItemDelegate extends BaseBoxRecyclerViewDelegate<jl0, kl0> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.ToDoItemDelegate$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static void a(List items) {
            Intrinsics.checkNotNullParameter(items, "items");
            int i = 0;
            for (Object obj2 : items) {
                int i2 = i + 1;
                if (i < 0) {
                    zhm.v.s();
                    throw null;
                }
                jl0 jl0Var = (jl0) obj2;
                jl0Var.f = i == 0 ? R$attr.uikit_dp16 : R$attr.uikit_dp4;
                jl0Var.f164873g = i == items.size() + (-1) ? R$attr.uikit_dp16 : R$attr.uikit_dp0;
                i = i2;
            }
        }
    }

    public ToDoItemDelegate() {
        super(R$layout.internal_delegate_to_do_item, false, new ri0(14));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new kl0(kotlin.jvm.internal.s.r(parent, this.f58164c));
    }

    @Override // com.revolut.core.ui_kit.recycler.BaseBoxRecyclerViewDelegate
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void p(kl0 holder, jl0 data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        holder.f.setModel(new aw0.pa(data.f164871b, data.f164872c, data.d));
    }
}
