package n3j;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class n implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f212146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n61.c f212147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f212148c;
    public final Data d;
    public final boolean e;
    public final List f;

    public n(Data infoWithExtra, n61.c cVar, int i, Data suggestionData, boolean z, List validInputFields) {
        Intrinsics.checkNotNullParameter(infoWithExtra, "infoWithExtra");
        Intrinsics.checkNotNullParameter(suggestionData, "suggestionData");
        Intrinsics.checkNotNullParameter(validInputFields, "validInputFields");
        this.f212146a = infoWithExtra;
        this.f212147b = cVar;
        this.f212148c = i;
        this.d = suggestionData;
        this.e = z;
        this.f = validInputFields;
    }

    public static n a(n nVar, Data data, n61.c cVar, int i, Data data2, List list, int i2) {
        if ((i2 & 1) != 0) {
            data = nVar.f212146a;
        }
        Data infoWithExtra = data;
        if ((i2 & 2) != 0) {
            cVar = nVar.f212147b;
        }
        n61.c cVar2 = cVar;
        if ((i2 & 4) != 0) {
            i = nVar.f212148c;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            data2 = nVar.d;
        }
        Data suggestionData = data2;
        boolean z = (i2 & 16) != 0 ? nVar.e : true;
        if ((i2 & 32) != 0) {
            list = nVar.f;
        }
        List validInputFields = list;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(infoWithExtra, "infoWithExtra");
        Intrinsics.checkNotNullParameter(suggestionData, "suggestionData");
        Intrinsics.checkNotNullParameter(validInputFields, "validInputFields");
        return new n(infoWithExtra, cVar2, i3, suggestionData, z, validInputFields);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f212146a, nVar.f212146a) && Intrinsics.f(this.f212147b, nVar.f212147b) && this.f212148c == nVar.f212148c && Intrinsics.f(this.d, nVar.d) && this.e == nVar.e && Intrinsics.f(this.f, nVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f212146a.hashCode() * 31;
        n61.c cVar = this.f212147b;
        return this.f.hashCode() + j6.a.c(kii.e.c(this.d, j6.a.b(this.f212148c, (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31, 31), 31), 31, this.e);
    }
}
