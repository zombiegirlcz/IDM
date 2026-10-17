package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.m80;
import java.util.List;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class wb implements ie1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c81 f34568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m80.b f34569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m80.a f34570c;
    private final s20 d;
    private final c e;
    private final a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f34571g;

    public static final class a implements u20 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final r20 f34572a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f34573b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f34574c;
        private final c81 d;
        private final String e;
        private final c81 f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final c81 f34575g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final l20 f34576h;
        private final z10 i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final List f34577j;

        public a(r20 format, String identifier, boolean z, c81 title, String text, c81 placeholder, c81 status, l20 state, z10 searchImageSource, List suggestions) {
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(searchImageSource, "searchImageSource");
            Intrinsics.checkNotNullParameter(suggestions, "suggestions");
            this.f34572a = format;
            this.f34573b = identifier;
            this.f34574c = z;
            this.d = title;
            this.e = text;
            this.f = placeholder;
            this.f34575g = status;
            this.f34576h = state;
            this.i = searchImageSource;
            this.f34577j = suggestions;
        }

        public final a a(r20 format, String identifier, boolean z, c81 title, String text, c81 placeholder, c81 status, l20 state, z10 searchImageSource, List suggestions) {
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(searchImageSource, "searchImageSource");
            Intrinsics.checkNotNullParameter(suggestions, "suggestions");
            return new a(format, identifier, z, title, text, placeholder, status, state, searchImageSource, suggestions);
        }

        @Override // com.fourthline.orca.internal.u20
        public c81 b() {
            return this.f34575g;
        }

        public c81 c() {
            return this.f;
        }

        public final z10 d() {
            return this.i;
        }

        public final List e() {
            return this.f34577j;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return this.f34572a == aVar.f34572a && Intrinsics.f(this.f34573b, aVar.f34573b) && this.f34574c == aVar.f34574c && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f34575g, aVar.f34575g) && this.f34576h == aVar.f34576h && Intrinsics.f(this.i, aVar.i) && Intrinsics.f(this.f34577j, aVar.f34577j);
        }

        @Override // com.fourthline.orca.internal.u20
        public r20 getFormat() {
            return this.f34572a;
        }

        @Override // com.fourthline.orca.internal.u20
        public l20 getState() {
            return this.f34576h;
        }

        @Override // com.fourthline.orca.internal.u20
        public String getText() {
            return this.e;
        }

        @Override // com.fourthline.orca.internal.u20
        public c81 getTitle() {
            return this.d;
        }

        public int hashCode() {
            return (((((((((((((((((this.f34572a.hashCode() * 31) + this.f34573b.hashCode()) * 31) + Boolean.hashCode(this.f34574c)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.f34575g.hashCode()) * 31) + this.f34576h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.f34577j.hashCode();
        }

        public String toString() {
            return "CountryState(format=" + this.f34572a + ", identifier=" + this.f34573b + ", isVisible=" + this.f34574c + ", title=" + this.d + ", text=" + this.e + ", placeholder=" + this.f + ", status=" + this.f34575g + ", state=" + this.f34576h + ", searchImageSource=" + this.i + ", suggestions=" + this.f34577j + ")";
        }

        public static /* synthetic */ a a(a aVar, r20 r20Var, String str, boolean z, c81 c81Var, String str2, c81 c81Var2, c81 c81Var3, l20 l20Var, z10 z10Var, List list, int i, Object obj2) {
            if ((i & 1) != 0) {
                r20Var = aVar.f34572a;
            }
            if ((i & 2) != 0) {
                str = aVar.f34573b;
            }
            if ((i & 4) != 0) {
                z = aVar.f34574c;
            }
            if ((i & 8) != 0) {
                c81Var = aVar.d;
            }
            if ((i & 16) != 0) {
                str2 = aVar.e;
            }
            if ((i & 32) != 0) {
                c81Var2 = aVar.f;
            }
            if ((i & 64) != 0) {
                c81Var3 = aVar.f34575g;
            }
            if ((i & 128) != 0) {
                l20Var = aVar.f34576h;
            }
            if ((i & 256) != 0) {
                z10Var = aVar.i;
            }
            if ((i & 512) != 0) {
                list = aVar.f34577j;
            }
            z10 z10Var2 = z10Var;
            List list2 = list;
            c81 c81Var4 = c81Var3;
            l20 l20Var2 = l20Var;
            String str3 = str2;
            c81 c81Var5 = c81Var2;
            return aVar.a(r20Var, str, z, c81Var, str3, c81Var5, c81Var4, l20Var2, z10Var2, list2);
        }

        @Override // com.fourthline.orca.internal.u20
        public String a() {
            return this.f34573b;
        }

        public a(r20 r20Var, String str, boolean z, c81 c81Var, String str2, c81 c81Var2, c81 c81Var3, l20 l20Var, z10 z10Var, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? r20.f32616a : r20Var, (i & 2) != 0 ? "contact_phone_country" : str, (i & 4) != 0 ? true : z, c81Var, (i & 16) != 0 ? "" : str2, c81Var2, (i & 64) != 0 ? c81.b.f27406b : c81Var3, (i & 128) != 0 ? l20.f30507a : l20Var, z10Var, (i & 512) != 0 ? zhm.f0.f322471a : list);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f34578a = new b("NUMBER", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f34579b = new b("COUNTRY", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ b[] f34580c;
        private static final /* synthetic */ EnumEntries d;

        static {
            b[] bVarArrA = a();
            f34580c = bVarArrA;
            d = vc.s.n(bVarArrA);
        }

        private b(String str, int i) {
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f34578a, f34579b};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f34580c.clone();
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s20 f34581a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f34582b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f34583c;
        private final z10 d;
        private final c81 e;

        public c(s20 inputViewState, String flag, String selectedCode, z10 phoneImageSource, c81 phoneImageAccessibility) {
            Intrinsics.checkNotNullParameter(inputViewState, "inputViewState");
            Intrinsics.checkNotNullParameter(flag, "flag");
            Intrinsics.checkNotNullParameter(selectedCode, "selectedCode");
            Intrinsics.checkNotNullParameter(phoneImageSource, "phoneImageSource");
            Intrinsics.checkNotNullParameter(phoneImageAccessibility, "phoneImageAccessibility");
            this.f34581a = inputViewState;
            this.f34582b = flag;
            this.f34583c = selectedCode;
            this.d = phoneImageSource;
            this.e = phoneImageAccessibility;
        }

        public final c a(s20 inputViewState, String flag, String selectedCode, z10 phoneImageSource, c81 phoneImageAccessibility) {
            Intrinsics.checkNotNullParameter(inputViewState, "inputViewState");
            Intrinsics.checkNotNullParameter(flag, "flag");
            Intrinsics.checkNotNullParameter(selectedCode, "selectedCode");
            Intrinsics.checkNotNullParameter(phoneImageSource, "phoneImageSource");
            Intrinsics.checkNotNullParameter(phoneImageAccessibility, "phoneImageAccessibility");
            return new c(inputViewState, flag, selectedCode, phoneImageSource, phoneImageAccessibility);
        }

        public final s20 b() {
            return this.f34581a;
        }

        public final c81 c() {
            return this.e;
        }

        public final z10 d() {
            return this.d;
        }

        public final String e() {
            return this.f34583c;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return Intrinsics.f(this.f34581a, cVar.f34581a) && Intrinsics.f(this.f34582b, cVar.f34582b) && Intrinsics.f(this.f34583c, cVar.f34583c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e);
        }

        public int hashCode() {
            return (((((((this.f34581a.hashCode() * 31) + this.f34582b.hashCode()) * 31) + this.f34583c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
        }

        public String toString() {
            return "PhoneState(inputViewState=" + this.f34581a + ", flag=" + this.f34582b + ", selectedCode=" + this.f34583c + ", phoneImageSource=" + this.d + ", phoneImageAccessibility=" + this.e + ")";
        }

        public static /* synthetic */ c a(c cVar, s20 s20Var, String str, String str2, z10 z10Var, c81 c81Var, int i, Object obj2) {
            if ((i & 1) != 0) {
                s20Var = cVar.f34581a;
            }
            if ((i & 2) != 0) {
                str = cVar.f34582b;
            }
            if ((i & 4) != 0) {
                str2 = cVar.f34583c;
            }
            if ((i & 8) != 0) {
                z10Var = cVar.d;
            }
            if ((i & 16) != 0) {
                c81Var = cVar.e;
            }
            c81 c81Var2 = c81Var;
            String str3 = str2;
            return cVar.a(s20Var, str, str3, z10Var, c81Var2);
        }

        public final String a() {
            return this.f34582b;
        }
    }

    public wb(c81 title, m80.b primaryButtonState, m80.a secondaryButtonState, s20 emailState, c phoneState, a countryState, b phoneEnterState) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(primaryButtonState, "primaryButtonState");
        Intrinsics.checkNotNullParameter(secondaryButtonState, "secondaryButtonState");
        Intrinsics.checkNotNullParameter(emailState, "emailState");
        Intrinsics.checkNotNullParameter(phoneState, "phoneState");
        Intrinsics.checkNotNullParameter(countryState, "countryState");
        Intrinsics.checkNotNullParameter(phoneEnterState, "phoneEnterState");
        this.f34568a = title;
        this.f34569b = primaryButtonState;
        this.f34570c = secondaryButtonState;
        this.d = emailState;
        this.e = phoneState;
        this.f = countryState;
        this.f34571g = phoneEnterState;
    }

    public final wb a(c81 title, m80.b primaryButtonState, m80.a secondaryButtonState, s20 emailState, c phoneState, a countryState, b phoneEnterState) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(primaryButtonState, "primaryButtonState");
        Intrinsics.checkNotNullParameter(secondaryButtonState, "secondaryButtonState");
        Intrinsics.checkNotNullParameter(emailState, "emailState");
        Intrinsics.checkNotNullParameter(phoneState, "phoneState");
        Intrinsics.checkNotNullParameter(countryState, "countryState");
        Intrinsics.checkNotNullParameter(phoneEnterState, "phoneEnterState");
        return new wb(title, primaryButtonState, secondaryButtonState, emailState, phoneState, countryState, phoneEnterState);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof wb)) {
            return false;
        }
        wb wbVar = (wb) obj2;
        return Intrinsics.f(this.f34568a, wbVar.f34568a) && Intrinsics.f(this.f34569b, wbVar.f34569b) && Intrinsics.f(this.f34570c, wbVar.f34570c) && Intrinsics.f(this.d, wbVar.d) && Intrinsics.f(this.e, wbVar.e) && Intrinsics.f(this.f, wbVar.f) && this.f34571g == wbVar.f34571g;
    }

    public final c81 getTitle() {
        return this.f34568a;
    }

    public int hashCode() {
        return (((((((((((this.f34568a.hashCode() * 31) + this.f34569b.hashCode()) * 31) + this.f34570c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.f34571g.hashCode();
    }

    public final a n() {
        return this.f;
    }

    public final s20 o() {
        return this.d;
    }

    public final b p() {
        return this.f34571g;
    }

    public final c q() {
        return this.e;
    }

    public final m80.b r() {
        return this.f34569b;
    }

    public final m80.a s() {
        return this.f34570c;
    }

    public String toString() {
        return "State(title=" + this.f34568a + ", primaryButtonState=" + this.f34569b + ", secondaryButtonState=" + this.f34570c + ", emailState=" + this.d + ", phoneState=" + this.e + ", countryState=" + this.f + ", phoneEnterState=" + this.f34571g + ")";
    }

    public static /* synthetic */ wb a(wb wbVar, c81 c81Var, m80.b bVar, m80.a aVar, s20 s20Var, c cVar, a aVar2, b bVar2, int i, Object obj2) {
        if ((i & 1) != 0) {
            c81Var = wbVar.f34568a;
        }
        if ((i & 2) != 0) {
            bVar = wbVar.f34569b;
        }
        if ((i & 4) != 0) {
            aVar = wbVar.f34570c;
        }
        if ((i & 8) != 0) {
            s20Var = wbVar.d;
        }
        if ((i & 16) != 0) {
            cVar = wbVar.e;
        }
        if ((i & 32) != 0) {
            aVar2 = wbVar.f;
        }
        if ((i & 64) != 0) {
            bVar2 = wbVar.f34571g;
        }
        a aVar3 = aVar2;
        b bVar3 = bVar2;
        c cVar2 = cVar;
        m80.a aVar4 = aVar;
        return wbVar.a(c81Var, bVar, aVar4, s20Var, cVar2, aVar3, bVar3);
    }

    public /* synthetic */ wb(c81 c81Var, m80.b bVar, m80.a aVar, s20 s20Var, c cVar, a aVar2, b bVar2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c81Var, bVar, aVar, s20Var, cVar, aVar2, (i & 64) != 0 ? b.f34578a : bVar2);
    }
}
