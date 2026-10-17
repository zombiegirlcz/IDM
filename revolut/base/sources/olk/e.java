package olk;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f226438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f226439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f226440c;

    public e() {
        this(0);
    }

    public static e a(e eVar, String str, Data currentPlan, Data planCancelInfo, int i) {
        if ((i & 1) != 0) {
            str = eVar.f226438a;
        }
        if ((i & 2) != 0) {
            currentPlan = eVar.f226439b;
        }
        if ((i & 4) != 0) {
            planCancelInfo = eVar.f226440c;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(currentPlan, "currentPlan");
        Intrinsics.checkNotNullParameter(planCancelInfo, "planCancelInfo");
        return new e(currentPlan, planCancelInfo, str);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f226438a, eVar.f226438a) && Intrinsics.f(this.f226439b, eVar.f226439b) && Intrinsics.f(this.f226440c, eVar.f226440c);
    }

    public final int hashCode() {
        String str = this.f226438a;
        return this.f226440c.hashCode() + kii.e.c(this.f226439b, (str == null ? 0 : str.hashCode()) * 31, 31);
    }

    public e(Data currentPlan, Data planCancelInfo, String str) {
        Intrinsics.checkNotNullParameter(currentPlan, "currentPlan");
        Intrinsics.checkNotNullParameter(planCancelInfo, "planCancelInfo");
        this.f226438a = str;
        this.f226439b = currentPlan;
        this.f226440c = planCancelInfo;
    }

    public /* synthetic */ e(int i) {
        this(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), null);
    }
}
