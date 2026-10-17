package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CustomColors;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import com.youTransactor.uCube.rpc.Constants;
import ip0.fn0;
import ip0.gn0;
import ip0.hn0;
import ip0.in0;
import ip0.jn0;
import ip0.kn0;
import ip0.ri0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0005\u0003\u0007\u0002\b\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/TwoLogosHeaderDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/gn0;", "Lip0/jn0;", "<init>", "()V", "Companion", "ip0/en0", "ip0/hn0", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TwoLogosHeaderDelegate extends BaseRecyclerViewDelegate<gn0, jn0> {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public TwoLogosHeaderDelegate() {
        super(R$layout.internal_delegate_two_logos, new ri0(27));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new jn0(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_two_logos));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(jn0 holder, gn0 data, int i, List payloads) {
        int iA;
        int iA2;
        Image resourceImage;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        ArrayList<hn0> arrayList = new ArrayList();
        for (Object obj2 : payloads) {
            if (obj2 instanceof hn0) {
                arrayList.add(obj2);
            }
        }
        boolean zIsEmpty = payloads.isEmpty();
        boolean z = zIsEmpty;
        for (hn0 hn0Var : arrayList) {
            zIsEmpty = zIsEmpty || hn0Var.f164574a;
            z = z || hn0Var.f164575b;
        }
        if (zIsEmpty) {
            fn0 revolutLogoType = data.d;
            ImageView imageView = holder.f164897g;
            Intrinsics.checkNotNullParameter(revolutLogoType, "revolutLogoType");
            int i2 = in0.f164718a[revolutLogoType.ordinal()];
            if (i2 == 1) {
                iA = -2;
                iA2 = -2;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                iA = com.google.android.gms.internal.mlkit_vision_face.a.a(holder.itemView, "getContext(...)", 88.0f);
                iA2 = com.google.android.gms.internal.mlkit_vision_face.a.a(holder.itemView, "getContext(...)", 38.0f);
            }
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null && (((ViewGroup.MarginLayoutParams) layoutParams2).width != iA || ((ViewGroup.MarginLayoutParams) layoutParams2).height != iA2)) {
                ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
                if (layoutParams3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams3.width = iA;
                layoutParams3.height = iA2;
                imageView.setLayoutParams(layoutParams3);
            }
            int i3 = kn0.f165054a[data.d.ordinal()];
            if (i3 == 1) {
                resourceImage = new ResourceImage(R$drawable.uikit_icn_revolut_logo, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246);
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                resourceImage = new CdnImage("vertical_black_logo", "mobile/business/logos", null, new ImageTransformations(null, null, new CustomColors(1, null, new Color.Solid(R$attr.uikit_colorForeground)), gz0.b.CenterInside, null, null, null, ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG), null, null, Constants.TAG_F4);
            }
            View view = holder.itemView;
            yy0.f.e(h30.l.z(view, "itemView", view), resourceImage, holder.f164897g, null, null, 12);
        }
        if (z) {
            if (data.f164454c == null) {
                yy0.f.e(or0.u.k(holder.f).Q(), data.f164453b.a(), holder.f, null, null, 12);
            } else {
                View view2 = holder.itemView;
                yy0.f.e(h30.l.z(view2, "itemView", view2), data.f164454c, holder.f, null, null, 12);
            }
        }
    }
}
