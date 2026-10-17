package rha;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f254390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f254391b;

    public a(String str, c state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f254390a = str;
        this.f254391b = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f254390a, aVar.f254390a) && this.f254391b == aVar.f254391b;
    }

    public final int hashCode() {
        String str = this.f254390a;
        return this.f254391b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
