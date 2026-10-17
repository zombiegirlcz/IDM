package hi2;

import com.revolut.feature.apm.wero.impl.ui.pay.create.CreateRequestLinkData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreateRequestLinkData f152452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f152453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f152454c;

    public e(CreateRequestLinkData createRequestLinkData, f extraData, int i) {
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        this.f152452a = createRequestLinkData;
        this.f152453b = extraData;
        this.f152454c = i;
    }

    public static e a(e eVar, CreateRequestLinkData createRequestLinkData, f extraData, int i, int i2) {
        if ((i2 & 1) != 0) {
            createRequestLinkData = eVar.f152452a;
        }
        if ((i2 & 2) != 0) {
            extraData = eVar.f152453b;
        }
        if ((i2 & 4) != 0) {
            i = eVar.f152454c;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        return new e(createRequestLinkData, extraData, i);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f152452a, eVar.f152452a) && Intrinsics.f(this.f152453b, eVar.f152453b) && this.f152454c == eVar.f152454c;
    }

    public final int hashCode() {
        CreateRequestLinkData createRequestLinkData = this.f152452a;
        return Integer.hashCode(this.f152454c) + ((this.f152453b.hashCode() + ((createRequestLinkData == null ? 0 : createRequestLinkData.hashCode()) * 31)) * 31);
    }
}
