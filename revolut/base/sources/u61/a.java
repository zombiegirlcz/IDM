package u61;

import com.revolut.domain.models.login.ChannelType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChannelType f277465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f277466b;

    public a() {
        this(null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f277465a == aVar.f277465a && Intrinsics.f(this.f277466b, aVar.f277466b);
    }

    public final int hashCode() {
        ChannelType channelType = this.f277465a;
        int iHashCode = (channelType == null ? 0 : channelType.hashCode()) * 31;
        String str = this.f277466b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public a(ChannelType channelType, String str) {
        this.f277465a = channelType;
        this.f277466b = str;
    }
}
