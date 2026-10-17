package wp9;

import com.revolut.data.model.Data;
import com.revolut.feature.payments.bills_chooser.api.splits.SplitMembersType;
import com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary.SplitBillsSummaryScreenContract$SplitSummaryTab;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class v implements cli.j {

    @NotNull
    public static final u Companion = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f299202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f299203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SplitBillsSummaryScreenContract$SplitSummaryTab f299204c;
    public final SplitMembersType d;
    public final boolean e;
    public final r f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x f299205g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k71.q f299206h;

    public v(Data user, b0 distribution, SplitBillsSummaryScreenContract$SplitSummaryTab splitTab, SplitMembersType members, boolean z, r buttonState, x itemizationState, k71.q transactionsExtraData) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(distribution, "distribution");
        Intrinsics.checkNotNullParameter(splitTab, "splitTab");
        Intrinsics.checkNotNullParameter(members, "members");
        Intrinsics.checkNotNullParameter(buttonState, "buttonState");
        Intrinsics.checkNotNullParameter(itemizationState, "itemizationState");
        Intrinsics.checkNotNullParameter(transactionsExtraData, "transactionsExtraData");
        this.f299202a = user;
        this.f299203b = distribution;
        this.f299204c = splitTab;
        this.d = members;
        this.e = z;
        this.f = buttonState;
        this.f299205g = itemizationState;
        this.f299206h = transactionsExtraData;
    }

    public static v a(v vVar, Data data, b0 b0Var, SplitBillsSummaryScreenContract$SplitSummaryTab splitBillsSummaryScreenContract$SplitSummaryTab, SplitMembersType splitMembersType, r rVar, x xVar, k71.q qVar, int i) {
        if ((i & 1) != 0) {
            data = vVar.f299202a;
        }
        Data user = data;
        if ((i & 2) != 0) {
            b0Var = vVar.f299203b;
        }
        b0 distribution = b0Var;
        if ((i & 4) != 0) {
            splitBillsSummaryScreenContract$SplitSummaryTab = vVar.f299204c;
        }
        SplitBillsSummaryScreenContract$SplitSummaryTab splitTab = splitBillsSummaryScreenContract$SplitSummaryTab;
        if ((i & 8) != 0) {
            splitMembersType = vVar.d;
        }
        SplitMembersType members = splitMembersType;
        boolean z = vVar.e;
        if ((i & 32) != 0) {
            rVar = vVar.f;
        }
        r buttonState = rVar;
        if ((i & 64) != 0) {
            xVar = vVar.f299205g;
        }
        x itemizationState = xVar;
        k71.q transactionsExtraData = (i & 128) != 0 ? vVar.f299206h : qVar;
        vVar.getClass();
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(distribution, "distribution");
        Intrinsics.checkNotNullParameter(splitTab, "splitTab");
        Intrinsics.checkNotNullParameter(members, "members");
        Intrinsics.checkNotNullParameter(buttonState, "buttonState");
        Intrinsics.checkNotNullParameter(itemizationState, "itemizationState");
        Intrinsics.checkNotNullParameter(transactionsExtraData, "transactionsExtraData");
        return new v(user, distribution, splitTab, members, z, buttonState, itemizationState, transactionsExtraData);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f299202a, vVar.f299202a) && Intrinsics.f(this.f299203b, vVar.f299203b) && Intrinsics.f(this.f299204c, vVar.f299204c) && Intrinsics.f(this.d, vVar.d) && this.e == vVar.e && Intrinsics.f(this.f, vVar.f) && Intrinsics.f(this.f299205g, vVar.f299205g) && Intrinsics.f(this.f299206h, vVar.f299206h);
    }

    public final int hashCode() {
        return this.f299206h.hashCode() + ((this.f299205g.hashCode() + ((this.f.hashCode() + j6.a.c((this.d.hashCode() + ((this.f299204c.hashCode() + ((this.f299203b.hashCode() + (this.f299202a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e)) * 31)) * 31);
    }
}
