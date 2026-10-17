package wol;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i80.a f298965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f298966b;

    public i(i80.a barcode, String textContent) {
        Intrinsics.checkNotNullParameter(barcode, "barcode");
        Intrinsics.checkNotNullParameter(textContent, "textContent");
        this.f298965a = barcode;
        this.f298966b = textContent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f298965a, iVar.f298965a) && Intrinsics.f(this.f298966b, iVar.f298966b);
    }

    public final int hashCode() {
        return this.f298966b.hashCode() + (Arrays.deepHashCode(this.f298965a.f159408a) * 31);
    }
}
