package eh6;

import a08.l;
import com.revolut.feature.external_accounts.api.navigation.CreateMandateDestination;
import com.revolut.feature.external_accounts.api.navigation.InstitutionData;
import efm.d0;
import ke6.f;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import pfm.z;
import q06.h;
import sri.m;
import wp5.y;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f125739a;

    public a(m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f125739a = navigator;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "mandate") && Intrinsics.f(cVar.e(2), "create");
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        return new h(new CreateMandateDestination(new InstitutionData.InstitutionId(cVar.e(3)), null), null);
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        z zVarD = new pfm.h(new l(this, deeplink, 24), 2).D(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
        return zVarD;
    }
}
