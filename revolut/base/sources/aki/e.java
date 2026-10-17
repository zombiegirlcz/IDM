package aki;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IllegalStateException f5961b;

    public e(String str, IllegalStateException illegalStateException) {
        super(str, illegalStateException);
        this.f5960a = str;
        this.f5961b = illegalStateException;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f5960a, eVar.f5960a) && Intrinsics.f(this.f5961b, eVar.f5961b);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f5961b;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f5960a;
    }

    public final int hashCode() {
        String str = this.f5960a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        IllegalStateException illegalStateException = this.f5961b;
        return iHashCode + (illegalStateException != null ? illegalStateException.hashCode() : 0);
    }
}
