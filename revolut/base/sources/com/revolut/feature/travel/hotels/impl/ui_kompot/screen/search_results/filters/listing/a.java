package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing;

import aii.r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a implements r {

    /* JADX INFO: renamed from: com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.a$a, reason: collision with other inner class name */
    public static final class C0572a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f94029a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f94030b;

        public C0572a() {
            this(7, null, false);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C0572a)) {
                return false;
            }
            C0572a c0572a = (C0572a) obj2;
            return this.f94029a == c0572a.f94029a && Intrinsics.f(this.f94030b, c0572a.f94030b);
        }

        public final int hashCode() {
            return this.f94030b.hashCode() + (Boolean.hashCode(this.f94029a) * 961);
        }

        public C0572a(int i, List smartSearchSuggestions, boolean z) {
            z = (i & 1) != 0 ? false : z;
            smartSearchSuggestions = (i & 4) != 0 ? f0.f322471a : smartSearchSuggestions;
            Intrinsics.checkNotNullParameter(smartSearchSuggestions, "smartSearchSuggestions");
            this.f94029a = z;
            this.f94030b = smartSearchSuggestions;
        }
    }

    private a() {
    }
}
