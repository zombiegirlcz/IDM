package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.bo;
import ip0.vn;
import ip0.wn;
import ip0.xn;
import ip0.yn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \b*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u0005:\u0006\u0007\u0006\u0001\u0003\t\n¨\u0006\u000b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/HomeScreenPreviewDelegate;", "Lip0/vn;", "InnerModel", "Lip0/wn;", "InnerViewHolder", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/xn;", "Lip0/bo;", "Companion", "ip0/yn", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HomeScreenPreviewDelegate<InnerModel extends vn, InnerViewHolder extends wn> extends BaseRecyclerViewDelegate<xn, bo> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final iv0.t d = new iv0.t();
    public static final int e = R$attr.uikit_colorGreyTone10;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BaseRecyclerViewDelegate f52455c;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.HomeScreenPreviewDelegate$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeScreenPreviewDelegate(BaseRecyclerViewDelegate innerDelegate) {
        super(d.a(innerDelegate.getClass()), new in1.a(innerDelegate, 4));
        Intrinsics.checkNotNullParameter(innerDelegate, "innerDelegate");
        this.f52455c = innerDelegate;
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(new ContextThemeWrapper(parent.getContext(), R$style.UiKitTheme_TransparentDayNight)).inflate(R$layout.internal_delegate_home_screen_preview, parent, false);
        Intrinsics.h(viewInflate);
        View rootView = viewInflate.getRootView();
        Intrinsics.i(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
        return new bo(viewInflate, (wn) this.f52455c.g((ViewGroup) rootView));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.List] */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(bo holder, xn data, int i, List payloads) {
        ?? arrayList;
        boolean z;
        boolean z3;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof yn)) {
                payloads = null;
                break;
            }
            i2++;
        }
        boolean zN = ue0.e.n(payloads);
        if (payloads != null) {
            arrayList = new ArrayList();
            Iterator it8 = payloads.iterator();
            while (it8.hasNext()) {
                Object obj2 = ((yn) it8.next()).f167337a;
                if (obj2 != null) {
                    arrayList.add(obj2);
                }
            }
        } else {
            arrayList = zhm.f0.f322471a;
        }
        boh.f.b(this.f52455c, holder.f, data.f167200c, i, arrayList, data);
        if (payloads != null) {
            int size2 = payloads.size();
            z = zN;
            for (int i3 = 0; i3 < size2; i3++) {
                yn ynVar = (yn) payloads.get(i3);
                zN = zN || ynVar.f167338b;
                z = z || ynVar.f167339c;
            }
        } else {
            z = zN;
        }
        if (zN) {
            NavBarWithContainerBackground background = data.f167199b;
            Intrinsics.checkNotNullParameter(background, "background");
            xr0.i iVar = holder.f163643l;
            NavBarWithContainerBackground navBarWithContainerBackgroundA = com.revolut.core.ui_kit.models.m.a(background);
            if (background instanceof NavBarWithContainerBackground.VideoBackground) {
                z3 = true;
            } else if (background instanceof NavBarWithContainerBackground.ImageBackground) {
                z3 = ((NavBarWithContainerBackground.ImageBackground) background).f57879a instanceof LottieImage;
            } else {
                if (!background.equals(NavBarWithContainerBackground.TransparentBackground.f57882a)) {
                    throw new NoWhenBranchMatchedException();
                }
                z3 = false;
            }
            iVar.a(navBarWithContainerBackgroundA, z3 ? background : null);
        }
        if (z) {
            if (!data.d) {
                up0.l0 l0Var = holder.k;
                if (l0Var != null) {
                    l0Var.setVisibility(8);
                    return;
                }
                return;
            }
            ConstraintLayout constraintLayout = holder.f163640g;
            up0.l0 l0Var2 = holder.k;
            if (l0Var2 == null) {
                Context context = holder.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                l0Var2 = new up0.l0(context, new il9.p(17), new up0.b(200, 0, 0), 0.5f);
                l0Var2.setId(View.generateViewId());
                l0Var2.setVisibility(8);
                l0Var2.setOutlineProvider(holder.f163642j);
                l0Var2.setClipToOutline(true);
                constraintLayout.addView(l0Var2, constraintLayout.indexOfChild(holder.f.itemView));
                ConstraintSet constraintSet = new ConstraintSet();
                constraintSet.clone(constraintLayout);
                constraintSet.constrainWidth(l0Var2.getId(), 0);
                constraintSet.constrainHeight(l0Var2.getId(), 0);
                constraintSet.constrainPercentHeight(l0Var2.getId(), 0.62f);
                constraintSet.connect(l0Var2.getId(), 3, holder.itemView.getId(), 3);
                constraintSet.connect(l0Var2.getId(), 6, holder.itemView.getId(), 6);
                constraintSet.connect(l0Var2.getId(), 7, holder.itemView.getId(), 7);
                constraintSet.applyTo(constraintLayout);
                holder.k = l0Var2;
            }
            l0Var2.setVisibility(0);
        }
    }
}
