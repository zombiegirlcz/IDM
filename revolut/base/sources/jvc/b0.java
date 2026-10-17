package jvc;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b0 implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f178810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f178811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f178812c;

    public b0(ArrayList items, List headerActionItems, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(headerActionItems, "headerActionItems");
        this.f178810a = items;
        this.f178811b = headerActionItems;
        this.f178812c = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f178810a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return this.f178810a.equals(b0Var.f178810a) && Intrinsics.f(this.f178811b, b0Var.f178811b) && this.f178812c == b0Var.f178812c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f178812c) + p.a.d(this.f178810a.hashCode() * 31, 31, this.f178811b);
    }
}
