package yy3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f317776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f317777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f317778c;
    public final String d;
    public final h e;

    public i(String id10, String title, String description, String logoUrl, h otp) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
        Intrinsics.checkNotNullParameter(otp, "otp");
        this.f317776a = id10;
        this.f317777b = title;
        this.f317778c = description;
        this.d = logoUrl;
        this.e = otp;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f317776a, iVar.f317776a) && Intrinsics.f(this.f317777b, iVar.f317777b) && Intrinsics.f(this.f317778c, iVar.f317778c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c(p.a.c(p.a.c(this.f317776a.hashCode() * 31, 31, this.f317777b), 31, this.f317778c), 31, this.d);
    }
}
