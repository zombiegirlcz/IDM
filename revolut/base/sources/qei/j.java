package qei;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f245173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f245174b;

    public j(String pocketId) {
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        this.f245173a = pocketId;
        this.f245174b = i.WALLET;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f245173a, ((j) obj2).f245173a);
    }

    public final int hashCode() {
        return this.f245173a.hashCode();
    }
}
