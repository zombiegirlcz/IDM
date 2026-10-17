package com.revolut.core.ui_kit.internal.views.conditional_amount;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature_move_money.impl.automation.screen.MoveMoneyAutomationScreen;
import com.revolut.flexbox.FlexboxLayoutManager;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import com.youTransactor.uCube.rpc.Constants;
import fq7.j;
import ft0.b;
import ft0.f;
import ft0.g;
import ip0.ic;
import java.util.List;
import jb3.l;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import or0.u;
import org.jetbrains.annotations.NotNull;
import ty0.c;
import zp0.d;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00042\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0003\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/conditional_amount/ConditionalAmountAmountEditDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lft0/g;", "Lft0/b;", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ConditionalAmountAmountEditDelegate extends BaseRecyclerViewDelegate<g, b> {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c64.a f56870c;

    public static final class a {
        private a() {
        }
    }

    public ConditionalAmountAmountEditDelegate() {
        this(null);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) throws Throwable {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        MaskedTextInputEditText maskedTextInputEditText = new MaskedTextInputEditText(context, null, 6, 0);
        l.e(maskedTextInputEditText, R$attr.internal_textAppearanceEmphasis1);
        Context context2 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        maskedTextInputEditText.setTextColor(kli.a.s(R$attr.uikit_colorForeground, context2));
        maskedTextInputEditText.setBackground(null);
        maskedTextInputEditText.setPadding(0, 0, 0, 0);
        maskedTextInputEditText.setGravity(16);
        Context context3 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        maskedTextInputEditText.setMinWidth(kli.a.k(context3, 32.0f));
        maskedTextInputEditText.setInputType(8194);
        maskedTextInputEditText.setSingleLine(true);
        maskedTextInputEditText.setPaintFlags(maskedTextInputEditText.getPaintFlags() | 8);
        Context context4 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        FlexboxLayoutManager.LayoutParams layoutParams = new FlexboxLayoutManager.LayoutParams(-2, kli.a.k(context4, 40.0f));
        Context context5 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        layoutParams.setMarginEnd(kli.a.k(context5, 6.0f));
        maskedTextInputEditText.setLayoutParams(layoutParams);
        return new b(maskedTextInputEditText);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(b holder, g data, int i, List list) {
        d dVar;
        boolean z;
        int i2;
        int i3;
        List payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        MaskedTextInputEditText field = holder.f;
        ic data2 = data.f137757a;
        dj0.d dVar2 = data2.f164670b;
        int size = payloads.size();
        int i5 = 0;
        while (true) {
            dVar = null;
            if (i5 >= size) {
                break;
            }
            if (!(payloads.get(i5) instanceof f)) {
                payloads = null;
                break;
            }
            i5++;
        }
        List list2 = payloads;
        boolean z3 = list2 == null || list2.isEmpty();
        if (payloads != null) {
            int size2 = payloads.size();
            boolean z4 = z3;
            for (int i6 = 0; i6 < size2; i6++) {
                f fVar = (f) payloads.get(i6);
                z3 = z3 || fVar.f137755a;
                z4 = z4 || fVar.f137756b;
            }
            z = z4;
        } else {
            z = z3;
        }
        c64.a aVar = this.f56870c;
        if (aVar != null) {
            MoveMoneyAutomationScreen moveMoneyAutomationScreen = (MoveMoneyAutomationScreen) aVar.f21605b;
            KProperty[] kPropertyArr = MoveMoneyAutomationScreen.T;
            Intrinsics.checkNotNullParameter(data2, "data");
            Intrinsics.checkNotNullParameter(field, "field");
            i2 = 1;
            dVar = new d(field, dVar2.f115083b, new u80.d(jh.d.e(moveMoneyAutomationScreen.m2())), null, new a61.a(moveMoneyAutomationScreen, data2, 6), true, true, 0, false, null, 1928);
        } else {
            i2 = 1;
        }
        yz0.b maskingDelegate = field.getMaskingDelegate();
        if (!Intrinsics.f(dVar, maskingDelegate)) {
            if (maskingDelegate != null) {
                maskingDelegate.a();
            }
            field.setMaskingDelegate(dVar);
        } else if (dVar != null) {
            dVar.a();
        }
        if (z3) {
            c cVarB0 = u.k(field).b0();
            MoneyClause moneyClause = new MoneyClause(dVar2, new MoneyClause.Format.Editable(), null, null, 12);
            Context context = field.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            SpannableStringBuilder spannableStringBuilderA = c.a(cVarB0, moneyClause, context, null, null, null, null, Constants.TAG_FC_SPEED_MODE);
            if (!TextUtils.equals(field.getText(), spannableStringBuilderA)) {
                field.setText(spannableStringBuilderA);
            }
        }
        if (z) {
            int i21 = ft0.c.f137752a[data2.f164671c.ordinal()];
            if (i21 == i2) {
                i3 = R$attr.uikit_colorForeground;
            } else {
                if (i21 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i3 = R$attr.uikit_colorRed;
            }
            Context context2 = field.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            field.setTextColor(kli.a.s(i3, context2));
        }
    }

    public ConditionalAmountAmountEditDelegate(c64.a aVar) {
        super(R$id.internal_conditional_amount_amount_edit_delegate_view_type, new j(8));
        this.f56870c = aVar;
    }
}
