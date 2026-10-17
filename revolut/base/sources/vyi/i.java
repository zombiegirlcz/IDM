package vyi;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f293335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f293336b;

    public i(Data lounges, Data savedLoungeIds) {
        Intrinsics.checkNotNullParameter(lounges, "lounges");
        Intrinsics.checkNotNullParameter(savedLoungeIds, "savedLoungeIds");
        this.f293335a = lounges;
        this.f293336b = savedLoungeIds;
    }

    public static i a(i iVar, Data lounges, Data savedLoungeIds, int i) {
        if ((i & 1) != 0) {
            lounges = iVar.f293335a;
        }
        if ((i & 2) != 0) {
            savedLoungeIds = iVar.f293336b;
        }
        iVar.getClass();
        Intrinsics.checkNotNullParameter(lounges, "lounges");
        Intrinsics.checkNotNullParameter(savedLoungeIds, "savedLoungeIds");
        return new i(lounges, savedLoungeIds);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f293335a, iVar.f293335a) && Intrinsics.f(this.f293336b, iVar.f293336b);
    }

    public final int hashCode() {
        return this.f293336b.hashCode() + (this.f293335a.hashCode() * 31);
    }
}
