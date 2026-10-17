package csh;

import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f108470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f108471b;

    public h(ArrayList contentValues, Map map) {
        Intrinsics.checkNotNullParameter(contentValues, "contentValues");
        this.f108470a = contentValues;
        this.f108471b = map;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f108470a.equals(hVar.f108470a) && this.f108471b.equals(hVar.f108471b);
    }

    public final int hashCode() {
        return this.f108471b.hashCode() + (this.f108470a.hashCode() * 31);
    }
}
