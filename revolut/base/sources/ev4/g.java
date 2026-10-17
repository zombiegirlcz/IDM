package ev4;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cl4.p f129709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f129710b;

    public g(cl4.p format, Data model) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f129709a = format;
        this.f129710b = model;
    }

    public static g a(g gVar, cl4.p format, Data model, int i) {
        if ((i & 1) != 0) {
            format = gVar.f129709a;
        }
        if ((i & 2) != 0) {
            model = gVar.f129710b;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(model, "model");
        return new g(format, model);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f129709a == gVar.f129709a && Intrinsics.f(this.f129710b, gVar.f129710b);
    }

    public final int hashCode() {
        return this.f129710b.hashCode() + (this.f129709a.hashCode() * 31);
    }
}
