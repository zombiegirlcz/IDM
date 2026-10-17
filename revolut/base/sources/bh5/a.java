package bh5;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f15226a;

    public a() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f15226a, ((a) obj2).f15226a);
    }

    public final int hashCode() {
        return this.f15226a.hashCode();
    }

    public a(Data unlockProgress) {
        Intrinsics.checkNotNullParameter(unlockProgress, "unlockProgress");
        this.f15226a = unlockProgress;
    }

    public /* synthetic */ a(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
