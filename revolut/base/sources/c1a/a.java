package c1a;

import a0.d;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f20428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20429c;
    public final List d;
    public final String e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f20430g;

    public a(String id10, b source, String state, List participantsSplits, String str, long j2, long j3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(participantsSplits, "participantsSplits");
        this.f20427a = id10;
        this.f20428b = source;
        this.f20429c = state;
        this.d = participantsSplits;
        this.e = str;
        this.f = j2;
        this.f20430g = j3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f20427a, aVar.f20427a) && Intrinsics.f(this.f20428b, aVar.f20428b) && Intrinsics.f(this.f20429c, aVar.f20429c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && this.f == aVar.f && this.f20430g == aVar.f20430g;
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.c((this.f20428b.hashCode() + (this.f20427a.hashCode() * 31)) * 31, 31, this.f20429c), 31, this.d);
        String str = this.e;
        return Long.hashCode(this.f20430g) + d.c((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
    }
}
