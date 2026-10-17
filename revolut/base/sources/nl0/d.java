package nl0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes19.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Regex f216974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f216975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f216976c;

    public d(Regex regex, Function1 transform, Function1 removalTransform) {
        Intrinsics.checkNotNullParameter(regex, "regex");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Intrinsics.checkNotNullParameter(removalTransform, "removalTransform");
        this.f216974a = regex;
        this.f216975b = transform;
        this.f216976c = removalTransform;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f216974a, dVar.f216974a) && Intrinsics.f(this.f216975b, dVar.f216975b) && Intrinsics.f(this.f216976c, dVar.f216976c);
    }

    public final int hashCode() {
        return this.f216976c.hashCode() + ((this.f216975b.hashCode() + (this.f216974a.hashCode() * 31)) * 31);
    }
}
