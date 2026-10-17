package zmi;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Lazy[] f323531h = {null, null, null, yhm.j.c(yhm.k.PUBLICATION, new zj9.a(11)), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f323532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f323533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f323534c;
    public final List d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f323535g;

    public /* synthetic */ l(int i, String str, String str2, String str3, String str4, String str5, String str6, List list) {
        if (127 != (i & CertificateBody.profileType)) {
            j1.f(j.f323530a.getDescriptor(), i, CertificateBody.profileType);
            throw null;
        }
        this.f323532a = str;
        this.f323533b = str2;
        this.f323534c = str3;
        this.d = list;
        this.e = str4;
        this.f = str5;
        this.f323535g = str6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f323532a, lVar.f323532a) && Intrinsics.f(this.f323533b, lVar.f323533b) && Intrinsics.f(this.f323534c, lVar.f323534c) && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e) && Intrinsics.f(this.f, lVar.f) && Intrinsics.f(this.f323535g, lVar.f323535g);
    }

    public final int hashCode() {
        return this.f323535g.hashCode() + p.a.c(p.a.c(p.a.d(p.a.c(p.a.c(this.f323532a.hashCode() * 31, 31, this.f323533b), 31, this.f323534c), 31, this.d), 31, this.e), 31, this.f);
    }

    public l(String appClientId, String clientId, String registeredIdentityId, String redirectUri, String codeChallenge, String codeChallengeMethod, ArrayList scopes) {
        Intrinsics.checkNotNullParameter(appClientId, "appClientId");
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(registeredIdentityId, "registeredIdentityId");
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
        Intrinsics.checkNotNullParameter(codeChallenge, "codeChallenge");
        Intrinsics.checkNotNullParameter(codeChallengeMethod, "codeChallengeMethod");
        this.f323532a = appClientId;
        this.f323533b = clientId;
        this.f323534c = registeredIdentityId;
        this.d = scopes;
        this.e = redirectUri;
        this.f = codeChallenge;
        this.f323535g = codeChallengeMethod;
    }
}
