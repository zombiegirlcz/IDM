package oq0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.revolut.core.ui_kit.internal.views.chat.ChatBubbleReactionView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import qv0.o;

/* JADX INFO: loaded from: classes19.dex */
public final class f {
    private f() {
    }

    public static void a(View itemView, b item) {
        boolean z;
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(item, "item");
        Context context = itemView.getContext();
        Intrinsics.h(context);
        o oVar = (o) item;
        int iW = kli.a.w(oVar.getF53568j(), context);
        int iW2 = kli.a.w(oVar.getF53567h(), context);
        int iW3 = kli.a.w(oVar.getK(), context);
        int iW4 = kli.a.w(oVar.getI(), context);
        cam.f f52080c = item.getF53901b();
        int i = e.f227698a[item.getF53830w().ordinal()];
        boolean z3 = true;
        if (i == 1) {
            z = true;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            z = false;
        }
        boolean z4 = item.getV() != null;
        if (!z && !z4) {
            z3 = false;
        }
        if (s.s(f52080c) && f52080c.q() && !z3 && (iW = iW - kli.a.k(context, 5.0f)) < 0) {
            iW = 0;
        }
        if (!s.s(f52080c) && f52080c.q() && !z3 && (iW3 = iW3 - kli.a.k(context, 5.0f)) < 0) {
            iW3 = 0;
        }
        itemView.setPaddingRelative(iW, iW2, iW3, iW4);
    }

    public static int b(cam.f position) {
        Intrinsics.checkNotNullParameter(position, "position");
        return s.s(position) ? 8388611 : 8388613;
    }

    public static void c(ChatBubbleReactionView reactionsView, cam.f position) {
        int iK;
        int i;
        Intrinsics.checkNotNullParameter(reactionsView, "reactionsView");
        Intrinsics.checkNotNullParameter(position, "position");
        if (position.q()) {
            Context context = reactionsView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int iK2 = kli.a.k(context, 12.0f);
            Context context2 = reactionsView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            iK = kli.a.k(context2, 5.0f) + iK2;
        } else {
            Context context3 = reactionsView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            iK = kli.a.k(context3, 12.0f);
        }
        int i2 = 0;
        if (s.s(position)) {
            i = 8388611;
            int i3 = iK;
            iK = 0;
            i2 = i3;
        } else {
            i = 8388613;
        }
        ViewGroup.LayoutParams layoutParams = reactionsView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.setMarginEnd(iK);
        layoutParams2.setMarginStart(i2);
        layoutParams2.gravity = i;
        reactionsView.setLayoutParams(layoutParams2);
    }
}
