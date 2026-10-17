package yl6;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f314658a;

    public e(Data linkedAccountsConsent) {
        Intrinsics.checkNotNullParameter(linkedAccountsConsent, "linkedAccountsConsent");
        this.f314658a = linkedAccountsConsent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f314658a, ((e) obj2).f314658a);
    }

    public final int hashCode() {
        return this.f314658a.hashCode();
    }
}
