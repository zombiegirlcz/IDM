package bo6;

import cli.j;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f17290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17291b;

    public a(int i, ArrayList options) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.f17290a = options;
        this.f17291b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f17290a.equals(aVar.f17290a) && this.f17291b == aVar.f17291b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17291b) + (this.f17290a.hashCode() * 31);
    }
}
