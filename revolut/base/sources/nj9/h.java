package nj9;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import zh9.m1;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f216418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f216419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m1 f216420c;

    public h(Data feeSettings, Data switchOptions, m1 m1Var) {
        Intrinsics.checkNotNullParameter(feeSettings, "feeSettings");
        Intrinsics.checkNotNullParameter(switchOptions, "switchOptions");
        this.f216418a = feeSettings;
        this.f216419b = switchOptions;
        this.f216420c = m1Var;
    }

    public static h a(h hVar, Data feeSettings, Data switchOptions, m1 m1Var, int i) {
        if ((i & 1) != 0) {
            feeSettings = hVar.f216418a;
        }
        if ((i & 2) != 0) {
            switchOptions = hVar.f216419b;
        }
        if ((i & 4) != 0) {
            m1Var = hVar.f216420c;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(feeSettings, "feeSettings");
        Intrinsics.checkNotNullParameter(switchOptions, "switchOptions");
        return new h(feeSettings, switchOptions, m1Var);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f216418a, hVar.f216418a) && Intrinsics.f(this.f216419b, hVar.f216419b) && Intrinsics.f(this.f216420c, hVar.f216420c);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f216419b, this.f216418a.hashCode() * 31, 31);
        m1 m1Var = this.f216420c;
        return iC + (m1Var == null ? 0 : m1Var.hashCode());
    }
}
