package ty4;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f275466a;

    public d(Data pocketInfoListData) {
        Intrinsics.checkNotNullParameter(pocketInfoListData, "pocketInfoListData");
        this.f275466a = pocketInfoListData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f275466a, ((d) obj2).f275466a);
    }

    public final int hashCode() {
        return this.f275466a.hashCode();
    }
}
