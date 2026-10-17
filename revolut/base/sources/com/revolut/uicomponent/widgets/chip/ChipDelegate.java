package com.revolut.uicomponent.widgets.chip;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipDrawable;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import com.revolut.uicomponent.R$layout;
import eu7.c;
import ewh.y;
import ezl.a;
import ezl.b;
import ihm.f;
import java.util.List;
import koi.j;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import yhm.d;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/revolut/uicomponent/widgets/chip/ChipDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lezl/b;", "Lezl/a;", "core_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final class ChipDelegate extends BaseRecyclerViewDelegate<b, a> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f107320c;
    public ChipDrawable d;

    public ChipDelegate() {
        this(null);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (this.d == null) {
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R$layout.view_chip, (ViewGroup) null);
            Intrinsics.i(viewInflate, "null cannot be cast to non-null type com.google.android.material.chip.Chip");
            Drawable chipDrawable = ((Chip) viewInflate).getChipDrawable();
            Intrinsics.i(chipDrawable, "null cannot be cast to non-null type com.google.android.material.chip.ChipDrawable");
            this.d = (ChipDrawable) chipDrawable;
        }
        return new a(s.r(parent, R$layout.view_chip));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ void p(RecyclerView.ViewHolder viewHolder, j jVar, int i, List list) {
        p((a) viewHolder, i, list);
        throw null;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: m */
    public final /* bridge */ /* synthetic */ void p(koi.b bVar, j jVar, int i, List list) {
        p((a) bVar, i, list);
        throw null;
    }

    public final void p(a holder, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(null, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, null, i, payloads);
        holder.itemView.getContext();
        Chip chip = holder.f;
        chip.setChipIcon(null);
        chip.setRippleColor(null);
        chip.setChipIconTint(null);
        throw null;
    }

    public ChipDelegate(c cVar) {
        super(R$layout.view_chip, new y(10));
        this.f107320c = cVar;
        Intrinsics.checkNotNullExpressionValue(new f(), "create(...)");
    }
}
