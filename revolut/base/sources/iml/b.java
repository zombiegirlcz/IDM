package iml;

import aw0.m6;
import aw0.n6;
import aw0.o9;
import aw0.t0;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController;
import com.revolut.sso.api.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t70.g f162560a;

    public b(t70.g localization) {
        Intrinsics.checkNotNullParameter(localization, "localization");
        this.f162560a = localization;
    }

    public final RowActionsBottomSheetController a() {
        List listN0 = d0.n0(this.f162560a.getString(R$string.revolut_sso_continue_with_revolut_id_continue_with_revolut_more_fields), new String[]{"|"}, 0, 6);
        ArrayList arrayList = new ArrayList(w.t(listN0, 10));
        Iterator it8 = listN0.iterator();
        while (it8.hasNext()) {
            arrayList.add(d0.F0((String) it8.next()).toString());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((String) obj2).length() > 0) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
        int i = 0;
        for (Object obj3 : arrayList2) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            arrayList3.add(new CellDetailsDelegate.Model(a0.d.n("LIST_ID_LEARN_MORE_FIELD_", i), new t0((Clause) new CompositeClause(v.k(new ImageClause(R$drawable.uikit_icn_16_bullet_filled, (Integer) null, (Float) null, (Float) null, 30), new TextClause((String) obj3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, null, null, 14), (Image) null, 0, false, 30), new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, null, false, false, null, null, 32760));
            i = i2;
        }
        yp0.b.k(arrayList3, 0, 0, 0, 0, 31);
        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
        Iterator it9 = arrayList3.iterator();
        while (it9.hasNext()) {
            arrayList4.add(new eii.b((CellDetailsDelegate.Model) it9.next()));
        }
        return new RowActionsBottomSheetController(new eii.c(new lw0.a(new TextLocalisedClause(R$string.revolut_sso_continue_with_revolut_id_continue_with_revolut_more_title, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_continue_with_revolut_id_continue_with_revolut_more_description, null, null, 14), null, null, false, 28), new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R$string.revolut_sso_common_actions_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 55), arrayList4, mql.a.f208025a, null));
    }
}
