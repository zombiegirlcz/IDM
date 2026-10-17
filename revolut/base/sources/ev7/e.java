package ev7;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f129750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f129751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f129752c;

    public e() {
        this(0);
    }

    public static e a(e eVar, Data documents, Data banner, Data countryCode, int i) {
        if ((i & 1) != 0) {
            documents = eVar.f129750a;
        }
        if ((i & 2) != 0) {
            banner = eVar.f129751b;
        }
        if ((i & 4) != 0) {
            countryCode = eVar.f129752c;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(documents, "documents");
        Intrinsics.checkNotNullParameter(banner, "banner");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return new e(documents, banner, countryCode);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f129750a, eVar.f129750a) && Intrinsics.f(this.f129751b, eVar.f129751b) && Intrinsics.f(this.f129752c, eVar.f129752c);
    }

    public final int hashCode() {
        return this.f129752c.hashCode() + kii.e.c(this.f129751b, this.f129750a.hashCode() * 31, 31);
    }

    public e(Data documents, Data banner, Data countryCode) {
        Intrinsics.checkNotNullParameter(documents, "documents");
        Intrinsics.checkNotNullParameter(banner, "banner");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f129750a = documents;
        this.f129751b = banner;
        this.f129752c = countryCode;
    }

    public /* synthetic */ e(int i) {
        this(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null));
    }
}
