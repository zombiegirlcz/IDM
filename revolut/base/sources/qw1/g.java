package qw1;

import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.breb.api.R$string;
import com.revolut.feature.apm.breb.impl.ui.register.BrebRegisterScreenContract$InputData;
import com.revolut.feature.apm.core.models.alias.Alias;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import yji.l;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends oki.h implements dli.b {
    public final BrebRegisterScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j f249740p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vw1.b f249741q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wj0.a f249742r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f249743s;

    public g(BrebRegisterScreenContract$InputData inputData, j dialogsProvider, vw1.b aliasRepository, wj0.a idempotencyKeyHolder, i stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(dialogsProvider, "dialogsProvider");
        Intrinsics.checkNotNullParameter(aliasRepository, "aliasRepository");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f249740p = dialogsProvider;
        this.f249741q = aliasRepository;
        this.f249742r = idempotencyKeyHolder;
        this.f249743s = mra.d.b(this, new d(0), stateMapper, null, false, 12);
    }

    public static final wj0.b I2(g gVar, Alias alias) {
        String str = "IDEMPOTENCY_TAG_REGISTER_ALIAS-" + alias.f61878a + "-" + alias.f61879b;
        wj0.b bVar = new wj0.b(str);
        gVar.f249742r.a(str);
        return bVar;
    }

    public static final void J2(g gVar) {
        gVar.f249740p.getClass();
        l.a1(gVar, gVar.X1(new y0("register_generic_error_id", new z(new TextLocalisedClause(R$string.bre_b_registration_error_generic_title, null, null, 14), new TextLocalisedClause(R$string.bre_b_registration_error_generic_description, null, null, 14), new TextLocalisedClause(R$string.bre_b_registration_error_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4)), null, null, null, 7);
    }

    @Override // yji.l
    public final void I1() {
        H2(this.f249743s, new q2j.j(this.o.f61762a, 16));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f249743s;
    }
}
