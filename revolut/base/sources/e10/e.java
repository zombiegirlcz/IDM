package e10;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f121803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f121804b;

    public e(d prediction, c confidence) {
        Intrinsics.checkNotNullParameter(prediction, "prediction");
        Intrinsics.checkNotNullParameter(confidence, "confidence");
        this.f121803a = prediction;
        this.f121804b = confidence;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f121803a, eVar.f121803a) && Intrinsics.f(this.f121804b, eVar.f121804b);
    }

    public final int hashCode() {
        return this.f121804b.hashCode() + (this.f121803a.hashCode() * 31);
    }
}
