package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class d0 {

    @NotNull
    public static final c0 Companion = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f153057c;
    public final String d;

    public /* synthetic */ d0(int i, String str, String str2, dj0.d dVar, String str3) {
        if (15 != (i & 15)) {
            qlm.j1.f(b0.f153026a.getDescriptor(), i, 15);
            throw null;
        }
        this.f153055a = str;
        this.f153056b = str2;
        this.f153057c = dVar;
        this.d = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f153055a, d0Var.f153055a) && Intrinsics.f(this.f153056b, d0Var.f153056b) && Intrinsics.f(this.f153057c, d0Var.f153057c) && Intrinsics.f(this.d, d0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.f153055a.hashCode() * 31;
        String str = this.f153056b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        dj0.d dVar = this.f153057c;
        int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public d0(dj0.d dVar, String cancellationDateTime, String str, String str2) {
        Intrinsics.checkNotNullParameter(cancellationDateTime, "cancellationDateTime");
        this.f153055a = cancellationDateTime;
        this.f153056b = str;
        this.f153057c = dVar;
        this.d = str2;
    }
}
