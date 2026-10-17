package i2l;

import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class q implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f158038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f158039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f158040c;
    public final boolean d;
    public final AnimationRequest e;

    public q() {
        this(0);
    }

    public static q a(q qVar, Data data, Data data2, List list, boolean z, AnimationRequest animationRequest, int i) {
        if ((i & 1) != 0) {
            data = qVar.f158038a;
        }
        Data partnerLayout = data;
        if ((i & 2) != 0) {
            data2 = qVar.f158039b;
        }
        Data transactions = data2;
        if ((i & 4) != 0) {
            list = qVar.f158040c;
        }
        List helpItems = list;
        if ((i & 8) != 0) {
            z = qVar.d;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            animationRequest = qVar.e;
        }
        qVar.getClass();
        Intrinsics.checkNotNullParameter(partnerLayout, "partnerLayout");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(helpItems, "helpItems");
        return new q(partnerLayout, transactions, helpItems, z3, animationRequest);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f158038a, qVar.f158038a) && Intrinsics.f(this.f158039b, qVar.f158039b) && Intrinsics.f(this.f158040c, qVar.f158040c) && this.d == qVar.d && Intrinsics.f(this.e, qVar.e);
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.d(kii.e.c(this.f158039b, this.f158038a.hashCode() * 31, 31), 31, this.f158040c), 31, this.d);
        AnimationRequest animationRequest = this.e;
        return iC + (animationRequest == null ? 0 : animationRequest.hashCode());
    }

    public q(Data partnerLayout, Data transactions, List helpItems, boolean z, AnimationRequest animationRequest) {
        Intrinsics.checkNotNullParameter(partnerLayout, "partnerLayout");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(helpItems, "helpItems");
        this.f158038a = partnerLayout;
        this.f158039b = transactions;
        this.f158040c = helpItems;
        this.d = z;
        this.e = animationRequest;
    }

    public q(int i) {
        this(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), zhm.f0.f322471a, false, null);
    }
}
