package nci;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f214204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f214205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f214206c;

    public k(Data content, String str, boolean z) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f214204a = str;
        this.f214205b = content;
        this.f214206c = z;
    }

    public static k a(k kVar, String str, Data content, boolean z, int i) {
        if ((i & 1) != 0) {
            str = kVar.f214204a;
        }
        if ((i & 2) != 0) {
            content = kVar.f214205b;
        }
        if ((i & 4) != 0) {
            z = kVar.f214206c;
        }
        kVar.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        return new k(content, str, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f214204a, kVar.f214204a) && Intrinsics.f(this.f214205b, kVar.f214205b) && this.f214206c == kVar.f214206c;
    }

    public final int hashCode() {
        String str = this.f214204a;
        return Boolean.hashCode(this.f214206c) + kii.e.c(this.f214205b, (str == null ? 0 : str.hashCode()) * 31, 31);
    }
}
