package com.revolut.feature.remote_stories.models.keys;

import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/remote_stories/models/keys/RemoteStoriesKey;", "Landroid/os/Parcelable;", "feature_remote_stories_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RemoteStoriesKey extends Parcelable {
    String e8();

    String getProductName();

    default boolean x9() {
        return true;
    }

    String z1();
}
