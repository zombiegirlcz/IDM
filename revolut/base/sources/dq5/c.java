package dq5;

import bq5.j0;
import cli.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f116915a;

    public c(j0 recipientTypeSelected) {
        Intrinsics.checkNotNullParameter(recipientTypeSelected, "recipientTypeSelected");
        this.f116915a = recipientTypeSelected;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f116915a == ((c) obj2).f116915a;
    }

    public final int hashCode() {
        return this.f116915a.hashCode();
    }
}
