package d67;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends com.revolut.feature.full_screen_prompt.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ty0.a f111458a;

    public h(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        this.f111458a = clickData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f111458a, ((h) obj2).f111458a);
    }

    public final int hashCode() {
        return this.f111458a.hashCode();
    }
}
