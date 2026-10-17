package qu4;

import android.text.InputFilter;
import com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_amount.CreditCardRepayPaymentAmountScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q87.z;

/* JADX INFO: loaded from: classes22.dex */
public final class x implements cli.n {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardRepayPaymentAmountScreenContract$InputData f249248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w80.b f249249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InputFilter f249250c;
    public final mx4.x d;
    public final c e;

    public x(CreditCardRepayPaymentAmountScreenContract$InputData inputData, u80.o moneyPrefixFormatter, w80.b amountFormatter, InputFilter amountInputFilter, mx4.x contentListItemMapper, c autopayDescriptionMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(moneyPrefixFormatter, "moneyPrefixFormatter");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(amountInputFilter, "amountInputFilter");
        Intrinsics.checkNotNullParameter(contentListItemMapper, "contentListItemMapper");
        Intrinsics.checkNotNullParameter(autopayDescriptionMapper, "autopayDescriptionMapper");
        this.f249248a = inputData;
        this.f249249b = amountFormatter;
        this.f249250c = amountInputFilter;
        this.d = contentListItemMapper;
        this.e = autopayDescriptionMapper;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x015f, code lost:
    
        if (r9 == null) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final aw0.i a(qu4.i r33, boolean r34) {
        /*
            Method dump skipped, instruction units count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qu4.x.a(qu4.i, boolean):aw0.i");
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        i domainState = (i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (n) iii.c.f(domainState.d, new qpb.a(this, domainState, 14), new qce.b(this, domainState, 6), new z(domainState, this, 14));
    }
}
