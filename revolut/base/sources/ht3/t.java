package ht3;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class t implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f155307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f155308b;

    public t(String str, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f155307a = str;
        this.f155308b = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f155307a, tVar.f155307a) && this.f155308b.equals(tVar.f155308b);
    }

    public final int hashCode() {
        String str = this.f155307a;
        return this.f155308b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
