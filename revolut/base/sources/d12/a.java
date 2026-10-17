package d12;

import aii.e;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f110479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f110480b;

    public a(c inputData, b extension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(extension, "extension");
        this.f110479a = inputData;
        this.f110480b = extension;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f110479a, aVar.f110479a) && Intrinsics.f(this.f110480b, aVar.f110480b);
    }

    public final int hashCode() {
        return this.f110480b.hashCode() + (this.f110479a.f110481a.hashCode() * 31);
    }
}
