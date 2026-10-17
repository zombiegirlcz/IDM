package tkd;

import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class e {

    @NotNull
    public static final b Companion = new b();
    public static final Lazy[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f271936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f271937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f271938c;
    public final akd.a d;
    public final Map e;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f = new Lazy[]{null, null, yhm.j.c(kVar, new th9.k(13)), yhm.j.c(kVar, new th9.k(14)), yhm.j.c(kVar, new th9.k(15))};
    }

    public /* synthetic */ e(int i, String str, String str2, d dVar, akd.a aVar, Map map) {
        if (31 != (i & 31)) {
            j1.f(a.f271935a.getDescriptor(), i, 31);
            throw null;
        }
        this.f271936a = str;
        this.f271937b = str2;
        this.f271938c = dVar;
        this.d = aVar;
        this.e = map;
    }

    public final akd.a a() {
        return this.d;
    }

    public final String b() {
        return this.f271937b;
    }

    public final Map c() {
        return this.e;
    }

    public final String d() {
        return this.f271936a;
    }

    public final d e() {
        return this.f271938c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f271936a, eVar.f271936a) && Intrinsics.f(this.f271937b, eVar.f271937b) && this.f271938c == eVar.f271938c && this.d == eVar.d && Intrinsics.f(this.e, eVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.f271938c.hashCode() + p.a.c(this.f271936a.hashCode() * 31, 31, this.f271937b)) * 31)) * 31;
        Map map = this.e;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public e(String screenId, String campaignId, d slotType, akd.a actionType, Map map) {
        Intrinsics.checkNotNullParameter(screenId, "screenId");
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(slotType, "slotType");
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        this.f271936a = screenId;
        this.f271937b = campaignId;
        this.f271938c = slotType;
        this.d = actionType;
        this.e = map;
    }
}
