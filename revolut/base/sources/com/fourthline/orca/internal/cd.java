package com.fourthline.orca.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes23.dex */
public interface cd {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final IntRange f27439a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a01 f27440b;

        public a(IntRange range, a01 item) {
            Intrinsics.checkNotNullParameter(range, "range");
            Intrinsics.checkNotNullParameter(item, "item");
            this.f27439a = range;
            this.f27440b = item;
        }

        public final a01 a() {
            return this.f27440b;
        }

        public final IntRange b() {
            return this.f27439a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.f27439a, aVar.f27439a) && Intrinsics.f(this.f27440b, aVar.f27440b);
        }

        public int hashCode() {
            return (this.f27439a.hashCode() * 31) + this.f27440b.hashCode();
        }

        public String toString() {
            return "CountriesFilterResult(range=" + this.f27439a + ", item=" + this.f27440b + ")";
        }
    }

    List a(String str, List list);
}
