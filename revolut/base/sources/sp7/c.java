package sp7;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f264903a;

    public c(ArrayList answersInfo) {
        Intrinsics.checkNotNullParameter(answersInfo, "answersInfo");
        this.f264903a = answersInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f264903a.equals(((c) obj2).f264903a);
    }

    public final int hashCode() {
        return this.f264903a.hashCode();
    }
}
