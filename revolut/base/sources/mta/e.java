package mta;

import com.revolut.feature.raffle.impl.data.models.RaffleCampaign$ShareInfo;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RaffleCampaign$ShareInfo f208776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i80.a f208777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f208778c;

    public e(RaffleCampaign$ShareInfo shareInfo, i80.a aVar, ArrayList supportedShareActions) {
        Intrinsics.checkNotNullParameter(shareInfo, "shareInfo");
        Intrinsics.checkNotNullParameter(supportedShareActions, "supportedShareActions");
        this.f208776a = shareInfo;
        this.f208777b = aVar;
        this.f208778c = supportedShareActions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f208776a, eVar.f208776a) && Intrinsics.f(this.f208777b, eVar.f208777b) && this.f208778c.equals(eVar.f208778c);
    }

    public final int hashCode() {
        int iHashCode = this.f208776a.hashCode() * 31;
        i80.a aVar = this.f208777b;
        return this.f208778c.hashCode() + ((iHashCode + (aVar == null ? 0 : Arrays.deepHashCode(aVar.f159408a))) * 31);
    }
}
