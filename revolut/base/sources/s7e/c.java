package s7e;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f260678a;

    public c(ArrayList contacts) {
        Intrinsics.checkNotNullParameter(contacts, "contacts");
        this.f260678a = contacts;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f260678a.equals(((c) obj2).f260678a);
    }

    public final int hashCode() {
        return this.f260678a.hashCode();
    }
}
