package com.revolut.core.ui_kit.chat.prompt;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import ap0.d;
import ap0.e;
import ap0.g;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ihm.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import or0.u;
import p.a;
import pd.b;
import yy0.f;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0002\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/chat/prompt/ChatSuggestionRowDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lap0/d;", "Lap0/g;", "<init>", "()V", "ap0/e", "ui_kit_chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChatSuggestionRowDelegate extends BaseRecyclerViewDelegate<d, g> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f51548c;

    public ChatSuggestionRowDelegate() {
        super(R$id.chatSuggestionRowDelegate, new an4.g(21));
        this.f51548c = a.h("toSerialized(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.h(context);
        int iK = kli.a.k(context, 24.0f);
        int iK2 = kli.a.k(context, 12.0f);
        int iK3 = kli.a.k(context, 12.0f);
        int iK4 = kli.a.k(context, 10.0f);
        int iK5 = kli.a.k(context, 8.0f);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setPaddingRelative(iK2, iK4, iK3, iK4);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setLayoutParams(new LinearLayout.LayoutParams(iK, iK));
        linearLayout.addView(appCompatImageView);
        UIKitTextView uIKitTextView = new UIKitTextView(context, null, R$attr.internal_textAppearanceAirBody1);
        uIKitTextView.setTextColor(kli.a.s(R$attr.uikit_colorForeground, context));
        uIKitTextView.setTextAlignment(5);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2, 1.0f);
        layoutParams.setMarginStart(iK5);
        uIKitTextView.setLayoutParams(layoutParams);
        linearLayout.addView(uIKitTextView);
        linearLayout.setClickable(true);
        linearLayout.setFocusable(true);
        b.h(linearLayout, true);
        return new g(linearLayout, appCompatImageView, uIKitTextView);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(g holder, d data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        int size = payloads.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            if (!(payloads.get(i3) instanceof e)) {
                payloads = null;
                break;
            }
            i3++;
        }
        if (payloads == null) {
            payloads = f0.f322471a;
        }
        boolean zIsEmpty = payloads.isEmpty();
        int size2 = payloads.size();
        while (i2 < size2) {
            e eVar = (e) payloads.get(i2);
            if (!zIsEmpty) {
                eVar.getClass();
            }
            i2++;
            zIsEmpty = true;
        }
        if (zIsEmpty) {
            ChatPromptSuggestion suggestion = data.f8024a;
            Intrinsics.checkNotNullParameter(suggestion, "suggestion");
            Context context = holder.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            f.e(jh.d.f(context).Q(), suggestion.f51532b, holder.f, null, null, 12);
            kli.a.b(holder.f8029g, suggestion.f51533c, ty0.f.f275450a);
            holder.i = suggestion;
        }
        ChatPromptSuggestion suggestion2 = data.f8024a;
        an4.f onClick = new an4.f(this, 16);
        Intrinsics.checkNotNullParameter(suggestion2, "suggestion");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        u.r(itemView, suggestion2, suggestion2.f51533c, new ap0.f(onClick, suggestion2, 0));
    }
}
