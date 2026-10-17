package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.views.QrCodePlainView;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImage;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.l40;
import ip0.l70;
import ip0.m70;
import ip0.n70;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0002\u0003\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/QrCodePlainDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/l70;", "Lip0/n70;", "<init>", "()V", "ip0/m70", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class QrCodePlainDelegate extends BaseRecyclerViewDelegate<l70, n70> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e01.a f53137c;

    public QrCodePlainDelegate() {
        super(R$layout.internal_delegate_qr_code_plain, new l40(19));
        this.f53137c = new e01.a();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new n70(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_qr_code_plain));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(n70 holder, l70 data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        View view = holder.itemView;
        QrCodePlainView qrCodePlainView = holder.f165463g;
        Context context = view.getContext();
        View view2 = holder.itemView;
        Intrinsics.h(context);
        int i2 = data.f;
        QrCodeImage qrCodeImage = data.f165139b;
        boolean z = data.f165140c;
        view2.setPadding(kli.a.w(i2, context), kli.a.w(data.d, context), kli.a.w(data.f165141g, context), kli.a.w(data.e, context));
        if (payloads.isEmpty()) {
            View view3 = holder.itemView;
            yy0.f fVarZ = h30.l.z(view3, "itemView", view3);
            ImageView imageView = holder.f;
            Intrinsics.checkNotNullExpressionValue(imageView, "<get-qrImage>(...)");
            yy0.f.e(fVarZ, qrCodeImage, imageView, null, null, 12);
            qrCodePlainView.setBackground(z);
            this.f53137c.a(qrCodePlainView.f58847a, holder);
            return;
        }
        for (m70 m70Var : zhm.c0.N(payloads, m70.class)) {
            if (m70Var.f165331a) {
                View view4 = holder.itemView;
                yy0.f fVarZ2 = h30.l.z(view4, "itemView", view4);
                ImageView imageView2 = holder.f;
                Intrinsics.checkNotNullExpressionValue(imageView2, "<get-qrImage>(...)");
                yy0.f.e(fVarZ2, qrCodeImage, imageView2, null, null, 12);
            }
            if (m70Var.f165332b) {
                qrCodePlainView.setBackground(z);
            }
        }
    }
}
