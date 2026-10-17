package ly5;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f200700a;

    public f() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f200700a, ((f) obj2).f200700a);
    }

    public final int hashCode() {
        return this.f200700a.hashCode();
    }

    public f(Data collectionsData) {
        Intrinsics.checkNotNullParameter(collectionsData, "collectionsData");
        this.f200700a = collectionsData;
    }

    public /* synthetic */ f(int i) {
        this(new Data(null, null, false, 7, null));
    }
}
