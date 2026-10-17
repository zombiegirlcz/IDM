package jnc;

import aii.r;
import com.revolut.feature.wealth.models.robo.Template;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Template f176687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f176688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f176689c;

    public f(Template selectedTemplate, dj0.d initialDepositAmount, dj0.d monthlyDepositAmount) {
        Intrinsics.checkNotNullParameter(selectedTemplate, "selectedTemplate");
        Intrinsics.checkNotNullParameter(initialDepositAmount, "initialDepositAmount");
        Intrinsics.checkNotNullParameter(monthlyDepositAmount, "monthlyDepositAmount");
        this.f176687a = selectedTemplate;
        this.f176688b = initialDepositAmount;
        this.f176689c = monthlyDepositAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f176687a, fVar.f176687a) && Intrinsics.f(this.f176688b, fVar.f176688b) && Intrinsics.f(this.f176689c, fVar.f176689c);
    }

    public final int hashCode() {
        return this.f176689c.hashCode() + v7.c(this.f176687a.hashCode() * 31, 31, this.f176688b);
    }
}
