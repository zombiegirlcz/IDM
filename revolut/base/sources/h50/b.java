package h50;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f149411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f149412b;

    public b(String str, ArrayList chosenTags) {
        Intrinsics.checkNotNullParameter(chosenTags, "chosenTags");
        this.f149411a = chosenTags;
        this.f149412b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f149411a.equals(bVar.f149411a) && Intrinsics.f(this.f149412b, bVar.f149412b);
    }

    public final int hashCode() {
        int iHashCode = this.f149411a.hashCode() * 31;
        String str = this.f149412b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
