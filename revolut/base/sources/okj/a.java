package okj;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f226130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f226131b;

    public a(ArrayList primary, ArrayList secondary) {
        Intrinsics.checkNotNullParameter(primary, "primary");
        Intrinsics.checkNotNullParameter(secondary, "secondary");
        this.f226130a = primary;
        this.f226131b = secondary;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f226130a.equals(aVar.f226130a) && this.f226131b.equals(aVar.f226131b);
    }

    public final int hashCode() {
        return this.f226131b.hashCode() + (this.f226130a.hashCode() * 31);
    }
}
