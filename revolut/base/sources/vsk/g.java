package vsk;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f291843a;

    public g(Data data) {
        this.f291843a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f291843a, ((g) obj2).f291843a);
    }

    public final int hashCode() {
        Data data = this.f291843a;
        if (data == null) {
            return 0;
        }
        return data.hashCode();
    }
}
