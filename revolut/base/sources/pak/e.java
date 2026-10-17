package pak;

import aw0.j0;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.pda.impl.R$string;
import com.revolut.retail.feature.pda.impl.ui.SetUpPdaActivityContract$Step;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f234569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f234570b;

    public /* synthetic */ e(i iVar, int i) {
        this.f234569a = i;
        this.f234570b = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f234569a) {
            case 0:
                List list = (List) obj2;
                Intrinsics.checkNotNullParameter(list, "list");
                ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("LIST_HEADER_ID", null, new TextLocalisedClause(R$string.beneficiary_pda_account_selection_section_title, null, null, 14), null, null, null, j0.TRANSPARENT, null, null, false, false, null, null, 0, 0, 0, 0, 16777146);
                List list2 = list;
                ArrayList arrayList = new ArrayList(w.t(list2, 10));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    arrayList.add(this.f234570b.f234576m.c((f5j.a) it8.next(), true));
                }
                List listP = i2b.a.p(arrayList, new RowDelegate.Model("CREATE_NEW_BENEFICIARY_ID", LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_plus, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 16.0f, Float.valueOf(40.0f), null, 32), null, null, new TextLocalisedClause(R$string.beneficiary_pda_account_selection_action_create_new_beneficiary, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), null, null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073741804));
                yp0.b.k(listP, 0, 0, 0, 0, 31);
                return i2b.a.q(model, listP);
            default:
                i iVar = this.f234570b;
                lak.c cVar = iVar.f234577n;
                RowDelegate.Model model2 = (RowDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(model2, "model");
                Object obj3 = model2.u;
                if (obj3 == null) {
                    return ((iak.d) cVar).b();
                }
                iak.b bVar = iVar.f234574j;
                f5j.a beneficiary = (f5j.a) obj3;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
                return te0.w.z0(((iak.a) bVar.f160044a).w0(), beneficiary).e(((iak.d) cVar).f160049a.b(SetUpPdaActivityContract$Step.Confirmation.f102379a));
        }
    }
}
