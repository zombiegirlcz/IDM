package ow1;

import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.models.alias.Alias;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Alias f230259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f230260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f230261c;

    public i(Alias alias, Data qrCodeData, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(alias, "alias");
        Intrinsics.checkNotNullParameter(qrCodeData, "qrCodeData");
        this.f230259a = alias;
        this.f230260b = qrCodeData;
        this.f230261c = dVar;
    }

    public static i a(i iVar, Alias alias, Data qrCodeData, dj0.d dVar, int i) {
        if ((i & 1) != 0) {
            alias = iVar.f230259a;
        }
        if ((i & 2) != 0) {
            qrCodeData = iVar.f230260b;
        }
        if ((i & 4) != 0) {
            dVar = iVar.f230261c;
        }
        iVar.getClass();
        Intrinsics.checkNotNullParameter(alias, "alias");
        Intrinsics.checkNotNullParameter(qrCodeData, "qrCodeData");
        return new i(alias, qrCodeData, dVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f230259a, iVar.f230259a) && Intrinsics.f(this.f230260b, iVar.f230260b) && Intrinsics.f(this.f230261c, iVar.f230261c);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f230260b, this.f230259a.hashCode() * 31, 31);
        dj0.d dVar = this.f230261c;
        return iC + (dVar == null ? 0 : dVar.hashCode());
    }
}
