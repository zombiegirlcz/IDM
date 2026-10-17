package com.revolut.feature.cms.stories.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.ParcelableControllerDescriptor;
import fj3.c;
import fj3.f;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;
import zhm.r0;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/cms/stories/api/navigation/CmsStoriesControllerDescriptor;", "Lcom/revolut/kompot/common/ParcelableControllerDescriptor;", "Lfj3/c;", "", "toString", "()Ljava/lang/String;", "feature_cms_stories_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CmsStoriesControllerDescriptor implements ParcelableControllerDescriptor<c> {

    @NotNull
    public static final Parcelable.Creator<CmsStoriesControllerDescriptor> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f65936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f65937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f65938c;
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
            return new CmsStoriesControllerDescriptor(string, fVarValueOf, linkedHashMap, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CmsStoriesControllerDescriptor[i];
        }
    }

    public CmsStoriesControllerDescriptor(String managedCampaignReference, f theme, Map queryParameters, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(managedCampaignReference, "managedCampaignReference");
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(queryParameters, "queryParameters");
        this.f65936a = managedCampaignReference;
        this.f65937b = theme;
        this.f65938c = queryParameters;
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
        if (!(obj2 instanceof CmsStoriesControllerDescriptor)) {
            return false;
        }
        CmsStoriesControllerDescriptor cmsStoriesControllerDescriptor = (CmsStoriesControllerDescriptor) obj2;
        return Intrinsics.f(this.f65936a, cmsStoriesControllerDescriptor.f65936a) && this.f65937b == cmsStoriesControllerDescriptor.f65937b && Intrinsics.f(this.f65938c, cmsStoriesControllerDescriptor.f65938c) && this.d == cmsStoriesControllerDescriptor.d && this.e == cmsStoriesControllerDescriptor.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(p.a.b((this.f65937b.hashCode() + (this.f65936a.hashCode() * 31)) * 31, 31, this.f65938c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f65936a);
        dest.writeString(this.f65937b.name());
        Iterator itT = o.t(this.f65938c, dest);
        while (itT.hasNext()) {
            Map.Entry entry = (Map.Entry) itT.next();
            dest.writeString((String) entry.getKey());
            dest.writeString((String) entry.getValue());
        }
        dest.writeInt(this.d ? 1 : 0);
        dest.writeInt(this.e ? 1 : 0);
    }

    public /* synthetic */ CmsStoriesControllerDescriptor(String str, f fVar) {
        this(str, fVar, r0.g(), true, true);
    }
}
