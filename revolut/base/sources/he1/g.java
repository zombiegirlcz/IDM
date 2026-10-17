package he1;

import aii.r;
import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueCategory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public abstract class g implements r {

    public static final class a extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f151515a = new a();

        private a() {
        }
    }

    private g() {
    }

    public static final class b extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CatalogueCategory f151516a;

        public b(CatalogueCategory catalogueCategory) {
            this.f151516a = catalogueCategory;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.f151516a, ((b) obj2).f151516a);
        }

        public final int hashCode() {
            CatalogueCategory catalogueCategory = this.f151516a;
            if (catalogueCategory == null) {
                return 0;
            }
            return catalogueCategory.hashCode();
        }

        public b() {
            this(null);
        }
    }
}
