package hb6;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f150613a;

    public a(Data quote) {
        Intrinsics.checkNotNullParameter(quote, "quote");
        this.f150613a = quote;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f150613a, ((a) obj2).f150613a);
    }

    public final int hashCode() {
        return this.f150613a.hashCode();
    }
}
