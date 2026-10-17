package q66;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f242509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f242510b;

    public a(ArrayList assets, boolean z) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        this.f242509a = assets;
        this.f242510b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f242509a.equals(aVar.f242509a) && this.f242510b == aVar.f242510b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f242510b) + (this.f242509a.hashCode() * 31);
    }
}
