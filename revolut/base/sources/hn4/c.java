package hn4;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\u000f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000b\u0010\u0013R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017¨\u0006\u0019"}, d2 = {"Lhn4/c;", "", "", "toString", "()Ljava/lang/String;", "Lhn4/e;", "a", "Lhn4/e;", "()Lhn4/e;", "prompt", "Lio4/g;", "b", "Lio4/g;", "d", "()Lio4/g;", "withdrawalNotice", "Lhn4/f;", "c", "Lhn4/f;", "()Lhn4/f;", "successSheet", "Lhn4/d;", "Lhn4/d;", "()Lhn4/d;", "terminatedRepayment", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("prompt")
    @NotNull
    private final e prompt;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("withdrawalNotice")
    @NotNull
    private final io4.g withdrawalNotice;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("successSheet")
    @NotNull
    private final f successSheet;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("terminatedRepayment")
    private final d terminatedRepayment;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final e getPrompt() {
        return this.prompt;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final f getSuccessSheet() {
        return this.successSheet;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final d getTerminatedRepayment() {
        return this.terminatedRepayment;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final io4.g getWithdrawalNotice() {
        return this.withdrawalNotice;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.prompt, cVar.prompt) && Intrinsics.f(this.withdrawalNotice, cVar.withdrawalNotice) && Intrinsics.f(this.successSheet, cVar.successSheet) && Intrinsics.f(this.terminatedRepayment, cVar.terminatedRepayment);
    }

    public final int hashCode() {
        int iHashCode = (this.successSheet.hashCode() + ((this.withdrawalNotice.hashCode() + (this.prompt.hashCode() * 31)) * 31)) * 31;
        d dVar = this.terminatedRepayment;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}
