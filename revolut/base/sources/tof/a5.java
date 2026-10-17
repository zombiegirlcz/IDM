package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a5 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f272628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c5 f272629c;
    public final b5 d;

    public a5(String id10, String str, c5 state, b5 direction) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(direction, "direction");
        this.f272627a = id10;
        this.f272628b = str;
        this.f272629c = state;
        this.d = direction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a5)) {
            return false;
        }
        a5 a5Var = (a5) obj2;
        return Intrinsics.f(this.f272627a, a5Var.f272627a) && Intrinsics.f(this.f272628b, a5Var.f272628b) && this.f272629c == a5Var.f272629c && this.d == a5Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.f272627a.hashCode() * 31;
        String str = this.f272628b;
        return this.d.hashCode() + ((this.f272629c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }
}
