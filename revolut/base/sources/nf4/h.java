package nf4;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h extends com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f214811a;

    public h(ArrayList parameters) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.f214811a = parameters;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f214811a, ((h) obj2).f214811a);
    }

    public final int hashCode() {
        return this.f214811a.hashCode();
    }
}
