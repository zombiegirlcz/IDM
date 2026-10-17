package h3g;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final myf.b f149120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f149121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f149122c;

    public c(myf.b bVar, Integer num, List answers) {
        Intrinsics.checkNotNullParameter(answers, "answers");
        this.f149120a = bVar;
        this.f149121b = num;
        this.f149122c = answers;
    }

    public static c a(c cVar, List answers) {
        myf.b bVar = cVar.f149120a;
        Integer num = cVar.f149121b;
        Intrinsics.checkNotNullParameter(answers, "answers");
        return new c(bVar, num, answers);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f149120a == cVar.f149120a && Intrinsics.f(this.f149121b, cVar.f149121b) && Intrinsics.f(this.f149122c, cVar.f149122c);
    }

    public final int hashCode() {
        myf.b bVar = this.f149120a;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        Integer num = this.f149121b;
        return this.f149122c.hashCode() + ((iHashCode + (num != null ? num.hashCode() : 0)) * 31);
    }
}
