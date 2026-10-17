package fzg;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements e {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f139198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f139199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f139200c;
    public final dj0.d d;
    public final dj0.d e;

    public d(dj0.d value, DateTime timestamp, dj0.d realised, dj0.d unrealised, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(realised, "realised");
        Intrinsics.checkNotNullParameter(unrealised, "unrealised");
        this.f139198a = value;
        this.f139199b = timestamp;
        this.f139200c = realised;
        this.d = unrealised;
        this.e = dVar;
    }

    public static d b(d dVar, dj0.d dVar2, DateTime dateTime, int i) {
        if ((i & 1) != 0) {
            dVar2 = dVar.f139198a;
        }
        dj0.d value = dVar2;
        if ((i & 2) != 0) {
            dateTime = dVar.f139199b;
        }
        DateTime timestamp = dateTime;
        dj0.d realised = dVar.f139200c;
        dj0.d unrealised = dVar.d;
        dj0.d dVar3 = dVar.e;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(realised, "realised");
        Intrinsics.checkNotNullParameter(unrealised, "unrealised");
        return new d(value, timestamp, realised, unrealised, dVar3);
    }

    @Override // fzg.e
    public final e a(DateTime timestamp) {
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        return b(this, null, timestamp, 29);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f139198a, dVar.f139198a) && Intrinsics.f(this.f139199b, dVar.f139199b) && Intrinsics.f(this.f139200c, dVar.f139200c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e);
    }

    @Override // fzg.e
    public final DateTime getTimestamp() {
        return this.f139199b;
    }

    @Override // fzg.e
    public final dj0.d getValue() {
        return this.f139198a;
    }

    public final int hashCode() {
        int iC = v7.c(v7.c(m72.b.f(this.f139199b, this.f139198a.hashCode() * 31, 31), 31, this.f139200c), 31, this.d);
        dj0.d dVar = this.e;
        return iC + (dVar == null ? 0 : dVar.hashCode());
    }
}
