package uyd;

import com.revolut.feature.statements.api.models.StatementsFormat;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f284171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f284172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StatementsFormat f284173c;

    public c(String str, int i, StatementsFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        this.f284171a = str;
        this.f284172b = i;
        this.f284173c = format;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f284171a, cVar.f284171a) && this.f284172b == cVar.f284172b && this.f284173c == cVar.f284173c;
    }

    public final int hashCode() {
        String str = this.f284171a;
        return this.f284173c.hashCode() + j6.a.b(this.f284172b, (str == null ? 0 : str.hashCode()) * 31, 31);
    }
}
