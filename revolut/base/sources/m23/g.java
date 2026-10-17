package m23;

import cli.n;
import cli.o;
import com.onfido.android.sdk.capture.ui.camera.CaptureActivity;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.delegates.dc;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.cards_core.R$string;
import h93.l0;
import java.util.List;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx0.pc;
import org.jetbrains.annotations.NotNull;
import yhm.j;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements n {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f201694a = j.b(new m05.d(21));

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        int i;
        int i2;
        l0 l0Var;
        int i3;
        int i5;
        l0 l0Var2;
        int i6;
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        b bVar = domainState.f201687a;
        e13.a aVar = domainState.f201688b;
        boolean z = domainState.f201689c;
        boolean z3 = domainState.d;
        int[] iArr = h.f201695a;
        int i21 = iArr[bVar.ordinal()];
        if (i21 == 1) {
            i = R$string.card_screen_brazil_picker_local_title;
        } else {
            if (i21 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.card_screen_india_picker_local_title;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
        int i22 = iArr[bVar.ordinal()];
        if (i22 == 1) {
            i2 = R$string.card_screen_brazil_picker_local_subtitle;
        } else {
            if (i22 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = R$string.card_screen_india_picker_local_subtitle;
        }
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(i2, null, null, 14);
        Lazy lazy = this.f201694a;
        List listL = v.l(z ? (pc) lazy.getValue() : null);
        dc dcVar = new dc(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D338", null, null, null, 30));
        boolean z4 = !z;
        int i32 = iArr[bVar.ordinal()];
        if (i32 == 1) {
            l0Var = l0.BRAZIL_LOCAL;
        } else {
            if (i32 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            l0Var = l0.INDIA_LOCAL;
        }
        ProductSelectionDelegate.Model model = new ProductSelectionDelegate.Model("ID_LOCAL_CARD_PICKER_ITEM", dcVar, textLocalisedClause, textLocalisedClause2, listL, new m23.a(aVar, l0Var), null, false, false, z4, CaptureActivity.RESULT_EXIT_USER_FLOW);
        int i33 = iArr[bVar.ordinal()];
        if (i33 == 1) {
            i3 = R$string.card_screen_brazil_picker_global_title;
        } else {
            if (i33 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i3 = R$string.card_screen_india_picker_global_title;
        }
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(i3, null, null, 14);
        int i43 = iArr[bVar.ordinal()];
        if (i43 == 1) {
            i5 = R$string.card_screen_brazil_picker_global_subtitle;
        } else {
            if (i43 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i5 = R$string.card_screen_india_picker_global_subtitle;
        }
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(i5, null, null, 14);
        List listL2 = v.l(z3 ? (pc) lazy.getValue() : null);
        dc dcVar2 = new dc(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D294", null, null, null, 30));
        boolean z6 = !z3;
        int i59 = iArr[bVar.ordinal()];
        if (i59 == 1) {
            l0Var2 = l0.BRAZIL_GLOBAL;
        } else {
            if (i59 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            l0Var2 = l0.INDIA_GLOBAL;
        }
        List listK = v.k(model, new ProductSelectionDelegate.Model("ID_GLOBAL_CARD_PICKER_ITEM", dcVar2, textLocalisedClause3, textLocalisedClause4, listL2, new m23.a(aVar, l0Var2), null, false, false, z6, CaptureActivity.RESULT_EXIT_USER_FLOW));
        int i66 = iArr[domainState.f201687a.ordinal()];
        if (i66 == 1) {
            i6 = R$string.card_screen_brazil_picker_title;
        } else {
            if (i66 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i6 = R$string.card_screen_india_picker_title;
        }
        return new cii.b(null, listK, new lw0.a(new TextLocalisedClause(i6, null, null, 14), null, null, null, false, 30));
    }
}
