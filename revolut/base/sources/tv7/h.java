package tv7;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f274721a;

    public h() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f274721a, ((h) obj2).f274721a);
    }

    public final int hashCode() {
        return this.f274721a.hashCode();
    }

    public h(Data layout) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.f274721a = layout;
    }

    public /* synthetic */ h(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
