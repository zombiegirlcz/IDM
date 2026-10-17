package g03;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import q03.i0;
import q03.p0;
import q03.q0;

/* JADX INFO: loaded from: classes21.dex */
public final class b0 implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zjh.j f139261b;

    public b0(zjh.j legalEntityDisclaimerMapper, int i) {
        this.f139260a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(legalEntityDisclaimerMapper, "legalEntityDisclaimerMapper");
                this.f139261b = legalEntityDisclaimerMapper;
                break;
            default:
                Intrinsics.checkNotNullParameter(legalEntityDisclaimerMapper, "legalEntityDisclaimerMapper");
                this.f139261b = legalEntityDisclaimerMapper;
                break;
        }
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        int i;
        switch (this.f139260a) {
            case 0:
                a domainState = (a) jVar;
                Intrinsics.checkNotNullParameter(domainState, "domainState");
                return new f((List) iii.c.f(t1.t(domainState.f139253a, domainState.f139255c), new fwf.n(25), new fv0.c(25), new fyg.b(this, domainState, 2)));
            default:
                i0 domainState2 = (i0) jVar;
                Intrinsics.checkNotNullParameter(domainState2, "domainState");
                List list = (List) iii.c.f(domainState2.f241082c, new pyc.p(29), new pyb.g(17), new ox2.d(this, domainState2, 25));
                int i2 = q0.f241099a[domainState2.e.ordinal()];
                if (i2 == 1) {
                    i = R.string.common_action_settings;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R.string.card_security_title;
                }
                return new p0(new TextLocalisedClause(i, null, null, 14), list);
        }
    }
}
