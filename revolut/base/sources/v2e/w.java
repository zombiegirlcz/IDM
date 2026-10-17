package v2e;

import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class w implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f285728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f285729b;

    public w() {
        this(null, 3, 0);
    }

    @Override // cli.p
    public final List c() {
        return this.f285728a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f285728a, wVar.f285728a) && this.f285729b == wVar.f285729b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f285729b) + (this.f285728a.hashCode() * 31);
    }

    public w(List items, int i) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f285728a = items;
        this.f285729b = i;
    }

    public w(List list, int i, int i2) {
        this((i & 1) != 0 ? zhm.f0.f322471a : list, R$attr.uikit_dp0);
    }
}
