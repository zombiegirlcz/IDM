package fzd;

import com.revolut.feature.statements.api.models.CustomisationParameters;
import com.revolut.feature.statements.api.models.CustomisationSelection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CustomisationParameters f139145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CustomisationSelection f139146b;

    public k(CustomisationParameters parameters, CustomisationSelection selection) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(selection, "selection");
        this.f139145a = parameters;
        this.f139146b = selection;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f139145a, kVar.f139145a) && Intrinsics.f(this.f139146b, kVar.f139146b);
    }

    public final int hashCode() {
        return this.f139146b.hashCode() + (this.f139145a.hashCode() * 31);
    }
}
