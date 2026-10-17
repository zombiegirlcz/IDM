package wda;

import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.common.ui.api.Toggles;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import vge.f1;
import zhm.h0;
import zhm.r0;

/* JADX INFO: loaded from: classes5.dex */
public final class r {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f296496g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f296497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uea.f f296498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wsg.b f296499c;
    public final z d;
    public final ekg.g e;
    public final rea.e f;

    static {
        t0 t0Var = t0.f186434a;
        m70.a.t(t0Var);
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        f296496g = "  ";
    }

    public r(gte.a featureTogglesInteractor, uea.f pocketDetailsRepository, wsg.b walletInteractor, z pocketsSnapshotStorage, ekg.g uiPersonalisationInteractor, rea.e hideAccountDetailsInteractor) {
        Intrinsics.checkNotNullParameter(featureTogglesInteractor, "featureTogglesInteractor");
        Intrinsics.checkNotNullParameter(pocketDetailsRepository, "pocketDetailsRepository");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(pocketsSnapshotStorage, "pocketsSnapshotStorage");
        Intrinsics.checkNotNullParameter(uiPersonalisationInteractor, "uiPersonalisationInteractor");
        Intrinsics.checkNotNullParameter(hideAccountDetailsInteractor, "hideAccountDetailsInteractor");
        this.f296497a = featureTogglesInteractor;
        this.f296498b = pocketDetailsRepository;
        this.f296499c = walletInteractor;
        this.d = pocketsSnapshotStorage;
        this.e = uiPersonalisationInteractor;
        this.f = hideAccountDetailsInteractor;
    }

    public static final Flow a(r rVar, String str, io3.l lVar) {
        Object obj2 = w4l.j.f294644c;
        if (!obj2.equals(obj2)) {
            return new go.g(obj2, 2);
        }
        return new vkm.v(rd0.e.e(mo3.a.e(nim.a.u(new rhl.a(rVar, str, lVar, null), rVar.f296499c.d(str, w4l.h.f294642c)), new w6b.a(23), new w6b.a(24)), h0.f322473a, new f1(3, 20, null)), new l(2, 2, null));
    }

    public static ImageClause b() {
        int i = R$drawable.uikit_icn_24_bank;
        Float fValueOf = Float.valueOf(16.0f);
        return new ImageClause(i, ImageClauseTint.TextColor.f57790a, fValueOf, fValueOf, 16);
    }

    public final Flow c(io3.d pocket, xi0.b baseCurrency) {
        w4l.j preferredLoadingStrategy = w4l.j.f294644c;
        Intrinsics.checkNotNullParameter(preferredLoadingStrategy, "preferredLoadingStrategy");
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        return !((jte.d) this.f296497a).c(Toggles.AccountDetailsSurfacing.f98561c) ? new go.g(null, 2) : vkm.q.Q(this.f.a(), new j(null, this, pocket, baseCurrency, 0));
    }

    public final Flow d(String walletId, io3.l pocketType, List pockets, xi0.b baseCurrency) {
        w4l.j preferredLoadingStrategy = w4l.j.f294644c;
        Intrinsics.checkNotNullParameter(preferredLoadingStrategy, "preferredLoadingStrategy");
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        Intrinsics.checkNotNullParameter(pockets, "pockets");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        return !((jte.d) this.f296497a).c(Toggles.AccountDetailsSurfacing.f98561c) ? new go.g(r0.g(), 2) : vkm.q.Q(this.f.a(), new o(null, this, walletId, pocketType, pockets, baseCurrency, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final od0.i e(java.util.List r29, io3.d r30, boolean r31) {
        /*
            Method dump skipped, instruction units count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wda.r.e(java.util.List, io3.d, boolean):od0.i");
    }
}
