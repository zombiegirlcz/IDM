package xx9;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f309426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f309427b;

    public i(ArrayList localContacts, ArrayList remoteContacts) {
        Intrinsics.checkNotNullParameter(localContacts, "localContacts");
        Intrinsics.checkNotNullParameter(remoteContacts, "remoteContacts");
        this.f309426a = localContacts;
        this.f309427b = remoteContacts;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f309426a.equals(iVar.f309426a) && this.f309427b.equals(iVar.f309427b);
    }

    public final int hashCode() {
        return this.f309427b.hashCode() + (this.f309426a.hashCode() * 31);
    }
}
