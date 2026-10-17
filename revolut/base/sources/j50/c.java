package j50;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f171426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f171427b;

    public c(String str, ArrayList chosenTags) {
        Intrinsics.checkNotNullParameter(chosenTags, "chosenTags");
        this.f171426a = chosenTags;
        this.f171427b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f171426a.equals(cVar.f171426a) && Intrinsics.f(this.f171427b, cVar.f171427b);
    }

    public final int hashCode() {
        int iHashCode = this.f171426a.hashCode() * 31;
        String str = this.f171427b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
