package d14;

import d14.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u0006\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\f\u0010\u0017¨\u0006\u0019"}, d2 = {"Ld14/i;", "Ld14/l;", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "d", "()Z", "revolutAccountAvailable", "Ld14/h$d;", "b", "Ld14/h$d;", "c", "()Ld14/h$d;", "consents", "Ld14/h$b;", "Ld14/h$b;", "()Ld14/h$b;", "bankSelection", "Ld14/h$c;", "Ld14/h$c;", "()Ld14/h$c;", "cantFindBankPopup", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class i implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("revolutAccountAvailable")
    private final boolean revolutAccountAvailable;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("consents")
    @NotNull
    private final h.d consents;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("bankSelection")
    @NotNull
    private final h.b bankSelection;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("cantFindBankPopup")
    @NotNull
    private final h.c cantFindBankPopup;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final h.b getBankSelection() {
        return this.bankSelection;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final h.c getCantFindBankPopup() {
        return this.cantFindBankPopup;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final h.d getConsents() {
        return this.consents;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getRevolutAccountAvailable() {
        return this.revolutAccountAvailable;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.revolutAccountAvailable == iVar.revolutAccountAvailable && Intrinsics.f(this.consents, iVar.consents) && Intrinsics.f(this.bankSelection, iVar.bankSelection) && Intrinsics.f(this.cantFindBankPopup, iVar.cantFindBankPopup);
    }

    public final int hashCode() {
        return this.cantFindBankPopup.hashCode() + ((this.bankSelection.hashCode() + ((this.consents.hashCode() + (Boolean.hashCode(this.revolutAccountAvailable) * 31)) * 31)) * 31);
    }
}
