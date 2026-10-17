package l27;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UserAvatarImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UserNamePlaceholder;
import com.revolut.feature.freelancer.impl.R$string;
import java.util.List;
import k8d.t;
import kotlin.jvm.internal.Intrinsics;
import kye.l0;
import org.jetbrains.annotations.NotNull;
import te0.w;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements n {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft6.i f191699a;

    public k(ft6.i legalMapper) {
        Intrinsics.checkNotNullParameter(legalMapper, "legalMapper");
        this.f191699a = legalMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        dj0.d dVar = domainState.f191682a;
        do3.n nVar = (do3.n) domainState.f191684c.getContent();
        return new f((List) iii.c.f(domainState.f191683b, new l0g.a(24), new l0(23), new t(18)), new e(dVar != null ? new TextLocalisedClause(R$string.freelancer_sale_qr_code_pay, u.c(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12) : new TextLocalisedClause(R$string.freelancer_sale_qr_code_scan_to_pay, null, null, 14), nVar != null ? new TextLocalisedClause(R$string.freelancer_sale_qr_code_to, u.c(ft6.i.a(this.f191699a, nVar)), null, 12) : null, nVar != null ? new yy0.j(new UserAvatarImage(new UserNamePlaceholder.Default(w.I(nVar), 0), null, null, 6)) : null));
    }
}
