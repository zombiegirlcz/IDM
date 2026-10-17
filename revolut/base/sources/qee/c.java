package qee;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f245122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f245123b;

    public c(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f245122a = items;
        this.f245123b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f245122a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f245122a, cVar.f245122a) && this.f245123b == cVar.f245123b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f245123b) + (this.f245122a.hashCode() * 31);
    }
}
