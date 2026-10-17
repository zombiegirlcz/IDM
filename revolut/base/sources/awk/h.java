package awk;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes12.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10802a;

    public h() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f10802a, ((h) obj2).f10802a);
    }

    public final int hashCode() {
        return this.f10802a.hashCode();
    }

    public h(Map assetStatsSelectionStates) {
        Intrinsics.checkNotNullParameter(assetStatsSelectionStates, "assetStatsSelectionStates");
        this.f10802a = assetStatsSelectionStates;
    }

    public /* synthetic */ h(int i) {
        this(r0.g());
    }
}
