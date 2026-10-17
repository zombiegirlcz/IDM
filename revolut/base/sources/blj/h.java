package blj;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f16709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f16710c;

    public h(String str, Data portingAuthorization, Long l2) {
        Intrinsics.checkNotNullParameter(portingAuthorization, "portingAuthorization");
        this.f16708a = str;
        this.f16709b = portingAuthorization;
        this.f16710c = l2;
    }

    public static h a(h hVar, String str, Data portingAuthorization, Long l2, int i) {
        if ((i & 1) != 0) {
            str = hVar.f16708a;
        }
        if ((i & 2) != 0) {
            portingAuthorization = hVar.f16709b;
        }
        if ((i & 4) != 0) {
            l2 = hVar.f16710c;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(portingAuthorization, "portingAuthorization");
        return new h(str, portingAuthorization, l2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f16708a, hVar.f16708a) && Intrinsics.f(this.f16709b, hVar.f16709b) && Intrinsics.f(this.f16710c, hVar.f16710c);
    }

    public final int hashCode() {
        String str = this.f16708a;
        int iC = kii.e.c(this.f16709b, (str == null ? 0 : str.hashCode()) * 31, 31);
        Long l2 = this.f16710c;
        return iC + (l2 != null ? l2.hashCode() : 0);
    }
}
