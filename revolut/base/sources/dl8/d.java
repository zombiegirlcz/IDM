package dl8;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@g
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f115716a;

    public /* synthetic */ d(int i, String str) {
        if (1 == (i & 1)) {
            this.f115716a = str;
        } else {
            j1.f(b.f115715a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f115716a, ((d) obj2).f115716a);
    }

    public final int hashCode() {
        return this.f115716a.hashCode();
    }

    public d(String phoneNumber) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        this.f115716a = phoneNumber;
    }
}
