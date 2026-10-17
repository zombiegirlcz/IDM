package qu1;

import cli.y;
import com.revolut.feature.apm.blik.impl.ui.settings.BlikSettingsContract$InputData;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.apm.core.models.alias.AliasStatus;
import com.revolut.feature.apm.core.models.alias.AliasType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.j2;

/* JADX INFO: loaded from: classes20.dex */
public final class p extends oki.h implements b {

    @NotNull
    public static final j Companion = new j();
    public final BlikSettingsContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final eu1.a f249185p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final v02.b f249186q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final v02.c f249187r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final wj0.a f249188s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f249189t;

    public p(BlikSettingsContract$InputData inputData, eu1.a blikInteractor, v02.b aliasDeregisterExtension, v02.c aliasDialogMapper, wj0.a idempotencyKeyHolder, r stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(blikInteractor, "blikInteractor");
        Intrinsics.checkNotNullParameter(aliasDeregisterExtension, "aliasDeregisterExtension");
        Intrinsics.checkNotNullParameter(aliasDialogMapper, "aliasDialogMapper");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f249185p = blikInteractor;
        this.f249186q = aliasDeregisterExtension;
        this.f249187r = aliasDialogMapper;
        this.f249188s = idempotencyKeyHolder;
        this.f249189t = mra.d.b(this, new a(inputData.f61685a, inputData.f61686b), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        if (this.o.f61685a != null) {
            this.f249188s.a("IDEMPOTENCY_TAG_DELETE_ALIAS");
        }
    }

    public final void I2() {
        String str = ((a) ((j2) this.f249189t.f22677a).getValue()).f249174a;
        if (str == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ((j12.b) this.f249186q).Z2(new Alias(AliasType.PHONE.f61895b, str, AliasStatus.ACTIVE.f61885b), new qtb.c(this, 2));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f249189t;
    }
}
