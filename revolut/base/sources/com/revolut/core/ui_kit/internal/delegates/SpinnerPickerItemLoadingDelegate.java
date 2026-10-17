package com.revolut.core.ui_kit.internal.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.spinner_picker.SpinnerPickerItemLoadingDelegateModel;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import pof.e;
import pq0.l;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/internal/delegates/SpinnerPickerItemLoadingDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/models/spinner_picker/SpinnerPickerItemLoadingDelegateModel;", "Lpq0/l;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SpinnerPickerItemLoadingDelegate extends BaseRecyclerViewDelegate<SpinnerPickerItemLoadingDelegateModel, l> {
    public SpinnerPickerItemLoadingDelegate() {
        super(R$layout.internal_delegate_spinner_picker_loading_item, new e(7));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new l(s.r(parent, R$layout.internal_delegate_spinner_picker_loading_item));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(l holder, SpinnerPickerItemLoadingDelegateModel data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof ow0.b)) {
                payloads = null;
                break;
            }
            i2++;
        }
        if (payloads == null) {
            payloads = f0.f322471a;
        }
        boolean zIsEmpty = payloads.isEmpty();
        int size2 = payloads.size();
        boolean z = zIsEmpty;
        for (int i3 = 0; i3 < size2; i3++) {
            ow0.b bVar = (ow0.b) payloads.get(i3);
            zIsEmpty = zIsEmpty || bVar.f230255a;
            z = z || bVar.f230256b;
        }
        if (zIsEmpty) {
            holder.f238656g.setVisibility(data.f58156a ? 0 : 8);
        }
        if (z) {
            View view = holder.f238657h;
            data.getClass();
            view.setVisibility(8);
        }
    }
}
