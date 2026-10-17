package nua;

import cli.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hua.c f219267a;

    public a(hua.c selectedFrequency) {
        Intrinsics.checkNotNullParameter(selectedFrequency, "selectedFrequency");
        this.f219267a = selectedFrequency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f219267a == ((a) obj2).f219267a;
    }

    public final int hashCode() {
        return this.f219267a.hashCode();
    }
}
