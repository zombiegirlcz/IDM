package com.fourthline.orca.internal;

import com.fourthline.orca.core.flavor.OrcaFlavor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface gj0 {

    public static final class a implements gj0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final OrcaFlavor f28911a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f28912b;

        public a(OrcaFlavor flavor, boolean z) {
            Intrinsics.checkNotNullParameter(flavor, "flavor");
            this.f28911a = flavor;
            this.f28912b = z;
        }

        @Override // com.fourthline.orca.internal.gj0
        public boolean a() {
            return this.f28912b;
        }

        public final OrcaFlavor b() {
            return this.f28911a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.f28911a, aVar.f28911a) && this.f28912b == aVar.f28912b;
        }

        public int hashCode() {
            return (this.f28911a.hashCode() * 31) + Boolean.hashCode(this.f28912b);
        }

        public String toString() {
            return "Legacy(flavor=" + this.f28911a + ", isBackButtonOnTopEnabled=" + this.f28912b + ")";
        }
    }

    public static final class b implements gj0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final wi0 f28913a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final OrcaFlavor f28914b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f28915c;

        public b(wi0 styling, OrcaFlavor legacy, boolean z) {
            Intrinsics.checkNotNullParameter(styling, "styling");
            Intrinsics.checkNotNullParameter(legacy, "legacy");
            this.f28913a = styling;
            this.f28914b = legacy;
            this.f28915c = z;
        }

        @Override // com.fourthline.orca.internal.gj0
        public boolean a() {
            return this.f28915c;
        }

        public final OrcaFlavor b() {
            return this.f28914b;
        }

        public final wi0 c() {
            return this.f28913a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.f28913a, bVar.f28913a) && Intrinsics.f(this.f28914b, bVar.f28914b) && this.f28915c == bVar.f28915c;
        }

        public int hashCode() {
            return (((this.f28913a.hashCode() * 31) + this.f28914b.hashCode()) * 31) + Boolean.hashCode(this.f28915c);
        }

        public String toString() {
            return "Styling(styling=" + this.f28913a + ", legacy=" + this.f28914b + ", isBackButtonOnTopEnabled=" + this.f28915c + ")";
        }
    }

    boolean a();
}
