package sef;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f262187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f262188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f262189c;

    public f(Data noteData, String transactionId, String message) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(noteData, "noteData");
        this.f262187a = transactionId;
        this.f262188b = message;
        this.f262189c = noteData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f262187a, fVar.f262187a) && Intrinsics.f(this.f262188b, fVar.f262188b) && Intrinsics.f(this.f262189c, fVar.f262189c);
    }

    public final int hashCode() {
        return this.f262189c.hashCode() + p.a.c(this.f262187a.hashCode() * 31, 31, this.f262188b);
    }
}
