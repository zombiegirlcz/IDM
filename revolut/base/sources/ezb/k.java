package ezb;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.rev_points.api.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rp0.f1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.rev_points.impl.ui.challenges.home.b f130929b;

    public /* synthetic */ k(com.revolut.feature.rev_points.impl.ui.challenges.home.b bVar, int i) {
        this.f130928a = i;
        this.f130929b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f130928a) {
            case 0:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                com.revolut.feature.rev_points.impl.ui.challenges.home.b bVar = this.f130929b;
                pyb.c cVar = bVar.f83786r;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(error, "error");
                bVar.X1(cVar.f240739a.f("CLAIM_REWARD_DIALOG_ID", error));
                return Boolean.TRUE;
            default:
                dzb.e outputData = (dzb.e) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                boolean z = outputData instanceof dzb.d;
                com.revolut.feature.rev_points.impl.ui.challenges.home.b bVar2 = this.f130929b;
                if (z) {
                    bVar2.X1(bVar2.f83786r.a(((dzb.d) outputData).f121302a));
                } else {
                    if (!(outputData instanceof dzb.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String str = ((dzb.c) outputData).f121301a;
                    bVar2.f83787s.getClass();
                    yji.l.b1(bVar2, bVar2.X1(new mii.e("CHALLENGE_ACTIVATION_DIALOG_ID", new TextLocalisedClause(R$string.rev_points_challenge_v3_activated, null, null, 14), f1.BOTTOM, 12)), null, new chf.a(bVar2, str, null, 27), 3);
                }
                return Unit.f186387a;
        }
    }
}
