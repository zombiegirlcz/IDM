package vn3;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.PeriodClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.cooldown_checker.impl.R$string;
import ip0.qe0;
import ip0.we0;
import java.time.Duration;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static PeriodClause a(Duration duration) {
        return new PeriodClause(new PeriodClause.PeriodComponents(0, 0, 0, (int) duration.toHours(), (int) (duration.toMinutes() % ((long) 60)), 0, 39), null);
    }

    @Override // cli.n
    public final o c(j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Duration durationOfSeconds = Duration.ofSeconds(domainState.f290740b);
        List listC = u.c(new we0("", new qe0(-2, com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D281", null, null, null, 30))));
        int i = h.f290744a[domainState.f290739a.ordinal()];
        if (i == 1) {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.cooldown_check_new_beneficiary_action_title, null, null, 14);
            int i2 = R$string.cooldown_check_new_beneficiary_action_description;
            Intrinsics.h(durationOfSeconds);
            return new e(textLocalisedClause, new TextLocalisedClause(i2, u.c(a(durationOfSeconds)), null, 12), listC);
        }
        if (i == 2) {
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.cooldown_check_modify_email_address_action_title, null, null, 14);
            int i3 = R$string.cooldown_check_modify_email_address_action_description;
            Intrinsics.h(durationOfSeconds);
            return new e(textLocalisedClause2, new TextLocalisedClause(i3, u.c(a(durationOfSeconds)), null, 12), listC);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.cooldown_check_modify_phone_action_title, null, null, 14);
        int i5 = R$string.cooldown_check_modify_phone_action_description;
        Intrinsics.h(durationOfSeconds);
        return new e(textLocalisedClause3, new TextLocalisedClause(i5, u.c(a(durationOfSeconds)), null, 12), listC);
    }
}
