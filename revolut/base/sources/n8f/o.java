package n8f;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class o implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f213379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f213380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.i f213381c;

    public o(n header, ArrayList items, aw0.e eVar) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f213379a = header;
        this.f213380b = items;
        this.f213381c = eVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f213380b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f213379a.equals(oVar.f213379a) && this.f213380b.equals(oVar.f213380b) && Intrinsics.f(this.f213381c, oVar.f213381c);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f213380b, this.f213379a.hashCode() * 31, 31);
        aw0.i iVar = this.f213381c;
        return iB + (iVar == null ? 0 : iVar.hashCode());
    }
}
