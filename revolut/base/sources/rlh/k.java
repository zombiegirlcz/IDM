package rlh;

import android.os.Parcelable;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth.ui.impl.recurring_buy_hub_collection.RecurringBuyHubCollectionScreenContract$RetainedState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k extends t {
    @Override // cli.i
    public final Parcelable a(Object obj2) {
        n currentState = (n) obj2;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        return new RecurringBuyHubCollectionScreenContract$RetainedState((c0h.b) currentState.f255066b.getContent());
    }

    @Override // cli.i
    public final Object b(Object obj2, Parcelable parcelable) {
        n initialState = (n) obj2;
        RecurringBuyHubCollectionScreenContract$RetainedState retainedState = (RecurringBuyHubCollectionScreenContract$RetainedState) parcelable;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        c0h.b bVar = retainedState.f96022a;
        Data selectedCollectionId = bVar != null ? new Data(bVar, null, false, 6, null) : new Data(null, null, true, 3, null);
        Data collections = initialState.f255065a;
        Intrinsics.checkNotNullParameter(collections, "collections");
        Intrinsics.checkNotNullParameter(selectedCollectionId, "selectedCollectionId");
        return new n(collections, selectedCollectionId);
    }
}
