package krf;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f188856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f188857b;

    public a(b bVar, List inputs) {
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        this.f188856a = bVar;
        this.f188857b = inputs;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f188856a, aVar.f188856a) && Intrinsics.f(this.f188857b, aVar.f188857b);
    }

    public final int hashCode() {
        b bVar = this.f188856a;
        return this.f188857b.hashCode() + ((bVar == null ? 0 : bVar.hashCode()) * 31);
    }

    public a() {
        this(null, f0.f322471a);
    }
}
