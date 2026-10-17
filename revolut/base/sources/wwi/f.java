package wwi;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class f {

    public static final class a extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Data f300674a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Data f300675b;

        public a() {
            this(0);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.f300674a, aVar.f300674a) && Intrinsics.f(this.f300675b, aVar.f300675b);
        }

        public final int hashCode() {
            return this.f300675b.hashCode() + (this.f300674a.hashCode() * 31);
        }

        public a(Data allAirports, Data recentlyViewedAirports) {
            Intrinsics.checkNotNullParameter(allAirports, "allAirports");
            Intrinsics.checkNotNullParameter(recentlyViewedAirports, "recentlyViewedAirports");
            this.f300674a = allAirports;
            this.f300675b = recentlyViewedAirports;
        }

        public /* synthetic */ a(int i) {
            this(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null));
        }
    }

    private f() {
    }
}
