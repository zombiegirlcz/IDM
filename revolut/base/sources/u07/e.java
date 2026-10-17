package u07;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f276078a;

    public e() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f276078a, ((e) obj2).f276078a);
    }

    public final int hashCode() {
        return this.f276078a.hashCode();
    }

    public e(Data taxSettingsInfo) {
        Intrinsics.checkNotNullParameter(taxSettingsInfo, "taxSettingsInfo");
        this.f276078a = taxSettingsInfo;
    }

    public /* synthetic */ e(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
