package itb;

import com.revolut.data.model.Data;
import kii.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();
    public static final b d = new b(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f168358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f168359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f168360c;

    public static final class a {
        private a() {
        }
    }

    public b() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f168358a, bVar.f168358a) && Intrinsics.f(this.f168359b, bVar.f168359b) && this.f168360c == bVar.f168360c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f168360c) + e.c(this.f168359b, this.f168358a.hashCode() * 31, 31);
    }

    public b(Data userData, Data userPricingPlanTierData, boolean z) {
        Intrinsics.checkNotNullParameter(userData, "userData");
        Intrinsics.checkNotNullParameter(userPricingPlanTierData, "userPricingPlanTierData");
        this.f168358a = userData;
        this.f168359b = userPricingPlanTierData;
        this.f168360c = z;
    }

    public /* synthetic */ b(int i) {
        this(new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), false);
    }
}
