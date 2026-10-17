package gkl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u0000 42\u00020\u0001:\u0003\u00065\u000bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\u000e\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010$\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010)\u001a\u00020%8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u0015\u0010(R\u001a\u0010-\u001a\u00020*8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010+\u001a\u0004\b&\u0010,R\"\u00103\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010.8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b\u001b\u00102¨\u00066"}, d2 = {"Lgkl/o;", "", "", "toString", "()Ljava/lang/String;", "Lgkl/p;", "a", "Lgkl/p;", "()Lgkl/p;", "bankIdProvider", "Lgkl/q;", "b", "Lgkl/q;", "()Lgkl/q;", "dapProvider", "Lgkl/r;", "c", "Lgkl/r;", "()Lgkl/r;", "googleProvider", "Lgkl/s;", "d", "Lgkl/s;", "getOktaProvider", "()Lgkl/s;", "oktaProvider", "Lgkl/u;", "e", "Lgkl/u;", "f", "()Lgkl/u;", "signupWithRetailProvider", "Lgkl/w;", "Lgkl/w;", "h", "()Lgkl/w;", "webAuthnProvider", "Lgkl/t;", "g", "Lgkl/t;", "()Lgkl/t;", "qrDelegatedProvider", "Lgkl/v;", "Lgkl/v;", "()Lgkl/v;", "uaePassProvider", "", "Lgkl/o$b;", "i", "Ljava/util/List;", "()Ljava/util/List;", "signupCountries", "Companion", "gkl/x", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("bankIdSe")
    private final p bankIdProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("dap")
    @NotNull
    private final q dapProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("google")
    @NotNull
    private final r googleProvider;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("okta")
    private final s oktaProvider;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("signupWithRetail")
    private final u signupWithRetailProvider;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("webauthn")
    @NotNull
    private final w webAuthnProvider;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("qrDelegated")
    @NotNull
    private final t qrDelegatedProvider;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("uaePass")
    @NotNull
    private final v uaePassProvider;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("signupCountries")
    private final List<b> signupCountries;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \b2\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\t"}, d2 = {"Lgkl/o$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "value", "Companion", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final ArrayList f144475b;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("value")
        @NotNull
        private final String value;

        /* JADX INFO: renamed from: gkl.o$b$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public static ArrayList a() {
                return b.f144475b;
            }
        }

        static {
            List listK = zhm.v.k("AD", "AE", "AG", "AI", "AM", "AR", "AT", "AU", "AW", "AX", "AZ", "BA", "BD", "BE", "BG", "BH", "BL", "BM", "BN", "BQ", "BR", "CA", "CH", "CL", "CO", "CR", "CW", "CY", "CZ", "DE", "DK", "DM", "DO", "EC", "EE", "ES", "ET", "FI", "FK", "FO", "FR", "GB", "GD", "GE", "GF", "GG", "GI", "GL", "GM", "GP", "GR", "GS", "HK", "HN", "HR", "HU", "IC", "IE", "IL", "IM", "IN", "IO", "IS", "IT", "JE", "JO", "JP", "KM", "KN", "KR", "KW", "KY", "KZ", "LI", "LK", "LR", "LS", "LT", "LU", "LV", "MD", "MF", "MH", "MK", "MO", "MQ", "MR", "MS", "MT", "MX", "MY", "MZ", "NC", "NL", "NO", "NZ", "OM", "PF", "PL", "PM", "PN", "PT", "PW", "QA", "RE", "RO", "RS", "SA", "SE", "SG", "SH", "SI", "SJ", "SK", "SM", "SR", "SV", "SX", "TC", "TF", "TJ", "TL", "UA", "US", "VC", "VG", "VN", "WF", "YT", "ZA");
            ArrayList arrayList = new ArrayList(zhm.w.t(listK, 10));
            Iterator it8 = listK.iterator();
            while (it8.hasNext()) {
                arrayList.add(new b((String) it8.next()));
            }
            f144475b = arrayList;
        }

        public b(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.value, ((b) obj2).value);
        }

        public final int hashCode() {
            return this.value.hashCode();
        }
    }

    public o(p pVar, q dapProvider, r googleProvider, s sVar, u uVar, w webAuthnProvider, t qrDelegatedProvider, v uaePassProvider, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(dapProvider, "dapProvider");
        Intrinsics.checkNotNullParameter(googleProvider, "googleProvider");
        Intrinsics.checkNotNullParameter(webAuthnProvider, "webAuthnProvider");
        Intrinsics.checkNotNullParameter(qrDelegatedProvider, "qrDelegatedProvider");
        Intrinsics.checkNotNullParameter(uaePassProvider, "uaePassProvider");
        this.bankIdProvider = pVar;
        this.dapProvider = dapProvider;
        this.googleProvider = googleProvider;
        this.oktaProvider = sVar;
        this.signupWithRetailProvider = uVar;
        this.webAuthnProvider = webAuthnProvider;
        this.qrDelegatedProvider = qrDelegatedProvider;
        this.uaePassProvider = uaePassProvider;
        this.signupCountries = arrayList;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final p getBankIdProvider() {
        return this.bankIdProvider;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final q getDapProvider() {
        return this.dapProvider;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final r getGoogleProvider() {
        return this.googleProvider;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final t getQrDelegatedProvider() {
        return this.qrDelegatedProvider;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final List getSignupCountries() {
        return this.signupCountries;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.bankIdProvider, oVar.bankIdProvider) && Intrinsics.f(this.dapProvider, oVar.dapProvider) && Intrinsics.f(this.googleProvider, oVar.googleProvider) && Intrinsics.f(this.oktaProvider, oVar.oktaProvider) && Intrinsics.f(this.signupWithRetailProvider, oVar.signupWithRetailProvider) && Intrinsics.f(this.webAuthnProvider, oVar.webAuthnProvider) && Intrinsics.f(this.qrDelegatedProvider, oVar.qrDelegatedProvider) && Intrinsics.f(this.uaePassProvider, oVar.uaePassProvider) && Intrinsics.f(this.signupCountries, oVar.signupCountries);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final u getSignupWithRetailProvider() {
        return this.signupWithRetailProvider;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final v getUaePassProvider() {
        return this.uaePassProvider;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final w getWebAuthnProvider() {
        return this.webAuthnProvider;
    }

    public final int hashCode() {
        p pVar = this.bankIdProvider;
        int iHashCode = (this.googleProvider.hashCode() + ((this.dapProvider.hashCode() + ((pVar == null ? 0 : pVar.hashCode()) * 31)) * 31)) * 31;
        s sVar = this.oktaProvider;
        int iHashCode2 = (iHashCode + (sVar == null ? 0 : sVar.hashCode())) * 31;
        u uVar = this.signupWithRetailProvider;
        int iHashCode3 = (this.uaePassProvider.hashCode() + ((this.qrDelegatedProvider.hashCode() + ((this.webAuthnProvider.hashCode() + ((iHashCode2 + (uVar == null ? 0 : uVar.hashCode())) * 31)) * 31)) * 31)) * 31;
        List<b> list = this.signupCountries;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }
}
