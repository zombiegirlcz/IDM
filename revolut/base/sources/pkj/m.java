package pkj;

import android.os.Parcelable;
import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.ka;
import com.revolut.core.ui_kit.delegates.of;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.api.model.EsimHyperText;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPorting;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingInstruction;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer.EsimMobilePlanNumberTransferScreenContract$InputData;
import dej.q0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yp0.e0;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class m implements n {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimMobilePlanNumberTransferScreenContract$InputData f237209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rkj.c f237210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rkj.b f237211c;

    public m(EsimMobilePlanNumberTransferScreenContract$InputData inputData, rkj.c navBarConfigMapper, rkj.b instructionItemsMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(navBarConfigMapper, "navBarConfigMapper");
        Intrinsics.checkNotNullParameter(instructionItemsMapper, "instructionItemsMapper");
        this.f237209a = inputData;
        this.f237210b = navBarConfigMapper;
        this.f237211c = instructionItemsMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        ka kaVar;
        Object objD;
        Clause clauseO;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        q0 q0Var = domainState.f237197a;
        if (q0Var != null) {
            String str = q0Var.f113622a;
            kaVar = new ka("ID_PHONE_EDITOR", str.length() == 0 ? null : str, new Pair(new fj0.b(q0Var.f113623b), q0Var.f113624c), null, null, null, false, false, 8056);
        } else {
            kaVar = null;
        }
        EsimPhoneNumberPorting esimPhoneNumberPorting = this.f237209a.f101255a.f100408b.f100404a;
        if (esimPhoneNumberPorting != null) {
            rkj.b bVar = this.f237211c;
            ugc.a aVar = bVar.f254890c;
            ArrayList transferPhoneInstructions = esimPhoneNumberPorting.e;
            EsimMobilePlanNumberTransferScreenContract$InputData esimMobilePlanNumberTransferScreenContract$InputData = bVar.f254888a;
            Intrinsics.checkNotNullParameter(transferPhoneInstructions, "transferPhoneInstructions");
            ArrayList arrayList = new ArrayList(w.t(transferPhoneInstructions, 10));
            int i = 0;
            for (Object obj2 : transferPhoneInstructions) {
                int i2 = i + 1;
                if (i < 0) {
                    v.s();
                    throw null;
                }
                EsimPhoneNumberPortingInstruction esimPhoneNumberPortingInstruction = (EsimPhoneNumberPortingInstruction) obj2;
                String strN = a0.d.n("ID_INSTRUCTION_", i);
                String str2 = esimPhoneNumberPortingInstruction.f100358b;
                EsimHyperText esimHyperText = esimPhoneNumberPortingInstruction.f100359c;
                if (str2 == null || (clauseO = ugc.a.p(aVar, str2, esimMobilePlanNumberTransferScreenContract$InputData.f101256b)) == null) {
                    clauseO = aVar.o(esimHyperText, esimMobilePlanNumberTransferScreenContract$InputData.f101256b, Integer.valueOf(R$attr.uikit_colorGreyTone50));
                }
                Clause clause = clauseO;
                Clause clauseO2 = esimPhoneNumberPortingInstruction.f100358b != null ? aVar.o(esimHyperText, esimMobilePlanNumberTransferScreenContract$InputData.f101256b, null) : null;
                of ofVar = of.SMALL;
                String str3 = esimPhoneNumberPortingInstruction.f100357a;
                arrayList.add(new RowDelegate.Model(strN, str3 != null ? new RowDelegate.Model.MainImage.Image24(bVar.f254889b.m(str3), false, false, 6) : null, clause, ofVar, 0, clauseO2, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868816));
                i = i2;
            }
            String str4 = esimPhoneNumberPorting.d;
            if (str4 != null) {
                e0 e0Var = e0.OUTSIDE_BOX;
                int i3 = R$attr.uikit_dp8;
                int i5 = R$attr.uikit_dp16;
                boolean zIsEmpty = arrayList.isEmpty();
                objD = arrayList;
                if (!zIsEmpty) {
                    objD = yp0.b.d(arrayList, new ListSubheaderDelegate.Model("ID_TRANSFER_PHONE_INPUT_SUBHEADER", (Image) null, (Clause) new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, R$attr.uikit_dp0, R$attr.uikit_dp12, 0, 0, 53242), e0Var, i3, i3, i5, i5);
                }
            } else {
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                objD = arrayList;
            }
        } else {
            objD = null;
        }
        if (objD == null) {
            objD = f0.f322471a;
        }
        List listL = v.l(kaVar);
        yp0.b.q(listL, 0, 0, R$attr.uikit_dp0, 0, 11);
        ArrayList arrayListE0 = d0.E0((Iterable) objD, listL);
        boolean z = domainState.f237198b;
        EsimGiftRecipient esimGiftRecipient = this.f237210b.f254891a.f101256b;
        return new i(arrayListE0, z, new f(esimGiftRecipient != null ? new TextLocalisedClause(R$string.esim_mobile_plan_number_transfer_header_title_for_recipient, u.c(esimGiftRecipient.d), null, 12) : new TextLocalisedClause(R$string.esim_mobile_plan_number_transfer_header_title, null, null, 14), new TextLocalisedClause(esimGiftRecipient != null ? R$string.esim_mobile_plan_number_transfer_header_subtitle_for_recipient : R$string.esim_mobile_plan_number_transfer_header_subtitle, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10)));
    }
}
