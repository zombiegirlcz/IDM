package vy2;

import com.revolut.data.model.Data;
import jki.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f293120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f293121b;

    public c(Data originalLabel, String cardLabel) {
        Intrinsics.checkNotNullParameter(originalLabel, "originalLabel");
        Intrinsics.checkNotNullParameter(cardLabel, "cardLabel");
        this.f293120a = originalLabel;
        this.f293121b = cardLabel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f293120a, cVar.f293120a) && Intrinsics.f(this.f293121b, cVar.f293121b);
    }

    public final int hashCode() {
        return this.f293121b.hashCode() + (this.f293120a.hashCode() * 31);
    }
}
