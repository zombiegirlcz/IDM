package ww2;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.card_add_to_googlepay.impl.R$string;
import com.revolut.feature.cards.models.revolutcard.RevolutCardOtp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wvg.r1;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class o implements cli.n {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m93.a f300590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l93.f f300591b;

    public o(m93.a cardComponentItemMapper, l93.f revolutCardsInteractor) {
        Intrinsics.checkNotNullParameter(cardComponentItemMapper, "cardComponentItemMapper");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        this.f300590a = cardComponentItemMapper;
        this.f300591b = revolutCardsInteractor;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f300583a;
        RevolutCardOtp revolutCardOtp = domainState.f300584b;
        List list = (List) iii.c.f(data, new r1(6), new wug.k(16), new vh2.o(this, domainState, 27));
        TextLocalisedClause textLocalisedClause = domainState.f300583a.getContent() != null ? new TextLocalisedClause(R$string.google_pay_verification_button_copy_code, u.c(revolutCardOtp.f65546c), null, 12) : null;
        String str = revolutCardOtp.e;
        return new m(str != null ? new TextLocalisedClause(com.revolut.feature.cards_core.R$string.x_pay_otp_verification_title_with_requestor_name, u.c(str), null, 12) : new TextLocalisedClause(R$string.x_pay_otp_verification_title, null, null, 14), textLocalisedClause, list);
    }
}
