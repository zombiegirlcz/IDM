package com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2;

import aii.m;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a extends m {

    /* JADX INFO: renamed from: com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.a$a, reason: collision with other inner class name */
    public static final class C0549a extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0549a f87810b = new C0549a();

        private C0549a() {
        }
    }

    public static final class b extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f87811b = new b();

        private b() {
        }
    }

    public static final class c extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Set f87812b;

        public c() {
            this(0);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof c) && Intrinsics.f(this.f87812b, ((c) obj2).f87812b);
        }

        public final int hashCode() {
            return this.f87812b.hashCode();
        }

        public c(Set pendingSelectedDestinationIds) {
            Intrinsics.checkNotNullParameter(pendingSelectedDestinationIds, "pendingSelectedDestinationIds");
            this.f87812b = pendingSelectedDestinationIds;
        }

        public c(int i) {
            this(h0.f322473a);
        }
    }

    public static final class d extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Set f87813b;

        public d() {
            this(0);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof d) && Intrinsics.f(this.f87813b, ((d) obj2).f87813b);
        }

        public final int hashCode() {
            return this.f87813b.hashCode();
        }

        public d(Set pendingSelectedDestinationIds) {
            Intrinsics.checkNotNullParameter(pendingSelectedDestinationIds, "pendingSelectedDestinationIds");
            this.f87813b = pendingSelectedDestinationIds;
        }

        public d(int i) {
            this(h0.f322473a);
        }
    }

    public static final class e extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f87814b = new e();

        private e() {
        }
    }

    private a() {
    }
}
