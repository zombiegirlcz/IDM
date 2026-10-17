package vnb;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f290779a;

    public c(ArrayList productsData) {
        Intrinsics.checkNotNullParameter(productsData, "productsData");
        this.f290779a = productsData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f290779a.equals(((c) obj2).f290779a);
    }

    public final int hashCode() {
        return this.f290779a.hashCode();
    }
}
