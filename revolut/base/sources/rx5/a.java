package rx5;

import com.revolut.data.model.Data;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cw5.e f258025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f258026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f258027c;

    public a(cw5.e timeframe, Data items, Map volumeChanges) {
        Intrinsics.checkNotNullParameter(timeframe, "timeframe");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(volumeChanges, "volumeChanges");
        this.f258025a = timeframe;
        this.f258026b = items;
        this.f258027c = volumeChanges;
    }

    public static a a(a aVar, cw5.e timeframe, Data items, Map volumeChanges, int i) {
        if ((i & 1) != 0) {
            timeframe = aVar.f258025a;
        }
        if ((i & 2) != 0) {
            items = aVar.f258026b;
        }
        if ((i & 4) != 0) {
            volumeChanges = aVar.f258027c;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(timeframe, "timeframe");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(volumeChanges, "volumeChanges");
        return new a(timeframe, items, volumeChanges);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f258025a == aVar.f258025a && Intrinsics.f(this.f258026b, aVar.f258026b) && Intrinsics.f(this.f258027c, aVar.f258027c);
    }

    public final int hashCode() {
        return this.f258027c.hashCode() + kii.e.c(this.f258026b, this.f258025a.hashCode() * 31, 31);
    }

    public a() {
        this(cw5.e.ONE_DAY, new Data(null, null, true, 3, null), r0.g());
    }
}
