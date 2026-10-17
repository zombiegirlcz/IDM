package svi;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes10.dex */
public final class t implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f265987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f265988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f265989c;

    public t(String value, DateTime validUntil, long j2) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(validUntil, "validUntil");
        this.f265987a = value;
        this.f265988b = validUntil;
        this.f265989c = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f265987a, tVar.f265987a) && Intrinsics.f(this.f265988b, tVar.f265988b) && this.f265989c == tVar.f265989c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f265989c) + m72.b.f(this.f265988b, this.f265987a.hashCode() * 31, 31);
    }
}
