package com.revolut.chat.ui.messageslist;

import android.os.Parcelable;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/chat/ui/messageslist/AirTipPropagationTrackableItem;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class AirTipPropagationTrackableItem implements TrackableItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Parcelable f51173a;

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
    public final Parcelable getF51173a() {
        return this.f51173a;
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public final void setAnalyticsContext(Parcelable parcelable) {
        this.f51173a = parcelable;
    }
}
