package dh4;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f114744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ax4.b f114745b;

    public f(ax4.b constructorState, Data accountDetails) {
        Intrinsics.checkNotNullParameter(accountDetails, "accountDetails");
        Intrinsics.checkNotNullParameter(constructorState, "constructorState");
        this.f114744a = accountDetails;
        this.f114745b = constructorState;
    }

    public static f a(f fVar, Data accountDetails, ax4.b constructorState, int i) {
        if ((i & 1) != 0) {
            accountDetails = fVar.f114744a;
        }
        if ((i & 2) != 0) {
            constructorState = fVar.f114745b;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(accountDetails, "accountDetails");
        Intrinsics.checkNotNullParameter(constructorState, "constructorState");
        return new f(constructorState, accountDetails);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f114744a, fVar.f114744a) && Intrinsics.f(this.f114745b, fVar.f114745b);
    }

    public final int hashCode() {
        return this.f114745b.hashCode() + (this.f114744a.hashCode() * 31);
    }

    public /* synthetic */ f(Data data) {
        this(new ax4.b(0), data);
    }
}
