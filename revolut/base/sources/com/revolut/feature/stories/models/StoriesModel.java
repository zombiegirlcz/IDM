package com.revolut.feature.stories.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/stories/models/StoriesModel;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "framework_stories_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StoriesModel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StoriesModel> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f88784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f88785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f88786c;
    public final boolean d;
    public final Parcelable e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f88787g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f88788h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Clause clause = (Clause) j6.a.f(parcel, "parcel", StoriesModel.class);
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(StoriesModel.class, parcel, arrayList, iE, 1);
            }
            return new StoriesModel(clause, string, arrayList, parcel.readInt() != 0, parcel.readParcelable(StoriesModel.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoriesModel[i];
        }
    }

    public StoriesModel(Clause title, String storyKey, ArrayList items, boolean z, Parcelable parcelable, boolean z3, boolean z4, int i) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(storyKey, "storyKey");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f88784a = title;
        this.f88785b = storyKey;
        this.f88786c = items;
        this.d = z;
        this.e = parcelable;
        this.f = z3;
        this.f88787g = z4;
        this.f88788h = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StoriesModel)) {
            return false;
        }
        StoriesModel storiesModel = (StoriesModel) obj2;
        return Intrinsics.f(this.f88784a, storiesModel.f88784a) && Intrinsics.f(this.f88785b, storiesModel.f88785b) && this.f88786c.equals(storiesModel.f88786c) && this.d == storiesModel.d && Intrinsics.f(this.e, storiesModel.e) && this.f == storiesModel.f && this.f88787g == storiesModel.f88787g && this.f88788h == storiesModel.f88788h;
    }

    public final int hashCode() {
        int iC = j6.a.c(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f88786c, p.a.c(this.f88784a.hashCode() * 31, 31, this.f88785b), 31), 31, this.d);
        Parcelable parcelable = this.e;
        return Integer.hashCode(this.f88788h) + j6.a.c(j6.a.c((iC + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31, this.f), 31, this.f88787g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f88784a, i);
        dest.writeString(this.f88785b);
        Iterator itY = j6.a.y(this.f88786c, dest);
        while (itY.hasNext()) {
            dest.writeParcelable((Parcelable) itY.next(), i);
        }
        dest.writeInt(this.d ? 1 : 0);
        dest.writeParcelable(this.e, i);
        dest.writeInt(this.f ? 1 : 0);
        dest.writeInt(this.f88787g ? 1 : 0);
        dest.writeInt(this.f88788h);
    }
}
