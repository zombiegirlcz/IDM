package ybh;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class w implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f312359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f312360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f312361c;

    public w(ArrayList items, v header, u uVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(header, "header");
        this.f312359a = items;
        this.f312360b = header;
        this.f312361c = uVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f312359a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return this.f312359a.equals(wVar.f312359a) && Intrinsics.f(this.f312360b, wVar.f312360b) && this.f312361c.equals(wVar.f312361c);
    }

    public final int hashCode() {
        return this.f312361c.hashCode() + ((this.f312360b.hashCode() + (this.f312359a.hashCode() * 31)) * 31);
    }
}
