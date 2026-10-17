package a9d;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f2405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f2406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f2407c;

    public f(Data cardSection, Data faqs, boolean z) {
        Intrinsics.checkNotNullParameter(cardSection, "cardSection");
        Intrinsics.checkNotNullParameter(faqs, "faqs");
        this.f2405a = cardSection;
        this.f2406b = faqs;
        this.f2407c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f2405a, fVar.f2405a) && Intrinsics.f(this.f2406b, fVar.f2406b) && this.f2407c == fVar.f2407c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2407c) + kii.e.c(this.f2406b, this.f2405a.hashCode() * 31, 31);
    }
}
