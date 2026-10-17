package kog;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends com.revolut.feature.user_declarations.shared.flows.pep.screens.persons_list.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f186357a;

    public h(List connections) {
        Intrinsics.checkNotNullParameter(connections, "connections");
        Intrinsics.checkNotNullParameter("PEP_PERSONS_LIST_CONTINUE_BUTTON", "continueButtonTag");
        this.f186357a = connections;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f186357a, ((h) obj2).f186357a);
    }

    public final int hashCode() {
        return (this.f186357a.hashCode() * 31) + 2119954158;
    }
}
