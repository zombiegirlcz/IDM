package qbe;

import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import dce.k0;
import efm.r;
import ip0.y10;
import ip0.z;
import java.time.LocalDateTime;
import java.util.List;
import koi.j;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import l80.f;
import org.jetbrains.annotations.NotNull;
import q97.h2;
import q97.q2;
import qua.p;
import vz1.g;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends abe.a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f244232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a9e.b f244233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f244234c;

    public d(g apmPaymentsAuthorisationsRepository, a9e.b commonSubscriptionMapper, e dateProvider) {
        Intrinsics.checkNotNullParameter(apmPaymentsAuthorisationsRepository, "apmPaymentsAuthorisationsRepository");
        Intrinsics.checkNotNullParameter(commonSubscriptionMapper, "commonSubscriptionMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f244232a = apmPaymentsAuthorisationsRepository;
        this.f244233b = commonSubscriptionMapper;
        this.f244234c = dateProvider;
    }

    public static j e(String str, LocalDateTime localDateTime, int i, int i2) {
        if (localDateTime == null) {
            return null;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
        long jR = oi0.d.R(localDateTime);
        TimeClause.Format.INSTANCE.getClass();
        sa saVar = new sa(str, (Clause) textLocalisedClause, (Clause) new TextLocalisedClause(i2, u.c(new TimeClause(jR, TimeClause.Format.f57959a, null, null, 12)), null, 12), (List) null, false, (Image) new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), (y10) null, (Object) null, 4056);
        yp0.b.l(saVar, 0, 0, 0, 0, null, false, 63);
        return saVar;
    }

    @Override // abe.a
    public final z a(Object obj2) {
        List listK;
        a model = (a) obj2;
        Intrinsics.checkNotNullParameter(model, "model");
        p pVar = model.f244227a;
        boolean zA = qua.u.A(pVar);
        a9e.b bVar = this.f244233b;
        if (zA || qua.u.h(pVar, ((f) this.f244234c).k())) {
            i9e.f fVar = (i9e.f) bVar;
            listK = v.k(fVar.m(), fVar.i());
        } else {
            listK = f0.f322471a;
        }
        return ((i9e.f) bVar).c(listK);
    }

    @Override // abe.a
    public final List b(Object obj2) {
        a model = (a) obj2;
        Intrinsics.checkNotNullParameter(model, "model");
        return (List) iii.c.f(model.f244229c, new qb5.a(3), new q2(25), new q87.z(this, model, 2));
    }

    @Override // abe.a
    public final r c(hce.c subscriptionContent) {
        Intrinsics.checkNotNullParameter(subscriptionContent, "subscriptionContent");
        r map = rd0.e.c(this.f244232a.b(subscriptionContent.f150886a.f150883a.f249314a.f160150a), kotlin.coroutines.g.f186406a).map(new h2(18, new k0(subscriptionContent, 2)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    @Override // abe.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final efm.r d(hce.c r36) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qbe.d.d(hce.c):efm.r");
    }
}
