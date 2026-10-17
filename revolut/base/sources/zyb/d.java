package zyb;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f326401a;

    public d() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f326401a, ((d) obj2).f326401a);
    }

    public final int hashCode() {
        return this.f326401a.hashCode();
    }

    public d(Data bottomSheetData) {
        Intrinsics.checkNotNullParameter(bottomSheetData, "bottomSheetData");
        this.f326401a = bottomSheetData;
    }

    public /* synthetic */ d(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
