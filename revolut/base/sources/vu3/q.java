package vu3;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f292238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f292239b;

    public q(String str, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f292238a = str;
        this.f292239b = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f292238a, qVar.f292238a) && this.f292239b.equals(qVar.f292239b);
    }

    public final int hashCode() {
        String str = this.f292238a;
        return this.f292239b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
