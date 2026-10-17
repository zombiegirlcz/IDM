package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.ReviewCardDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.ia0;
import ip0.ja0;
import ip0.ka0;
import ip0.la0;
import ip0.ma0;
import ip0.na0;
import ip0.pa0;
import ip0.t90;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0007\u0003\u0002\u0007\b\t\n\u000bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\f"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ReviewCardDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/la0;", "Lip0/pa0;", "<init>", "()V", "Companion", "ip0/ia0", "com/fasterxml/jackson/core/m", "ip0/jp", "ip0/ma0", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ReviewCardDelegate extends BaseRecyclerViewDelegate<la0, pa0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f53189c;
    public final ihm.f d;

    public ReviewCardDelegate() {
        super(R$layout.internal_delegate_review_card, new t90(5));
        this.f53189c = v0.a.d("create(...)");
        this.d = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new pa0(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_review_card));
    }

    /* JADX WARN: Type inference failed for: r2v40, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v41, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(pa0 holder, final la0 data, int i, List payloads) {
        final ReviewCardDelegate reviewCardDelegate;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        TextView textView = holder.f165802l;
        ImageView imageView = holder.f165800h;
        TextView textView2 = holder.i;
        TextView textView3 = holder.f165799g;
        TextView textView4 = holder.f;
        TextView textView5 = holder.k;
        TextView textView6 = holder.f165801j;
        boolean zIsEmpty = payloads.isEmpty();
        ty0.f fVar = ty0.f.f275450a;
        if (zIsEmpty) {
            reviewCardDelegate = this;
            ?? r2 = data.f165154b;
            com.fasterxml.jackson.core.m mVar = data.f165158j;
            kli.a.b(textView4, r2, ty0.f.f275450a);
            kli.a.b(textView3, data.f165155c, ty0.f.f275450a);
            kli.a.b(textView2, data.f, ty0.f.f275450a);
            zi0.c.g(imageView, data.e);
            kli.a.b(textView, data.d, ty0.f.f275450a);
            textView6.setMinLines(mVar.f26179b);
            textView6.setMaxLines(mVar.f26180c);
            kli.a.b(textView6, data.f165156g, fVar);
        } else {
            List list = payloads;
            ArrayList<ma0> arrayList = new ArrayList(zhm.w.t(list, 10));
            for (Object obj2 : list) {
                Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.ReviewCardDelegate.Payload");
                arrayList.add((ma0) obj2);
            }
            for (ma0 ma0Var : arrayList) {
                if (ma0Var.f165344a) {
                    kli.a.b(textView4, data.f165154b, ty0.f.f275450a);
                }
                if (ma0Var.f165345b) {
                    kli.a.b(textView3, data.f165155c, ty0.f.f275450a);
                }
                if (ma0Var.f || ma0Var.f165348h || ma0Var.i || ma0Var.f165347g) {
                    textView6.setMinLines(data.f165158j.f26179b);
                    textView6.setMaxLines(data.f165158j.f26180c);
                    kli.a.b(textView6, data.f165156g, fVar);
                }
                if (ma0Var.e) {
                    kli.a.b(textView2, data.f, ty0.f.f275450a);
                }
                if (ma0Var.d) {
                    zi0.c.g(imageView, data.e);
                }
                if (ma0Var.f165346c) {
                    kli.a.b(textView, data.d, ty0.f.f275450a);
                }
                if (ma0Var.f165349j) {
                    View itemView = holder.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                    or0.b.c(this, data, itemView, false, null, 28);
                }
            }
            reviewCardDelegate = this;
        }
        Clause clause = data.f165156g;
        com.fasterxml.jackson.core.m mVar2 = data.f165158j;
        ia0 ia0Var = data.i;
        if ((clause != null && ia0Var == ia0.VISIBLE_WHEN_DESCRIPTION_ELLIPSIZED && (mVar2 instanceof ja0) && (((ja0) mVar2).d instanceof na0)) || (clause != null && ia0Var == ia0.VISIBLE_WHEN_DESCRIPTION_ELLIPSIZED && (mVar2 instanceof ka0))) {
            ip0.md callback = new ip0.md(holder, data, 6);
            Object obj3 = or0.u.f228038a;
            Intrinsics.checkNotNullParameter(textView6, "<this>");
            Intrinsics.checkNotNullParameter(callback, "callback");
            textView6.getViewTreeObserver().addOnPreDrawListener(new or0.r(textView6, callback));
        } else if (clause == null) {
            kli.a.b(textView5, null, ty0.f.f275450a);
        } else {
            kli.a.b(textView5, data.f165157h, ty0.f.f275450a);
        }
        final int i2 = 0;
        textView5.setOnClickListener(new View.OnClickListener(reviewCardDelegate) { // from class: ip0.ha0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReviewCardDelegate f164528b;

            {
                this.f164528b = reviewCardDelegate;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        this.f164528b.f53189c.onNext(data);
                        break;
                    default:
                        this.f164528b.d.onNext(data);
                        break;
                }
            }
        });
        final int i3 = 1;
        holder.itemView.setOnClickListener(new View.OnClickListener(reviewCardDelegate) { // from class: ip0.ha0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReviewCardDelegate f164528b;

            {
                this.f164528b = reviewCardDelegate;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        this.f164528b.f53189c.onNext(data);
                        break;
                    default:
                        this.f164528b.d.onNext(data);
                        break;
                }
            }
        });
        View itemView2 = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
        or0.b.c(reviewCardDelegate, data, itemView2, false, null, 28);
    }
}
