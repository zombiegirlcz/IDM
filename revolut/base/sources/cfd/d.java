package cfd;

import cli.j;
import com.revolut.core.ui_kit.models.Clause;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f23679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f23680b;

    public d(Clause title, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f23679a = title;
        this.f23680b = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f23679a, dVar.f23679a) && this.f23680b.equals(dVar.f23680b);
    }

    public final int hashCode() {
        return this.f23680b.hashCode() + (this.f23679a.hashCode() * 31);
    }
}
