package qe4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f245058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f245059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f245060c;

    public c(String processId, String oneTimePassword, long j2) {
        Intrinsics.checkNotNullParameter(processId, "processId");
        Intrinsics.checkNotNullParameter(oneTimePassword, "oneTimePassword");
        this.f245058a = processId;
        this.f245059b = oneTimePassword;
        this.f245060c = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f245058a, cVar.f245058a) && Intrinsics.f(this.f245059b, cVar.f245059b) && this.f245060c == cVar.f245060c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f245060c) + p.a.c(this.f245058a.hashCode() * 31, 31, this.f245059b);
    }
}
