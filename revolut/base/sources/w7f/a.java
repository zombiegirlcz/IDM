package w7f;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f295517a;

    public a() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f295517a, ((a) obj2).f295517a);
    }

    public final int hashCode() {
        Data data = this.f295517a;
        if (data == null) {
            return 0;
        }
        return data.hashCode();
    }

    public a(Data data) {
        this.f295517a = data;
    }
}
