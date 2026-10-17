package thh;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f271382a;

    public a() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f271382a, ((a) obj2).f271382a);
    }

    public final int hashCode() {
        Data data = this.f271382a;
        if (data == null) {
            return 0;
        }
        return data.hashCode();
    }

    public a(Data data) {
        this.f271382a = data;
    }
}
