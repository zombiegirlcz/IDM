package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/StoriesScreen;", "Lcom/revolut/feature/backend_flow/domain/models/BackendScreen;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StoriesScreen extends BackendScreen {

    @NotNull
    public static final Parcelable.Creator<StoriesScreen> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f63664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f63665c;
    public final String d;
    public final String e;
    public final String f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int iA = 0;
            boolean z = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(Transition.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            return new StoriesScreen(string, parcel.readString(), arrayList, parcel.readString(), parcel.readString(), z);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoriesScreen[i];
        }
    }

    public StoriesScreen(String id10, String storyId, List list, String str, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(storyId, "storyId");
        this.f63663a = id10;
        this.f63664b = z;
        this.f63665c = list;
        this.d = storyId;
        this.e = str;
        this.f = str2;
    }

    public static StoriesScreen J(StoriesScreen storiesScreen, String str) {
        String id10 = storiesScreen.f63663a;
        boolean z = storiesScreen.f63664b;
        List list = storiesScreen.f63665c;
        String storyId = storiesScreen.d;
        String str2 = storiesScreen.e;
        storiesScreen.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(storyId, "storyId");
        return new StoriesScreen(id10, storyId, list, str2, str, z);
    }

    @Override // xl2.t
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF63663a() {
        return this.f63663a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StoriesScreen)) {
            return false;
        }
        StoriesScreen storiesScreen = (StoriesScreen) obj2;
        return Intrinsics.f(this.f63663a, storiesScreen.f63663a) && this.f63664b == storiesScreen.f63664b && Intrinsics.f(this.f63665c, storiesScreen.f63665c) && Intrinsics.f(this.d, storiesScreen.d) && Intrinsics.f(this.e, storiesScreen.e) && Intrinsics.f(this.f, storiesScreen.f);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f63663a.hashCode() * 31, 31, this.f63664b);
        List list = this.f63665c;
        int iC2 = p.a.c((iC + (list == null ? 0 : list.hashCode())) * 31, 31, this.d);
        String str = this.e;
        int iHashCode = (iC2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.revolut.feature.backend_flow.domain.models.BackendScreen
    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getF() {
        return this.f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63663a);
        dest.writeInt(this.f63664b ? 1 : 0);
        List list = this.f63665c;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((Transition) itQ.next()).writeToParcel(dest, i);
            }
        }
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
    }
}
