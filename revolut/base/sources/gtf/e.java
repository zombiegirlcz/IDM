package gtf;

import aw0.h;
import aw0.m6;
import aw0.n6;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.transfer_reasons.api.navigation.LegalConfirmationInputData;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements n {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LegalConfirmationInputData f146604a;

    public e(LegalConfirmationInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f146604a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        LegalConfirmationInputData legalConfirmationInputData = this.f146604a;
        lw0.a aVar = new lw0.a(legalConfirmationInputData.f92313a, null, null, null, false, 30);
        aim.e eVarB = u.b();
        eVarB.add(new CellDetailsStandaloneNoteDelegate.Model("BULLET_ITEM_DESCRIPTION_LIST_ID", null, legalConfirmationInputData.f92314b, null, null, false, null, R$attr.uikit_dp12, R$attr.uikit_dp0, 1658));
        List list = legalConfirmationInputData.f92315c;
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        int i = 0;
        for (Object obj2 : list2) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            arrayList.add(new CellDetailsStandaloneNoteDelegate.Model(a0.d.n("BULLET_ITEM_ID_PREFIX_", i), null, (Clause) obj2, null, new ResourceImage(R$drawable.uikit_icn_24_dot, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, null, R$attr.uikit_dp0, i == v.j(list) ? R$attr.uikit_dp12 : R$attr.uikit_dp0, 1642));
            i = i2;
        }
        eVarB.addAll(arrayList);
        aim.e eVarA = u.a(eVarB);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        m6 m6Var = n6.Companion;
        return new cii.b(new h(false, m6.c(m6Var, legalConfirmationInputData.d, LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), m6.c(m6Var, legalConfirmationInputData.e, LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), null, null, null, 121), eVarA, aVar);
    }
}
