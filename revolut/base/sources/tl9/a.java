package tl9;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.pay_with_smile.impl.ui.flow.create_passcode.CreatePasscodeFlowContract$InputData;
import he9.k;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements xki.c, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreatePasscodeFlowContract$InputData f272019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f272020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f272021c = this;
    public final e4m.e d;

    public a(c cVar, CreatePasscodeFlowContract$InputData createPasscodeFlowContract$InputData) {
        this.f272020b = cVar;
        this.f272019a = createPasscodeFlowContract$InputData;
        this.d = e4m.b.b(new ta9.f(cVar, this, 10));
    }

    @Override // he9.k
    public final he9.f b() {
        return new he9.f(this.f272020b, this.f272021c, 6);
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
