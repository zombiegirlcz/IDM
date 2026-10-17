package sxa;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f266390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f266391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f266392c;
    public final c d;
    public final c e;
    public final c f;

    public f(String id10, b emptyChat, a chat, c beneficiaryProfile, c transactionDetails, c transactionFee) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(emptyChat, "emptyChat");
        Intrinsics.checkNotNullParameter(chat, "chat");
        Intrinsics.checkNotNullParameter(beneficiaryProfile, "beneficiaryProfile");
        Intrinsics.checkNotNullParameter(transactionDetails, "transactionDetails");
        Intrinsics.checkNotNullParameter(transactionFee, "transactionFee");
        this.f266390a = id10;
        this.f266391b = emptyChat;
        this.f266392c = chat;
        this.d = beneficiaryProfile;
        this.e = transactionDetails;
        this.f = transactionFee;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f266390a, fVar.f266390a) && Intrinsics.f(this.f266391b, fVar.f266391b) && Intrinsics.f(this.f266392c, fVar.f266392c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && Intrinsics.f(this.f, fVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.f266392c.hashCode() + ((this.f266391b.hashCode() + (this.f266390a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
