package yic;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f314293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f314294b;

    public s(i header, List items) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f314293a = header;
        this.f314294b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f314294b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f314293a, sVar.f314293a) && Intrinsics.f(this.f314294b, sVar.f314294b);
    }

    public final int hashCode() {
        return this.f314294b.hashCode() + (this.f314293a.hashCode() * 31);
    }
}
