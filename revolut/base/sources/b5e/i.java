package b5e;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements oki.a {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f12494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f12495c;
    public final Data d;
    public final Data e;

    public i(String str, List pagerItems, Data data, Data data2, Data data3) {
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        this.f12493a = str;
        this.f12494b = pagerItems;
        this.f12495c = data;
        this.d = data2;
        this.e = data3;
    }

    public static i a(i iVar, String str, Data data, Data data2, Data data3, int i) {
        if ((i & 1) != 0) {
            str = iVar.f12493a;
        }
        String str2 = str;
        List pagerItems = iVar.f12494b;
        if ((i & 4) != 0) {
            data = iVar.f12495c;
        }
        Data data4 = data;
        if ((i & 8) != 0) {
            data2 = iVar.d;
        }
        Data data5 = data2;
        if ((i & 16) != 0) {
            data3 = iVar.e;
        }
        iVar.getClass();
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        return new i(str2, pagerItems, data4, data5, data3);
    }

    @Override // oki.a
    public final List W() {
        return this.f12494b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f12493a, iVar.f12493a) && Intrinsics.f(this.f12494b, iVar.f12494b) && Intrinsics.f(this.f12495c, iVar.f12495c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e);
    }

    public final int hashCode() {
        String str = this.f12493a;
        int iD = p.a.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f12494b);
        Data data = this.f12495c;
        int iHashCode = (iD + (data == null ? 0 : data.hashCode())) * 31;
        Data data2 = this.d;
        int iHashCode2 = (iHashCode + (data2 == null ? 0 : data2.hashCode())) * 31;
        Data data3 = this.e;
        return iHashCode2 + (data3 != null ? data3.hashCode() : 0);
    }

    @Override // oki.a
    public final String z() {
        return this.f12493a;
    }
}
