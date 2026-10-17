package ruj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class m {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f257587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f257588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f257589c;
    public final String d;
    public final String e;
    public final String f;

    public /* synthetic */ m(String str, int i, String str2, String str3, String str4, String str5, String str6) {
        if (63 != (i & 63)) {
            j1.f(k.f257586a.getDescriptor(), i, 63);
            throw null;
        }
        this.f257587a = str;
        this.f257588b = str2;
        this.f257589c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f257587a, mVar.f257587a) && Intrinsics.f(this.f257588b, mVar.f257588b) && Intrinsics.f(this.f257589c, mVar.f257589c) && Intrinsics.f(this.d, mVar.d) && Intrinsics.f(this.e, mVar.e) && Intrinsics.f(this.f, mVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(this.f257587a.hashCode() * 31, 31, this.f257588b), 31, this.f257589c), 31, this.d), 31, this.e);
    }

    public m(String id10, String eyebrow, String title, String subtitle, String buttonText, String assetUrl) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(eyebrow, "eyebrow");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        Intrinsics.checkNotNullParameter(assetUrl, "assetUrl");
        this.f257587a = id10;
        this.f257588b = eyebrow;
        this.f257589c = title;
        this.d = subtitle;
        this.e = buttonText;
        this.f = assetUrl;
    }
}
