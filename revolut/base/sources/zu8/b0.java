package zu8;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.kyc.impl.screens.documentid_input.KYCDocumentIdInputScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class b0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KYCDocumentIdInputScreenContract$InputData f325231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zpc.m f325232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f325233c;

    public b0(c0 c0Var, a0 a0Var, KYCDocumentIdInputScreenContract$InputData kYCDocumentIdInputScreenContract$InputData) {
        this.f325231a = kYCDocumentIdInputScreenContract$InputData;
        int i = 16;
        this.f325232b = new zpc.m(c0Var, this, 1, i);
        this.f325233c = e4m.b.b(new zpc.m(c0Var, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
