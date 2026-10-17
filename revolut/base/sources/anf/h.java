package anf;

import aw0.o9;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.transactions.impl.R$string;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import mx0.pc;
import org.jetbrains.annotations.NotNull;
import tof.a3;
import zhm.d0;

/* JADX INFO: loaded from: classes8.dex */
public abstract class h {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final thf.d f7735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final thf.m f7736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final thf.b f7737c;
    public final sj5.a d;

    public h(thf.d transactionIconResourcesMapper, thf.m transactionTextResourcesMapper, thf.b transactionAmountMapper, wa7.p hiddenAccountsTransactionInteractor, sj5.a cryptoDepositTransactionStateChecker) {
        Intrinsics.checkNotNullParameter(transactionIconResourcesMapper, "transactionIconResourcesMapper");
        Intrinsics.checkNotNullParameter(transactionTextResourcesMapper, "transactionTextResourcesMapper");
        Intrinsics.checkNotNullParameter(transactionAmountMapper, "transactionAmountMapper");
        Intrinsics.checkNotNullParameter(hiddenAccountsTransactionInteractor, "hiddenAccountsTransactionInteractor");
        Intrinsics.checkNotNullParameter(cryptoDepositTransactionStateChecker, "cryptoDepositTransactionStateChecker");
        this.f7735a = transactionIconResourcesMapper;
        this.f7736b = transactionTextResourcesMapper;
        this.f7737c = transactionAmountMapper;
        this.d = cryptoDepositTransactionStateChecker;
    }

    public static void f(ArrayList arrayList) {
        TextClause textClause = new TextClause("\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        if (arrayList.isEmpty() || Intrinsics.f(d0.m0(arrayList), textClause)) {
            return;
        }
        arrayList.add(textClause);
    }

    public static void g(String str, ArrayList arrayList, boolean z) {
        f(arrayList);
        arrayList.add(new TextClause(str, (Style) null, z ? Integer.valueOf(R$attr.uikit_colorOrange) : null, false, (o9) null, (List) null, 122));
    }

    public static MoneyClause h(h hVar, a3 transaction, boolean z, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        Intrinsics.checkNotNullParameter(transaction, "<this>");
        bnf.e eVar = (bnf.e) hVar.f7737c;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return eVar.e(transaction, z, eVar.a(transaction), false, false);
    }

    public static Clause i(h hVar, a3 a3Var, v61.h hVar2, boolean z, wi0.b bVar) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        return ((bnf.e) hVar.f7737c).f(a3Var, hVar2, false, z, false, bVar);
    }

    public static AvatarModel.Default j(h hVar, a3 a3Var, k71.q extraData) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        return ((bnf.o) hVar.f7735a).h(a3Var, extraData);
    }

    public static CompositeClause l(boolean z) {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(z ? R$string.transactionUI_transaction_list_freelancer_subtitle_inbound : R$string.transactionUI_transaction_list_freelancer_cashbackPromo, null, new Custom(Integer.valueOf(R$attr.uikit_colorDeepGrey), false, null, false, null, 254), 10);
        m70.a.t(t0.f186434a);
        return new CompositeClause(zhm.v.k(textLocalisedClause, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new ImageClause(R$drawable.uikit_icn_20_spare_change, Integer.valueOf(R$attr.uikit_colorDeepGrey), (Float) null, (Float) null, 28)), null, null, null, 14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:265:0x06dc  */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v16 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.revolut.core.ui_kit.models.CompositeClause m(anf.h r40, tof.a3 r41, k71.q r42, boolean r43, boolean r44, boolean r45, boolean r46, boolean r47, int r48) {
        /*
            Method dump skipped, instruction units count: 2312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: anf.h.m(anf.h, tof.a3, k71.q, boolean, boolean, boolean, boolean, boolean, int):com.revolut.core.ui_kit.models.CompositeClause");
    }

    public static List n(a3 a3Var, k71.q extraData) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        return zhm.v.l((extraData.v.contains(a3Var.f272581b) || extraData.f181809x.contains(a3Var.f272581b)) ? new pc(j6.a.q("TransactionListTagItem_instalment_", a3Var.f272579a), new TagViewData(new ResourceImage(R$drawable.uikit_icn_24_calendar_quarter, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R$string.transactionUI_transaction_list_tag_instalment, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), R$attr.uikit_colorForeground_20, null, R$attr.uikit_colorTransparent, null, 1000), null) : null);
    }

    public final String k(a3 a3Var, k71.q qVar) {
        String string = ((bnf.r) this.f7736b).k(a3Var, qVar).toString();
        if (string.length() > 0) {
            return string;
        }
        return null;
    }

    public final TextLocalisedClause o(a3 a3Var, k71.q extraData) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        int i = R$string.transactionUI_transaction_placeholder_title;
        Map map = extraData.f181795b;
        Map map2 = extraData.d;
        Map map3 = extraData.e;
        r61.c cVar = extraData.f181799j;
        do3.n nVar = extraData.f181794a;
        return new TextLocalisedClause(i, zhm.u.c(((bnf.r) this.f7736b).p(a3Var, map, map2, map3, cVar, nVar != null ? nVar.f116408a : null, extraData.f181806s, extraData.u)), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, wa7.p.c(a3Var, extraData.f181808w), null, 246), 8);
    }
}
