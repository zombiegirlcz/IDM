package zc0;

import com.revolut.feature.backend_flow.domain.models.SelectionItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class s3 implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SelectionItem f321122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f321123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f321124c;

    public s3(SelectionItem item, String optionId, boolean z) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(optionId, "optionId");
        this.f321122a = item;
        this.f321123b = optionId;
        this.f321124c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s3)) {
            return false;
        }
        s3 s3Var = (s3) obj2;
        return Intrinsics.f(this.f321122a, s3Var.f321122a) && Intrinsics.f(this.f321123b, s3Var.f321123b) && this.f321124c == s3Var.f321124c;
    }

    @Override // zc0.d
    public final String getItemId() {
        return this.f321122a.getId();
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f321124c) + p.a.c(this.f321122a.hashCode() * 31, 31, this.f321123b);
    }
}
