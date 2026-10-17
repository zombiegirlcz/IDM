package st9;

import ip0.v7;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import okl.m;
import oq9.o;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f265542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f265543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f265544c;
    public final dj0.d d;
    public final dj0.d e;
    public final o f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f265545g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f265546h;

    public e(String id10, String groupId, d state, dj0.d amount, dj0.d displayAmount, o payee, o payer, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(displayAmount, "displayAmount");
        Intrinsics.checkNotNullParameter(payee, "payee");
        Intrinsics.checkNotNullParameter(payer, "payer");
        this.f265542a = id10;
        this.f265543b = groupId;
        this.f265544c = state;
        this.d = amount;
        this.e = displayAmount;
        this.f = payee;
        this.f265545g = payer;
        this.f265546h = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f265542a, eVar.f265542a) && Intrinsics.f(this.f265543b, eVar.f265543b) && this.f265544c == eVar.f265544c && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f) && Intrinsics.f(this.f265545g, eVar.f265545g) && this.f265546h == eVar.f265546h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f265546h) + m.d(this.f265545g, m.d(this.f, v7.c(v7.c((this.f265544c.hashCode() + p.a.c(this.f265542a.hashCode() * 31, 31, this.f265543b)) * 31, 31, this.d), 31, this.e), 31), 31);
    }
}
