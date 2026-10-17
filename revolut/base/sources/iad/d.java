package iad;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f159990a;

    public d() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f159990a, ((d) obj2).f159990a);
    }

    public final int hashCode() {
        return this.f159990a.hashCode();
    }

    public d(Data pdfFileData) {
        Intrinsics.checkNotNullParameter(pdfFileData, "pdfFileData");
        this.f159990a = pdfFileData;
    }

    public /* synthetic */ d(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
