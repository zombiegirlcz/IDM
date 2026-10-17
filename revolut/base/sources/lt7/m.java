package lt7;

import android.content.Intent;
import android.net.Uri;
import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.feature.insurance_credit.impl.ui.screen.contact.ContactScreenContract$InputData;
import com.revolut.kompot.common.ExternalDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends oki.h implements j {
    public final ContactScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ys7.h f199835p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final tr7.a f199836q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f199837r;

    public m(cli.n stateMapper, ContactScreenContract$InputData inputData, ys7.h detailsRepository, tr7.a copyToClipboardHelper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(detailsRepository, "detailsRepository");
        Intrinsics.checkNotNullParameter(copyToClipboardHelper, "copyToClipboardHelper");
        this.o = inputData;
        this.f199835p = detailsRepository;
        this.f199836q = copyToClipboardHelper;
        this.f199837r = mra.d.b(this, new i(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, ys7.h.a(this.f199835p, this.o.f75821a), null, null, new lph.h(this, null, 3), 3);
    }

    public final void I2(Object obj2, String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (!(obj2 instanceof ts7.h)) {
            if (obj2 instanceof ft7.a) {
                ft7.a aVar = (ft7.a) obj2;
                tr7.a.b(this.f199836q, aVar.f137957b, new TextLocalisedClause(R$string.credit_loan_insurance_common_copied, u.c(aVar.f137956a), null, 12), 2);
                return;
            }
            return;
        }
        ts7.g gVar = ((ts7.h) obj2).e;
        if (gVar instanceof ts7.d) {
            C1(new ExternalDestination.ByIntent(new Intent("android.intent.action.SENDTO", Uri.parse("mailto:" + ((ts7.d) gVar).f274045a)), null));
            return;
        }
        if (!(gVar instanceof ts7.f)) {
            if (!(gVar instanceof ts7.e)) {
                throw new NoWhenBranchMatchedException();
            }
            C1(u0.c(new FaqFeatureConfig.Starter(((ts7.e) gVar).f274046a, 2)));
        } else {
            C1(new ExternalDestination.ByIntent(new Intent("android.intent.action.DIAL", Uri.parse("tel:" + ((ts7.f) gVar).f274047a)), null));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f199837r;
    }
}
