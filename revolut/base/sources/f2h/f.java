package f2h;

import cli.o;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw0.a f131787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f131788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f131789c;
    public final aw0.i d;

    public f(lw0.a headerModel, ArrayList tabs, String str, aw0.e eVar) {
        Intrinsics.checkNotNullParameter(headerModel, "headerModel");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.f131787a = headerModel;
        this.f131788b = tabs;
        this.f131789c = str;
        this.d = eVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f131787a.equals(fVar.f131787a) && this.f131788b.equals(fVar.f131788b) && Intrinsics.f(this.f131789c, fVar.f131789c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f131788b, this.f131787a.hashCode() * 31, 31);
        String str = this.f131789c;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        aw0.i iVar = this.d;
        return iHashCode + (iVar != null ? iVar.hashCode() : 0);
    }
}
