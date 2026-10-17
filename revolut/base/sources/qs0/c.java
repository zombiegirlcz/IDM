package qs0;

import android.content.Context;
import androidx.core.graphics.ColorUtils;
import aw0.v1;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import dr0.l;
import fp0.d;
import jo0.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ms0.v3;
import ms0.w3;

/* JADX INFO: loaded from: classes19.dex */
public abstract class c {
    /* JADX WARN: Type inference failed for: r9v22, types: [java.lang.Object, kotlin.Lazy] */
    public static final a a(LargeActionButton.ButtonStyle buttonStyle, Context context, int i, v1 contextualColorScheme, float f) {
        int iS;
        LargeActionButton.ButtonStyle.FilledButton filledButton;
        Intrinsics.checkNotNullParameter(buttonStyle, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(contextualColorScheme, "contextualColorScheme");
        hp0.a aVarJ = null;
        if (buttonStyle instanceof LargeActionButton.ButtonStyle.ContextualFilledButton) {
            if (((Boolean) g.D.getValue()).booleanValue()) {
                v3 v3VarA = w3.a(context, true, contextualColorScheme);
                i = v3VarA.f208467a;
                iS = v3VarA.f208468b;
            } else {
                if (i == 0) {
                    i = kli.a.s(R$attr.uikit_colorGreyTone8, context);
                }
                iS = kli.a.s(contextualColorScheme.a(), context);
            }
            aVarJ = l.k(l.f(context, new d(new Color.SolidInt(iS), new Color.SolidInt(i), false), l.h(context, f, new Color.SolidInt(i), 0, null), Integer.valueOf(R$id.rippleContent), null, 16), l.h(context, f, new Color.SolidInt(ColorUtils.blendARGB(i, -3355444, 0.9f)), 0, null), null, 60);
        } else if (buttonStyle instanceof LargeActionButton.ButtonStyle.ContextualSolidButton) {
            int i2 = b.f248741a[contextualColorScheme.ordinal()];
            if (i2 == 1) {
                filledButton = (LargeActionButton.ButtonStyle.FilledButton) LargeActionButton.ButtonStyle.d.z();
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                filledButton = (LargeActionButton.ButtonStyle.FilledButton) LargeActionButton.ButtonStyle.f58727c.z();
            }
            aVarJ = filledButton.j(context);
            iS = kli.a.s(filledButton.getV(), context);
        } else if (buttonStyle instanceof LargeActionButton.ButtonStyle.FlatButton) {
            int iA = i == 0 ? ((LargeActionButton.ButtonStyle.FlatButton) buttonStyle).f58746t : contextualColorScheme.a();
            iS = iA != 0 ? kli.a.s(iA, context) : 0;
        } else {
            if (!(buttonStyle instanceof LargeActionButton.ButtonStyle.FilledButton)) {
                throw new NoWhenBranchMatchedException();
            }
            aVarJ = ((LargeActionButton.ButtonStyle.FilledButton) buttonStyle).j(context);
            iS = kli.a.s(buttonStyle.getV(), context);
        }
        return new a(aVarJ, iS);
    }
}
