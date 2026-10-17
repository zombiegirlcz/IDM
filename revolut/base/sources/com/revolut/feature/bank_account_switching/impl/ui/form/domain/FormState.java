package com.revolut.feature.bank_account_switching.impl.ui.form.domain;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.r0;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/form/domain/FormState;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FormState implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FormState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f63923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f63924b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                String string = parcel.readString();
                int i3 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i3);
                for (int i5 = 0; i5 != i3; i5++) {
                    linkedHashMap2.put(parcel.readString(), parcel.readParcelable(FormState.class.getClassLoader()));
                }
                linkedHashMap.put(string, linkedHashMap2);
            }
            return new FormState(linkedHashMap, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FormState[i];
        }
    }

    public FormState(Map values, String selectedTabId) {
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(selectedTabId, "selectedTabId");
        this.f63923a = values;
        this.f63924b = selectedTabId;
    }

    public static FormState a(FormState formState, Map values, String selectedTabId, int i) {
        if ((i & 1) != 0) {
            values = formState.f63923a;
        }
        if ((i & 2) != 0) {
            selectedTabId = formState.f63924b;
        }
        formState.getClass();
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(selectedTabId, "selectedTabId");
        return new FormState(values, selectedTabId);
    }

    public final Map b() {
        Map map = (Map) this.f63923a.get(this.f63924b);
        return map == null ? r0.g() : map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FormState)) {
            return false;
        }
        FormState formState = (FormState) obj2;
        return Intrinsics.f(this.f63923a, formState.f63923a) && Intrinsics.f(this.f63924b, formState.f63924b);
    }

    public final int hashCode() {
        return this.f63924b.hashCode() + (this.f63923a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itZ = j6.a.z(this.f63923a, dest);
        while (itZ.hasNext()) {
            Map.Entry entry = (Map.Entry) itZ.next();
            dest.writeString((String) entry.getKey());
            Iterator itZ2 = j6.a.z((Map) entry.getValue(), dest);
            while (itZ2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itZ2.next();
                dest.writeString((String) entry2.getKey());
                dest.writeParcelable((Parcelable) entry2.getValue(), i);
            }
        }
        dest.writeString(this.f63924b);
    }
}
