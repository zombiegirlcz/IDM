package com.revolut.feature.freelancer.impl.network.models;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014R\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\f\u0010\u0014R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u0006\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/revolut/feature/freelancer/impl/network/models/b;", "", "", "toString", "()Ljava/lang/String;", "Lcom/revolut/feature/freelancer/impl/network/models/p0;", "a", "Lcom/revolut/feature/freelancer/impl/network/models/p0;", "f", "()Lcom/revolut/feature/freelancer/impl/network/models/p0;", "settings", "Lcom/revolut/feature/freelancer/impl/network/models/j0;", "b", "Lcom/revolut/feature/freelancer/impl/network/models/j0;", "e", "()Lcom/revolut/feature/freelancer/impl/network/models/j0;", "permissions", "", "c", "Ljava/util/List;", "()Ljava/util/List;", "eligiblePaymentMethods", "d", "enabledFeatures", "Lcom/revolut/feature/freelancer/impl/network/models/m;", "disabledFeatures", "Lcom/revolut/feature/freelancer/impl/network/models/a;", "Lcom/revolut/feature/freelancer/impl/network/models/a;", "()Lcom/revolut/feature/freelancer/impl/network/models/a;", "accountClosure", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("settings")
    @NotNull
    private final p0 settings;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("permissions")
    @NotNull
    private final j0 permissions;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("eligiblePaymentMethods")
    private final List<String> eligiblePaymentMethods;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("enabledFeatures")
    private final List<String> enabledFeatures;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("disabledReasons")
    private final List<m> disabledFeatures;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("accountClosure")
    private final a accountClosure;

    public b(p0 settings, j0 permissions, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, a aVar) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        this.settings = settings;
        this.permissions = permissions;
        this.eligiblePaymentMethods = arrayList;
        this.enabledFeatures = arrayList2;
        this.disabledFeatures = arrayList3;
        this.accountClosure = aVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getAccountClosure() {
        return this.accountClosure;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getDisabledFeatures() {
        return this.disabledFeatures;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getEligiblePaymentMethods() {
        return this.eligiblePaymentMethods;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getEnabledFeatures() {
        return this.enabledFeatures;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final j0 getPermissions() {
        return this.permissions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.settings, bVar.settings) && Intrinsics.f(this.permissions, bVar.permissions) && Intrinsics.f(this.eligiblePaymentMethods, bVar.eligiblePaymentMethods) && Intrinsics.f(this.enabledFeatures, bVar.enabledFeatures) && Intrinsics.f(this.disabledFeatures, bVar.disabledFeatures) && Intrinsics.f(this.accountClosure, bVar.accountClosure);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final p0 getSettings() {
        return this.settings;
    }

    public final int hashCode() {
        int iHashCode = (this.permissions.hashCode() + (this.settings.hashCode() * 31)) * 31;
        List<String> list = this.eligiblePaymentMethods;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.enabledFeatures;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<m> list3 = this.disabledFeatures;
        int iHashCode4 = (iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        a aVar = this.accountClosure;
        return iHashCode4 + (aVar != null ? aVar.hashCode() : 0);
    }
}
