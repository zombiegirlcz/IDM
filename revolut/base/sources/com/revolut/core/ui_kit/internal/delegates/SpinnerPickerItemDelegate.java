package com.revolut.core.ui_kit.internal.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.spinner_picker.SpinnerPickerItemDelegateModel;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import h30.l;
import ihm.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;
import pof.e;
import pq0.k;
import ty0.c;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0003\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/internal/delegates/SpinnerPickerItemDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/models/spinner_picker/SpinnerPickerItemDelegateModel;", "Lpq0/k;", "<init>", "()V", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SpinnerPickerItemDelegate extends BaseRecyclerViewDelegate<SpinnerPickerItemDelegateModel, k> {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f55846c;

    public static final class a {
        private a() {
        }
    }

    public SpinnerPickerItemDelegate() {
        super(R$layout.internal_delegate_spinner_picker_item, new e(6));
        this.f55846c = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new k(s.r(parent, R$layout.internal_delegate_spinner_picker_item));
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(k holder, SpinnerPickerItemDelegateModel data, int i, List list) {
        List payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof ow0.a)) {
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
        boolean z3 = z;
        boolean z4 = z3;
        int i3 = 0;
        while (true) {
            if (i3 >= size2) {
                break;
            }
            ow0.a aVar = (ow0.a) payloads.get(i3);
            zIsEmpty = zIsEmpty || aVar.f230252a;
            z = z || aVar.f230253b;
            z3 = z3 || aVar.f230254c;
            z4 = z4 || aVar.d;
            i3++;
        }
        if (zIsEmpty) {
            holder.f.setModel(data.f58153a);
        }
        if (z) {
            View view = holder.itemView;
            c.b(l.x(view, "itemView", view), data.f58154b, holder.f238654g, null, null, 12);
        }
        if (z3) {
            AppCompatTextView appCompatTextView = holder.f238655h;
            data.getClass();
            kli.a.b(appCompatTextView, null, ty0.f.f275450a);
        }
        if (z4) {
            holder.f238654g.setMaxLines(data.f ? 1 : 2);
        }
        holder.itemView.setOnClickListener(new kp0.l(this, data, 17));
    }
}
