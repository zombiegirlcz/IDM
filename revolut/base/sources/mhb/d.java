package mhb;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx0.c7;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f205474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c7 f205475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f205476c;

    public d(aim.e items, c7 footerContent, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(footerContent, "footerContent");
        this.f205474a = items;
        this.f205475b = footerContent;
        this.f205476c = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f205474a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f205474a, dVar.f205474a) && this.f205475b.equals(dVar.f205475b) && this.f205476c == dVar.f205476c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f205476c) + ((this.f205475b.hashCode() + (this.f205474a.hashCode() * 31)) * 31);
    }
}
