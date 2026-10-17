package coa;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f25500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qla.a f25501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f25502c;
    public final Data d;
    public final boolean e;
    public final boolean f;

    public a() {
        this(false, 31);
    }

    public static a a(a aVar, Data data, qla.a aVar2, Data data2, Data data3, int i) {
        if ((i & 1) != 0) {
            data = aVar.f25500a;
        }
        Data settings = data;
        if ((i & 2) != 0) {
            aVar2 = aVar.f25501b;
        }
        qla.a aVar3 = aVar2;
        if ((i & 4) != 0) {
            data2 = aVar.f25502c;
        }
        Data isPersonalisationMigrated = data2;
        if ((i & 8) != 0) {
            data3 = aVar.d;
        }
        Data creditCollectionSettings = data3;
        boolean z = aVar.e;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(isPersonalisationMigrated, "isPersonalisationMigrated");
        Intrinsics.checkNotNullParameter(creditCollectionSettings, "creditCollectionSettings");
        return new a(settings, aVar3, isPersonalisationMigrated, creditCollectionSettings, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f25500a, aVar.f25500a) && this.f25501b == aVar.f25501b && Intrinsics.f(this.f25502c, aVar.f25502c) && Intrinsics.f(this.d, aVar.d) && this.e == aVar.e;
    }

    public final int hashCode() {
        int iHashCode = this.f25500a.hashCode() * 31;
        qla.a aVar = this.f25501b;
        return Boolean.hashCode(this.e) + kii.e.c(this.d, kii.e.c(this.f25502c, (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31, 31), 31);
    }

    public a(Data settings, qla.a aVar, Data isPersonalisationMigrated, Data creditCollectionSettings, boolean z) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(isPersonalisationMigrated, "isPersonalisationMigrated");
        Intrinsics.checkNotNullParameter(creditCollectionSettings, "creditCollectionSettings");
        this.f25500a = settings;
        this.f25501b = aVar;
        this.f25502c = isPersonalisationMigrated;
        this.d = creditCollectionSettings;
        this.e = z;
        this.f = aVar == qla.a.REVOLUT_X;
    }

    public /* synthetic */ a(boolean z, int i) {
        this(new Data(null, null, true, 3, null), null, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), (i & 16) != 0 ? false : z);
    }
}
