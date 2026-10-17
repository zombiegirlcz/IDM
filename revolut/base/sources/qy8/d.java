package qy8;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.kyc_documents_scan.externalkyc.trustdock.TrustdockScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TrustdockScreenContract$InputData f250258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f250259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f250260c;

    public d(a aVar, TrustdockScreenContract$InputData trustdockScreenContract$InputData) {
        this.f250258a = trustdockScreenContract$InputData;
        int i = 2;
        this.f250259b = e4m.b.b(new qy7.f(aVar, this, 1, i));
        this.f250260c = e4m.b.b(new qy7.f(aVar, this, 0, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}
