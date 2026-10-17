package com.revolut.feature.pix.api.navigation;

import com.revolut.feature.pix.api.navigation.PixNavigation$InputData;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.InternalDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/pix/api/navigation/PixNavigation$Destination", "Lcom/revolut/feature/pix/api/navigation/PixNavigation$InputData;", "INPUT", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PixNavigation$Destination<INPUT extends PixNavigation$InputData> extends InternalDestination<INPUT> implements KompotDestination {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PixNavigation$InputData f80510b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PixNavigation$Destination(PixNavigation$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f80510b = inputData;
    }

    @Override // com.revolut.kompot.common.InternalDestination
    /* JADX INFO: renamed from: c, reason: from getter and merged with bridge method [inline-methods] */
    public PixNavigation$InputData getF98300a() {
        return this.f80510b;
    }
}
