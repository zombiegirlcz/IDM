package n33;

import com.onfido.android.sdk.capture.ui.camera.CaptureActivity;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.delegates.dc;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.cards_core.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import mx0.pc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f211696a = te0.w.y0(new n08.b(23));

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, kotlin.Lazy] */
    public final ProductSelectionDelegate.Model a(e13.a aVar, boolean z, f fVar) {
        int i;
        int i2;
        h93.l0 l0Var;
        int[] iArr = g.f211720a;
        int i3 = iArr[fVar.ordinal()];
        if (i3 == 1) {
            i = R$string.card_screen_brazil_picker_global_title;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.card_screen_india_picker_global_title;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
        int i5 = iArr[fVar.ordinal()];
        if (i5 == 1) {
            i2 = R$string.card_screen_brazil_picker_global_subtitle;
        } else {
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = R$string.card_screen_india_picker_global_subtitle;
        }
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(i2, null, null, 14);
        List listL = zhm.v.l(z ? (pc) this.f211696a.getValue() : null);
        dc dcVar = new dc(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D294", null, null, null, 30));
        boolean z3 = !z;
        int i6 = iArr[fVar.ordinal()];
        if (i6 == 1) {
            l0Var = h93.l0.BRAZIL_GLOBAL;
        } else {
            if (i6 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            l0Var = h93.l0.INDIA_GLOBAL;
        }
        return new ProductSelectionDelegate.Model("ID_GLOBAL_CARD_PICKER_ITEM", dcVar, textLocalisedClause, textLocalisedClause2, listL, new e(aVar, l0Var), null, false, false, z3, CaptureActivity.RESULT_EXIT_USER_FLOW);
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, kotlin.Lazy] */
    public final ProductSelectionDelegate.Model b(e13.a aVar, boolean z, f fVar) {
        int i;
        int i2;
        h93.l0 l0Var;
        int[] iArr = g.f211720a;
        int i3 = iArr[fVar.ordinal()];
        if (i3 == 1) {
            i = R$string.card_screen_brazil_picker_local_title;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.card_screen_india_picker_local_title;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
        int i5 = iArr[fVar.ordinal()];
        if (i5 == 1) {
            i2 = R$string.card_screen_brazil_picker_local_subtitle;
        } else {
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = R$string.card_screen_india_picker_local_subtitle;
        }
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(i2, null, null, 14);
        List listL = zhm.v.l(z ? (pc) this.f211696a.getValue() : null);
        dc dcVar = new dc(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D338", null, null, null, 30));
        boolean z3 = !z;
        int i6 = iArr[fVar.ordinal()];
        if (i6 == 1) {
            l0Var = h93.l0.BRAZIL_LOCAL;
        } else {
            if (i6 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            l0Var = h93.l0.INDIA_LOCAL;
        }
        return new ProductSelectionDelegate.Model("ID_LOCAL_CARD_PICKER_ITEM", dcVar, textLocalisedClause, textLocalisedClause2, listL, new e(aVar, l0Var), null, false, false, z3, CaptureActivity.RESULT_EXIT_USER_FLOW);
    }
}
