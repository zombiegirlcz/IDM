package zul;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class w implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f325558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f325559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f325560c;

    public w(v toolbar, u nextButton, ArrayList items) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(nextButton, "nextButton");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f325558a = toolbar;
        this.f325559b = nextButton;
        this.f325560c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f325560c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f325558a, wVar.f325558a) && this.f325559b.equals(wVar.f325559b) && this.f325560c.equals(wVar.f325560c);
    }

    public final int hashCode() {
        return this.f325560c.hashCode() + ((this.f325559b.hashCode() + (this.f325558a.hashCode() * 31)) * 31);
    }
}
