package yw0;

import com.revolut.core.ui_kit_resources.R$drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f317277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f317278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f317279c;

    public j(i style, boolean z) {
        int i = R$drawable.uikit_icn_24_cross;
        Intrinsics.checkNotNullParameter(style, "style");
        this.f317277a = style;
        this.f317278b = i;
        this.f317279c = z;
    }

    @Override // yw0.k
    public final boolean a() {
        return this.f317279c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f317277a == jVar.f317277a && this.f317278b == jVar.f317278b && this.f317279c == jVar.f317279c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f317279c) + j6.a.b(this.f317278b, this.f317277a.hashCode() * 31, 31);
    }
}
