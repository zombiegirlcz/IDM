package xqd;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f308155a;

    public a(Data score) {
        Intrinsics.checkNotNullParameter(score, "score");
        this.f308155a = score;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f308155a, ((a) obj2).f308155a);
    }

    public final int hashCode() {
        return this.f308155a.hashCode();
    }
}
