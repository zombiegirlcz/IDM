package j27;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f implements cli.j {

    public static final class a extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Data f170711a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f170712b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f170713c;

        public a() {
            this(null, 7);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.f170711a, aVar.f170711a) && Intrinsics.f(this.f170712b, aVar.f170712b) && Intrinsics.f(this.f170713c, aVar.f170713c);
        }

        public final int hashCode() {
            Data data = this.f170711a;
            int iHashCode = (data == null ? 0 : data.hashCode()) * 31;
            List list = this.f170712b;
            return this.f170713c.hashCode() + ((iHashCode + (list != null ? list.hashCode() : 0)) * 31);
        }

        public a(Data data, String searchQuery, List list) {
            Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
            this.f170711a = data;
            this.f170712b = list;
            this.f170713c = searchQuery;
        }

        public /* synthetic */ a(Data data, int i) {
            this((i & 1) != 0 ? null : data, "", null);
        }
    }

    public static final class b extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f170714a = new b();

        private b() {
        }
    }

    private f() {
    }
}
