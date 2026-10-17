package snd;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f264536a;

    public h(ArrayList accountIds) {
        Intrinsics.checkNotNullParameter(accountIds, "accountIds");
        this.f264536a = accountIds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f264536a.equals(((h) obj2).f264536a);
    }

    public final int hashCode() {
        return this.f264536a.hashCode();
    }
}
