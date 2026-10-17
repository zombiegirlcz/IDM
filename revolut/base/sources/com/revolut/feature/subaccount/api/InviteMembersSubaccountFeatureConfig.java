package com.revolut.feature.subaccount.api;

import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subaccount/api/InviteMembersSubaccountFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_subaccount_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InviteMembersSubaccountFeatureConfig extends KompotBridgeFeatureConfig {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f88936g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f88937h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InviteMembersSubaccountFeatureConfig(String groupId, List members) {
        super((ActivityAnimation) null, (ParcelableDestination) new InviteMembersSubaccountDestination(groupId, members), false, (Integer) null, 0, 61);
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(members, "members");
        this.f88936g = groupId;
        this.f88937h = members;
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InviteMembersSubaccountFeatureConfig)) {
            return false;
        }
        InviteMembersSubaccountFeatureConfig inviteMembersSubaccountFeatureConfig = (InviteMembersSubaccountFeatureConfig) obj2;
        return Intrinsics.f(this.f88936g, inviteMembersSubaccountFeatureConfig.f88936g) && Intrinsics.f(this.f88937h, inviteMembersSubaccountFeatureConfig.f88937h);
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final int hashCode() {
        return this.f88937h.hashCode() + (this.f88936g.hashCode() * 31);
    }
}
