package e4k;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.transfer.models.config.AdditionalInformationInput;
import com.revolut.feature.transfer.models.config.AdditionalInformationInputMaskConfig;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class l0 implements jki.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i4k.e f122615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i4k.b f122616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yof.d f122617c;
    public final kl.c0 d;
    public final i4k.n e;

    public l0(i4k.e amountItemsMapper, i4k.b amountFooterMapper, yof.d transferAmountMapper, kl.c0 beneficiaryNavBarMapper, i4k.n structuredReferenceItemsMapper) {
        Intrinsics.checkNotNullParameter(amountItemsMapper, "amountItemsMapper");
        Intrinsics.checkNotNullParameter(amountFooterMapper, "amountFooterMapper");
        Intrinsics.checkNotNullParameter(transferAmountMapper, "transferAmountMapper");
        Intrinsics.checkNotNullParameter(beneficiaryNavBarMapper, "beneficiaryNavBarMapper");
        Intrinsics.checkNotNullParameter(structuredReferenceItemsMapper, "structuredReferenceItemsMapper");
        this.f122615a = amountItemsMapper;
        this.f122616b = amountFooterMapper;
        this.f122617c = transferAmountMapper;
        this.d = beneficiaryNavBarMapper;
        this.e = structuredReferenceItemsMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0688 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x06b9  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x06ff  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x025e  */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v24 */
    @Override // jki.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final jki.m a(jki.i r97) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1931
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e4k.l0.a(jki.i):jki.m");
    }

    public final ArrayList b(krf.a aVar, BankTransferData bankTransferData) {
        List<AdditionalInformationInput> list = aVar.f188857b;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (AdditionalInformationInput config : list) {
            String str = (String) bankTransferData.f101931m.get(config.f92266a);
            if (str == null) {
                str = "";
            }
            String text = str;
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(config, "config");
            yof.d dVar = this.f122615a.f158524a;
            String id10 = j6.a.q("ITEM_ADDITIONAL_INPUT_ID_", config.f92266a);
            TextClause label = new TextClause(config.f92267b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            AdditionalInformationInputMaskConfig additionalInformationInputMaskConfig = config.e;
            ppf.c cVar = (ppf.c) dVar;
            cVar.getClass();
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(label, "label");
            InputTextDelegate.Model model = new InputTextDelegate.Model(id10, new TextClause(text, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), label, null, null, null, null, false, null, false, false, 0, true, 0, false, cVar.f238599a.a(id10), false, null, false, false, 0, false, false, additionalInformationInputMaskConfig, -150994952, 130559);
            yp0.b.l(model, R$attr.uikit_dp8, 0, 0, 0, null, false, 62);
            arrayList.add(model);
        }
        return arrayList;
    }
}
