package xvc;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f309232a;

    public f() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f309232a, ((f) obj2).f309232a);
    }

    public final int hashCode() {
        return this.f309232a.hashCode();
    }

    public f(Data streetModeInfo) {
        Intrinsics.checkNotNullParameter(streetModeInfo, "streetModeInfo");
        this.f309232a = streetModeInfo;
    }

    public /* synthetic */ f(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
