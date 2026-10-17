package wf0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f296906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f296907b;

    public n(String localeLang, String lastTimeUpdated) {
        Intrinsics.checkNotNullParameter(localeLang, "localeLang");
        Intrinsics.checkNotNullParameter(lastTimeUpdated, "lastTimeUpdated");
        this.f296906a = localeLang;
        this.f296907b = lastTimeUpdated;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f296906a, nVar.f296906a) && Intrinsics.f(this.f296907b, nVar.f296907b);
    }

    public final int hashCode() {
        return this.f296907b.hashCode() + (this.f296906a.hashCode() * 31);
    }
}
