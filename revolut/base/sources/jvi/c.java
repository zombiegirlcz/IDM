package jvi;

import bti.n;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftPass;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import l80.f;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f178885a;

    public c(e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f178885a = dateProvider;
    }

    public final ati.a a(AsftPass pass) {
        Intrinsics.checkNotNullParameter(pass, "pass");
        return (pass.f98714b == n.CREATED || ue0.e.n(pass.f98726t)) ? ati.a.CREATED : ((f) this.f178885a).b().compareTo(pass.d) >= 0 ? ati.a.READY_TO_USE : ati.a.AVAILABLE_SOON;
    }
}
