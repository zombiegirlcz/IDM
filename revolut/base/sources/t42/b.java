package t42;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferContract$InputData;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferDirection;
import com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmTransferDirection f267837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ApmTransferContract$InputData.FooterConfig f267838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TransferData f267839c;
    public final c d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f267840g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Clause f267841h;

    public b(ApmTransferDirection direction, ApmTransferContract$InputData.FooterConfig footerConfig, TransferData transferData, c extraData, boolean z, boolean z3, int i, Clause clause) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        this.f267837a = direction;
        this.f267838b = footerConfig;
        this.f267839c = transferData;
        this.d = extraData;
        this.e = z;
        this.f = z3;
        this.f267840g = i;
        this.f267841h = clause;
    }

    public static b a(b bVar, TransferData transferData, c cVar, int i, Clause clause, int i2) {
        ApmTransferDirection direction = bVar.f267837a;
        ApmTransferContract$InputData.FooterConfig footerConfig = bVar.f267838b;
        if ((i2 & 4) != 0) {
            transferData = bVar.f267839c;
        }
        TransferData transferData2 = transferData;
        if ((i2 & 8) != 0) {
            cVar = bVar.d;
        }
        c extraData = cVar;
        boolean z = bVar.e;
        boolean z3 = bVar.f;
        if ((i2 & 64) != 0) {
            i = bVar.f267840g;
        }
        int i3 = i;
        if ((i2 & 128) != 0) {
            clause = bVar.f267841h;
        }
        bVar.getClass();
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        return new b(direction, footerConfig, transferData2, extraData, z, z3, i3, clause);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f267837a, bVar.f267837a) && Intrinsics.f(this.f267838b, bVar.f267838b) && Intrinsics.f(this.f267839c, bVar.f267839c) && Intrinsics.f(this.d, bVar.d) && this.e == bVar.e && this.f == bVar.f && this.f267840g == bVar.f267840g && Intrinsics.f(this.f267841h, bVar.f267841h);
    }

    public final int hashCode() {
        int iHashCode = this.f267837a.hashCode() * 31;
        ApmTransferContract$InputData.FooterConfig footerConfig = this.f267838b;
        int iHashCode2 = (iHashCode + (footerConfig == null ? 0 : footerConfig.hashCode())) * 31;
        TransferData transferData = this.f267839c;
        int iB = j6.a.b(this.f267840g, j6.a.c(j6.a.c((this.d.hashCode() + ((iHashCode2 + (transferData == null ? 0 : transferData.hashCode())) * 31)) * 31, 31, this.e), 31, this.f), 31);
        Clause clause = this.f267841h;
        return iB + (clause != null ? clause.hashCode() : 0);
    }
}
