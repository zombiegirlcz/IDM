package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import com.revolut.ui_kit_pdf.PdfView;
import ip0.tz;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0002\u0006\u0003\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/PdfDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/ga;", "Lcom/revolut/core/ui_kit/delegates/ja;", "<init>", "()V", "a", "b", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PdfDelegate extends BaseRecyclerViewDelegate<ga, ja> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.b f52890c;

    public static abstract class a {
        private a() {
        }
    }

    public static abstract class b {

        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f52891a = new a();

            private a() {
            }
        }

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.PdfDelegate$b$b, reason: collision with other inner class name */
        public static final class C0416b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0416b f52892a = new C0416b();

            private C0416b() {
            }
        }

        private b() {
        }
    }

    public PdfDelegate() {
        super(R$layout.internal_delegate_pdf, new tz(4));
        this.f52890c = j6.a.h("create(...)");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void p(ja holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        View view = holder.itemView;
        Intrinsics.i(view, "null cannot be cast to non-null type android.widget.FrameLayout");
        FrameLayout frameLayout = (FrameLayout) view;
        View view2 = holder.f54326g;
        int iIndexOfChild = frameLayout.indexOfChild(view2);
        frameLayout.removeView(view2);
        Context context = frameLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        PdfView pdfView = new PdfView(context, 0 == true ? 1 : 0, 4, 0);
        pdfView.setLayoutParams(view2.getLayoutParams());
        pdfView.setId(View.generateViewId());
        frameLayout.addView(pdfView, iIndexOfChild);
        Intrinsics.checkNotNullParameter(pdfView, "<set-?>");
        holder.f54326g = pdfView;
        koi.j jVar = holder.e;
        ga gaVar = jVar instanceof ga ? (ga) jVar : null;
        if (gaVar != null) {
            holder.F(gaVar);
        }
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ja(kotlin.jvm.internal.s.r(parent, this.f98535a), this.f52890c);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    /* JADX INFO: renamed from: j */
    public final void p(RecyclerView.ViewHolder viewHolder, koi.j jVar, int i, List payloads) {
        ja holder = (ja) viewHolder;
        ga data = (ga) jVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        holder.F(data);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    /* JADX INFO: renamed from: k */
    public final /* bridge */ /* synthetic */ void n(RecyclerView.ViewHolder viewHolder) {
        p((ja) viewHolder);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: m */
    public final void p(koi.b bVar, koi.j jVar, int i, List payloads) {
        ja holder = (ja) bVar;
        ga data = (ga) jVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        holder.F(data);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final /* bridge */ /* synthetic */ void n(koi.b bVar) {
        p((ja) bVar);
    }
}
