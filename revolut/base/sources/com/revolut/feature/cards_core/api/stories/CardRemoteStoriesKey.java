package com.revolut.feature.cards_core.api.stories;

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
/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0081\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007j\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/revolut/feature/cards_core/api/stories/CardRemoteStoriesKey;", "Lcom/revolut/feature/remote_stories/models/keys/RemoteStoriesKey;", "", "", "productName", "Ljava/lang/String;", "getProductName", "()Ljava/lang/String;", "storyName", "z1", "storyVariant", "e8", "BIG_TILE", "feature_cards_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardRemoteStoriesKey implements RemoteStoriesKey {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CardRemoteStoriesKey[] $VALUES;
    public static final CardRemoteStoriesKey BIG_TILE;

    @NotNull
    public static final Parcelable.Creator<CardRemoteStoriesKey> CREATOR;

    @NotNull
    private final String productName = "cards";

    @NotNull
    private final String storyName = "story";
    private final String storyVariant = "big-tile";

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return CardRemoteStoriesKey.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardRemoteStoriesKey[i];
        }
    }

    static {
        CardRemoteStoriesKey cardRemoteStoriesKey = new CardRemoteStoriesKey();
        BIG_TILE = cardRemoteStoriesKey;
        CardRemoteStoriesKey[] cardRemoteStoriesKeyArr = {cardRemoteStoriesKey};
        $VALUES = cardRemoteStoriesKeyArr;
        $ENTRIES = s.n(cardRemoteStoriesKeyArr);
        CREATOR = new a();
    }

    public static CardRemoteStoriesKey valueOf(String str) {
        return (CardRemoteStoriesKey) Enum.valueOf(CardRemoteStoriesKey.class, str);
    }

    public static CardRemoteStoriesKey[] values() {
        return (CardRemoteStoriesKey[]) $VALUES.clone();
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
