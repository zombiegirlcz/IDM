package k50;

import com.revolut.chat.data.repository.chat.MessageAuthor;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class t4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MessageAuthor f181250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f181251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UUID f181252c;

    public t4(MessageAuthor author, long j2, UUID uuid) {
        Intrinsics.checkNotNullParameter(author, "author");
        this.f181250a = author;
        this.f181251b = j2;
        this.f181252c = uuid;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t4)) {
            return false;
        }
        t4 t4Var = (t4) obj2;
        return Intrinsics.f(this.f181250a, t4Var.f181250a) && this.f181251b == t4Var.f181251b && Intrinsics.f(this.f181252c, t4Var.f181252c);
    }

    public final int hashCode() {
        int iC = a0.d.c(this.f181250a.hashCode() * 31, 31, this.f181251b);
        UUID uuid = this.f181252c;
        return iC + (uuid == null ? 0 : uuid.hashCode());
    }
}
