package zt4;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f325067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f325068b;

    public a(Data content, boolean z) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f325067a = content;
        this.f325068b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f325067a, aVar.f325067a) && this.f325068b == aVar.f325068b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f325068b) + (this.f325067a.hashCode() * 31);
    }
}
