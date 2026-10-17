package gaa;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f142116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f142117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f142118c;
    public final int d;

    public e(List titleArgs, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(titleArgs, "titleArgs");
        this.f142116a = i;
        this.f142117b = titleArgs;
        this.f142118c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f142116a == eVar.f142116a && Intrinsics.f(this.f142117b, eVar.f142117b) && this.f142118c == eVar.f142118c && this.d == eVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + j6.a.b(this.f142118c, p.a.d(Integer.hashCode(this.f142116a) * 31, 31, this.f142117b), 31);
    }
}
