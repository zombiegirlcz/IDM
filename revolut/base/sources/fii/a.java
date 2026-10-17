package fii;

import cli.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f135423a;

    public a(g inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f135423a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f135423a.equals(((a) obj2).f135423a);
    }

    public final int hashCode() {
        return this.f135423a.f135430a.hashCode();
    }
}
