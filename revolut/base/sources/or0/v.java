package or0;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public abstract class v {
    public static final void a(View view, qv0.c position) {
        boolean z;
        float fL;
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(position, "position");
        boolean z3 = position instanceof c.f;
        if (z3 || (position instanceof c.a) || (position instanceof c.e)) {
            z = true;
        } else {
            if (!(position instanceof c.d) && !(position instanceof c.b) && !(position instanceof c.C1364c)) {
                throw new NoWhenBranchMatchedException();
            }
            z = false;
        }
        view.setClipToOutline(z);
        if (z3) {
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            fL = kli.a.l(context, ((c.f) position).f249516a.a());
            i2 = (int) fL;
            i = 0;
        } else if (position instanceof c.a) {
            Context context2 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            fL = kli.a.l(context2, ((c.a) position).f249510a.a());
            i = -((int) fL);
            i2 = 0;
        } else {
            if (position instanceof c.e) {
                Context context3 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                fL = kli.a.l(context3, ((c.e) position).f249514a.a());
            } else {
                fL = -1.0f;
            }
            i = 0;
            i2 = 0;
        }
        if (fL < BitmapDescriptorFactory.HUE_RED) {
            view.setOutlineProvider(null);
            return;
        }
        ViewOutlineProvider outlineProvider = view.getOutlineProvider();
        iv0.s sVar = outlineProvider instanceof iv0.s ? (iv0.s) outlineProvider : null;
        if (sVar == null) {
            iv0.s sVar2 = new iv0.s(fL, true);
            sVar2.e.set(0, i, 0, i2);
            view.setOutlineProvider(sVar2);
            return;
        }
        Rect rect = sVar.e;
        if (sVar.f168696a == fL && rect.top == i && rect.bottom == i2 && rect.left == 0 && rect.right == 0) {
            return;
        }
        sVar.f168696a = fL;
        rect.set(0, i, 0, i2);
        view.invalidateOutline();
    }
}
