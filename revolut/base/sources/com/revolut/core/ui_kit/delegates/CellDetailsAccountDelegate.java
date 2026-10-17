package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.CellDetailsAccountDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.recycler.BaseGroupRecyclerViewDelegate;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0002\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CellDetailsAccountDelegate;", "Lcom/revolut/core/ui_kit/recycler/BaseGroupRecyclerViewDelegate;", "Lip0/t5;", "Lip0/u5;", "<init>", "()V", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CellDetailsAccountDelegate extends BaseGroupRecyclerViewDelegate<ip0.t5, ip0.u5> {

    @NotNull
    private static final a Companion = new a();
    public final ihm.f d;
    public final ihm.f e;
    public final ihm.f f;

    public static final class a {
        private a() {
        }
    }

    public CellDetailsAccountDelegate() {
        super(R$layout.internal_delegate_cell_details_account, new ip0.g4(9));
        this.d = v0.a.d("create(...)");
        this.e = v0.a.d("create(...)");
        this.f = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.u5(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_cell_details_account));
    }

    @Override // com.revolut.core.ui_kit.recycler.BaseGroupRecyclerViewDelegate
    public final void q(koi.b bVar, qv0.l lVar, int i, List payloads) {
        ip0.u5 holder = (ip0.u5) bVar;
        final ip0.t5 data = (ip0.t5) lVar;
        Float fValueOf = Float.valueOf(16.0f);
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.q(holder, data, i, payloads);
        View view = holder.itemView;
        ImageView imageView = holder.f166596h;
        TextView textView = holder.f;
        ty0.c cVarX = h30.l.x(view, "itemView", view);
        Clause clause = data.f166448b;
        int i2 = data.d;
        ty0.c.b(cVarX, clause, holder.f, null, null, 12);
        View view2 = holder.itemView;
        ty0.c.b(h30.l.x(view2, "itemView", view2), data.f166449c, holder.f166595g, null, null, 12);
        Integer num = data.f;
        int iIntValue = num != null ? num.intValue() : R$attr.uikit_colorAccent;
        Context context = holder.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iS = kli.a.s(iIntValue, context);
        textView.setTextColor(iS);
        textView.setMaxLines(i2);
        textView.setEllipsize(i2 == Integer.MAX_VALUE ? null : TextUtils.TruncateAt.END);
        Integer num2 = data.f166450g;
        yy0.f.e(or0.u.k(imageView).Q(), new LayeredImage(zhm.u.c(new LayeredImage.Layer.Drawable(num2 != null ? num2.intValue() : R$drawable.uikit_icn_24_copy, (Integer) null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 126)), fValueOf, fValueOf, 8), holder.f166596h, null, null, 12);
        rd0.e.q(imageView, Integer.valueOf(iS));
        final int i3 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: ip0.s5

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CellDetailsAccountDelegate f166297b;

            {
                this.f166297b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i3) {
                    case 0:
                        this.f166297b.d.onNext(data);
                        break;
                    case 1:
                        this.f166297b.e.onNext(data);
                        break;
                    default:
                        this.f166297b.f.onNext(data);
                        break;
                }
            }
        });
        final int i5 = 1;
        holder.itemView.setOnClickListener(new View.OnClickListener(this) { // from class: ip0.s5

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CellDetailsAccountDelegate f166297b;

            {
                this.f166297b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i5) {
                    case 0:
                        this.f166297b.d.onNext(data);
                        break;
                    case 1:
                        this.f166297b.e.onNext(data);
                        break;
                    default:
                        this.f166297b.f.onNext(data);
                        break;
                }
            }
        });
        final int i6 = 2;
        holder.f166595g.setOnClickListener(new View.OnClickListener(this) { // from class: ip0.s5

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CellDetailsAccountDelegate f166297b;

            {
                this.f166297b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i6) {
                    case 0:
                        this.f166297b.d.onNext(data);
                        break;
                    case 1:
                        this.f166297b.e.onNext(data);
                        break;
                    default:
                        this.f166297b.f.onNext(data);
                        break;
                }
            }
        });
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        Clause clause2 = data.f166449c;
        gq0.b bVarF = clause2 != null ? hx7.b.f(clause2) : null;
        Clause clause3 = data.f166448b;
        gq0.d[] elements = {bVarF, clause3 != null ? hx7.b.f(clause3) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        hx7.b.u(kotlin.collections.d.L(elements), itemView);
    }
}
