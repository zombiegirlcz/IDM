package v03;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wy2.c f284715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f284716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f284717c;
    public final i93.e d;
    public final i93.l e;

    public e(wy2.c flowType, String cardId, dj0.d dVar, i93.e cardSettingsType, i93.l transactionLimit) {
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(cardSettingsType, "cardSettingsType");
        Intrinsics.checkNotNullParameter(transactionLimit, "transactionLimit");
        this.f284715a = flowType;
        this.f284716b = cardId;
        this.f284717c = dVar;
        this.d = cardSettingsType;
        this.e = transactionLimit;
    }

    public static e a(e eVar, dj0.d dVar) {
        wy2.c flowType = eVar.f284715a;
        String cardId = eVar.f284716b;
        i93.e cardSettingsType = eVar.d;
        i93.l transactionLimit = eVar.e;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(cardSettingsType, "cardSettingsType");
        Intrinsics.checkNotNullParameter(transactionLimit, "transactionLimit");
        return new e(flowType, cardId, dVar, cardSettingsType, transactionLimit);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f284715a == eVar.f284715a && Intrinsics.f(this.f284716b, eVar.f284716b) && Intrinsics.f(this.f284717c, eVar.f284717c) && this.d == eVar.d && Intrinsics.f(this.e, eVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f284715a.hashCode() * 31, 31, this.f284716b);
        dj0.d dVar = this.f284717c;
        return this.e.hashCode() + ((this.d.hashCode() + ((iC + (dVar == null ? 0 : dVar.hashCode())) * 31)) * 31);
    }
}
