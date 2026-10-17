package rw0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f257793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f257794b;

    public a(Clause startText, h endText) {
        Intrinsics.checkNotNullParameter(startText, "startText");
        Intrinsics.checkNotNullParameter(endText, "endText");
        this.f257793a = startText;
        this.f257794b = endText;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f257793a.equals(aVar.f257793a) && this.f257794b.equals(aVar.f257794b);
    }

    public final int hashCode() {
        return this.f257794b.hashCode() + (this.f257793a.hashCode() * 31);
    }
}
