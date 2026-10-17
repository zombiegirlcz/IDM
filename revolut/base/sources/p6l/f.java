package p6l;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\f\u0010\u0014R\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0003\u0010\u0014R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\b\u0010\u0019¨\u0006\u001b"}, d2 = {"Lp6l/f;", "", "", "a", "Z", "f", "()Z", "isLocationSecurityEnabled", "b", "e", "isEcommerceDisabled", "Lp6l/u;", "c", "Lp6l/u;", "d", "()Lp6l/u;", "securityOptions", "", "Lp6l/m;", "Ljava/util/List;", "()Ljava/util/List;", "pockets", "", "accountsAvailableForBinding", "Ljava/lang/String;", "()Ljava/lang/String;", "bindingStrategy", "feature_shared_cards_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("locationSecurityEnabled")
    private final boolean isLocationSecurityEnabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("ecommerceDisabled")
    private final boolean isEcommerceDisabled;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("securityOptions")
    private final u securityOptions;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("pockets")
    private final List<m> pockets;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("accountsAvailableForBinding")
    private final List<String> accountsAvailableForBinding;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("bindingStrategy")
    private final String bindingStrategy;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getAccountsAvailableForBinding() {
        return this.accountsAvailableForBinding;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBindingStrategy() {
        return this.bindingStrategy;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getPockets() {
        return this.pockets;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final u getSecurityOptions() {
        return this.securityOptions;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsEcommerceDisabled() {
        return this.isEcommerceDisabled;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsLocationSecurityEnabled() {
        return this.isLocationSecurityEnabled;
    }
}
