package fma;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.profile.api.navigation.ProfileAddressControllerDescriptor;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements rma.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProfileAddressControllerDescriptor.InputData f136097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f136098b;

    public g(h hVar, ProfileAddressControllerDescriptor.InputData inputData) {
        this.f136097a = inputData;
        this.f136098b = e4m.b.b(new f(hVar, this));
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
