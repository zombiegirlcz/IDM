package qgb;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class f0 {

    @NotNull
    public static final e0 Companion = new e0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f245733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f245734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f245735c;
    public final Integer d;
    public final Instant e;
    public final Instant f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Instant f245736g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Instant f245737h;
    public final z i;

    public /* synthetic */ f0(int i, String str, String str2, String str3, Integer num, Instant instant, Instant instant2, Instant instant3, Instant instant4, z zVar) {
        if (3 != (i & 3)) {
            j1.f(d0.f245730a.getDescriptor(), i, 3);
            throw null;
        }
        this.f245733a = str;
        this.f245734b = str2;
        if ((i & 4) == 0) {
            this.f245735c = null;
        } else {
            this.f245735c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = instant;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = instant2;
        }
        if ((i & 64) == 0) {
            this.f245736g = null;
        } else {
            this.f245736g = instant3;
        }
        if ((i & 128) == 0) {
            this.f245737h = null;
        } else {
            this.f245737h = instant4;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = zVar;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return Intrinsics.f(this.f245733a, f0Var.f245733a) && Intrinsics.f(this.f245734b, f0Var.f245734b) && Intrinsics.f(this.f245735c, f0Var.f245735c) && Intrinsics.f(this.d, f0Var.d) && Intrinsics.f(this.e, f0Var.e) && Intrinsics.f(this.f, f0Var.f) && Intrinsics.f(this.f245736g, f0Var.f245736g) && Intrinsics.f(this.f245737h, f0Var.f245737h) && Intrinsics.f(this.i, f0Var.i);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f245733a.hashCode() * 31, 31, this.f245734b);
        String str = this.f245735c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Instant instant = this.e;
        int iHashCode3 = (iHashCode2 + (instant == null ? 0 : instant.hashCode())) * 31;
        Instant instant2 = this.f;
        int iHashCode4 = (iHashCode3 + (instant2 == null ? 0 : instant2.hashCode())) * 31;
        Instant instant3 = this.f245736g;
        int iHashCode5 = (iHashCode4 + (instant3 == null ? 0 : instant3.hashCode())) * 31;
        Instant instant4 = this.f245737h;
        int iHashCode6 = (iHashCode5 + (instant4 == null ? 0 : instant4.hashCode())) * 31;
        z zVar = this.i;
        return iHashCode6 + (zVar != null ? zVar.hashCode() : 0);
    }

    public f0(String type, String state, String str, Integer num, Instant instant, Instant instant2, Instant instant3, Instant instant4, z zVar) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f245733a = type;
        this.f245734b = state;
        this.f245735c = str;
        this.d = num;
        this.e = instant;
        this.f = instant2;
        this.f245736g = instant3;
        this.f245737h = instant4;
        this.i = zVar;
    }
}
