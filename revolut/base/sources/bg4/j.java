package bg4;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f15104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f15105b;

    public j(Data content, Data quote) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(quote, "quote");
        this.f15104a = content;
        this.f15105b = quote;
    }

    public static j a(j jVar, Data content, Data quote, int i) {
        if ((i & 1) != 0) {
            content = jVar.f15104a;
        }
        if ((i & 2) != 0) {
            quote = jVar.f15105b;
        }
        jVar.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(quote, "quote");
        return new j(content, quote);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f15104a, jVar.f15104a) && Intrinsics.f(this.f15105b, jVar.f15105b);
    }

    public final int hashCode() {
        return this.f15105b.hashCode() + (this.f15104a.hashCode() * 31);
    }
}
