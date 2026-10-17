package nq7;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.data.model.InsurableCar;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xl7.n;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements p {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f218378a;

    public i(l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f218378a = dateProvider;
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        c domainState = (c) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.car_insurance_overdue_payment_title, null, null, 14);
        CdnImage cdnImageC = com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D075a", new ImageTransformations(null, null, null, null, null, 70, 70, 31), null, null, 28);
        TextLocalisedClause textLocalisedClauseA = xl7.m.a(domainState.f218372b, ((l80.f) this.f218378a).e());
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.car_insurance_overdue_payment_footer, null, null, 14);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.car_insurance_overdue_payment_button, null, null, 14);
        InsurableCar insurableCar = domainState.f218371a;
        List listC = u.c(new RowDelegate.Model("CAR_PAYMENT_OVERDUE_ID", n.k(R$drawable.uikit_icn_24_driving_licence, false, null, 15), xl7.h.c(insurableCar), null, 0, xl7.h.b(insurableCar, true), null, null, 0, new RowDelegate.Model.c.b(n.g(domainState.f218372b.f75217b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, 2), null, null, false, 126), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867800));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return new f(listC, textLocalisedClause, cdnImageC, textLocalisedClauseA, textLocalisedClause2, textLocalisedClause3);
    }
}
