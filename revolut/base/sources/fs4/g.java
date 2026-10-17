package fs4;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.n6;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import gs4.h;
import ip0.y10;
import ip0.zj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import ql4.i;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class g {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cm4.f f137593a;

    public g(cm4.f instalmentItemMapper, bp4.f localizationProvider, a creditCardMsiOffersInstalmentHubMapper) {
        Intrinsics.checkNotNullParameter(instalmentItemMapper, "instalmentItemMapper");
        Intrinsics.checkNotNullParameter(localizationProvider, "localizationProvider");
        Intrinsics.checkNotNullParameter(creditCardMsiOffersInstalmentHubMapper, "creditCardMsiOffersInstalmentHubMapper");
        this.f137593a = instalmentItemMapper;
    }

    public static RowDelegate.Model a(int i, String str) {
        return new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image40(com.revolut.core.ui_kit_core.displayers.image.models.b.b("3D097"), null, null, false, null, false, 60), new TextLocalisedClause(i, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856);
    }

    public static sa c(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, TextLocalisedClause textLocalisedClause3, String str) {
        sa saVar = new sa("id_credit_card_instalment_overdue", (Clause) textLocalisedClause, (Clause) textLocalisedClause2, u.c(new ActionsView.Item(str, null, false, null, null, textLocalisedClause3, null, null, null, null, false, null, null, null, null, 32670)), false, (Image) new ResourceImage(R$drawable.uikit_icn_24_warning, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorRed), (List) null, (ImageTransformations) null, (Clause) null, 246), (y10) null, (Object) null, 4032);
        yp0.b.l(saVar, 0, 0, 0, 0, null, false, 63);
        return saVar;
    }

    public static ListSubheaderDelegate.Model d() {
        return new ListSubheaderDelegate.Model("id_current_item_header", (Image) null, (Clause) new TextLocalisedClause(R$string.credit_card_instalment_hub_header_active, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
    }

    public static List e(TextLocalisedClause textLocalisedClause, n6 n6Var) {
        FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("id_button_create", new TextLocalisedClause(R$string.credit_card_instalment_hub_empty_title, null, null, 14), textLocalisedClause, new ComplexImage.Regular(new GlyphImage(R$drawable.uikit_icn_24_calendar_quarter, null, null, 6)), n6Var, zj.REGULAR, false, null, null, null, 1984);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return u.c(model);
    }

    public static ListSubheaderDelegate.Model f() {
        return new ListSubheaderDelegate.Model("id_past_item_header", (Image) null, (Clause) new TextLocalisedClause(R$string.credit_card_instalment_hub_header_past, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
    }

    public final ArrayList b(List list, String str, Function0 function0, ListSubheaderDelegate.Model model, int i) {
        boolean z = list.size() > 2;
        aim.e eVarB = u.b();
        List listV0 = d0.V0(list, 2);
        ArrayList arrayList = new ArrayList();
        Iterator it8 = listV0.iterator();
        while (it8.hasNext()) {
            RowDelegate.Model modelC = ((h) this.f137593a).c((i) it8.next());
            if (modelC != null) {
                arrayList.add(modelC);
            }
        }
        boolean zIsEmpty = arrayList.isEmpty();
        List listC = arrayList;
        if (zIsEmpty) {
            listC = u.c(function0.invoke());
        }
        eVarB.addAll(listC);
        if (z) {
            eVarB.add(new LargeActionButtonDelegate.Model(str, LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(R$string.credit_common_see_all, null, null, 14), false, null, null, null, null, 1000));
        }
        return yp0.b.g(u.a(eVarB), model, null, 0, i, LDSFile.EF_DG4_TAG);
    }
}
