package w5b;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class s3 {

    @NotNull
    public static final r3 Companion = new r3();
    public static final Lazy[] d = {null, null, yhm.j.c(yhm.k.PUBLICATION, new w56.a(20))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f295006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f295007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f295008c;

    public /* synthetic */ s3(int i, String str, String str2, List list) {
        if (7 != (i & 7)) {
            qlm.j1.f(q3.f294985a.getDescriptor(), i, 7);
            throw null;
        }
        this.f295006a = str;
        this.f295007b = str2;
        this.f295008c = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s3)) {
            return false;
        }
        s3 s3Var = (s3) obj2;
        return Intrinsics.f(this.f295006a, s3Var.f295006a) && Intrinsics.f(this.f295007b, s3Var.f295007b) && Intrinsics.f(this.f295008c, s3Var.f295008c);
    }

    public final int hashCode() {
        int iHashCode = this.f295006a.hashCode() * 31;
        String str = this.f295007b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f295008c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public s3(String title, String str, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f295006a = title;
        this.f295007b = str;
        this.f295008c = arrayList;
    }
}
