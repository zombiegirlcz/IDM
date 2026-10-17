package com.revolut.core.ui_kit.internal.popups;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.List;
import jb3.l;
import kli.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ypg.h;
import yr0.d;
import yr0.e;
import yr0.f;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0002\u0003\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/internal/popups/PopupMenuSectionHeaderDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lyr0/d;", "Lyr0/f;", "<init>", "()V", "yr0/e", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PopupMenuSectionHeaderDelegate extends BaseRecyclerViewDelegate<d, f> {
    public PopupMenuSectionHeaderDelegate() {
        super(R$id.popupMenuSectionHeader, new h(6));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        UIKitTextView uIKitTextView = new UIKitTextView(context, null, 6, 0);
        uIKitTextView.setId(R$id.popupMenuSectionHeader);
        uIKitTextView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        Context context2 = uIKitTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        uIKitTextView.setMinimumWidth(a.k(context2, 200.0f));
        l.e(uIKitTextView, R$attr.internal_textAppearanceBody3);
        Context context3 = uIKitTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        uIKitTextView.setTextColor(a.s(R$attr.uikit_colorGreyTone50, context3));
        uIKitTextView.setSingleLine();
        uIKitTextView.setEllipsize(TextUtils.TruncateAt.END);
        uIKitTextView.setTextAlignment(5);
        Context context4 = uIKitTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        int iK = a.k(context4, 16.0f);
        Context context5 = uIKitTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        int iK2 = a.k(context5, 8.0f);
        Context context6 = uIKitTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        int iK3 = a.k(context6, 16.0f);
        Context context7 = uIKitTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
        uIKitTextView.setPaddingRelative(iK, iK2, iK3, a.k(context7, 8.0f));
        ViewCompat.setAccessibilityHeading(uIKitTextView, true);
        return new f(uIKitTextView);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(f holder, d data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        UIKitTextView uIKitTextView = holder.f;
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof e)) {
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
            e eVar = (e) payloads.get(i3);
            zIsEmpty = zIsEmpty || eVar.f316060a;
            z = z || eVar.f316061b;
        }
        if (zIsEmpty) {
            a.b(uIKitTextView, data.f316058b, ty0.f.f275450a);
        }
        if (z) {
            Context context = uIKitTextView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int iK = a.k(context, data.f316059c ? 48.0f : 16.0f);
            if (uIKitTextView.getPaddingStart() != iK) {
                uIKitTextView.setPaddingRelative(iK, uIKitTextView.getPaddingTop(), uIKitTextView.getPaddingEnd(), uIKitTextView.getPaddingBottom());
            }
        }
    }
}
