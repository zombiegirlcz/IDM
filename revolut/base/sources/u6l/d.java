package u6l;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\"\u0010!\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R \u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b\u0006\u0010 R\u001c\u0010%\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010$\u001a\u0004\b\u000b\u0010\u0004R\u001c\u0010'\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010$\u001a\u0004\b&\u0010\u0004¨\u0006("}, d2 = {"Lu6l/d;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "f", "()Z", "locationSecurityEnabled", "b", "c", "ecommerceDisabled", "Lu6l/m;", "Lu6l/m;", "i", "()Lu6l/m;", "securityOptions", "Ljo3/b;", "d", "Ljo3/b;", "e", "()Ljo3/b;", "limit", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "initial", "", "Lu6l/h;", "Ljava/util/List;", "h", "()Ljava/util/List;", "pockets", "g", "accountsAvailableForBinding", "Ljava/lang/String;", "bindingStrategy", "getLabel", "label", "feature_shared_cards_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("locationSecurityEnabled")
    private final boolean locationSecurityEnabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("ecommerceDisabled")
    private final boolean ecommerceDisabled;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("securityOptions")
    private final m securityOptions;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("limit")
    private final jo3.b limit;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("initial")
    private final Boolean initial;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("pockets")
    private final List<h> pockets;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("accountsAvailableForBinding")
    @NotNull
    private final List<String> accountsAvailableForBinding;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("bindingStrategy")
    private final String bindingStrategy;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("label")
    private final String label;

    public d(boolean z, boolean z3, m mVar, jo3.b bVar, Boolean bool, ArrayList arrayList, ArrayList accountsAvailableForBinding, String str, String str2) {
        Intrinsics.checkNotNullParameter(accountsAvailableForBinding, "accountsAvailableForBinding");
        this.locationSecurityEnabled = z;
        this.ecommerceDisabled = z3;
        this.securityOptions = mVar;
        this.limit = bVar;
        this.initial = bool;
        this.pockets = arrayList;
        this.accountsAvailableForBinding = accountsAvailableForBinding;
        this.bindingStrategy = str;
        this.label = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getAccountsAvailableForBinding() {
        return this.accountsAvailableForBinding;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBindingStrategy() {
        return this.bindingStrategy;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getEcommerceDisabled() {
        return this.ecommerceDisabled;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Boolean getInitial() {
        return this.initial;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final jo3.b getLimit() {
        return this.limit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.locationSecurityEnabled == dVar.locationSecurityEnabled && this.ecommerceDisabled == dVar.ecommerceDisabled && Intrinsics.f(this.securityOptions, dVar.securityOptions) && Intrinsics.f(this.limit, dVar.limit) && Intrinsics.f(this.initial, dVar.initial) && Intrinsics.f(this.pockets, dVar.pockets) && Intrinsics.f(this.accountsAvailableForBinding, dVar.accountsAvailableForBinding) && Intrinsics.f(this.bindingStrategy, dVar.bindingStrategy) && Intrinsics.f(this.label, dVar.label);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getLocationSecurityEnabled() {
        return this.locationSecurityEnabled;
    }

    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final List getPockets() {
        return this.pockets;
    }

    public final int hashCode() {
        int iC = j6.a.c(Boolean.hashCode(this.locationSecurityEnabled) * 31, 31, this.ecommerceDisabled);
        m mVar = this.securityOptions;
        int iHashCode = (iC + (mVar == null ? 0 : mVar.hashCode())) * 31;
        jo3.b bVar = this.limit;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Boolean bool = this.initial;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<h> list = this.pockets;
        int iD = p.a.d((iHashCode3 + (list == null ? 0 : list.hashCode())) * 31, 31, this.accountsAvailableForBinding);
        String str = this.bindingStrategy;
        int iHashCode4 = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.label;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final m getSecurityOptions() {
        return this.securityOptions;
    }
}
