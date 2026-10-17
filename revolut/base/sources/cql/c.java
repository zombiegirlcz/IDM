package cql;

import cli.j;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f108154a;

    public c(List sessions) {
        Intrinsics.checkNotNullParameter(sessions, "sessions");
        this.f108154a = sessions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f108154a, ((c) obj2).f108154a);
    }

    public final int hashCode() {
        return this.f108154a.hashCode();
    }
}
