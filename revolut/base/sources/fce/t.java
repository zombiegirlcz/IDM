package fce;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class t extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fva.e f133719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f133720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qua.p f133721c;

    public t(fva.e eVar, List availableFrequencies, qua.p subscription) {
        Intrinsics.checkNotNullParameter(availableFrequencies, "availableFrequencies");
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        this.f133719a = eVar;
        this.f133720b = availableFrequencies;
        this.f133721c = subscription;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return this.f133719a == tVar.f133719a && Intrinsics.f(this.f133720b, tVar.f133720b) && Intrinsics.f(this.f133721c, tVar.f133721c);
    }

    public final int hashCode() {
        fva.e eVar = this.f133719a;
        return this.f133721c.hashCode() + p.a.d((eVar == null ? 0 : eVar.hashCode()) * 31, 31, this.f133720b);
    }
}
