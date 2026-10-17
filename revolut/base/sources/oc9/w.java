package oc9;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class w implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f224161a;

    public w(ArrayList termsToSignIds) {
        Intrinsics.checkNotNullParameter(termsToSignIds, "termsToSignIds");
        this.f224161a = termsToSignIds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w) && this.f224161a.equals(((w) obj2).f224161a);
    }

    public final int hashCode() {
        return this.f224161a.hashCode();
    }
}
