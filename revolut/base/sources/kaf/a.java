package kaf;

import cli.j;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferBroker;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferUserAccountInformation;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferBroker f182480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferUserAccountInformation f182481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f182482c;
    public final boolean d;
    public final boolean e;

    public a(TransferBroker selectedBroker, TransferUserAccountInformation userAccountInformation, List selectedAssets, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(selectedBroker, "selectedBroker");
        Intrinsics.checkNotNullParameter(userAccountInformation, "userAccountInformation");
        Intrinsics.checkNotNullParameter(selectedAssets, "selectedAssets");
        this.f182480a = selectedBroker;
        this.f182481b = userAccountInformation;
        this.f182482c = selectedAssets;
        this.d = z;
        this.e = z3;
    }

    public static a a(a aVar, boolean z) {
        TransferBroker selectedBroker = aVar.f182480a;
        TransferUserAccountInformation userAccountInformation = aVar.f182481b;
        List selectedAssets = aVar.f182482c;
        boolean z3 = aVar.d;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(selectedBroker, "selectedBroker");
        Intrinsics.checkNotNullParameter(userAccountInformation, "userAccountInformation");
        Intrinsics.checkNotNullParameter(selectedAssets, "selectedAssets");
        return new a(selectedBroker, userAccountInformation, selectedAssets, z3, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f182480a, aVar.f182480a) && Intrinsics.f(this.f182481b, aVar.f182481b) && Intrinsics.f(this.f182482c, aVar.f182482c) && this.d == aVar.d && this.e == aVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(p.a.d((this.f182481b.hashCode() + (this.f182480a.hashCode() * 31)) * 31, 31, this.f182482c), 31, this.d);
    }
}
