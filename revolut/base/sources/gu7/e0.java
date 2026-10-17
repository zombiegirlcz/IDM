package gu7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class e0 {

    @NotNull
    public static final d0 Companion = new d0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.feature.insurance_embedded.impl.data.model.p f146734a;

    public /* synthetic */ e0(int i, com.revolut.feature.insurance_embedded.impl.data.model.p pVar) {
        if (1 == (i & 1)) {
            this.f146734a = pVar;
        } else {
            qlm.j1.f(c0.f146720a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e0) && Intrinsics.f(this.f146734a, ((e0) obj2).f146734a);
    }

    public final int hashCode() {
        com.revolut.feature.insurance_embedded.impl.data.model.p pVar = this.f146734a;
        if (pVar == null) {
            return 0;
        }
        return pVar.hashCode();
    }

    public e0(com.revolut.feature.insurance_embedded.impl.data.model.p pVar) {
        this.f146734a = pVar;
    }
}
