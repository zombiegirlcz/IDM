package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class w0 {

    @NotNull
    public static final v0 Companion = new v0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153346a;

    public /* synthetic */ w0(int i, String str) {
        if (1 == (i & 1)) {
            this.f153346a = str;
        } else {
            qlm.j1.f(u0.f153325a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w0) && Intrinsics.f(this.f153346a, ((w0) obj2).f153346a);
    }

    public final int hashCode() {
        return this.f153346a.hashCode();
    }

    public w0(String registrationNumber) {
        Intrinsics.checkNotNullParameter(registrationNumber, "registrationNumber");
        this.f153346a = registrationNumber;
    }
}
