package gh1;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.add_card_to_google_pay_shared.impl.R$string;
import com.revolut.feature.cards.models.revolutcard.RevolutCardOtp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class o implements cli.n {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw2.a f143831a;

    public o(lw2.a sharedCardComponentItemMapper) {
        Intrinsics.checkNotNullParameter(sharedCardComponentItemMapper, "sharedCardComponentItemMapper");
        this.f143831a = sharedCardComponentItemMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f143824a;
        RevolutCardOtp revolutCardOtp = domainState.f143825b;
        List list = (List) iii.c.f(data, new gd8.j(18), new gcc.c(9), new fyg.b(this, domainState, 14));
        TextLocalisedClause textLocalisedClause = domainState.f143824a.getContent() != null ? new TextLocalisedClause(R$string.google_pay_verification_button_copy_code, u.c(revolutCardOtp.f65546c), null, 12) : null;
        String str = revolutCardOtp.e;
        return new m(str != null ? new TextLocalisedClause(R$string.x_pay_otp_verification_title_with_requestor_name, u.c(str), null, 12) : new TextLocalisedClause(R$string.x_pay_otp_verification_title, null, null, 14), textLocalisedClause, list);
    }
}
