package t8e;

import cli.j;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.subaccount.impl.ui.qr_link.SubaccountQRLinkScreenContract$SubaccountInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SubaccountQRLinkScreenContract$SubaccountInfo f268879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f268880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f268881c;

    public a(SubaccountQRLinkScreenContract$SubaccountInfo subaccountInfo, String link, Image image) {
        Intrinsics.checkNotNullParameter(subaccountInfo, "subaccountInfo");
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(image, "image");
        this.f268879a = subaccountInfo;
        this.f268880b = link;
        this.f268881c = image;
    }

    public static a a(a aVar, SubaccountQRLinkScreenContract$SubaccountInfo subaccountInfo, Image image, int i) {
        if ((i & 1) != 0) {
            subaccountInfo = aVar.f268879a;
        }
        String link = aVar.f268880b;
        if ((i & 4) != 0) {
            image = aVar.f268881c;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(subaccountInfo, "subaccountInfo");
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(image, "image");
        return new a(subaccountInfo, link, image);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f268879a, aVar.f268879a) && Intrinsics.f(this.f268880b, aVar.f268880b) && Intrinsics.f(this.f268881c, aVar.f268881c);
    }

    public final int hashCode() {
        return this.f268881c.hashCode() + p.a.c(this.f268879a.hashCode() * 31, 31, this.f268880b);
    }
}
