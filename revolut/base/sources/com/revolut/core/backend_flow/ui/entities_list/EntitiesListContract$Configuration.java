package com.revolut.core.backend_flow.ui.entities_list;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.backend_flow.domain.models.EntitiesListItem;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/core/backend_flow/ui/entities_list/EntitiesListContract$Configuration", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EntitiesListContract$Configuration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EntitiesListContract$Configuration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f51326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f51327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f51328c;
    public final FormScreen d;
    public final EntitiesListItem e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(parcel.readString(), parcel.createStringArrayList());
            }
            return new EntitiesListContract$Configuration(string, string2, linkedHashMap, (FormScreen) parcel.readParcelable(EntitiesListContract$Configuration.class.getClassLoader()), (EntitiesListItem) parcel.readParcelable(EntitiesListContract$Configuration.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EntitiesListContract$Configuration[i];
        }
    }

    public EntitiesListContract$Configuration(String flowName, String flowId, Map parameters, FormScreen screen, EntitiesListItem item) {
        Intrinsics.checkNotNullParameter(flowName, "flowName");
        Intrinsics.checkNotNullParameter(flowId, "flowId");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(item, "item");
        this.f51326a = flowName;
        this.f51327b = flowId;
        this.f51328c = parameters;
        this.d = screen;
        this.e = item;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EntitiesListContract$Configuration)) {
            return false;
        }
        EntitiesListContract$Configuration entitiesListContract$Configuration = (EntitiesListContract$Configuration) obj2;
        return Intrinsics.f(this.f51326a, entitiesListContract$Configuration.f51326a) && Intrinsics.f(this.f51327b, entitiesListContract$Configuration.f51327b) && Intrinsics.f(this.f51328c, entitiesListContract$Configuration.f51328c) && Intrinsics.f(this.d, entitiesListContract$Configuration.d) && Intrinsics.f(this.e, entitiesListContract$Configuration.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + p.a.e(p.a.c(this.f51326a.hashCode() * 31, 31, this.f51327b), 31, this.f51328c)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f51326a);
        dest.writeString(this.f51327b);
        Iterator itZ = j6.a.z(this.f51328c, dest);
        while (itZ.hasNext()) {
            Map.Entry entry = (Map.Entry) itZ.next();
            dest.writeString((String) entry.getKey());
            dest.writeStringList((List) entry.getValue());
        }
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
    }
}
