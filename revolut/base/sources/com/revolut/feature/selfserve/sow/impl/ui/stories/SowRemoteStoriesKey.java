package com.revolut.feature.selfserve.sow.impl.ui.stories;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.remote_stories.models.keys.RemoteStoriesKey;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0081\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007j\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/revolut/feature/selfserve/sow/impl/ui/stories/SowRemoteStoriesKey;", "Lcom/revolut/feature/remote_stories/models/keys/RemoteStoriesKey;", "", "", "productName", "Ljava/lang/String;", "getProductName", "()Ljava/lang/String;", "storyName", "z1", "storyVariant", "e8", "SOW_HARD_LOCK", "SOW_SOFT_LOCK", "SOW_NON_LOCK", "feature_selfserve_sow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SowRemoteStoriesKey implements RemoteStoriesKey {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SowRemoteStoriesKey[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<SowRemoteStoriesKey> CREATOR;
    public static final SowRemoteStoriesKey SOW_HARD_LOCK;
    public static final SowRemoteStoriesKey SOW_NON_LOCK;
    public static final SowRemoteStoriesKey SOW_SOFT_LOCK;

    @NotNull
    private final String productName = "alerts";

    @NotNull
    private final String storyName = "sow";
    private final String storyVariant;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return SowRemoteStoriesKey.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SowRemoteStoriesKey[i];
        }
    }

    static {
        SowRemoteStoriesKey sowRemoteStoriesKey = new SowRemoteStoriesKey("SOW_HARD_LOCK", 0, "hard-lock");
        SOW_HARD_LOCK = sowRemoteStoriesKey;
        SowRemoteStoriesKey sowRemoteStoriesKey2 = new SowRemoteStoriesKey("SOW_SOFT_LOCK", 1, "soft-lock");
        SOW_SOFT_LOCK = sowRemoteStoriesKey2;
        SowRemoteStoriesKey sowRemoteStoriesKey3 = new SowRemoteStoriesKey("SOW_NON_LOCK", 2, "non-lock");
        SOW_NON_LOCK = sowRemoteStoriesKey3;
        SowRemoteStoriesKey[] sowRemoteStoriesKeyArr = {sowRemoteStoriesKey, sowRemoteStoriesKey2, sowRemoteStoriesKey3};
        $VALUES = sowRemoteStoriesKeyArr;
        $ENTRIES = s.n(sowRemoteStoriesKeyArr);
        CREATOR = new a();
    }

    public SowRemoteStoriesKey(String str, int i, String str2) {
        this.storyVariant = str2;
    }

    public static SowRemoteStoriesKey valueOf(String str) {
        return (SowRemoteStoriesKey) Enum.valueOf(SowRemoteStoriesKey.class, str);
    }

    public static SowRemoteStoriesKey[] values() {
        return (SowRemoteStoriesKey[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.revolut.feature.remote_stories.models.keys.RemoteStoriesKey
    /* JADX INFO: renamed from: e8, reason: from getter */
    public final String getStoryVariant() {
        return this.storyVariant;
    }

    @Override // com.revolut.feature.remote_stories.models.keys.RemoteStoriesKey
    public final String getProductName() {
        return this.productName;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }

    @Override // com.revolut.feature.remote_stories.models.keys.RemoteStoriesKey
    /* JADX INFO: renamed from: z1, reason: from getter */
    public final String getStoryName() {
        return this.storyName;
    }
}
