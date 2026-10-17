package u40;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Instant;
import v30.j;
import v30.r;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f276959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f276960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f276961c;
    public final Instant d;

    public b(j detailedChat) {
        Intrinsics.checkNotNullParameter(detailedChat, "detailedChat");
        this.f276959a = detailedChat;
        String string = detailedChat.f285785a.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.f276960b = string;
        this.f276961c = r.b(detailedChat);
        this.d = detailedChat.f285793n;
    }

    @Override // u40.d
    public final String a() {
        return this.f276960b;
    }

    @Override // u40.d
    public final Instant b() {
        return this.d;
    }

    @Override // u40.d
    public final boolean c() {
        return this.f276961c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f276959a, ((b) obj2).f276959a);
    }

    public final int hashCode() {
        return this.f276959a.hashCode();
    }
}
