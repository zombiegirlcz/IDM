package zaj;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f320726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f320727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f320728c;

    public e(d header, c button, List items) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f320726a = header;
        this.f320727b = button;
        this.f320728c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f320728c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f320726a, eVar.f320726a) && Intrinsics.f(this.f320727b, eVar.f320727b) && Intrinsics.f(this.f320728c, eVar.f320728c);
    }

    public final int hashCode() {
        return this.f320728c.hashCode() + ((this.f320727b.hashCode() + (this.f320726a.hashCode() * 31)) * 31);
    }
}
