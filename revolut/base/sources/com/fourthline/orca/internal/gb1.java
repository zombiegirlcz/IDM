package com.fourthline.orca.internal;

import com.fourthline.orca.internal.m80;
import java.util.List;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class gb1 implements ie1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c81 f28827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c81 f28828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f28829c;
    private final c81 d;
    private final a e;
    private final m80.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final m80.a f28830g;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c81 f28831a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c81 f28832b;

        public a(c81 text, c81 link) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(link, "link");
            this.f28831a = text;
            this.f28832b = link;
        }

        public final c81 a() {
            return this.f28832b;
        }

        public final c81 b() {
            return this.f28831a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.f28831a, aVar.f28831a) && Intrinsics.f(this.f28832b, aVar.f28832b);
        }

        public int hashCode() {
            return (this.f28831a.hashCode() * 31) + this.f28832b.hashCode();
        }

        public String toString() {
            return "LinkButtonState(text=" + this.f28831a + ", link=" + this.f28832b + ")";
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f28833a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c f28834b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final c81 f28835c;
        private final c81 d;
        private final c81 e;
        private final z10 f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Object f28836g;

        public b(d state, c layout, c81 text, c81 c81Var, c81 c81Var2, z10 z10Var, Object obj2) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(layout, "layout");
            Intrinsics.checkNotNullParameter(text, "text");
            this.f28833a = state;
            this.f28834b = layout;
            this.f28835c = text;
            this.d = c81Var;
            this.e = c81Var2;
            this.f = z10Var;
            this.f28836g = obj2;
        }

        public final b a(d state, c layout, c81 text, c81 c81Var, c81 c81Var2, z10 z10Var, Object obj2) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(layout, "layout");
            Intrinsics.checkNotNullParameter(text, "text");
            return new b(state, layout, text, c81Var, c81Var2, z10Var, obj2);
        }

        public final c81 b() {
            return this.e;
        }

        public final z10 c() {
            return this.f;
        }

        public final c d() {
            return this.f28834b;
        }

        public final d e() {
            return this.f28833a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return this.f28833a == bVar.f28833a && this.f28834b == bVar.f28834b && Intrinsics.f(this.f28835c, bVar.f28835c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f28836g, bVar.f28836g);
        }

        public final c81 f() {
            return this.f28835c;
        }

        public final Object g() {
            return this.f28836g;
        }

        public int hashCode() {
            int iHashCode = ((((this.f28833a.hashCode() * 31) + this.f28834b.hashCode()) * 31) + this.f28835c.hashCode()) * 31;
            c81 c81Var = this.d;
            int iHashCode2 = (iHashCode + (c81Var == null ? 0 : c81Var.hashCode())) * 31;
            c81 c81Var2 = this.e;
            int iHashCode3 = (iHashCode2 + (c81Var2 == null ? 0 : c81Var2.hashCode())) * 31;
            z10 z10Var = this.f;
            int iHashCode4 = (iHashCode3 + (z10Var == null ? 0 : z10Var.hashCode())) * 31;
            Object obj2 = this.f28836g;
            return iHashCode4 + (obj2 != null ? obj2.hashCode() : 0);
        }

        public String toString() {
            return "TypeOptionPresentation(state=" + this.f28833a + ", layout=" + this.f28834b + ", text=" + this.f28835c + ", description=" + this.d + ", hint=" + this.e + ", icon=" + this.f + ", type=" + this.f28836g + ")";
        }

        public static /* synthetic */ b a(b bVar, d dVar, c cVar, c81 c81Var, c81 c81Var2, c81 c81Var3, z10 z10Var, Object obj2, int i, Object obj3) {
            if ((i & 1) != 0) {
                dVar = bVar.f28833a;
            }
            if ((i & 2) != 0) {
                cVar = bVar.f28834b;
            }
            if ((i & 4) != 0) {
                c81Var = bVar.f28835c;
            }
            if ((i & 8) != 0) {
                c81Var2 = bVar.d;
            }
            if ((i & 16) != 0) {
                c81Var3 = bVar.e;
            }
            if ((i & 32) != 0) {
                z10Var = bVar.f;
            }
            if ((i & 64) != 0) {
                obj2 = bVar.f28836g;
            }
            z10 z10Var2 = z10Var;
            Object obj4 = obj2;
            c81 c81Var4 = c81Var3;
            c81 c81Var5 = c81Var;
            return bVar.a(dVar, cVar, c81Var5, c81Var2, c81Var4, z10Var2, obj4);
        }

        public final c81 a() {
            return this.d;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ b(d dVar, c cVar, c81 c81Var, c81 c81Var2, c81 c81Var3, z10 z10Var, Object obj2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            Object obj3;
            z10 z10Var2;
            c81 c81Var4;
            c81Var2 = (i & 8) != 0 ? null : c81Var2;
            if ((i & 16) != 0) {
                obj3 = obj2;
                z10Var2 = z10Var;
                c81Var4 = null;
            } else {
                obj3 = obj2;
                z10Var2 = z10Var;
                c81Var4 = c81Var3;
            }
            this(dVar, cVar, c81Var, c81Var2, c81Var4, z10Var2, obj3);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f28837a = new c("Default", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f28838b = new c("Descriptive", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ c[] f28839c;
        private static final /* synthetic */ EnumEntries d;

        static {
            c[] cVarArrA = a();
            f28839c = cVarArrA;
            d = vc.s.n(cVarArrA);
        }

        private c(String str, int i) {
        }

        private static final /* synthetic */ c[] a() {
            return new c[]{f28837a, f28838b};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f28839c.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f28840a = new d("CHECKED", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f28841b = new d("UNCHECKED", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f28842c = new d("NOT_ACCEPTED", 2);
        private static final /* synthetic */ d[] d;
        private static final /* synthetic */ EnumEntries e;

        static {
            d[] dVarArrA = a();
            d = dVarArrA;
            e = vc.s.n(dVarArrA);
        }

        private d(String str, int i) {
        }

        private static final /* synthetic */ d[] a() {
            return new d[]{f28840a, f28841b, f28842c};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) d.clone();
        }
    }

    public gb1(c81 title, c81 description, List options, c81 c81Var, a aVar, m80.b primaryButton, m80.a secondaryButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        Intrinsics.checkNotNullParameter(secondaryButton, "secondaryButton");
        this.f28827a = title;
        this.f28828b = description;
        this.f28829c = options;
        this.d = c81Var;
        this.e = aVar;
        this.f = primaryButton;
        this.f28830g = secondaryButton;
    }

    public final gb1 a(c81 title, c81 description, List options, c81 c81Var, a aVar, m80.b primaryButton, m80.a secondaryButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        Intrinsics.checkNotNullParameter(secondaryButton, "secondaryButton");
        return new gb1(title, description, options, c81Var, aVar, primaryButton, secondaryButton);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof gb1)) {
            return false;
        }
        gb1 gb1Var = (gb1) obj2;
        return Intrinsics.f(this.f28827a, gb1Var.f28827a) && Intrinsics.f(this.f28828b, gb1Var.f28828b) && Intrinsics.f(this.f28829c, gb1Var.f28829c) && Intrinsics.f(this.d, gb1Var.d) && Intrinsics.f(this.e, gb1Var.e) && Intrinsics.f(this.f, gb1Var.f) && Intrinsics.f(this.f28830g, gb1Var.f28830g);
    }

    public final c81 getTitle() {
        return this.f28827a;
    }

    public int hashCode() {
        int iHashCode = ((((this.f28827a.hashCode() * 31) + this.f28828b.hashCode()) * 31) + this.f28829c.hashCode()) * 31;
        c81 c81Var = this.d;
        int iHashCode2 = (iHashCode + (c81Var == null ? 0 : c81Var.hashCode())) * 31;
        a aVar = this.e;
        return ((((iHashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31) + this.f.hashCode()) * 31) + this.f28830g.hashCode();
    }

    public final c81 n() {
        return this.d;
    }

    public final a o() {
        return this.e;
    }

    public final List p() {
        return this.f28829c;
    }

    public final m80.b q() {
        return this.f;
    }

    public final m80.a r() {
        return this.f28830g;
    }

    public String toString() {
        return "State(title=" + this.f28827a + ", description=" + this.f28828b + ", options=" + this.f28829c + ", hint=" + this.d + ", linkButton=" + this.e + ", primaryButton=" + this.f + ", secondaryButton=" + this.f28830g + ")";
    }

    public static /* synthetic */ gb1 a(gb1 gb1Var, c81 c81Var, c81 c81Var2, List list, c81 c81Var3, a aVar, m80.b bVar, m80.a aVar2, int i, Object obj2) {
        if ((i & 1) != 0) {
            c81Var = gb1Var.f28827a;
        }
        if ((i & 2) != 0) {
            c81Var2 = gb1Var.f28828b;
        }
        if ((i & 4) != 0) {
            list = gb1Var.f28829c;
        }
        if ((i & 8) != 0) {
            c81Var3 = gb1Var.d;
        }
        if ((i & 16) != 0) {
            aVar = gb1Var.e;
        }
        if ((i & 32) != 0) {
            bVar = gb1Var.f;
        }
        if ((i & 64) != 0) {
            aVar2 = gb1Var.f28830g;
        }
        m80.b bVar2 = bVar;
        m80.a aVar3 = aVar2;
        a aVar4 = aVar;
        List list2 = list;
        return gb1Var.a(c81Var, c81Var2, list2, c81Var3, aVar4, bVar2, aVar3);
    }

    public final c81 a() {
        return this.f28828b;
    }
}
