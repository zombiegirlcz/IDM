package com.revolut.camerakit.validators.config;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.data.database.models.openbanking.d;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/camerakit/validators/config/CompoundValidatorConfig;", "Landroid/os/Parcelable;", "Lcom/revolut/camerakit/validators/config/ValidatorConfig;", "", "toString", "()Ljava/lang/String;", "camera_kit_validators_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CompoundValidatorConfig implements Parcelable, ValidatorConfig {

    @NotNull
    public static final Parcelable.Creator<CompoundValidatorConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f50903a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                Parcelable parcelable = parcel.readParcelable(CompoundValidatorConfig.class.getClassLoader());
                int i3 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i3);
                int iE = 0;
                while (iE != i3) {
                    iE = d.e(CompoundValidatorConfig.class, parcel, linkedHashSet, iE, 1);
                }
                linkedHashMap.put(parcelable, linkedHashSet);
            }
            return new CompoundValidatorConfig(linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CompoundValidatorConfig[i];
        }
    }

    public CompoundValidatorConfig(LinkedHashMap validatorConfigsGraph) {
        Intrinsics.checkNotNullParameter(validatorConfigsGraph, "validatorConfigsGraph");
        this.f50903a = validatorConfigsGraph;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof CompoundValidatorConfig) && this.f50903a.equals(((CompoundValidatorConfig) obj2).f50903a);
    }

    public final int hashCode() {
        return this.f50903a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        LinkedHashMap linkedHashMap = this.f50903a;
        dest.writeInt(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            dest.writeParcelable((Parcelable) entry.getKey(), i);
            Iterator itV = n.v((Set) entry.getValue(), dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }
}
