package xc8;

import java.time.LocalDateTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f304101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v6d.a f304102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f304103c;
    public final a d;
    public final LocalDateTime e;

    public c(String id10, v6d.a code, b type, a state, LocalDateTime createdDate) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        this.f304101a = id10;
        this.f304102b = code;
        this.f304103c = type;
        this.d = state;
        this.e = createdDate;
    }

    public static c a(c cVar, a state) {
        String id10 = cVar.f304101a;
        v6d.a code = cVar.f304102b;
        b type = cVar.f304103c;
        LocalDateTime createdDate = cVar.e;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        return new c(id10, code, type, state, createdDate);
    }

    public final boolean b() {
        return this.d == a.GIVEN;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f304101a, cVar.f304101a) && this.f304102b == cVar.f304102b && this.f304103c == cVar.f304103c && this.d == cVar.d && Intrinsics.f(this.e, cVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.f304103c.hashCode() + ((this.f304102b.hashCode() + (this.f304101a.hashCode() * 31)) * 31)) * 31)) * 31);
    }
}
