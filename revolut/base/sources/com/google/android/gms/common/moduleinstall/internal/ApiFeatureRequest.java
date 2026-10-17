package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.moduleinstall.ModuleInstallRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
@SafeParcelable.Class(creator = "ApiFeatureRequestCreator")
public class ApiFeatureRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ApiFeatureRequest> CREATOR = new zac();
    private static final Comparator zaa = new Comparator() { // from class: com.google.android.gms.common.moduleinstall.internal.zab
        @Override // java.util.Comparator
        public final int compare(Object obj2, Object obj3) {
            Feature feature = (Feature) obj2;
            Feature feature2 = (Feature) obj3;
            Parcelable.Creator<ApiFeatureRequest> creator = ApiFeatureRequest.CREATOR;
            return !feature.getName().equals(feature2.getName()) ? feature.getName().compareTo(feature2.getName()) : (feature.getVersion() > feature2.getVersion() ? 1 : (feature.getVersion() == feature2.getVersion() ? 0 : -1));
        }
    };

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getApiFeatures", id = 1)
    private final List f38202zab;

    /* JADX INFO: renamed from: zac, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getIsUrgent", id = 2)
    private final boolean f38203zac;

    /* JADX INFO: renamed from: zad, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getFeatureRequestSessionId", id = 3)
    private final String f38204zad;

    /* JADX INFO: renamed from: zae, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getCallingPackage", id = 4)
    private final String f38205zae;

    @SafeParcelable.Constructor
    public ApiFeatureRequest(@NonNull @SafeParcelable.Param(id = 1) List list, @SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) String str2) {
        Preconditions.checkNotNull(list);
        this.f38202zab = list;
        this.f38203zac = z;
        this.f38204zad = str;
        this.f38205zae = str2;
    }

    @NonNull
    @KeepForSdk
    public static ApiFeatureRequest fromModuleInstallRequest(@NonNull ModuleInstallRequest moduleInstallRequest) {
        return zaa(moduleInstallRequest.getApis(), true);
    }

    public static ApiFeatureRequest zaa(List list, boolean z) {
        TreeSet treeSet = new TreeSet(zaa);
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            Collections.addAll(treeSet, ((OptionalModuleApi) it8.next()).getOptionalFeatures());
        }
        return new ApiFeatureRequest(new ArrayList(treeSet), z, null, null);
    }

    public final boolean equals(Object obj2) {
        if (obj2 == null || !(obj2 instanceof ApiFeatureRequest)) {
            return false;
        }
        ApiFeatureRequest apiFeatureRequest = (ApiFeatureRequest) obj2;
        return this.f38203zac == apiFeatureRequest.f38203zac && Objects.equal(this.f38202zab, apiFeatureRequest.f38202zab) && Objects.equal(this.f38204zad, apiFeatureRequest.f38204zad) && Objects.equal(this.f38205zae, apiFeatureRequest.f38205zae);
    }

    @NonNull
    @KeepForSdk
    public List<Feature> getApiFeatures() {
        return this.f38202zab;
    }

    public final int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.f38203zac), this.f38202zab, this.f38204zad, this.f38205zae);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, getApiFeatures(), false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.f38203zac);
        SafeParcelWriter.writeString(parcel, 3, this.f38204zad, false);
        SafeParcelWriter.writeString(parcel, 4, this.f38205zae, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
