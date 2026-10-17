package t50;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f268016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z30.j f268017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f268018c;
    public final Integer d;

    public h(UUID chatId, z30.j ratingOptions, boolean z, Integer num) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(ratingOptions, "ratingOptions");
        this.f268016a = chatId;
        this.f268017b = ratingOptions;
        this.f268018c = z;
        this.d = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f268016a, hVar.f268016a) && Intrinsics.f(this.f268017b, hVar.f268017b) && this.f268018c == hVar.f268018c && Intrinsics.f(this.d, hVar.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c((this.f268017b.hashCode() + (this.f268016a.hashCode() * 31)) * 31, 31, this.f268018c), 31, false);
        Integer num = this.d;
        return iC + (num != null ? num.hashCode() : 0);
    }
}
