package zbj;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class y implements z {

    @NotNull
    public static final x Companion = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f320947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f320948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f320949c;
    public final od0.i d;
    public final od0.i e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jbj.a f320950g;

    public y(xi0.b currency, Data addressData, Data blockchains, od0.i selectedBlockchain, od0.i minimumDeposit, boolean z, jbj.a aVar) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(addressData, "addressData");
        Intrinsics.checkNotNullParameter(blockchains, "blockchains");
        Intrinsics.checkNotNullParameter(selectedBlockchain, "selectedBlockchain");
        Intrinsics.checkNotNullParameter(minimumDeposit, "minimumDeposit");
        this.f320947a = currency;
        this.f320948b = addressData;
        this.f320949c = blockchains;
        this.d = selectedBlockchain;
        this.e = minimumDeposit;
        this.f = z;
        this.f320950g = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f320947a, yVar.f320947a) && Intrinsics.f(this.f320948b, yVar.f320948b) && Intrinsics.f(this.f320949c, yVar.f320949c) && Intrinsics.f(this.d, yVar.d) && Intrinsics.f(this.e, yVar.e) && this.f == yVar.f && Intrinsics.f(this.f320950g, yVar.f320950g);
    }

    public final int hashCode() {
        int iC = j6.a.c(r6.b.f(this.e, r6.b.f(this.d, kii.e.c(this.f320949c, kii.e.c(this.f320948b, this.f320947a.hashCode() * 31, 31), 31), 31), 31), 31, this.f);
        jbj.a aVar = this.f320950g;
        return iC + (aVar == null ? 0 : aVar.hashCode());
    }
}
