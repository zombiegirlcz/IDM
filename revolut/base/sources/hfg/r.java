package hfg;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f151884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f151885b;

    public r(String textSuggestion, ArrayList destinations) {
        Intrinsics.checkNotNullParameter(textSuggestion, "textSuggestion");
        Intrinsics.checkNotNullParameter(destinations, "destinations");
        this.f151884a = textSuggestion;
        this.f151885b = destinations;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f151884a, rVar.f151884a) && this.f151885b.equals(rVar.f151885b);
    }

    public final int hashCode() {
        return this.f151885b.hashCode() + (this.f151884a.hashCode() * 31);
    }
}
