package com.revolut.feature.remote_stories.impl.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.stories.models.StoriesModel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/remote_stories/impl/ui/RemoteStoriesContract$RemoteStoriesModel", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_remote_stories_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RemoteStoriesContract$RemoteStoriesModel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RemoteStoriesContract$RemoteStoriesModel> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StoriesModel f81974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f81975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f81976c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            StoriesModel storiesModel = (StoriesModel) j6.a.f(parcel, "parcel", RemoteStoriesContract$RemoteStoriesModel.class);
            String string = parcel.readString();
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(parcel.readString(), parcel.createStringArrayList());
            }
            return new RemoteStoriesContract$RemoteStoriesModel(storiesModel, string, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RemoteStoriesContract$RemoteStoriesModel[i];
        }
    }

    public RemoteStoriesContract$RemoteStoriesModel(StoriesModel storiesModel, String str, LinkedHashMap pageDeeplinkMap) {
        Intrinsics.checkNotNullParameter(storiesModel, "storiesModel");
        Intrinsics.checkNotNullParameter(pageDeeplinkMap, "pageDeeplinkMap");
        this.f81974a = storiesModel;
        this.f81975b = str;
        this.f81976c = pageDeeplinkMap;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RemoteStoriesContract$RemoteStoriesModel)) {
            return false;
        }
        RemoteStoriesContract$RemoteStoriesModel remoteStoriesContract$RemoteStoriesModel = (RemoteStoriesContract$RemoteStoriesModel) obj2;
        return Intrinsics.f(this.f81974a, remoteStoriesContract$RemoteStoriesModel.f81974a) && Intrinsics.f(this.f81975b, remoteStoriesContract$RemoteStoriesModel.f81975b) && this.f81976c.equals(remoteStoriesContract$RemoteStoriesModel.f81976c);
    }

    public final int hashCode() {
        int iHashCode = this.f81974a.hashCode() * 31;
        String str = this.f81975b;
        return this.f81976c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f81974a, i);
        dest.writeString(this.f81975b);
        LinkedHashMap linkedHashMap = this.f81976c;
        dest.writeInt(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            dest.writeString((String) entry.getKey());
            dest.writeStringList((List) entry.getValue());
        }
    }
}
