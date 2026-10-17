package z0c;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f318202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f318203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f318204c;

    public d(int i, ArrayList highlights, List supportedShareActions) {
        Intrinsics.checkNotNullParameter(highlights, "highlights");
        Intrinsics.checkNotNullParameter(supportedShareActions, "supportedShareActions");
        this.f318202a = highlights;
        this.f318203b = i;
        this.f318204c = supportedShareActions;
    }

    public static d a(d dVar, int i, ArrayList arrayList, int i2) {
        ArrayList highlights = dVar.f318202a;
        if ((i2 & 2) != 0) {
            i = dVar.f318203b;
        }
        List supportedShareActions = arrayList;
        if ((i2 & 4) != 0) {
            supportedShareActions = dVar.f318204c;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(highlights, "highlights");
        Intrinsics.checkNotNullParameter(supportedShareActions, "supportedShareActions");
        return new d(i, highlights, supportedShareActions);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f318202a.equals(dVar.f318202a) && this.f318203b == dVar.f318203b && Intrinsics.f(this.f318204c, dVar.f318204c);
    }

    public final int hashCode() {
        return this.f318204c.hashCode() + j6.a.b(this.f318203b, this.f318202a.hashCode() * 31, 31);
    }
}
