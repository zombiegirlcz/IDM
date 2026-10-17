package o4d;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f222195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f222196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f222197c;
    public final DateTime d;
    public final String e;

    public c(String assetTypeKey, String from, String to6, DateTime addedTime, String syncState) {
        Intrinsics.checkNotNullParameter(assetTypeKey, "assetTypeKey");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        Intrinsics.checkNotNullParameter(addedTime, "addedTime");
        Intrinsics.checkNotNullParameter(syncState, "syncState");
        this.f222195a = assetTypeKey;
        this.f222196b = from;
        this.f222197c = to6;
        this.d = addedTime;
        this.e = syncState;
    }

    public final String a() {
        return this.f222195a;
    }

    public final String b() {
        return this.f222196b;
    }

    public final String c() {
        return this.e;
    }

    public final String d() {
        return this.f222197c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f222195a, cVar.f222195a) && Intrinsics.f(this.f222196b, cVar.f222196b) && Intrinsics.f(this.f222197c, cVar.f222197c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + m72.b.f(this.d, p.a.c(p.a.c(this.f222195a.hashCode() * 31, 31, this.f222196b), 31, this.f222197c), 31);
    }
}
