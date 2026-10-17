package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.views.HorizontalStepsProgressView;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.g60;
import ip0.h60;
import ip0.l40;
import ip0.ws;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00062\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0005\u0002\u0007\u0003\b\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ProgressionCountDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/tc;", "Lip0/h60;", "<init>", "()V", "Companion", "b", "ip0/g60", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ProgressionCountDelegate extends BaseRecyclerViewDelegate<tc, h60> {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f53037c;

    public static final class a {
        private a() {
        }
    }

    public static abstract class b {
        private b() {
        }
    }

    public ProgressionCountDelegate() {
        super(R$layout.internal_delegate_progression_count, new l40(9));
        this.f53037c = te0.w.y0(new il9.p(23));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new h60(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_progression_count));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(h60 holder, tc data, int i, List payloads) {
        boolean z;
        boolean z3;
        boolean z4;
        boolean z6;
        boolean z11;
        tc tcVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        ProgressBar progressBar = holder.k;
        ArrayList<g60> arrayList = new ArrayList();
        for (Object obj2 : payloads) {
            if (obj2 instanceof g60) {
                arrayList.add(obj2);
            }
        }
        ProgressBar progressBar2 = null;
        if (payloads.size() != arrayList.size()) {
            arrayList = null;
        }
        boolean z12 = arrayList == null || arrayList.isEmpty();
        if (arrayList != null) {
            z = z12;
            z3 = z;
            z4 = z3;
            z6 = z4;
            z11 = z6;
            for (g60 g60Var : arrayList) {
                z12 = z12 || g60Var.f164351a;
                z = z || g60Var.f164352b;
                z3 = z3 || g60Var.f164353c;
                z4 = z4 || g60Var.d;
                z6 = z6 || g60Var.e;
                z11 = z11 || g60Var.f;
            }
        } else {
            z = z12;
            z3 = z;
            z4 = z3;
            z6 = z4;
            z11 = z6;
        }
        if (z12) {
            kli.a.b(holder.f, data.f54767b, ty0.f.f275450a);
        }
        if (z) {
            kli.a.b(holder.f164514g, data.f54768c, ty0.f.f275450a);
        }
        if (z3) {
            kli.a.b(holder.f164515h, data.d, ty0.f.f275450a);
        }
        if (z4) {
            zi0.c.g(holder.i, data.e);
        }
        if (z6) {
            uc ucVar = data.f;
            if (ucVar != null) {
                progressBar.setProgress(ucVar.f54829a);
                progressBar2 = progressBar;
            }
            progressBar.setVisibility(Intrinsics.f(progressBar2, progressBar) ? 0 : 8);
            HorizontalStepsProgressView horizontalStepsProgressView = holder.f164516j;
            horizontalStepsProgressView.setVisibility(Intrinsics.f(progressBar2, horizontalStepsProgressView) ? 0 : 8);
        }
        if (z11) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            tcVar = data;
            or0.b.c(this, tcVar, itemView, true, null, 24);
        } else {
            tcVar = data;
        }
        holder.itemView.setOnClickListener(new ws(this, tcVar, 11));
    }
}
