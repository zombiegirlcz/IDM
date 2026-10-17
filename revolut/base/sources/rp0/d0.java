package rp0;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.tm0;
import ip0.um0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class d0 {
    public static y a(Clause title, Clause clause, TextLocalisedClause actionButton, String str, Object actionButtonParcel, int i) {
        String actionButtonListId = (i & 8) != 0 ? String.valueOf(actionButton) : str;
        String str2 = (i & 256) != 0 ? null : "DIALOG_BUTTON_TAG";
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(actionButton, "actionButton");
        Intrinsics.checkNotNullParameter(actionButtonListId, "actionButtonListId");
        Intrinsics.checkNotNullParameter(actionButtonParcel, "actionButtonParcel");
        l lVar = l.WINDOW;
        t tVar = new t(title, clause, null, 28);
        aim.e eVarB = zhm.u.b();
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        int i2 = R$attr.uikit_dp8;
        int i3 = R$attr.uikit_dp24;
        int i5 = R$attr.uikit_dp16;
        eVarB.add(new LargeActionButtonDelegate.Model(actionButtonListId, defaultFilledButton, null, actionButton, false, str2, actionButtonParcel, i2, i3, i5, i5, 80));
        return new y(zhm.u.a(eVarB), tVar, lVar, null, null, null, 744);
    }

    public static y b(TextLocalisedClause title, TextLocalisedClause textLocalisedClause, d2 primaryButton, d2 secondaryButton, g0a.j jVar, int i) {
        g0a.j jVar2 = (i & 128) != 0 ? null : jVar;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        Intrinsics.checkNotNullParameter(secondaryButton, "secondaryButton");
        l lVar = l.WINDOW;
        t tVar = new t(title, textLocalisedClause, null, 28);
        aim.e eVarB = zhm.u.b();
        String strO = com.google.android.gms.internal.mlkit_vision_face.a.o(primaryButton.f256062a, " - ", secondaryButton.f256062a);
        tm0 tm0Var = new tm0(LargeActionButton.ButtonStyle.f58726b, null, primaryButton.f256063b, true, null, primaryButton.f256062a);
        tm0 tm0Var2 = new tm0(LargeActionButton.ButtonStyle.f58725a, null, secondaryButton.f256063b, true, null, secondaryButton.f256062a);
        int i2 = R$attr.uikit_dp0;
        eVarB.add(new um0(strO, tm0Var, tm0Var2, jVar2, (Parcelable) null, (Parcelable) null, i2, R$attr.uikit_dp8, i2, i2));
        return new y(zhm.u.a(eVarB), tVar, lVar, null, null, null, 744);
    }

    public static final y c(TextLocalisedClause title, Clause clause, d2 primaryButton, d2 secondaryButton, Function1 function1) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        Intrinsics.checkNotNullParameter(secondaryButton, "secondaryButton");
        l lVar = l.WINDOW;
        t tVar = new t(title, clause, null, 28);
        aim.e eVarB = zhm.u.b();
        if (function1 != null) {
            function1.invoke(eVarB);
        }
        String str = primaryButton.f256062a;
        TextLocalisedClause textLocalisedClause = primaryButton.f256063b;
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        Object obj2 = primaryButton.f256064c;
        int i = R$attr.uikit_dp8;
        int i2 = R$attr.uikit_dp16;
        eVarB.add(new LargeActionButtonDelegate.Model(str, defaultFilledButton, null, textLocalisedClause, false, null, obj2, i, i2, i2, i2, 80));
        String str2 = secondaryButton.f256062a;
        TextLocalisedClause textLocalisedClause2 = secondaryButton.f256063b;
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton2 = LargeActionButton.ButtonStyle.f58726b;
        Object obj3 = secondaryButton.f256064c;
        int i3 = R$attr.uikit_dp0;
        int i5 = R$attr.uikit_dp24;
        int i6 = R$attr.uikit_dp16;
        eVarB.add(new LargeActionButtonDelegate.Model(str2, defaultFilledButton2, null, textLocalisedClause2, false, null, obj3, i3, i5, i6, i6, 80));
        return new y(zhm.u.a(eVarB), tVar, lVar, null, null, null, 744);
    }

    public static /* synthetic */ y d(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, d2 d2Var, d2 d2Var2, is2.t tVar, int i) {
        if ((i & 2) != 0) {
            textLocalisedClause2 = null;
        }
        if ((i & 64) != 0) {
            tVar = null;
        }
        return c(textLocalisedClause, textLocalisedClause2, d2Var, d2Var2, tVar);
    }
}
