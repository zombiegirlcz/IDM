package i83;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f159418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f159419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f159420c;

    public f(j selectedCards, Data terminatedCards, boolean z) {
        Intrinsics.checkNotNullParameter(selectedCards, "selectedCards");
        Intrinsics.checkNotNullParameter(terminatedCards, "terminatedCards");
        this.f159418a = selectedCards;
        this.f159419b = terminatedCards;
        this.f159420c = z;
    }

    public static f a(f fVar, j selectedCards, Data terminatedCards, int i) {
        if ((i & 1) != 0) {
            selectedCards = fVar.f159418a;
        }
        if ((i & 2) != 0) {
            terminatedCards = fVar.f159419b;
        }
        boolean z = fVar.f159420c;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(selectedCards, "selectedCards");
        Intrinsics.checkNotNullParameter(terminatedCards, "terminatedCards");
        return new f(selectedCards, terminatedCards, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f159418a == fVar.f159418a && Intrinsics.f(this.f159419b, fVar.f159419b) && this.f159420c == fVar.f159420c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f159420c) + kii.e.c(this.f159419b, this.f159418a.hashCode() * 31, 31);
    }
}
