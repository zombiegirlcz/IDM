package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import java.util.List;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class sq implements ie1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c81 f33094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c81 f33095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c81 f33096c;
    private final c81 d;
    private final c81 e;
    private final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f33097g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final c f33098h;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f33099a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c81 f33100b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final z10 f33101c;
        private final DocumentType d;

        public a(b state, c81 text, z10 iconImageSource, DocumentType type) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(iconImageSource, "iconImageSource");
            Intrinsics.checkNotNullParameter(type, "type");
            this.f33099a = state;
            this.f33100b = text;
            this.f33101c = iconImageSource;
            this.d = type;
        }

        public final a a(b state, c81 text, z10 iconImageSource, DocumentType type) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(iconImageSource, "iconImageSource");
            Intrinsics.checkNotNullParameter(type, "type");
            return new a(state, text, iconImageSource, type);
        }

        public final b b() {
            return this.f33099a;
        }

        public final c81 c() {
            return this.f33100b;
        }

        public final DocumentType d() {
            return this.d;
        }

        public final boolean e() {
            return this.f33099a != b.f33104c;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return this.f33099a == aVar.f33099a && Intrinsics.f(this.f33100b, aVar.f33100b) && Intrinsics.f(this.f33101c, aVar.f33101c) && this.d == aVar.d;
        }

        public int hashCode() {
            return (((((this.f33099a.hashCode() * 31) + this.f33100b.hashCode()) * 31) + this.f33101c.hashCode()) * 31) + this.d.hashCode();
        }

        public String toString() {
            return "DocumentOptionPresentation(state=" + this.f33099a + ", text=" + this.f33100b + ", iconImageSource=" + this.f33101c + ", type=" + this.d + ")";
        }

        public static /* synthetic */ a a(a aVar, b bVar, c81 c81Var, z10 z10Var, DocumentType documentType, int i, Object obj2) {
            if ((i & 1) != 0) {
                bVar = aVar.f33099a;
            }
            if ((i & 2) != 0) {
                c81Var = aVar.f33100b;
            }
            if ((i & 4) != 0) {
                z10Var = aVar.f33101c;
            }
            if ((i & 8) != 0) {
                documentType = aVar.d;
            }
            return aVar.a(bVar, c81Var, z10Var, documentType);
        }

        public final z10 a() {
            return this.f33101c;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f33102a = new b("CHECKED", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f33103b = new b("UNCHECKED", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f33104c = new b("NOT_ACCEPTED", 2);
        private static final /* synthetic */ b[] d;
        private static final /* synthetic */ EnumEntries e;

        static {
            b[] bVarArrA = a();
            d = bVarArrA;
            e = vc.s.n(bVarArrA);
        }

        private b(String str, int i) {
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f33102a, f33103b, f33104c};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) d.clone();
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c81 f33105a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c81 f33106b;

        public c(c81 text, c81 link) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(link, "link");
            this.f33105a = text;
            this.f33106b = link;
        }

        public final c81 a() {
            return this.f33106b;
        }

        public final c81 b() {
            return this.f33105a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return Intrinsics.f(this.f33105a, cVar.f33105a) && Intrinsics.f(this.f33106b, cVar.f33106b);
        }

        public int hashCode() {
            return (this.f33105a.hashCode() * 31) + this.f33106b.hashCode();
        }

        public String toString() {
            return "LinkButtonState(text=" + this.f33105a + ", link=" + this.f33106b + ")";
        }
    }

    public sq(c81 title, c81 description, c81 hint, c81 primaryButtonText, c81 secondaryButtonText, List options, boolean z, c linkButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(hint, "hint");
        Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
        Intrinsics.checkNotNullParameter(secondaryButtonText, "secondaryButtonText");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(linkButton, "linkButton");
        this.f33094a = title;
        this.f33095b = description;
        this.f33096c = hint;
        this.d = primaryButtonText;
        this.e = secondaryButtonText;
        this.f = options;
        this.f33097g = z;
        this.f33098h = linkButton;
    }

    public final sq a(c81 title, c81 description, c81 hint, c81 primaryButtonText, c81 secondaryButtonText, List options, boolean z, c linkButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(hint, "hint");
        Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
        Intrinsics.checkNotNullParameter(secondaryButtonText, "secondaryButtonText");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(linkButton, "linkButton");
        return new sq(title, description, hint, primaryButtonText, secondaryButtonText, options, z, linkButton);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof sq)) {
            return false;
        }
        sq sqVar = (sq) obj2;
        return Intrinsics.f(this.f33094a, sqVar.f33094a) && Intrinsics.f(this.f33095b, sqVar.f33095b) && Intrinsics.f(this.f33096c, sqVar.f33096c) && Intrinsics.f(this.d, sqVar.d) && Intrinsics.f(this.e, sqVar.e) && Intrinsics.f(this.f, sqVar.f) && this.f33097g == sqVar.f33097g && Intrinsics.f(this.f33098h, sqVar.f33098h);
    }

    public final c81 getTitle() {
        return this.f33094a;
    }

    public int hashCode() {
        return (((((((((((((this.f33094a.hashCode() * 31) + this.f33095b.hashCode()) * 31) + this.f33096c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + Boolean.hashCode(this.f33097g)) * 31) + this.f33098h.hashCode();
    }

    public final c81 n() {
        return this.f33096c;
    }

    public final c o() {
        return this.f33098h;
    }

    public final List p() {
        return this.f;
    }

    public final boolean q() {
        return this.f33097g;
    }

    public String toString() {
        return "State(title=" + this.f33094a + ", description=" + this.f33095b + ", hint=" + this.f33096c + ", primaryButtonText=" + this.d + ", secondaryButtonText=" + this.e + ", options=" + this.f + ", isPrimaryButtonEnabled=" + this.f33097g + ", linkButton=" + this.f33098h + ")";
    }

    public static /* synthetic */ sq a(sq sqVar, c81 c81Var, c81 c81Var2, c81 c81Var3, c81 c81Var4, c81 c81Var5, List list, boolean z, c cVar, int i, Object obj2) {
        if ((i & 1) != 0) {
            c81Var = sqVar.f33094a;
        }
        if ((i & 2) != 0) {
            c81Var2 = sqVar.f33095b;
        }
        if ((i & 4) != 0) {
            c81Var3 = sqVar.f33096c;
        }
        if ((i & 8) != 0) {
            c81Var4 = sqVar.d;
        }
        if ((i & 16) != 0) {
            c81Var5 = sqVar.e;
        }
        if ((i & 32) != 0) {
            list = sqVar.f;
        }
        if ((i & 64) != 0) {
            z = sqVar.f33097g;
        }
        if ((i & 128) != 0) {
            cVar = sqVar.f33098h;
        }
        boolean z3 = z;
        c cVar2 = cVar;
        c81 c81Var6 = c81Var5;
        List list2 = list;
        return sqVar.a(c81Var, c81Var2, c81Var3, c81Var4, c81Var6, list2, z3, cVar2);
    }

    public final c81 a() {
        return this.f33095b;
    }

    public /* synthetic */ sq(c81 c81Var, c81 c81Var2, c81 c81Var3, c81 c81Var4, c81 c81Var5, List list, boolean z, c cVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c81Var, c81Var2, c81Var3, c81Var4, c81Var5, list, (i & 64) != 0 ? false : z, cVar);
    }
}
