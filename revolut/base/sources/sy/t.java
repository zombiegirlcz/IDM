package sy;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class t implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f266557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f266558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f266559c;

    public t(p navBar, Uri fileUri, boolean z) {
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        Intrinsics.checkNotNullParameter(fileUri, "fileUri");
        this.f266557a = navBar;
        this.f266558b = fileUri;
        this.f266559c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f266557a, tVar.f266557a) && Intrinsics.f(this.f266558b, tVar.f266558b) && this.f266559c == tVar.f266559c;
    }

    @Override // sy.u
    public final p f() {
        return this.f266557a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f266559c) + ((this.f266558b.hashCode() + (this.f266557a.hashCode() * 31)) * 31);
    }
}
