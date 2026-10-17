package kui;

import bti.m;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f189819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f189820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f189821c;

    public e(Data passData, Data termsUrlData, m mVar) {
        Intrinsics.checkNotNullParameter(passData, "passData");
        Intrinsics.checkNotNullParameter(termsUrlData, "termsUrlData");
        this.f189819a = passData;
        this.f189820b = termsUrlData;
        this.f189821c = mVar;
    }

    public static e a(e eVar, Data passData, Data termsUrlData, m mVar, int i) {
        if ((i & 1) != 0) {
            passData = eVar.f189819a;
        }
        if ((i & 2) != 0) {
            termsUrlData = eVar.f189820b;
        }
        if ((i & 4) != 0) {
            mVar = eVar.f189821c;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(passData, "passData");
        Intrinsics.checkNotNullParameter(termsUrlData, "termsUrlData");
        return new e(passData, termsUrlData, mVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f189819a, eVar.f189819a) && Intrinsics.f(this.f189820b, eVar.f189820b) && this.f189821c == eVar.f189821c;
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f189820b, this.f189819a.hashCode() * 31, 31);
        m mVar = this.f189821c;
        return iC + (mVar == null ? 0 : mVar.hashCode());
    }
}
