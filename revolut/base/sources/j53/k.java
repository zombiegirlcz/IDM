package j53;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f171470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f171471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f171472c;
    public final String d;

    public k(Data imagesData, Data images, String str, String str2) {
        Intrinsics.checkNotNullParameter(imagesData, "imagesData");
        Intrinsics.checkNotNullParameter(images, "images");
        this.f171470a = str;
        this.f171471b = imagesData;
        this.f171472c = images;
        this.d = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f171470a, kVar.f171470a) && Intrinsics.f(this.f171471b, kVar.f171471b) && Intrinsics.f(this.f171472c, kVar.f171472c) && Intrinsics.f(this.d, kVar.d);
    }

    public final int hashCode() {
        String str = this.f171470a;
        int iC = kii.e.c(this.f171472c, kii.e.c(this.f171471b, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
        String str2 = this.d;
        return iC + (str2 != null ? str2.hashCode() : 0);
    }
}
