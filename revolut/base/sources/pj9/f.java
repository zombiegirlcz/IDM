package pj9;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f236704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f236705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f236706c;
    public final boolean d;

    public f(Data accountConfig, Data introContent, String str, boolean z) {
        Intrinsics.checkNotNullParameter(accountConfig, "accountConfig");
        Intrinsics.checkNotNullParameter(introContent, "introContent");
        this.f236704a = accountConfig;
        this.f236705b = introContent;
        this.f236706c = str;
        this.d = z;
    }

    public static f a(f fVar, Data accountConfig, Data introContent, String str, int i) {
        if ((i & 1) != 0) {
            accountConfig = fVar.f236704a;
        }
        if ((i & 4) != 0) {
            str = fVar.f236706c;
        }
        boolean z = fVar.d;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(accountConfig, "accountConfig");
        Intrinsics.checkNotNullParameter(introContent, "introContent");
        return new f(accountConfig, introContent, str, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f236704a, fVar.f236704a) && Intrinsics.f(this.f236705b, fVar.f236705b) && Intrinsics.f(this.f236706c, fVar.f236706c) && this.d == fVar.d;
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f236705b, this.f236704a.hashCode() * 31, 31);
        String str = this.f236706c;
        return Boolean.hashCode(this.d) + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }
}
