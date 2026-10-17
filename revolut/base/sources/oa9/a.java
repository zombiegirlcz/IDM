package oa9;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f223545a;

    public a(Data documents) {
        Intrinsics.checkNotNullParameter(documents, "documents");
        this.f223545a = documents;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f223545a, ((a) obj2).f223545a);
    }

    public final int hashCode() {
        return this.f223545a.hashCode();
    }
}
