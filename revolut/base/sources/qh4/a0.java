package qh4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a0 implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f246448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f246449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f246450c;

    public a0(List items, String str, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f246448a = items;
        this.f246449b = str;
        this.f246450c = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f246448a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f246448a, a0Var.f246448a) && Intrinsics.f(this.f246449b, a0Var.f246449b) && this.f246450c == a0Var.f246450c;
    }

    public final int hashCode() {
        int iHashCode = this.f246448a.hashCode() * 31;
        String str = this.f246449b;
        return Boolean.hashCode(this.f246450c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
