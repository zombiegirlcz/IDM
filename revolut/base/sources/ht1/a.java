package ht1;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f155206a;

    public a(Data settings) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.f155206a = settings;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f155206a, ((a) obj2).f155206a);
    }

    public final int hashCode() {
        return this.f155206a.hashCode();
    }
}
