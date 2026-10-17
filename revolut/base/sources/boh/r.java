package boh;

import kotlin.jvm.internal.Intrinsics;
import xzg.b0;
import xzg.d0;

/* JADX INFO: loaded from: classes10.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f17479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f17480b;

    public r(b0 timeSpan, d0 section) {
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(section, "section");
        this.f17479a = timeSpan;
        this.f17480b = section;
    }

    public static r a(r rVar, b0 timeSpan, d0 section, int i) {
        if ((i & 1) != 0) {
            timeSpan = rVar.f17479a;
        }
        if ((i & 2) != 0) {
            section = rVar.f17480b;
        }
        rVar.getClass();
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(section, "section");
        return new r(timeSpan, section);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return this.f17479a == rVar.f17479a && this.f17480b == rVar.f17480b;
    }

    public final int hashCode() {
        return this.f17480b.hashCode() + (this.f17479a.hashCode() * 31);
    }
}
