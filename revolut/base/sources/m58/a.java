package m58;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f202848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f202849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f202850c;
    public final Data d;

    public a() {
        this(0);
    }

    public static a a(a aVar, Data amount, Data jointPocket, Data targetPersonalPocket, Data amountInputVerificationData, int i) {
        if ((i & 1) != 0) {
            amount = aVar.f202848a;
        }
        if ((i & 2) != 0) {
            jointPocket = aVar.f202849b;
        }
        if ((i & 4) != 0) {
            targetPersonalPocket = aVar.f202850c;
        }
        if ((i & 8) != 0) {
            amountInputVerificationData = aVar.d;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(jointPocket, "jointPocket");
        Intrinsics.checkNotNullParameter(targetPersonalPocket, "targetPersonalPocket");
        Intrinsics.checkNotNullParameter(amountInputVerificationData, "amountInputVerificationData");
        return new a(amount, jointPocket, targetPersonalPocket, amountInputVerificationData);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f202848a, aVar.f202848a) && Intrinsics.f(this.f202849b, aVar.f202849b) && Intrinsics.f(this.f202850c, aVar.f202850c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + kii.e.c(this.f202850c, kii.e.c(this.f202849b, this.f202848a.hashCode() * 31, 31), 31);
    }

    public a(Data amount, Data jointPocket, Data targetPersonalPocket, Data amountInputVerificationData) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(jointPocket, "jointPocket");
        Intrinsics.checkNotNullParameter(targetPersonalPocket, "targetPersonalPocket");
        Intrinsics.checkNotNullParameter(amountInputVerificationData, "amountInputVerificationData");
        this.f202848a = amount;
        this.f202849b = jointPocket;
        this.f202850c = targetPersonalPocket;
        this.d = amountInputVerificationData;
    }

    public /* synthetic */ a(int i) {
        this(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null));
    }
}
