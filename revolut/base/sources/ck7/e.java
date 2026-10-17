package ck7;

import com.revolut.data.model.Data;
import com.revolut.feature.insurance.api.models.details.CFACReimbursementType;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f24787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CFACReimbursementType f24788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f24789c;
    public final boolean d;

    public e(List reasonGroups, CFACReimbursementType reimbursementType, Data reasonNotListedInfoData, boolean z) {
        Intrinsics.checkNotNullParameter(reasonGroups, "reasonGroups");
        Intrinsics.checkNotNullParameter(reimbursementType, "reimbursementType");
        Intrinsics.checkNotNullParameter(reasonNotListedInfoData, "reasonNotListedInfoData");
        this.f24787a = reasonGroups;
        this.f24788b = reimbursementType;
        this.f24789c = reasonNotListedInfoData;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f24787a, eVar.f24787a) && this.f24788b == eVar.f24788b && Intrinsics.f(this.f24789c, eVar.f24789c) && this.d == eVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + kii.e.c(this.f24789c, (this.f24788b.hashCode() + (this.f24787a.hashCode() * 31)) * 31, 31);
    }
}
