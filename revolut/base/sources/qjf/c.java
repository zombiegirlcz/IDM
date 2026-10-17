package qjf;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f246863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f246864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f246865c;
    public final String d;
    public final String e;

    public c(UrlImage urlImage, String title, String description, String str, String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f246863a = urlImage;
        this.f246864b = title;
        this.f246865c = description;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f246863a, cVar.f246863a) && Intrinsics.f(this.f246864b, cVar.f246864b) && Intrinsics.f(this.f246865c, cVar.f246865c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e);
    }

    public final int hashCode() {
        Image image = this.f246863a;
        int iC = p.a.c(p.a.c((image == null ? 0 : image.hashCode()) * 31, 31, this.f246864b), 31, this.f246865c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
