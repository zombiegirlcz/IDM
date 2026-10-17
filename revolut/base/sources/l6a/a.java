package l6a;

import a0.d;
import android.os.Parcelable;
import aw0.e;
import aw0.n6;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.payments_migration.impl.R$string;
import com.revolut.feature.payments_migration.impl.models.providers.Provider;
import ip0.zj;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import ms0.h4;
import org.jetbrains.annotations.NotNull;
import yhm.r;
import yp0.b;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    @NotNull
    public static final C1093a Companion = new C1093a();

    /* JADX INFO: renamed from: l6a.a$a, reason: collision with other inner class name */
    public static final class C1093a {
        private C1093a() {
        }
    }

    public static e a(Provider provider, boolean z) {
        if (provider == null) {
            return null;
        }
        Pair pair = z ? new Pair(new TextLocalisedClause(R$string.payments_migration_move_payment_action_done, null, null, 14), null) : new Pair(new TextLocalisedClause(R$string.payments_migration_move_payment_action_go_to, u.c(provider.f80212b), null, 12), new ResourceImage(R$drawable.uikit_icn_24_link_external, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        return new e(true, null, null, new n6((TextLocalisedClause) pair.f186385a, LargeActionButton.ButtonStyle.f58725a, (ResourceImage) pair.f186386b, null, false, null, null, 1016), null, null, 54);
    }

    public static List b(Throwable th10) {
        FullScreenStateDelegate.Model model;
        if (tj0.a.a(th10)) {
            model = new FullScreenStateDelegate.Model("NO_CONNECTION_ERROR_ITEM_LIST_ID", new TextLocalisedClause(com.revolut.kompot.common.R$string.common_offline_state_title, null, null, 14), new TextLocalisedClause(com.revolut.kompot.common.R$string.common_offline_state_description, null, null, 14), new ComplexImage.Regular(new GlyphImage(R$drawable.uikit_icn_24_communication, null, null, 6)), new l6(12, new TextLocalisedClause(com.revolut.kompot.common.R$string.common_offline_state_action, null, null, 14), null, h4.ACCENT), zj.REGULAR, false, null, null, null, 1984);
        } else {
            model = new FullScreenStateDelegate.Model("ERROR_ITEM_LIST_ID", new TextLocalisedClause(R$string.payments_migration_error_state_title, null, null, 14), new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_description, null, null, 14), new ComplexImage.Regular(new GlyphImage(R$drawable.uikit_icn_24_exclamation_triangle, null, null, 6)), new l6(12, new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_action, null, null, 14), null, h4.ACCENT), zj.REGULAR, false, null, null, null, 1984);
        }
        List listC = u.c(model);
        b.k(listC, 0, 0, 0, 0, 31);
        return listC;
    }

    public static ArrayList c(int i, int i2, boolean z) {
        List listK = v.k(new r(new TextLocalisedClause(R$string.payments_migration_move_payment_instructions_first_step_title, null, null, 14), new TextLocalisedClause(i, null, null, 14), Integer.valueOf(R$drawable.uikit_icn_24_bullet_1)), new r(new TextLocalisedClause(R$string.payments_migration_move_payment_instructions_second_step_title, null, null, 14), new TextLocalisedClause(R$string.payments_migration_move_payment_instructions_second_step_description, null, null, 14), Integer.valueOf(R$drawable.uikit_icn_24_bullet_2)), z ? new r(new TextLocalisedClause(R$string.payments_migration_move_payment_instructions_third_step_title, null, null, 14), new TextLocalisedClause(R$string.payments_migration_move_payment_instructions_third_step_description, null, null, 14), Integer.valueOf(R$drawable.uikit_icn_24_bullet_3)) : new r(new TextLocalisedClause(R$string.payments_migration_move_payment_instructions_third_step_opt_out_title, null, null, 14), new TextLocalisedClause(R$string.payments_migration_move_payment_instructions_third_step_opt_out_description, null, null, 14), Integer.valueOf(R$drawable.uikit_icn_24_bullet_3)));
        List listC = u.c(new ListSubheaderDelegate.Model("INSTRUCTIONS_TITLE_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.payments_migration_move_payment_instructions_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, i2, R$attr.uikit_dp4, 0, 0, 53242));
        List list = listK;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        int i3 = 0;
        for (Object obj2 : list) {
            int i5 = i3 + 1;
            if (i3 < 0) {
                v.s();
                throw null;
            }
            r rVar = (r) obj2;
            arrayList.add(new RowDelegate.Model(d.n("INSTRUCTIONS_STEP_LIST_ID_PREFIX_", i3), new RowDelegate.Model.MainImage.Image24(new ResourceImage(((Number) rVar.f314203c).intValue(), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), (Clause) rVar.f314201a, null, 0, (Clause) rVar.f314202b, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
            i3 = i5;
        }
        b.k(arrayList, 0, 0, 0, 0, 31);
        return d0.E0(arrayList, listC);
    }

    public static TextLocalisedClause d(Provider provider) {
        return provider != null ? new TextLocalisedClause(R$string.payments_migration_move_payment_provider_title, u.c(provider.f80212b), null, 12) : new TextLocalisedClause(R$string.payments_migration_move_payment_no_provider_title, null, null, 14);
    }
}
