package qr6;

import dj0.d;
import ip0.v7;
import java.time.LocalDateTime;
import kotlin.jvm.internal.Intrinsics;
import lr6.h0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f248654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDateTime f248655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f248656c;
    public final String d;
    public final h0 e;

    public c(b eventType, LocalDateTime timestamp, d dVar, String str, h0 h0Var) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        this.f248654a = eventType;
        this.f248655b = timestamp;
        this.f248656c = dVar;
        this.d = str;
        this.e = h0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f248654a == cVar.f248654a && Intrinsics.f(this.f248655b, cVar.f248655b) && Intrinsics.f(this.f248656c, cVar.f248656c) && Intrinsics.f(this.d, cVar.d) && this.e == cVar.e;
    }

    public final int hashCode() {
        int i = v7.i(this.f248655b, this.f248654a.hashCode() * 31, 31);
        d dVar = this.f248656c;
        int iHashCode = (i + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        h0 h0Var = this.e;
        return iHashCode2 + (h0Var != null ? h0Var.hashCode() : 0);
    }
}
