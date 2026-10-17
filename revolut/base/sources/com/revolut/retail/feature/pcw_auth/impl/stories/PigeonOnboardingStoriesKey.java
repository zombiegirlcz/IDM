package com.revolut.retail.feature.pcw_auth.impl.stories;

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
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0081\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007j\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/revolut/retail/feature/pcw_auth/impl/stories/PigeonOnboardingStoriesKey;", "Lcom/revolut/feature/remote_stories/models/keys/RemoteStoriesKey;", "", "", "productName", "Ljava/lang/String;", "getProductName", "()Ljava/lang/String;", "storyName", "z1", "storyVariant", "e8", "Companion", "a", "APP_PCW_ONBOARDING_STORY_US", "feature_credit_pcw_auth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PigeonOnboardingStoriesKey implements RemoteStoriesKey {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PigeonOnboardingStoriesKey[] $VALUES;
    public static final PigeonOnboardingStoriesKey APP_PCW_ONBOARDING_STORY_US;

    @NotNull
    public static final Parcelable.Creator<PigeonOnboardingStoriesKey> CREATOR;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String productName = "onboarding";

    @NotNull
    private final String storyName = "us-credit";
    private final String storyVariant = "ftc";

    /* JADX INFO: renamed from: com.revolut.retail.feature.pcw_auth.impl.stories.PigeonOnboardingStoriesKey$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return PigeonOnboardingStoriesKey.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PigeonOnboardingStoriesKey[i];
        }
    }

    static {
        PigeonOnboardingStoriesKey pigeonOnboardingStoriesKey = new PigeonOnboardingStoriesKey();
        APP_PCW_ONBOARDING_STORY_US = pigeonOnboardingStoriesKey;
        PigeonOnboardingStoriesKey[] pigeonOnboardingStoriesKeyArr = {pigeonOnboardingStoriesKey};
        $VALUES = pigeonOnboardingStoriesKeyArr;
        $ENTRIES = s.n(pigeonOnboardingStoriesKeyArr);
        INSTANCE = new Companion();
        CREATOR = new b();
    }

    public static PigeonOnboardingStoriesKey valueOf(String str) {
        return (PigeonOnboardingStoriesKey) Enum.valueOf(PigeonOnboardingStoriesKey.class, str);
    }

    public static PigeonOnboardingStoriesKey[] values() {
        return (PigeonOnboardingStoriesKey[]) $VALUES.clone();
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
    public final boolean x9() {
        return false;
    }

    @Override // com.revolut.feature.remote_stories.models.keys.RemoteStoriesKey
    /* JADX INFO: renamed from: z1, reason: from getter */
    public final String getStoryName() {
        return this.storyName;
    }
}
