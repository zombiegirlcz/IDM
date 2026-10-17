package qo6;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class r {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f248071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f248072b;

    public /* synthetic */ r(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(p.f248070a.getDescriptor(), i, 3);
            throw null;
        }
        this.f248071a = str;
        this.f248072b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f248071a, rVar.f248071a) && Intrinsics.f(this.f248072b, rVar.f248072b);
    }

    public final int hashCode() {
        return this.f248072b.hashCode() + (this.f248071a.hashCode() * 31);
    }

    public r(String accountLabel) {
        Intrinsics.checkNotNullParameter("PIX_SMART_TRANSFER", "type");
        Intrinsics.checkNotNullParameter(accountLabel, "accountLabel");
        this.f248071a = "PIX_SMART_TRANSFER";
        this.f248072b = accountLabel;
    }
}
