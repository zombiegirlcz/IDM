package maa;

import com.revolut.data.model.Data;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f203979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f203980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f203981c;
    public final l d;
    public final Set e;

    public j() {
        this(0);
    }

    public static j a(j jVar, Data data, int i, int i2, l lVar, Set set, int i3) {
        if ((i3 & 1) != 0) {
            data = jVar.f203979a;
        }
        Data infoData = data;
        if ((i3 & 2) != 0) {
            i = jVar.f203980b;
        }
        int i5 = i;
        if ((i3 & 4) != 0) {
            i2 = jVar.f203981c;
        }
        int i6 = i2;
        if ((i3 & 8) != 0) {
            lVar = jVar.d;
        }
        l selectedFilter = lVar;
        if ((i3 & 16) != 0) {
            set = jVar.e;
        }
        Set selectedAccounts = set;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(infoData, "infoData");
        Intrinsics.checkNotNullParameter(selectedFilter, "selectedFilter");
        Intrinsics.checkNotNullParameter(selectedAccounts, "selectedAccounts");
        return new j(infoData, i5, i6, selectedFilter, selectedAccounts);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f203979a, jVar.f203979a) && this.f203980b == jVar.f203980b && this.f203981c == jVar.f203981c && this.d == jVar.d && Intrinsics.f(this.e, jVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + j6.a.b(this.f203981c, j6.a.b(this.f203980b, this.f203979a.hashCode() * 31, 31), 31)) * 31);
    }

    public j(Data infoData, int i, int i2, l selectedFilter, Set selectedAccounts) {
        Intrinsics.checkNotNullParameter(infoData, "infoData");
        Intrinsics.checkNotNullParameter(selectedFilter, "selectedFilter");
        Intrinsics.checkNotNullParameter(selectedAccounts, "selectedAccounts");
        this.f203979a = infoData;
        this.f203980b = i;
        this.f203981c = i2;
        this.d = selectedFilter;
        this.e = selectedAccounts;
    }

    public j(int i) {
        this(new Data(null, null, false, 7, null), 0, 0, l.NONE, h0.f322473a);
    }
}
