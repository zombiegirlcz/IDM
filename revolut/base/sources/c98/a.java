package c98;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\n"}, d2 = {"Lc98/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "base64Image", "b", "imageUrl", "feature_junior_card_request_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("base64Image")
    @NotNull
    private final String base64Image;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("imageUrl")
    @NotNull
    private final String imageUrl;

    public a(String base64Image, String imageUrl) {
        Intrinsics.checkNotNullParameter(base64Image, "base64Image");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.base64Image = base64Image;
        this.imageUrl = imageUrl;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBase64Image() {
        return this.base64Image;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.base64Image, aVar.base64Image) && Intrinsics.f(this.imageUrl, aVar.imageUrl);
    }

    public final int hashCode() {
        return this.imageUrl.hashCode() + (this.base64Image.hashCode() * 31);
    }
}
