package com.revolut.retail.core.navigation;

import android.os.Parcelable;
import kotlin.Metadata;
import yhm.d;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000e\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/revolut/retail/core/navigation/NaviCommand;", "Landroid/os/Parcelable;", "<init>", "()V", "Lcom/revolut/retail/core/navigation/ActivityNavigateCommand;", "Lcom/revolut/retail/core/navigation/BaseFragmentNavigateCommand;", "Lcom/revolut/retail/core/navigation/BrowserCommand;", "Lcom/revolut/retail/core/navigation/CollapseApplicationCommand;", "Lcom/revolut/retail/core/navigation/CompositeCommand;", "Lcom/revolut/retail/core/navigation/DeeplinkNavigateCommand;", "Lcom/revolut/retail/core/navigation/DummyCommand;", "Lcom/revolut/retail/core/navigation/FeatureCommand;", "Lcom/revolut/retail/core/navigation/FinishCommand;", "Lcom/revolut/retail/core/navigation/FinishFlowCommand;", "Lcom/revolut/retail/core/navigation/FinishFragmentNavigateCommand;", "Lcom/revolut/retail/core/navigation/IntentCommand;", "Lcom/revolut/retail/core/navigation/IntentSenderCommand;", "Lcom/revolut/retail/core/navigation/RestartApplicationCommand;", "retail_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public abstract class NaviCommand implements Parcelable {
    private NaviCommand() {
    }
}
