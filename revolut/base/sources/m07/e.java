package m07;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f201091a;

    public e() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f201091a, ((e) obj2).f201091a);
    }

    public final int hashCode() {
        return this.f201091a.hashCode();
    }

    public e(Data settingsData) {
        Intrinsics.checkNotNullParameter(settingsData, "settingsData");
        this.f201091a = settingsData;
    }

    public /* synthetic */ e(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
