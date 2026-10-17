package oti;

import ip0.v7;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class u {

    @NotNull
    public static final t Companion = new t();
    public static final Lazy[] d = {null, null, yhm.j.c(yhm.k.PUBLICATION, new oqj.d(14))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f229691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jo3.a f229692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f229693c;

    public /* synthetic */ u(int i, String str, jo3.a aVar, List list) {
        if (7 != (i & 7)) {
            qlm.j1.f(s.f229685a.getDescriptor(), i, 7);
            throw null;
        }
        this.f229691a = str;
        this.f229692b = aVar;
        this.f229693c = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f229691a, uVar.f229691a) && Intrinsics.f(this.f229692b, uVar.f229692b) && Intrinsics.f(this.f229693c, uVar.f229693c);
    }

    public final int hashCode() {
        return this.f229693c.hashCode() + v7.j(this.f229692b, this.f229691a.hashCode() * 31, 31);
    }

    public u(String token, jo3.a originalPrice, ArrayList pointsOptions) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(originalPrice, "originalPrice");
        Intrinsics.checkNotNullParameter(pointsOptions, "pointsOptions");
        this.f229691a = token;
        this.f229692b = originalPrice;
        this.f229693c = pointsOptions;
    }
}
