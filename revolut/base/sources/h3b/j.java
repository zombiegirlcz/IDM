package h3b;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f149084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f149085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f149086c;
    public final Data d;

    public j() {
        this(0);
    }

    public static j a(j jVar, Data availableActions, Data cashBalanceInfo, List list, Data maintenanceMarginWidgetState, int i) {
        if ((i & 1) != 0) {
            availableActions = jVar.f149084a;
        }
        if ((i & 2) != 0) {
            cashBalanceInfo = jVar.f149085b;
        }
        if ((i & 4) != 0) {
            list = jVar.f149086c;
        }
        if ((i & 8) != 0) {
            maintenanceMarginWidgetState = jVar.d;
        }
        jVar.getClass();
        Intrinsics.checkNotNullParameter(availableActions, "availableActions");
        Intrinsics.checkNotNullParameter(cashBalanceInfo, "cashBalanceInfo");
        Intrinsics.checkNotNullParameter(maintenanceMarginWidgetState, "maintenanceMarginWidgetState");
        return new j(availableActions, cashBalanceInfo, maintenanceMarginWidgetState, list);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f149084a, jVar.f149084a) && Intrinsics.f(this.f149085b, jVar.f149085b) && Intrinsics.f(this.f149086c, jVar.f149086c) && Intrinsics.f(this.d, jVar.d);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f149085b, this.f149084a.hashCode() * 31, 31);
        List list = this.f149086c;
        return this.d.hashCode() + ((iC + (list == null ? 0 : list.hashCode())) * 31);
    }

    public j(Data availableActions, Data cashBalanceInfo, Data maintenanceMarginWidgetState, List list) {
        Intrinsics.checkNotNullParameter(availableActions, "availableActions");
        Intrinsics.checkNotNullParameter(cashBalanceInfo, "cashBalanceInfo");
        Intrinsics.checkNotNullParameter(maintenanceMarginWidgetState, "maintenanceMarginWidgetState");
        this.f149084a = availableActions;
        this.f149085b = cashBalanceInfo;
        this.f149086c = list;
        this.d = maintenanceMarginWidgetState;
    }

    public /* synthetic */ j(int i) {
        this(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, false, 7, null), null);
    }
}
