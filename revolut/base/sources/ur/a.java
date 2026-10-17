package ur;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f282218a;

    public a(ArrayList uploadedKeys) {
        Intrinsics.checkNotNullParameter(uploadedKeys, "uploadedKeys");
        this.f282218a = uploadedKeys;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f282218a.equals(((a) obj2).f282218a);
    }

    public final int hashCode() {
        return this.f282218a.hashCode();
    }
}
