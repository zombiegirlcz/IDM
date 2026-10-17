package ip7;

import com.revolut.data.model.Data;
import java.util.Set;
import kl7.f1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f1 f167666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f167667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f167668c;
    public final boolean d;

    public f(f1 paymentFrequency, Data priceOption, Set selected, boolean z) {
        Intrinsics.checkNotNullParameter(paymentFrequency, "paymentFrequency");
        Intrinsics.checkNotNullParameter(priceOption, "priceOption");
        Intrinsics.checkNotNullParameter(selected, "selected");
        this.f167666a = paymentFrequency;
        this.f167667b = priceOption;
        this.f167668c = selected;
        this.d = z;
    }

    public static f a(f fVar, Data priceOption, Set selected, int i) {
        f1 paymentFrequency = fVar.f167666a;
        if ((i & 2) != 0) {
            priceOption = fVar.f167667b;
        }
        boolean z = fVar.d;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(paymentFrequency, "paymentFrequency");
        Intrinsics.checkNotNullParameter(priceOption, "priceOption");
        Intrinsics.checkNotNullParameter(selected, "selected");
        return new f(paymentFrequency, priceOption, selected, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f167666a == fVar.f167666a && Intrinsics.f(this.f167667b, fVar.f167667b) && Intrinsics.f(this.f167668c, fVar.f167668c) && this.d == fVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + p.a.f(kii.e.c(this.f167667b, this.f167666a.hashCode() * 31, 31), 31, this.f167668c);
    }
}
