package com.fourthline.orca.internal;

import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class xg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f34981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f34982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f34983c;
    private final a d;
    private final b e;
    private final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f34984g;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f34985a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f34986b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f34987c;

        public /* synthetic */ a(long j2, long j3, long j5, DefaultConstructorMarker defaultConstructorMarker) {
            this(j2, j3, j5);
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Color.m1978equalsimpl0(this.f34985a, aVar.f34985a) && Color.m1978equalsimpl0(this.f34986b, aVar.f34986b) && Color.m1978equalsimpl0(this.f34987c, aVar.f34987c);
        }

        public int hashCode() {
            return (((Color.m1984hashCodeimpl(this.f34985a) * 31) + Color.m1984hashCodeimpl(this.f34986b)) * 31) + Color.m1984hashCodeimpl(this.f34987c);
        }

        public String toString() {
            return "OrcaButton(textColor=" + Color.m1985toStringimpl(this.f34985a) + ", backgroundColor=" + Color.m1985toStringimpl(this.f34986b) + ", borderColor=" + Color.m1985toStringimpl(this.f34987c) + ")";
        }

        private a(long j2, long j3, long j5) {
            this.f34985a = j2;
            this.f34986b = j3;
            this.f34987c = j5;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f34988a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f34989b;

        public /* synthetic */ b(long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
            this(j2, j3);
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Color.m1978equalsimpl0(this.f34988a, bVar.f34988a) && Color.m1978equalsimpl0(this.f34989b, bVar.f34989b);
        }

        public int hashCode() {
            return (Color.m1984hashCodeimpl(this.f34988a) * 31) + Color.m1984hashCodeimpl(this.f34989b);
        }

        public String toString() {
            return "OrcaCheckbox(tintColor=" + Color.m1985toStringimpl(this.f34988a) + ", iconColor=" + Color.m1985toStringimpl(this.f34989b) + ")";
        }

        private b(long j2, long j3) {
            this.f34988a = j2;
            this.f34989b = j3;
        }
    }

    public /* synthetic */ xg0(a aVar, a aVar2, a aVar3, a aVar4, b bVar, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, aVar2, aVar3, aVar4, bVar, j2, j3);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof xg0)) {
            return false;
        }
        xg0 xg0Var = (xg0) obj2;
        return Intrinsics.f(this.f34981a, xg0Var.f34981a) && Intrinsics.f(this.f34982b, xg0Var.f34982b) && Intrinsics.f(this.f34983c, xg0Var.f34983c) && Intrinsics.f(this.d, xg0Var.d) && Intrinsics.f(this.e, xg0Var.e) && Color.m1978equalsimpl0(this.f, xg0Var.f) && Color.m1978equalsimpl0(this.f34984g, xg0Var.f34984g);
    }

    public int hashCode() {
        return (((((((((((this.f34981a.hashCode() * 31) + this.f34982b.hashCode()) * 31) + this.f34983c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + Color.m1984hashCodeimpl(this.f)) * 31) + Color.m1984hashCodeimpl(this.f34984g);
    }

    public String toString() {
        return "OrcaButtons(primary=" + this.f34981a + ", secondary=" + this.f34982b + ", scannerPrimary=" + this.f34983c + ", scannerSecondary=" + this.d + ", checkbox=" + this.e + ", linkButtonColor=" + Color.m1985toStringimpl(this.f) + ", backButtonColor=" + Color.m1985toStringimpl(this.f34984g) + ")";
    }

    private xg0(a primary, a secondary, a scannerPrimary, a scannerSecondary, b checkbox, long j2, long j3) {
        Intrinsics.checkNotNullParameter(primary, "primary");
        Intrinsics.checkNotNullParameter(secondary, "secondary");
        Intrinsics.checkNotNullParameter(scannerPrimary, "scannerPrimary");
        Intrinsics.checkNotNullParameter(scannerSecondary, "scannerSecondary");
        Intrinsics.checkNotNullParameter(checkbox, "checkbox");
        this.f34981a = primary;
        this.f34982b = secondary;
        this.f34983c = scannerPrimary;
        this.d = scannerSecondary;
        this.e = checkbox;
        this.f = j2;
        this.f34984g = j3;
    }
}
