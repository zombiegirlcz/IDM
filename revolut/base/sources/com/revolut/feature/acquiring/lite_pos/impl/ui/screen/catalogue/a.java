package com.revolut.feature.acquiring.lite_pos.impl.ui.screen.catalogue;

import aii.r;
import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueCategory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public abstract class a implements r {

    /* JADX INFO: renamed from: com.revolut.feature.acquiring.lite_pos.impl.ui.screen.catalogue.a$a, reason: collision with other inner class name */
    public static final class C0452a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0452a f60775a = new C0452a();

        private C0452a() {
        }
    }

    private a() {
    }

    public static final class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CatalogueCategory f60776a;

        public b(CatalogueCategory catalogueCategory) {
            this.f60776a = catalogueCategory;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.f60776a, ((b) obj2).f60776a);
        }

        public final int hashCode() {
            CatalogueCategory catalogueCategory = this.f60776a;
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
