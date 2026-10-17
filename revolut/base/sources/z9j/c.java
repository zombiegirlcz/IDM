package z9j;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f320503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f320504b;

    public c(ArrayList items, b header) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(header, "header");
        this.f320503a = items;
        this.f320504b = header;
    }

    @Override // cli.p
    public final List c() {
        return this.f320503a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f320503a.equals(cVar.f320503a) && this.f320504b.equals(cVar.f320504b);
    }

    public final int hashCode() {
        return this.f320504b.hashCode() + (this.f320503a.hashCode() * 31);
    }
}
