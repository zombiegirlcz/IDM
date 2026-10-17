package e07;

import com.google.crypto.tink.shaded.protobuf.t1;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import ma1.o;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f121454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gr6.e f121455b;

    public l(o cardReaderSettingsAppInteractor, gr6.e freelancerAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(cardReaderSettingsAppInteractor, "cardReaderSettingsAppInteractor");
        Intrinsics.checkNotNullParameter(freelancerAvailabilityInteractor, "freelancerAvailabilityInteractor");
        this.f121454a = cardReaderSettingsAppInteractor;
        this.f121455b = freelancerAvailabilityInteractor;
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        e domainState = (e) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new h((List) iii.c.f(t1.t(domainState.f121440a, domainState.f121441b), new dz7.k(12), new k(0), new dn8.k(this, domainState, 5)));
    }
}
