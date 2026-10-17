package ymi;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f315005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f315006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f315007c;
    public final String d;
    public final String e;
    public final String f;

    public b(String clientId, String registeredIdentityId, String redirectUri, String codeChallenge, String codeChallengeMethod, ArrayList scopes) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(registeredIdentityId, "registeredIdentityId");
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
        Intrinsics.checkNotNullParameter(codeChallenge, "codeChallenge");
        Intrinsics.checkNotNullParameter(codeChallengeMethod, "codeChallengeMethod");
        this.f315005a = clientId;
        this.f315006b = registeredIdentityId;
        this.f315007c = scopes;
        this.d = redirectUri;
        this.e = codeChallenge;
        this.f = codeChallengeMethod;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f315005a, bVar.f315005a) && Intrinsics.f(this.f315006b, bVar.f315006b) && this.f315007c.equals(bVar.f315007c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.c(p.a.c(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f315007c, p.a.c(this.f315005a.hashCode() * 31, 31, this.f315006b), 31), 31, this.d), 31, this.e);
    }
}
