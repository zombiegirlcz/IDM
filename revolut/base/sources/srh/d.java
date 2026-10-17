package srh;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.web_sign_in.navigation.WebSignInDestinationInput;
import java.util.Set;
import r6e.m;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements qji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WebSignInDestinationInput f265222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f265223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f265224c = this;
    public final e4m.e d;

    public d(b bVar, WebSignInDestinationInput webSignInDestinationInput) {
        this.f265223b = bVar;
        this.f265222a = webSignInDestinationInput;
        this.d = e4m.b.b(new m(bVar, this, 21));
    }

    @Override // dki.t
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of();
    }
}
