package com.revolut.feature.cms.stories.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import fj3.f;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\u0003\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/cms/stories/api/navigation/CmsStoriesDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "Companion", "Story", "OfflineDialog", "a", "Lcom/revolut/feature/cms/stories/api/navigation/CmsStoriesDestination$OfflineDialog;", "Lcom/revolut/feature/cms/stories/api/navigation/CmsStoriesDestination$Story;", "feature_cms_stories_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CmsStoriesDestination implements KompotDestination {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/cms/stories/api/navigation/CmsStoriesDestination$OfflineDialog;", "Lcom/revolut/feature/cms/stories/api/navigation/CmsStoriesDestination;", "<init>", "()V", "feature_cms_stories_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class OfflineDialog extends CmsStoriesDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OfflineDialog f65939a = new OfflineDialog();

        @NotNull
        public static final Parcelable.Creator<OfflineDialog> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return OfflineDialog.f65939a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OfflineDialog[i];
            }
        }

        private OfflineDialog() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cms/stories/api/navigation/CmsStoriesDestination$Story;", "Lcom/revolut/feature/cms/stories/api/navigation/CmsStoriesDestination;", "", "toString", "()Ljava/lang/String;", "feature_cms_stories_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Story extends CmsStoriesDestination {

        @NotNull
        public static final Parcelable.Creator<Story> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f65940a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f f65941b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Map f65942c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                f fVarValueOf = f.valueOf(parcel.readString());
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                int iD = 0;
                while (iD != i) {
                    iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
                }
                return new Story(string, fVarValueOf, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Story[i];
            }
        }

        public Story(String managedCampaignReference, f theme, Map queryParameters) {
            Intrinsics.checkNotNullParameter(managedCampaignReference, "managedCampaignReference");
            Intrinsics.checkNotNullParameter(theme, "theme");
            Intrinsics.checkNotNullParameter(queryParameters, "queryParameters");
            this.f65940a = managedCampaignReference;
            this.f65941b = theme;
            this.f65942c = queryParameters;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Story)) {
                return false;
            }
            Story story = (Story) obj2;
            return Intrinsics.f(this.f65940a, story.f65940a) && this.f65941b == story.f65941b && Intrinsics.f(this.f65942c, story.f65942c);
        }

        public final int hashCode() {
            return this.f65942c.hashCode() + ((this.f65941b.hashCode() + (this.f65940a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f65940a);
            dest.writeString(this.f65941b.name());
            Iterator itZ = j6.a.z(this.f65942c, dest);
            while (itZ.hasNext()) {
                Map.Entry entry = (Map.Entry) itZ.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.cms.stories.api.navigation.CmsStoriesDestination$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    private CmsStoriesDestination() {
    }
}
