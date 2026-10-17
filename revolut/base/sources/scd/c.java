package scd;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f261715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f261716b;

    public /* synthetic */ c(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(a.f261714a.getDescriptor(), i, 3);
            throw null;
        }
        this.f261715a = str;
        this.f261716b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f261715a, cVar.f261715a) && Intrinsics.f(this.f261716b, cVar.f261716b);
    }

    public final int hashCode() {
        return this.f261716b.hashCode() + (this.f261715a.hashCode() * 31);
    }

    public c(String id10, String youthId) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(youthId, "youthId");
        this.f261715a = id10;
        this.f261716b = youthId;
    }
}
