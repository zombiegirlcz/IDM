package bx8;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends com.revolut.feature.kyc.impl.screens.documentid_input.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f19523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f19524b;

    public n(ArrayList consents, ArrayList fieldResults) {
        Intrinsics.checkNotNullParameter(consents, "consents");
        Intrinsics.checkNotNullParameter(fieldResults, "fieldResults");
        this.f19523a = consents;
        this.f19524b = fieldResults;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f19523a.equals(nVar.f19523a) && this.f19524b.equals(nVar.f19524b);
    }

    public final int hashCode() {
        return this.f19524b.hashCode() + (this.f19523a.hashCode() * 31);
    }
}
