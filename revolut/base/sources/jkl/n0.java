package jkl;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010 \n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\n\u0010\bR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\f\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000e\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0007\u001a\u0004\b\u0011\u0010\bR\u001a\u0010\u0015\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0007\u001a\u0004\b\u0014\u0010\bR\u001a\u0010\u0016\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0007\u001a\u0004\b\u0010\u0010\bR\u001a\u0010\u0018\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0007\u001a\u0004\b\u0017\u0010\bR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001a\u001a\u0004\b\u0013\u0010\u001b¨\u0006\u001d"}, d2 = {"Ljkl/n0;", "", "", "toString", "()Ljava/lang/String;", "Ljkl/n0$a;", "a", "Ljkl/n0$a;", "()Ljkl/n0$a;", "bankIdProvider", "b", "dapProvider", "c", "googleProvider", "d", "oktaProvider", "e", "g", "signupWithRetailProvider", "f", "i", "webAuthnProvider", "qrDelegatedProvider", "h", "uaePassProvider", "", "Ljava/util/List;", "()Ljava/util/List;", "signupCountries", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("bankIdSe")
    private final a bankIdProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("dap")
    @NotNull
    private final a dapProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("google")
    @NotNull
    private final a googleProvider;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("okta")
    private final a oktaProvider;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("signupWithRetail")
    private final a signupWithRetailProvider;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("webauthn")
    @NotNull
    private final a webAuthnProvider;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("qrDelegated")
    @NotNull
    private final a qrDelegatedProvider;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("uaePass")
    @NotNull
    private final a uaePassProvider;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("signupCountries")
    @NotNull
    private final List<String> signupCountries;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Ljkl/n0$a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "()Z", "enabled", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("enabled")
        private final boolean enabled;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && this.enabled == ((a) obj2).enabled;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.enabled);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getBankIdProvider() {
        return this.bankIdProvider;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getDapProvider() {
        return this.dapProvider;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a getGoogleProvider() {
        return this.googleProvider;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final a getOktaProvider() {
        return this.oktaProvider;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final a getQrDelegatedProvider() {
        return this.qrDelegatedProvider;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj2;
        return Intrinsics.f(this.bankIdProvider, n0Var.bankIdProvider) && Intrinsics.f(this.dapProvider, n0Var.dapProvider) && Intrinsics.f(this.googleProvider, n0Var.googleProvider) && Intrinsics.f(this.oktaProvider, n0Var.oktaProvider) && Intrinsics.f(this.signupWithRetailProvider, n0Var.signupWithRetailProvider) && Intrinsics.f(this.webAuthnProvider, n0Var.webAuthnProvider) && Intrinsics.f(this.qrDelegatedProvider, n0Var.qrDelegatedProvider) && Intrinsics.f(this.uaePassProvider, n0Var.uaePassProvider) && Intrinsics.f(this.signupCountries, n0Var.signupCountries);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final List getSignupCountries() {
        return this.signupCountries;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final a getSignupWithRetailProvider() {
        return this.signupWithRetailProvider;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final a getUaePassProvider() {
        return this.uaePassProvider;
    }

    public final int hashCode() {
        a aVar = this.bankIdProvider;
        int iHashCode = (this.googleProvider.hashCode() + ((this.dapProvider.hashCode() + ((aVar == null ? 0 : aVar.hashCode()) * 31)) * 31)) * 31;
        a aVar2 = this.oktaProvider;
        int iHashCode2 = (iHashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        a aVar3 = this.signupWithRetailProvider;
        return this.signupCountries.hashCode() + ((this.uaePassProvider.hashCode() + ((this.qrDelegatedProvider.hashCode() + ((this.webAuthnProvider.hashCode() + ((iHashCode2 + (aVar3 != null ? aVar3.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final a getWebAuthnProvider() {
        return this.webAuthnProvider;
    }
}
