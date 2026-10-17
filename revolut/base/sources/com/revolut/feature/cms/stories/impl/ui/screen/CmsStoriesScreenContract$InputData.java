package com.revolut.feature.cms.stories.impl.ui.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import fj3.f;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/cms/stories/impl/ui/screen/CmsStoriesScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_cms_stories_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CmsStoriesScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CmsStoriesScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f65944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f65945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f65946c;
    public final boolean d;
    public final boolean e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            f fVarValueOf = f.valueOf(parcel.readString());
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            int iD = 0;
            while (true) {
                if (iD == i) {
                    break;
                }
                iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
            }
            return new CmsStoriesScreenContract$InputData(string, fVarValueOf, linkedHashMap, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CmsStoriesScreenContract$InputData[i];
        }
    }

    public CmsStoriesScreenContract$InputData(String managedCampaignReference, f theme, Map queryParameters, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(managedCampaignReference, "managedCampaignReference");
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(queryParameters, "queryParameters");
        this.f65944a = managedCampaignReference;
        this.f65945b = theme;
        this.f65946c = queryParameters;
        this.d = z;
        this.e = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CmsStoriesScreenContract$InputData)) {
            return false;
        }
        CmsStoriesScreenContract$InputData cmsStoriesScreenContract$InputData = (CmsStoriesScreenContract$InputData) obj2;
        return Intrinsics.f(this.f65944a, cmsStoriesScreenContract$InputData.f65944a) && this.f65945b == cmsStoriesScreenContract$InputData.f65945b && Intrinsics.f(this.f65946c, cmsStoriesScreenContract$InputData.f65946c) && this.d == cmsStoriesScreenContract$InputData.d && this.e == cmsStoriesScreenContract$InputData.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(p.a.e((this.f65945b.hashCode() + (this.f65944a.hashCode() * 31)) * 31, 31, this.f65946c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f65944a);
        dest.writeString(this.f65945b.name());
        Iterator itZ = j6.a.z(this.f65946c, dest);
        while (itZ.hasNext()) {
            Map.Entry entry = (Map.Entry) itZ.next();
            dest.writeString((String) entry.getKey());
            dest.writeString((String) entry.getValue());
        }
        dest.writeInt(this.d ? 1 : 0);
        dest.writeInt(this.e ? 1 : 0);
    }
}
