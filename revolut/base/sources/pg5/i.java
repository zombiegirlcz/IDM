package pg5;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class i {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f235806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f235807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f235808c;
    public final String d;

    public /* synthetic */ i(int i, String str, h hVar, String str2, String str3) {
        if (15 != (i & 15)) {
            j1.f(d.f235801a.getDescriptor(), i, 15);
            throw null;
        }
        this.f235806a = str;
        this.f235807b = hVar;
        this.f235808c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f235806a, iVar.f235806a) && Intrinsics.f(this.f235807b, iVar.f235807b) && Intrinsics.f(this.f235808c, iVar.f235808c) && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f235806a.hashCode() * 31;
        h hVar = this.f235807b;
        return this.d.hashCode() + p.a.c((iHashCode + (hVar == null ? 0 : hVar.hashCode())) * 31, 31, this.f235808c);
    }

    public i(String status, h hVar, String pickerDescription, String footer) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(pickerDescription, "pickerDescription");
        Intrinsics.checkNotNullParameter(footer, "footer");
        this.f235806a = status;
        this.f235807b = hVar;
        this.f235808c = pickerDescription;
        this.d = footer;
    }
}
