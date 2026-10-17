package ug7;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PromptMarketingContentDelegate.Model.Button f279977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f279978b;

    public a(PromptMarketingContentDelegate.Model.Button model, d parcel) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f279977a = model;
        this.f279978b = parcel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f279977a, aVar.f279977a) && Intrinsics.f(this.f279978b, aVar.f279978b);
    }

    public final int hashCode() {
        return this.f279978b.hashCode() + (this.f279977a.hashCode() * 31);
    }
}
