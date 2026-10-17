package ywj;

import aii.r;
import com.revolut.sso.api.login.RevolutSsoApi$SignUpOutputData$Authenticated$Method;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cdd.c f317475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RevolutSsoApi$SignUpOutputData$Authenticated$Method f317476b;

    public h(cdd.c response, RevolutSsoApi$SignUpOutputData$Authenticated$Method revolutSsoApi$SignUpOutputData$Authenticated$Method) {
        Intrinsics.checkNotNullParameter(response, "response");
        this.f317475a = response;
        this.f317476b = revolutSsoApi$SignUpOutputData$Authenticated$Method;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f317475a, hVar.f317475a) && Intrinsics.f(this.f317476b, hVar.f317476b);
    }

    public final int hashCode() {
        int iHashCode = this.f317475a.hashCode() * 31;
        RevolutSsoApi$SignUpOutputData$Authenticated$Method revolutSsoApi$SignUpOutputData$Authenticated$Method = this.f317476b;
        return iHashCode + (revolutSsoApi$SignUpOutputData$Authenticated$Method == null ? 0 : revolutSsoApi$SignUpOutputData$Authenticated$Method.hashCode());
    }
}
