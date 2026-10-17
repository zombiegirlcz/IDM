package qh4;

import com.revolut.feature.credit.application.plugins.api.models.rollee.RolleeSession;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class s implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RolleeSession f246474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f246475b;

    public s(RolleeSession session, boolean z) {
        Intrinsics.checkNotNullParameter(session, "session");
        this.f246474a = session;
        this.f246475b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f246474a, sVar.f246474a) && this.f246475b == sVar.f246475b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f246475b) + (this.f246474a.hashCode() * 31);
    }
}
