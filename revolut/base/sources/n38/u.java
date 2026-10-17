package n38;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class u implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f211959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f211960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f211961c;

    public u(String name, String phone, w state) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f211959a = name;
        this.f211960b = phone;
        this.f211961c = state;
    }

    public final w a() {
        return this.f211961c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f211959a, uVar.f211959a) && Intrinsics.f(this.f211960b, uVar.f211960b) && this.f211961c == uVar.f211961c;
    }

    public final String getName() {
        return this.f211959a;
    }

    public final String getPhone() {
        return this.f211960b;
    }

    public final int hashCode() {
        return this.f211961c.hashCode() + p.a.c(this.f211959a.hashCode() * 31, 31, this.f211960b);
    }
}
