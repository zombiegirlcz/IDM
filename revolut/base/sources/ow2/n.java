package ow2;

import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.card_add_to_googlepay.impl.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import njj.c1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class n implements cli.n {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m93.a f230291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l93.f f230292b;

    public n(m93.a cardComponentItemMapper, l93.f revolutCardsInteractor) {
        Intrinsics.checkNotNullParameter(cardComponentItemMapper, "cardComponentItemMapper");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        this.f230291a = cardComponentItemMapper;
        this.f230292b = revolutCardsInteractor;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        TextLocalisedClause textLocalisedClause;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.f(domainState.f230277a, new ou6.o(15), new oq3.e(27), new c1(this, domainState, 29));
        boolean z = domainState.f230277a.getContent() != null;
        int i = m.f230290a[domainState.e.ordinal()];
        if (i == 1) {
            textLocalisedClause = new TextLocalisedClause(R$string.google_pay_in_app_verification_title, null, null, 14);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.apple_pay_in_app_verification_title, null, null, 14);
        }
        return new h(textLocalisedClause, list, z);
    }
}
