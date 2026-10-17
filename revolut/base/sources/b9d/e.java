package b9d;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f13716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f13717c;
    public final boolean d;
    public final String e;

    public e(String entityId, Data card, Data actions, boolean z, String str) {
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f13715a = entityId;
        this.f13716b = card;
        this.f13717c = actions;
        this.d = z;
        this.e = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f13715a, eVar.f13715a) && Intrinsics.f(this.f13716b, eVar.f13716b) && Intrinsics.f(this.f13717c, eVar.f13717c) && this.d == eVar.d && Intrinsics.f(this.e, eVar.e);
    }

    public final int hashCode() {
        int iC = j6.a.c(kii.e.c(this.f13717c, kii.e.c(this.f13716b, this.f13715a.hashCode() * 31, 31), 31), 31, this.d);
        String str = this.e;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
