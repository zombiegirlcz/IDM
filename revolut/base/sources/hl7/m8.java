package hl7;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class m8 {

    @NotNull
    public static final l8 Companion = new l8();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f153217b = {yhm.j.c(yhm.k.PUBLICATION, new q0(21))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f153218a;

    public /* synthetic */ m8(int i, List list) {
        if (1 == (i & 1)) {
            this.f153218a = list;
        } else {
            qlm.j1.f(k8.f153174a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m8) && Intrinsics.f(this.f153218a, ((m8) obj2).f153218a);
    }

    public final int hashCode() {
        return this.f153218a.hashCode();
    }
}
