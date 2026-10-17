package com.fourthline.orca.internal;

import com.fourthline.orca.internal.m80;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class az implements ie1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c81 f26939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c81 f26940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m80.b f26941c;
    private final c81 d;
    private final List e;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final yk f26942a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c81 f26943b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final c81 f26944c;
        private final z10 d;
        private final boolean e;
        private final boolean f;

        public a(yk type, c81 subtitle, c81 description, z10 z10Var, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(description, "description");
            this.f26942a = type;
            this.f26943b = subtitle;
            this.f26944c = description;
            this.d = z10Var;
            this.e = z;
            this.f = z3;
        }

        public final a a(yk type, c81 subtitle, c81 description, z10 z10Var, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(description, "description");
            return new a(type, subtitle, description, z10Var, z, z3);
        }

        public final z10 b() {
            return this.d;
        }

        public final c81 c() {
            return this.f26943b;
        }

        public final yk d() {
            return this.f26942a;
        }

        public final boolean e() {
            return this.f;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return this.f26942a == aVar.f26942a && Intrinsics.f(this.f26943b, aVar.f26943b) && Intrinsics.f(this.f26944c, aVar.f26944c) && Intrinsics.f(this.d, aVar.d) && this.e == aVar.e && this.f == aVar.f;
        }

        public final boolean f() {
            return this.e;
        }

        public int hashCode() {
            int iHashCode = ((((this.f26942a.hashCode() * 31) + this.f26943b.hashCode()) * 31) + this.f26944c.hashCode()) * 31;
            z10 z10Var = this.d;
            return ((((iHashCode + (z10Var == null ? 0 : z10Var.hashCode())) * 31) + Boolean.hashCode(this.e)) * 31) + Boolean.hashCode(this.f);
        }

        public String toString() {
            return "FlowSelectionPresentation(type=" + this.f26942a + ", subtitle=" + this.f26943b + ", description=" + this.f26944c + ", icon=" + this.d + ", isSelected=" + this.e + ", isEnabled=" + this.f + ")";
        }

        public static /* synthetic */ a a(a aVar, yk ykVar, c81 c81Var, c81 c81Var2, z10 z10Var, boolean z, boolean z3, int i, Object obj2) {
            if ((i & 1) != 0) {
                ykVar = aVar.f26942a;
            }
            if ((i & 2) != 0) {
                c81Var = aVar.f26943b;
            }
            if ((i & 4) != 0) {
                c81Var2 = aVar.f26944c;
            }
            if ((i & 8) != 0) {
                z10Var = aVar.d;
            }
            if ((i & 16) != 0) {
                z = aVar.e;
            }
            if ((i & 32) != 0) {
                z3 = aVar.f;
            }
            boolean z4 = z;
            boolean z6 = z3;
            return aVar.a(ykVar, c81Var, c81Var2, z10Var, z4, z6);
        }

        public final c81 a() {
            return this.f26944c;
        }

        public /* synthetic */ a(yk ykVar, c81 c81Var, c81 c81Var2, z10 z10Var, boolean z, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(ykVar, c81Var, c81Var2, z10Var, z, (i & 32) != 0 ? true : z3);
        }
    }

    public az(c81 title, c81 subtitle, m80.b primaryButtonState, c81 secondaryButtonText, List options) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(primaryButtonState, "primaryButtonState");
        Intrinsics.checkNotNullParameter(secondaryButtonText, "secondaryButtonText");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f26939a = title;
        this.f26940b = subtitle;
        this.f26941c = primaryButtonState;
        this.d = secondaryButtonText;
        this.e = options;
    }

    public final az a(c81 title, c81 subtitle, m80.b primaryButtonState, c81 secondaryButtonText, List options) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(primaryButtonState, "primaryButtonState");
        Intrinsics.checkNotNullParameter(secondaryButtonText, "secondaryButtonText");
        Intrinsics.checkNotNullParameter(options, "options");
        return new az(title, subtitle, primaryButtonState, secondaryButtonText, options);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof az)) {
            return false;
        }
        az azVar = (az) obj2;
        return Intrinsics.f(this.f26939a, azVar.f26939a) && Intrinsics.f(this.f26940b, azVar.f26940b) && Intrinsics.f(this.f26941c, azVar.f26941c) && Intrinsics.f(this.d, azVar.d) && Intrinsics.f(this.e, azVar.e);
    }

    public final c81 getTitle() {
        return this.f26939a;
    }

    public int hashCode() {
        return (((((((this.f26939a.hashCode() * 31) + this.f26940b.hashCode()) * 31) + this.f26941c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final List n() {
        return this.e;
    }

    public final m80.b o() {
        return this.f26941c;
    }

    public final c81 p() {
        return this.f26940b;
    }

    public String toString() {
        return "State(title=" + this.f26939a + ", subtitle=" + this.f26940b + ", primaryButtonState=" + this.f26941c + ", secondaryButtonText=" + this.d + ", options=" + this.e + ")";
    }

    public static /* synthetic */ az a(az azVar, c81 c81Var, c81 c81Var2, m80.b bVar, c81 c81Var3, List list, int i, Object obj2) {
        if ((i & 1) != 0) {
            c81Var = azVar.f26939a;
        }
        if ((i & 2) != 0) {
            c81Var2 = azVar.f26940b;
        }
        if ((i & 4) != 0) {
            bVar = azVar.f26941c;
        }
        if ((i & 8) != 0) {
            c81Var3 = azVar.d;
        }
        if ((i & 16) != 0) {
            list = azVar.e;
        }
        List list2 = list;
        m80.b bVar2 = bVar;
        return azVar.a(c81Var, c81Var2, bVar2, c81Var3, list2);
    }
}
