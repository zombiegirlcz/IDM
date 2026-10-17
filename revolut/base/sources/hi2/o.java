package hi2;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.wero.api.R$string;
import com.revolut.feature.apm.wero.impl.ui.pay.create.CreateRequestLinkData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class o implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ji2.b f152470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yof.d f152471b;

    public o(ji2.b amountItemsMapper, yof.d transferAmountMapper) {
        Intrinsics.checkNotNullParameter(amountItemsMapper, "amountItemsMapper");
        Intrinsics.checkNotNullParameter(transferAmountMapper, "transferAmountMapper");
        this.f152470a = amountItemsMapper;
        this.f152471b = transferAmountMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        long j2;
        boolean z;
        List listK;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        CreateRequestLinkData transferData = domainState.f152452a;
        f extraData = domainState.f152453b;
        TextLocalisedClause textLocalisedClause = null;
        if (transferData == null) {
            listK = ((ppf.c) this.f152471b).f();
            z = false;
            j2 = 0;
        } else {
            long j3 = transferData.f63099a;
            int i = domainState.f152454c;
            Intrinsics.checkNotNullParameter(transferData, "data");
            Intrinsics.checkNotNullParameter(extraData, "extraData");
            xi0.b bVar = transferData.f63100b;
            dj0.d dVar = new dj0.d(j3, bVar);
            ji2.b bVar2 = this.f152470a;
            j2 = 0;
            String strD = bVar2.f174342b.d(j3, bVar.f306286a);
            z = false;
            String string = u80.o.b(new u80.g(dVar, u80.e.UNSIGNED, u80.b.SYMBOL, 8)).toString();
            List list = ((ppf.c) bVar2.f174341a).f238600b;
            ldd.b bVar3 = bVar2.f174343c;
            boolean zA = bVar3.a("ITEM_AMOUNT_INPUT_ID");
            boolean zC = bVar3.c(i, "ITEM_AMOUNT_INPUT_ID");
            List list2 = extraData.f152456b;
            hrf.h hVar = extraData.f152455a;
            bw0.h hVar2 = new bw0.h(strD, string, (TextClause) null, true, list, Boolean.valueOf(zA), list2, false, false, zC, false, (bw0.e) null, (Clause) null, false, 32132);
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.wero_qr_link_create_amount_hint, null, null, 14);
            bw0.l lVar = (j3 == 0 || hVar.f154819c == null) ? bw0.l.INFO : bw0.l.ERROR;
            CenteredAmountDelegate.Model model = new CenteredAmountDelegate.Model("ITEM_AMOUNT_INPUT_ID", null, hVar2, null, new bw0.m(textLocalisedClause2, lVar, lVar == bw0.l.ERROR ? new ResourceImage(R$drawable.uikit_icn_16_exclamation_mark_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorRed), (List) null, (ImageTransformations) null, (Clause) null, 246) : null, false, null), null, null, false, false, new yof.b(bVar, hVar.f154819c), null, 1506);
            int i2 = domainState.f152454c;
            Intrinsics.checkNotNullParameter(transferData, "transferData");
            InputTextDelegate.Model modelA = yof.d.a(bVar2.f174341a, transferData.f63101c, new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_transfer_amount_note_placeholder, null, null, 14), 140, i2, false, null, null, null, 240);
            yp0.b.l(modelA, 0, 0, 0, 0, null, false, 63);
            listK = v.k(model, modelA);
        }
        CreateRequestLinkData createRequestLinkData = domainState.f152452a;
        if (createRequestLinkData != null) {
            long j5 = createRequestLinkData.f63099a;
            textLocalisedClause = j5 > j2 ? new TextLocalisedClause(R$string.wero_qr_link_create_action_custom_amount, u.c(new MoneyClause(new dj0.d(j5, createRequestLinkData.f63100b), new MoneyClause.Format.Shorts(z, 63), null, null, 12)), null, 12) : new TextLocalisedClause(R$string.wero_qr_link_create_action_any_amount, null, null, 14);
        }
        return new j(textLocalisedClause, listK, extraData.f152455a.b());
    }
}
