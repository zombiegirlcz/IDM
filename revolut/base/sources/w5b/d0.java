package w5b;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class d0 {

    @NotNull
    public static final c0 Companion = new c0();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Lazy[] f294804h = {null, null, null, yhm.j.c(yhm.k.PUBLICATION, new w56.a(8)), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f294805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f294806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f294807c;
    public final List d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ld7.f f294808g;

    public /* synthetic */ d0(int i, String str, String str2, String str3, List list, String str4, String str5, ld7.f fVar) {
        if (63 != (i & 63)) {
            qlm.j1.f(b0.f294783a.getDescriptor(), i, 63);
            throw null;
        }
        this.f294805a = str;
        this.f294806b = str2;
        this.f294807c = str3;
        this.d = list;
        this.e = str4;
        this.f = str5;
        if ((i & 64) == 0) {
            this.f294808g = null;
        } else {
            this.f294808g = fVar;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f294805a, d0Var.f294805a) && Intrinsics.f(this.f294806b, d0Var.f294806b) && Intrinsics.f(this.f294807c, d0Var.f294807c) && Intrinsics.f(this.d, d0Var.d) && Intrinsics.f(this.e, d0Var.e) && Intrinsics.f(this.f, d0Var.f) && Intrinsics.f(this.f294808g, d0Var.f294808g);
    }

    public final int hashCode() {
        int iHashCode = this.f294805a.hashCode() * 31;
        String str = this.f294806b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f294807c;
        int iC = p.a.c(p.a.d((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d), 31, this.e);
        String str3 = this.f;
        int iHashCode3 = (iC + (str3 == null ? 0 : str3.hashCode())) * 31;
        ld7.f fVar = this.f294808g;
        return iHashCode3 + (fVar != null ? fVar.f194043a.hashCode() : 0);
    }

    public d0(String title, String str, String str2, ArrayList inputFields, String actionButtonTitle, String str3, ld7.f fVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(inputFields, "inputFields");
        Intrinsics.checkNotNullParameter(actionButtonTitle, "actionButtonTitle");
        this.f294805a = title;
        this.f294806b = str;
        this.f294807c = str2;
        this.d = inputFields;
        this.e = actionButtonTitle;
        this.f = str3;
        this.f294808g = fVar;
    }
}
