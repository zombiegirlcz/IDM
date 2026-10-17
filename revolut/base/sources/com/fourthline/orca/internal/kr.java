package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class kr implements ie1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c81 f30366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c81 f30367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c81 f30368c;
    private final c81 d;
    private final List e;
    private final boolean f;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final DocumentType f30369a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c81 f30370b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final z10 f30371c;
        private final boolean d;

        public a(DocumentType type, c81 c81Var, z10 z10Var, boolean z) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.f30369a = type;
            this.f30370b = c81Var;
            this.f30371c = z10Var;
            this.d = z;
        }

        public final c81 a() {
            return this.f30370b;
        }

        public final z10 b() {
            return this.f30371c;
        }

        public final DocumentType c() {
            return this.f30369a;
        }

        public final boolean d() {
            return this.d;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return this.f30369a == aVar.f30369a && Intrinsics.f(this.f30370b, aVar.f30370b) && Intrinsics.f(this.f30371c, aVar.f30371c) && this.d == aVar.d;
        }

        public int hashCode() {
            int iHashCode = this.f30369a.hashCode() * 31;
            c81 c81Var = this.f30370b;
            int iHashCode2 = (iHashCode + (c81Var == null ? 0 : c81Var.hashCode())) * 31;
            z10 z10Var = this.f30371c;
            return ((iHashCode2 + (z10Var != null ? z10Var.hashCode() : 0)) * 31) + Boolean.hashCode(this.d);
        }

        public String toString() {
            return "DocumentVersionPresentation(type=" + this.f30369a + ", description=" + this.f30370b + ", imageSource=" + this.f30371c + ", isSelected=" + this.d + ")";
        }
    }

    public kr(c81 title, c81 subtitle, c81 primaryButtonText, c81 secondaryButtonText, List options, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
        Intrinsics.checkNotNullParameter(secondaryButtonText, "secondaryButtonText");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f30366a = title;
        this.f30367b = subtitle;
        this.f30368c = primaryButtonText;
        this.d = secondaryButtonText;
        this.e = options;
        this.f = z;
    }

    public final kr a(c81 title, c81 subtitle, c81 primaryButtonText, c81 secondaryButtonText, List options, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
        Intrinsics.checkNotNullParameter(secondaryButtonText, "secondaryButtonText");
        Intrinsics.checkNotNullParameter(options, "options");
        return new kr(title, subtitle, primaryButtonText, secondaryButtonText, options, z);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof kr)) {
            return false;
        }
        kr krVar = (kr) obj2;
        return Intrinsics.f(this.f30366a, krVar.f30366a) && Intrinsics.f(this.f30367b, krVar.f30367b) && Intrinsics.f(this.f30368c, krVar.f30368c) && Intrinsics.f(this.d, krVar.d) && Intrinsics.f(this.e, krVar.e) && this.f == krVar.f;
    }

    public final c81 getTitle() {
        return this.f30366a;
    }

    public int hashCode() {
        return (((((((((this.f30366a.hashCode() * 31) + this.f30367b.hashCode()) * 31) + this.f30368c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + Boolean.hashCode(this.f);
    }

    public final List n() {
        return this.e;
    }

    public final c81 o() {
        return this.f30367b;
    }

    public final boolean p() {
        return this.f;
    }

    public String toString() {
        return "State(title=" + this.f30366a + ", subtitle=" + this.f30367b + ", primaryButtonText=" + this.f30368c + ", secondaryButtonText=" + this.d + ", options=" + this.e + ", isPrimaryButtonEnabled=" + this.f + ")";
    }

    public static /* synthetic */ kr a(kr krVar, c81 c81Var, c81 c81Var2, c81 c81Var3, c81 c81Var4, List list, boolean z, int i, Object obj2) {
        if ((i & 1) != 0) {
            c81Var = krVar.f30366a;
        }
        if ((i & 2) != 0) {
            c81Var2 = krVar.f30367b;
        }
        if ((i & 4) != 0) {
            c81Var3 = krVar.f30368c;
        }
        if ((i & 8) != 0) {
            c81Var4 = krVar.d;
        }
        if ((i & 16) != 0) {
            list = krVar.e;
        }
        if ((i & 32) != 0) {
            z = krVar.f;
        }
        List list2 = list;
        boolean z3 = z;
        return krVar.a(c81Var, c81Var2, c81Var3, c81Var4, list2, z3);
    }

    public /* synthetic */ kr(c81 c81Var, c81 c81Var2, c81 c81Var3, c81 c81Var4, List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c81Var, c81Var2, c81Var3, c81Var4, list, (i & 32) != 0 ? false : z);
    }
}
