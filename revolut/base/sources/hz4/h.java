package hz4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f157024a;

    public h(String inputText) {
        Intrinsics.checkNotNullParameter(inputText, "inputText");
        this.f157024a = inputText;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f157024a, ((h) obj2).f157024a);
    }

    public final int hashCode() {
        return this.f157024a.hashCode();
    }
}
