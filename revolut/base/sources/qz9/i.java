package qz9;

import com.revolut.data.model.Data;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import wk2.x;

/* JADX INFO: loaded from: classes5.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wl3.u f250424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f250425b;

    public i(wl3.u revolutContactPaymentsSettingsInteractor) {
        Intrinsics.checkNotNullParameter(revolutContactPaymentsSettingsInteractor, "revolutContactPaymentsSettingsInteractor");
        this.f250424a = revolutContactPaymentsSettingsInteractor;
        od0.i.Companion.getClass();
        this.f250425b = new Data(od0.i.f224256b, null, false, 6, null);
    }

    public final efm.r a(zm3.a contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        zm3.l contact2 = contact instanceof zm3.l ? (zm3.l) contact : null;
        Data data = this.f250425b;
        if (contact2 != null) {
            Intrinsics.checkNotNullParameter(contact2, "contact");
            efm.r rVarW = nim.a.w(nim.a.w(this.f250424a.f(), new x(contact2, 5)), new b(5));
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            efm.r rVarDefaultIfEmpty = rVarW.materialize().publish(new lhi.b(24, new njf.h(data, 1))).dematerialize(new lhi.b(24, h.f250423a)).defaultIfEmpty(data);
            Intrinsics.checkNotNullExpressionValue(rVarDefaultIfEmpty, "defaultIfEmpty(...)");
            efm.r rVarE = ue0.e.E(rVarDefaultIfEmpty, data);
            if (rVarE != null) {
                return rVarE;
            }
        }
        efm.r rVarJust = efm.r.just(data);
        Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
        return rVarJust;
    }
}
