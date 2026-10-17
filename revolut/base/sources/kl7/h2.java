package kl7;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f185333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f185334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f185335c;

    public h2(String description, ArrayList arrayList, boolean z) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.f185333a = description;
        this.f185334b = z;
        this.f185335c = arrayList;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h2)) {
            return false;
        }
        h2 h2Var = (h2) obj2;
        return Intrinsics.f(this.f185333a, h2Var.f185333a) && this.f185334b == h2Var.f185334b && Intrinsics.f(this.f185335c, h2Var.f185335c);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f185333a.hashCode() * 31, 31, this.f185334b);
        List list = this.f185335c;
        return iC + (list == null ? 0 : list.hashCode());
    }
}
