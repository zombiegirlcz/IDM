package rd7;

import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f253366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f253367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UrlImage.CustomHeaders f253368c;
    public final String d;

    public /* synthetic */ g(String str, UrlImage.SimpleCustomHeaders simpleCustomHeaders, int i) {
        this(str, (i & 2) == 0, (i & 4) != 0 ? null : simpleCustomHeaders, null);
    }

    @Override // rd7.h
    public final String a() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f253366a, gVar.f253366a) && this.f253367b == gVar.f253367b && Intrinsics.f(this.f253368c, gVar.f253368c) && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f253366a.hashCode() * 31, 31, this.f253367b);
        UrlImage.CustomHeaders customHeaders = this.f253368c;
        int iHashCode = (iC + (customHeaders == null ? 0 : customHeaders.hashCode())) * 31;
        String str = this.d;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public g(String url2, boolean z, UrlImage.CustomHeaders customHeaders, String str) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f253366a = url2;
        this.f253367b = z;
        this.f253368c = customHeaders;
        this.d = str;
    }
}
