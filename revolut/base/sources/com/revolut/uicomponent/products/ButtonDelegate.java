package com.revolut.uicomponent.products;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import com.revolut.uicomponent.R$id;
import com.revolut.uicomponent.R$layout;
import ihm.f;
import java.util.List;
import koi.j;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uyh.s;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00042\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0005\u0002\u0003\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/uicomponent/products/ButtonDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Luyl/b;", "Luyl/d;", "Companion", "uyl/c", "a", "core_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@yhm.d
public final class ButtonDelegate extends BaseRecyclerViewDelegate<uyl.b, uyl.d> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f107163c;

    /* JADX INFO: renamed from: com.revolut.uicomponent.products.ButtonDelegate$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ButtonDelegate(Function1 function1, uyl.c style) {
        int i;
        Intrinsics.checkNotNullParameter(style, "style");
        INSTANCE.getClass();
        int i2 = a.f107218a[style.ordinal()];
        if (i2 == 1) {
            i = R$layout.delegate_button_shadow_blue;
        } else if (i2 == 2) {
            i = R$layout.delegate_button_no_shadow_blue;
        } else if (i2 == 3) {
            i = R$layout.delegate_button_outlined_blue;
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$layout.delegate_button_outlined_grey;
        }
        super(i, new s(3));
        this.f107163c = function1;
        Intrinsics.checkNotNullExpressionValue(new f(), "create(...)");
        Intrinsics.checkNotNullExpressionValue(new f(), "create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View itemView = LayoutInflater.from(parent.getContext()).inflate(this.f98535a, parent, false);
        Intrinsics.checkNotNullExpressionValue(itemView, "inflate(...)");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        uyl.d dVar = new uyl.d(itemView);
        View viewFindViewById = itemView.findViewById(R$id.delegate_button_title);
        Intrinsics.i(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = itemView.findViewById(R$id.delegate_button_bottom_text);
        Intrinsics.i(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        return dVar;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    /* JADX INFO: renamed from: j */
    public final void p(RecyclerView.ViewHolder viewHolder, j jVar, int i, List payloads) {
        uyl.d holder = (uyl.d) viewHolder;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(null, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, null, i, payloads);
        throw null;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: m */
    public final void p(koi.b bVar, j jVar, int i, List payloads) {
        uyl.d holder = (uyl.d) bVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(null, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, null, i, payloads);
        throw null;
    }
}
