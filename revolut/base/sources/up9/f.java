package up9;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.payments.api.mapper.PaymentPocketInfo;
import com.revolut.feature.payments.groups.api.R$string;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import mx0.f3;
import mx0.h3;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import u80.o;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements p {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w80.b f281927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qd0.b f281928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ldd.b f281929c;
    public final vo9.a d;

    public f(w80.b amountFormatter, qd0.b languageProvider, o moneyPrefixFormatter, ldd.b focusRequesterDelegate, vo9.a paymentPocketMapper) {
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        Intrinsics.checkNotNullParameter(moneyPrefixFormatter, "moneyPrefixFormatter");
        Intrinsics.checkNotNullParameter(focusRequesterDelegate, "focusRequesterDelegate");
        Intrinsics.checkNotNullParameter(paymentPocketMapper, "paymentPocketMapper");
        this.f281927a = amountFormatter;
        this.f281928b = languageProvider;
        this.f281929c = focusRequesterDelegate;
        this.d = paymentPocketMapper;
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        f3 f3Var;
        b domainState = (b) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        long j2 = domainState.f281922c;
        xi0.b bVar = domainState.d;
        dj0.d dVar = new dj0.d(j2, bVar);
        long j3 = domainState.f281922c;
        String strD = this.f281927a.d(j3, bVar.f306286a);
        a aVar = new a(((s80.b) this.f281928b).b(), bVar);
        String string = o.b(new u80.g(dVar, u80.e.UNSIGNED, u80.b.SYMBOL, 8)).toString();
        if (domainState.e) {
            PaymentPocketInfo paymentPocketInfoD = ((yt9.g) this.d).d(bVar);
            f3Var = new f3(paymentPocketInfoD.f79169a, paymentPocketInfoD.f79170b, null, true, h3.ACTIVE, true);
        } else {
            f3Var = null;
        }
        ldd.b bVar2 = this.f281929c;
        CenteredAmountDelegate.Model model = new CenteredAmountDelegate.Model("ID_AMOUNT_EDIT", null, new bw0.h(strD, string, true, null, Boolean.valueOf(bVar2.a("ID_AMOUNT_EDIT")), false, false, bVar2.c(domainState.f, "ID_AMOUNT_EDIT"), false, null, 7892), f3Var, null, null, null, false, false, aVar, null, 1506);
        InputTextDelegate.Model model2 = new InputTextDelegate.Model("ID_NAME_INPUT", new TextClause(domainState.f281921b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.payments_groups_split_bill_create_bill_input_hint, null, null, 14), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -8, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        boolean z = false;
        List listK = v.k(model, model2);
        Clause clause = domainState.f281920a;
        if (!d0.W(domainState.f281921b) && j3 > 0) {
            z = true;
        }
        return new d(clause, listK, z);
    }
}
