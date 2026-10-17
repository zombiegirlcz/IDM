package lza;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f200953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f200954b;

    public a(String storyId, long j2) {
        Intrinsics.checkNotNullParameter(storyId, "storyId");
        this.f200953a = storyId;
        this.f200954b = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f200953a, aVar.f200953a) && this.f200954b == aVar.f200954b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f200954b) + (this.f200953a.hashCode() * 31);
    }
}
