package z00;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import x00.j;

/* JADX INFO: loaded from: classes16.dex */
public final class b implements j {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Regex f318154c = new Regex("P([A-Z0<])([A-Z0<]{3})((?:[A-Z0]+<)+)((?:<[A-Z0]+)*)<*");
    public static final Regex d = new Regex("([A-Z0-9<]{1,9})([0-9O])([A-Z0<]{3})([0-9O]{6})([0-9O])([MF<])([0-9O]{6})([0-9O])([A-Z0-9<]+)([0-9O])([0-9O])");
    public static final Regex e = new Regex("([A-Z0-9<]{1,9})([0-9O])([A-Z0<]{3})([0-9O]{6})([0-9O])([MF<])([0-9O]{6})([0-9O])(([A-Z0-9<]+)([0-9O])([0-9O]))?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f318155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f318156b;

    public b(String firstLine, String secondLine) {
        Intrinsics.checkNotNullParameter(firstLine, "firstLine");
        Intrinsics.checkNotNullParameter(secondLine, "secondLine");
        this.f318155a = firstLine;
        this.f318156b = secondLine;
    }

    @Override // x00.j
    public final String a() {
        return String.valueOf(this.f318156b.charAt(27));
    }

    @Override // x00.j
    public final String b() {
        return d0.t0(this.f318156b, kotlin.ranges.f.o(21, 27));
    }

    @Override // x00.j
    public final String c() {
        return String.valueOf(this.f318156b.charAt(9));
    }

    @Override // x00.j
    public final String d() {
        return d0.t0(this.f318156b, kotlin.ranges.f.o(13, 19));
    }

    @Override // x00.j
    public final String e() {
        return String.valueOf(this.f318156b.charAt(19));
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f318155a, bVar.f318155a) && Intrinsics.f(this.f318156b, bVar.f318156b);
    }

    @Override // x00.j
    public final String getDocumentNumber() {
        return d0.t0(this.f318156b, kotlin.ranges.f.o(0, 9));
    }

    public final int hashCode() {
        return this.f318156b.hashCode() + (this.f318155a.hashCode() * 31);
    }
}
