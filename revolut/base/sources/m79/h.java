package m79;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f203360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f203361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f203362c;

    public h(String str, ArrayList blocks, a aVar) {
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        this.f203360a = str;
        this.f203361b = blocks;
        this.f203362c = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f203360a, hVar.f203360a) && this.f203361b.equals(hVar.f203361b) && Intrinsics.f(this.f203362c, hVar.f203362c);
    }

    public final int hashCode() {
        String str = this.f203360a;
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f203361b, (str == null ? 0 : str.hashCode()) * 31, 31);
        a aVar = this.f203362c;
        return iB + (aVar != null ? aVar.hashCode() : 0);
    }
}
