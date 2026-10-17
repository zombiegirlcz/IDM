package duc;

import com.revolut.data.model.Data;
import h93.f0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f117960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f117961b;

    public e(f0 revolutCard, Data cardBitmap) {
        Intrinsics.checkNotNullParameter(revolutCard, "revolutCard");
        Intrinsics.checkNotNullParameter(cardBitmap, "cardBitmap");
        this.f117960a = revolutCard;
        this.f117961b = cardBitmap;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f117960a, eVar.f117960a) && Intrinsics.f(this.f117961b, eVar.f117961b);
    }

    public final int hashCode() {
        return this.f117961b.hashCode() + (this.f117960a.hashCode() * 31);
    }
}
