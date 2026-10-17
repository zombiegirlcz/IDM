package yf4;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f313173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f313174b;

    public e(Data config, Integer num) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f313173a = config;
        this.f313174b = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f313173a, eVar.f313173a) && Intrinsics.f(this.f313174b, eVar.f313174b);
    }

    public final int hashCode() {
        int iHashCode = this.f313173a.hashCode() * 31;
        Integer num = this.f313174b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
