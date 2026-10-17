package udk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class s implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f279269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f279270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oz0.c f279271c;

    public s(String videoUrlLight, String videoUrlDark, oz0.c transparencyMode) {
        Intrinsics.checkNotNullParameter(videoUrlLight, "videoUrlLight");
        Intrinsics.checkNotNullParameter(videoUrlDark, "videoUrlDark");
        Intrinsics.checkNotNullParameter(transparencyMode, "transparencyMode");
        this.f279269a = videoUrlLight;
        this.f279270b = videoUrlDark;
        this.f279271c = transparencyMode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f279269a, sVar.f279269a) && Intrinsics.f(this.f279270b, sVar.f279270b) && this.f279271c == sVar.f279271c;
    }

    public final int hashCode() {
        return this.f279271c.hashCode() + p.a.c(this.f279269a.hashCode() * 31, 31, this.f279270b);
    }
}
