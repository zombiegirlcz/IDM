package com.revolut.shared.feature.workflow.engine.api.models.workflow;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/ProductClosurePrompt;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ProductClosurePrompt implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ProductClosurePrompt> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f105596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f105597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f105598c;
    public final String d;
    public final String e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ProductClosurePrompt(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ProductClosurePrompt[i];
        }
    }

    public ProductClosurePrompt(String title, String str, String buttonTitle, String deeplink, List stepsToClose) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(stepsToClose, "stepsToClose");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f105596a = title;
        this.f105597b = stepsToClose;
        this.f105598c = str;
        this.d = buttonTitle;
        this.e = deeplink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ProductClosurePrompt)) {
            return false;
        }
        ProductClosurePrompt productClosurePrompt = (ProductClosurePrompt) obj2;
        return Intrinsics.f(this.f105596a, productClosurePrompt.f105596a) && Intrinsics.f(this.f105597b, productClosurePrompt.f105597b) && Intrinsics.f(this.f105598c, productClosurePrompt.f105598c) && Intrinsics.f(this.d, productClosurePrompt.d) && Intrinsics.f(this.e, productClosurePrompt.e);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f105596a.hashCode() * 31, 31, this.f105597b);
        String str = this.f105598c;
        return this.e.hashCode() + p.a.c((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f105596a);
        dest.writeStringList(this.f105597b);
        dest.writeString(this.f105598c);
        dest.writeString(this.d);
        dest.writeString(this.e);
    }
}
