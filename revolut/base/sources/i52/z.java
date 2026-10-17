package i52;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.api.R$string;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class z implements cli.n {

    @NotNull
    public static final x Companion = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w80.b f158580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yof.k f158581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lx1.i f158582c;
    public final a12.s d;
    public final q12.g e;

    public z(w80.b amountFormatter, yof.k transferReviewMapper, lx1.i apmRecipientMapper, u80.o prefixFormatter, a12.s apmFooterMapper, q12.g apmQuoteMapper) {
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(transferReviewMapper, "transferReviewMapper");
        Intrinsics.checkNotNullParameter(apmRecipientMapper, "apmRecipientMapper");
        Intrinsics.checkNotNullParameter(prefixFormatter, "prefixFormatter");
        Intrinsics.checkNotNullParameter(apmFooterMapper, "apmFooterMapper");
        Intrinsics.checkNotNullParameter(apmQuoteMapper, "apmQuoteMapper");
        this.f158580a = amountFormatter;
        this.f158581b = transferReviewMapper;
        this.f158582c = apmRecipientMapper;
        this.d = apmFooterMapper;
        this.e = apmQuoteMapper;
    }

    public final qv0.i a(String str) {
        qv0.i iVarG = ((ppf.d) this.f158581b).g(new TextLocalisedClause(R$string.apm_transfer_review_field_note, null, null, 14), str, false);
        yp0.b.l(iVarG, 0, 0, 0, 0, null, false, 63);
        return iVarG;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01fa  */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r64) {
        /*
            Method dump skipped, instruction units count: 1547
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i52.z.c(cli.j):cli.o");
    }
}
