package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.layout.UIKitConstraintLayout;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.TiltGlowCardContainerView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.SmoothEdgesUrlImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import com.youTransactor.uCube.rpc.Constants;
import ip0.dk;
import ip0.pk;
import ip0.qk;
import ip0.vk;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0003\u0002\u0007\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/GiftCardDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/pk;", "Lip0/vk;", "<init>", "()V", "Companion", "ip0/qk", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GiftCardDelegate extends BaseRecyclerViewDelegate<pk, vk> {
    public GiftCardDelegate() {
        super(R$layout.internal_delegate_gift_card, new dk(3));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        vk vkVar = new vk(kotlin.jvm.internal.s.r(parent, this.f98535a));
        View itemView = vkVar.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        UIKitConstraintLayout uIKitConstraintLayout = (UIKitConstraintLayout) itemView.findViewById(R$id.card_constraintLayout);
        uIKitConstraintLayout.setAspectRatioConfig(new ut0.e(new aw0.d0(343, Constants.TAG_EMV_L2_VERSION), ut0.a.ADJUST_HEIGHT));
        Context context = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        uIKitConstraintLayout.setMaxHeight(kli.a.k(context, 250.0f));
        return vkVar;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(final vk holder, pk data, int i, List list) {
        List<qk> payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        TiltGlowCardContainerView tiltGlowCardContainerView = holder.f;
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof qk)) {
                payloads = null;
                break;
            }
            i2++;
        }
        if (payloads == null) {
            payloads = zhm.f0.f322471a;
        }
        boolean zIsEmpty = payloads.isEmpty();
        boolean z = zIsEmpty;
        boolean z3 = z;
        boolean z4 = z3;
        boolean z6 = z4;
        for (qk qkVar : payloads) {
            z = z || qkVar.f166008a;
            z3 = z3 || qkVar.f166009b;
            z4 = z4 || qkVar.f166010c;
            z6 = z6 || qkVar.d;
            zIsEmpty = zIsEmpty || qkVar.e;
        }
        if (zIsEmpty) {
            tiltGlowCardContainerView.setTiltEffectEnabled(data.f165842b);
        }
        if (z) {
            Image cardImage = data.f165841a;
            boolean z11 = data.f165842b;
            ShapeableImageView shapeableImageView = holder.f166834g;
            Intrinsics.checkNotNullParameter(cardImage, "cardImage");
            if ((cardImage instanceof UrlImage) && z11) {
                String str = ((UrlImage) cardImage).f60017a;
                float fA = qv0.h.EXTRA_LARGE.a();
                SmoothEdgesUrlImage smoothEdgesUrlImage = new SmoothEdgesUrlImage(str, fA, null);
                float fA2 = r6.b.a(holder.itemView, "getContext(...)", fA);
                shapeableImageView.setShapeAppearanceModel(new ShapeAppearanceModel().withCornerSize(fA2));
                tiltGlowCardContainerView.setCornerRadius(fA2);
                Context context = holder.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                final int i3 = 0;
                yy0.f.e(jh.d.f(context).Q(), smoothEdgesUrlImage, holder.f166834g, new Function1() { // from class: ip0.rk
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Drawable drawable = (Drawable) obj2;
                        switch (i3) {
                            case 0:
                                vk vkVar = holder;
                                tk tkVarF = vkVar.F(drawable);
                                AppCompatTextView appCompatTextView = vkVar.f166835h;
                                int i5 = tkVarF.f166534a;
                                appCompatTextView.setTextColor(i5);
                                AppCompatTextView appCompatTextView2 = vkVar.i;
                                appCompatTextView2.setTextColor(i5);
                                appCompatTextView2.setAlpha(0.8f);
                                vkVar.f.setChildDominantColor(tkVarF.f166535b);
                                break;
                            default:
                                vk vkVar2 = holder;
                                tk tkVarF2 = vkVar2.F(drawable);
                                AppCompatTextView appCompatTextView3 = vkVar2.f166835h;
                                int i6 = tkVarF2.f166534a;
                                appCompatTextView3.setTextColor(i6);
                                AppCompatTextView appCompatTextView4 = vkVar2.i;
                                appCompatTextView4.setTextColor(i6);
                                appCompatTextView4.setAlpha(0.8f);
                                break;
                        }
                        return Unit.f186387a;
                    }
                }, null, 8);
            } else {
                Context context2 = holder.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                final int i5 = 1;
                yy0.f.e(jh.d.f(context2).Q(), cardImage, holder.f166834g, new Function1() { // from class: ip0.rk
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Drawable drawable = (Drawable) obj2;
                        switch (i5) {
                            case 0:
                                vk vkVar = holder;
                                tk tkVarF = vkVar.F(drawable);
                                AppCompatTextView appCompatTextView = vkVar.f166835h;
                                int i59 = tkVarF.f166534a;
                                appCompatTextView.setTextColor(i59);
                                AppCompatTextView appCompatTextView2 = vkVar.i;
                                appCompatTextView2.setTextColor(i59);
                                appCompatTextView2.setAlpha(0.8f);
                                vkVar.f.setChildDominantColor(tkVarF.f166535b);
                                break;
                            default:
                                vk vkVar2 = holder;
                                tk tkVarF2 = vkVar2.F(drawable);
                                AppCompatTextView appCompatTextView3 = vkVar2.f166835h;
                                int i6 = tkVarF2.f166534a;
                                appCompatTextView3.setTextColor(i6);
                                AppCompatTextView appCompatTextView4 = vkVar2.i;
                                appCompatTextView4.setTextColor(i6);
                                appCompatTextView4.setAlpha(0.8f);
                                break;
                        }
                        return Unit.f186387a;
                    }
                }, null, 8);
                ShapeAppearanceModel shapeAppearanceModel = new ShapeAppearanceModel();
                Context context3 = holder.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                shapeableImageView.setShapeAppearanceModel(shapeAppearanceModel.withCornerSize(kli.a.l(context3, qv0.h.EXTRA_LARGE.a())));
            }
        }
        if (z3) {
            MoneyClause moneyClause = data.f165843c;
            holder.f166835h.setVisibility(moneyClause != null ? 0 : 8);
            View view = holder.itemView;
            ty0.c.b(h30.l.x(view, "itemView", view), moneyClause, holder.f166835h, null, null, 12);
        }
        if (z4) {
            TextLocalisedClause textLocalisedClause = data.d;
            holder.i.setVisibility(textLocalisedClause == null ? 8 : 0);
            if (textLocalisedClause != null) {
                View view2 = holder.itemView;
                ty0.c.b(h30.l.x(view2, "itemView", view2), textLocalisedClause, holder.i, null, null, 12);
            }
        }
        if (z6) {
            data.getClass();
            holder.f166836j.setVisibility(8);
        }
    }
}
