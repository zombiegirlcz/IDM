package iha;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class q implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f161348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f161349b;

    public q(String text, ArrayList descriptors) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(descriptors, "descriptors");
        this.f161348a = text;
        this.f161349b = descriptors;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return this.f161348a.equals(qVar.f161348a) && this.f161349b.equals(qVar.f161349b);
    }

    public final int hashCode() {
        return this.f161349b.hashCode() + (this.f161348a.hashCode() * 31);
    }
}
