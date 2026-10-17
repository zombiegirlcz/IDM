package ot7;

import aw0.i;
import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f229565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lw0.a f229566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f229567c;

    public e(ArrayList items, lw0.a header, aw0.e eVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(header, "header");
        this.f229565a = items;
        this.f229566b = header;
        this.f229567c = eVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f229565a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f229565a.equals(eVar.f229565a) && this.f229566b.equals(eVar.f229566b) && Intrinsics.f(this.f229567c, eVar.f229567c);
    }

    public final int hashCode() {
        int iHashCode = (this.f229566b.hashCode() + (this.f229565a.hashCode() * 31)) * 31;
        i iVar = this.f229567c;
        return iHashCode + (iVar == null ? 0 : iVar.hashCode());
    }
}
