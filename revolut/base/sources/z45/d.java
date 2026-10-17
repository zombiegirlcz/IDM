package z45;

import fx4.h;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f319318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f319319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f319320c;
    public final ArrayList d;

    public d(h header, b primaryButton, b bVar, ArrayList items) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f319318a = header;
        this.f319319b = primaryButton;
        this.f319320c = bVar;
        this.d = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f319318a.equals(dVar.f319318a) && this.f319319b.equals(dVar.f319319b) && Intrinsics.f(this.f319320c, dVar.f319320c) && this.d.equals(dVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f319319b.hashCode() + (this.f319318a.hashCode() * 31)) * 31;
        b bVar = this.f319320c;
        return this.d.hashCode() + ((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31);
    }
}
