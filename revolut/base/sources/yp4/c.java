package yp4;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw0.a f315781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f315782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f315783c;
    public final int d;

    public c(lw0.a header, a action, ArrayList values, int i) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(values, "values");
        this.f315781a = header;
        this.f315782b = action;
        this.f315783c = values;
        this.d = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f315781a.equals(cVar.f315781a) && this.f315782b.equals(cVar.f315782b) && this.f315783c.equals(cVar.f315783c) && this.d == cVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f315783c, t61.a.a(this.f315781a.hashCode() * 31, 31, this.f315782b.f315778a), 31);
    }
}
