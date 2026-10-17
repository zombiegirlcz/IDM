package sm5;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f264345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f264346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f264347c;

    public /* synthetic */ c(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            j1.f(a.f264344a.getDescriptor(), i, 7);
            throw null;
        }
        this.f264345a = str;
        this.f264346b = str2;
        this.f264347c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f264345a, cVar.f264345a) && Intrinsics.f(this.f264346b, cVar.f264346b) && Intrinsics.f(this.f264347c, cVar.f264347c);
    }

    public final int hashCode() {
        String str = this.f264345a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f264346b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f264347c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
